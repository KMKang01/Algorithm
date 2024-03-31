const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때
/*
  
  i = ⌊n / 2⌋; => n을 2로 나눈 후 소수점 이하를 "버림" 연산
  return A[i]; => A[i]를 반환

*/
console.log(`1\n0`);
