const fs = require("fs");
let input = Number(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때
/*
  1층 -> 1      total: 1 + 6*0 = 1 -> x = 0, n = 1
  2층 -> 6      total: 1 + 6*1 = 7 -> 0<x=<1 , n =2 
  3층 -> 12     total: 1 + 6*1 + 6*2 = 19 -> 1<x=<3 ,n = 3
  4층 -> 18     total: 1 + 6*1 + 6*2 + 6*3 = 37 -> 3< x=<6, n=4
  5층 -> 24     total: 1 + 6*1 + 6*2 + 6*3 + 6*4 = 61 -> 6< x =<10, n=5
  .
  .
  .
  n층 -> 6 * (n-1)    total: prev + 6 * (n-1) -> 
*/
input--;
let x = input / 6;
let prev = 0;

for (let n = 1; n <= x + 1; n++) {
  if (x == 0) {
    console.log(n);
    break;
  }
  //console.log(`prev = ${prev}, x = ${x}, n = ${n}`);
  if (prev < x && x <= prev + n) {
    console.log(n + 1);
    break;
  } else {
    prev = prev + n;
  }
}
