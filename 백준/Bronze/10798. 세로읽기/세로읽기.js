const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

input = input.map((e) => {
  return (e = e.split(""));
});

let answer = "";
let row = input.length;
let lengthArr = input.map((e) => e.length);
let col = Math.max(...lengthArr);

for (let i = 0; i < col; i++) {
  for (let j = 0; j < row; j++) {
    if (input[j][i] != undefined) {
      answer += input[j][i];
    }
  }
}
console.log(answer);
