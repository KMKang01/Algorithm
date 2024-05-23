const fs = require("fs");
let N = BigInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때
answer = BigInt(1);
while (N > 0) {
  answer *= N--;
}
console.log(`${answer}`);
