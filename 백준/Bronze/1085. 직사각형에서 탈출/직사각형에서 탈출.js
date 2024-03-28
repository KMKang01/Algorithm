const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
let x = parseInt(input.shift());
let y = parseInt(input.shift());
let w = parseInt(input.shift());
let h = parseInt(input.shift());
/* 
  가로가 w, 세로가 h인 직사각형
  각 꼭짓점의 좌표
   - (0, 0), (w, 0), (0, h), (w, h)
  1. x
  2. w - x
  3. y
  4. h - y
  4개의 값을 모두 비교하여 가장 짧은 거리를 구함
*/
let minDist = x;
minDist > w - x ? (minDist = w - x) : "";
minDist > y ? (minDist = y) : "";
minDist > h - y ? (minDist = h - y) : "";
console.log(minDist);
