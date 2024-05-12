const fs = require("fs");
const N = parseInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때

console.log(`${N - N * 0.22} ${N * 0.8 + (N * 0.2 - N * 0.2 * 0.22)}`);
