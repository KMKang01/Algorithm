const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

input.shift();
let stack = [];
let result = 0;
input.forEach((e) => {
  e == 0 ? stack.pop() : stack.push(e);
});
stack.forEach((e) => {
  result += parseInt(e);
});
console.log(result);
