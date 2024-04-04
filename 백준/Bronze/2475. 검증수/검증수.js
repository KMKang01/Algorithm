const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
let arr = input.map((e) => {
  return parseInt(e) ** 2;
});
let sum = 0;
arr.forEach((e) => {
  sum += e;
});
console.log(sum % 10);
