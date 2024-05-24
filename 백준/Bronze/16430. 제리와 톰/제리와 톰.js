const fs = require("fs");
let [A, B] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
console.log(`${parseInt(B) - parseInt(A)} ${B}`);
