const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때

/* 
    n = 1 -> 정사각형 개수: 1개 -> 1 * 4 = 4
    n = 2 -> 정사각형 개수: 1+2개 -> 3 * 4 - 2(= 1T) * 2 = 8
    n = 3 -> 정사각형 개수: 1+2+3개 -> 6 * 4 - 6(= 3T) * 2 = 12
    n = 4 -> 정사각형 개수: 1+2+3+4개 -> 10 * 4 - 12(= 6T) * 2 = 16
    .
    .
    .
  */

console.log(parseInt(input) * 4);
