const fs = require("fs");
let [a, b] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
console.log(`${BigInt(a) * BigInt(b)}`);
