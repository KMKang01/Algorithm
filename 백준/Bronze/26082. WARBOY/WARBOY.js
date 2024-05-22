const fs = require("fs");
let [A, B, C] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때

A = parseInt(A);
B = parseInt(B);
C = parseInt(C);

let rival = B / A;
let answer = C * rival * 3;
console.log(answer);
