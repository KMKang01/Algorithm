const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

const num1 = parseInt(input.shift());
const num2 = parseInt(input.shift());
let arr = new Array();
for (let i = num1; i <= num2; i++) {
  for (let j = 2; j <= i; j++) {
    if (i % j == 0 && i != j) {
      break;
      //소수가 아님
    } else if (i % j == 0 && i == j) {
      arr.push(i);
      break;
    }
  }
}
let sum = 0;
arr.map((e) => {
  return (sum += e);
});
let min = arr[0];
arr.length != 0 ? console.log(`${sum}\n${min}`) : console.log("-1");
