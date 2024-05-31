const fs = require("fs");
let [A, B, C] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
A = parseInt(A);
B = parseInt(B);
C = parseInt(C);

let count = 1;
if (B >= C) {
  count = -1;
} else {
  count = Math.floor(A / (C - B)) + 1;
}

console.log(count);
