const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

const cnt = parseInt(input.shift());

input.sort((a, b) => a - b);
console.log(input.join("\n"));
