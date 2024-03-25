const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
const numCount = parseInt(input.shift());
let count = 0;
input = input[0].split(" ").map((e) => {
  return (e = Number(e));
});

for (let i = 0; i < numCount; i++) {
  for (let j = 2; j <= input[i]; j++) {
    if (input[i] % j == 0 && input[i] == j) {
      count++;
    } else if (input[i] % j == 0 && input[i] != j) {
      break;
    }
  }
}
console.log(count);
