const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(""); //여러 줄 입력받을 때

input.sort((a, b) => b - a);
console.log(input.join(""));
