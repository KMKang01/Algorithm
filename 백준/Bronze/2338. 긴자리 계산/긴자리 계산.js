const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

const a = BigInt(input.shift());
const b = BigInt(input.shift());
console.log(`${a+b}\n${a-b}\n${a*b}`);


