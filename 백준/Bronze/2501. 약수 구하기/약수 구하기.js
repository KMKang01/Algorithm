const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때

const num1 = parseInt(input.shift());
const num2 = parseInt(input.shift());
let arr = new Array();
for (let i = 1; i <= num1; i++) {
  num1 % i == 0 ? arr.push(i) : "";
}

arr.length >= num2 ? console.log(arr[num2 - 1]) : console.log("0");
