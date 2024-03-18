const fs = require("fs");
const input = Number(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때

let value = (2 ** input + 1) ** 2;

console.log(value);
