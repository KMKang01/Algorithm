const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때

let a = BigInt(input.shift());
let b = BigInt(input.shift());

console.log(Math.abs(Number((a - b).toString())));
