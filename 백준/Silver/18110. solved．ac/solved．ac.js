const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

/*
    25 * 0.15 = 3.75 -> 4
    5 * 0.15 = 0.75 -> 1




*/

let [tc, ...arr] = input;
tc = parseInt(tc); // 테스트케이스의 수
arr.sort((a, b) => a - b); // 난이도 의견 배열
let trimmedMean = 0; //절사평균
let sum = 0;
let per15 = Math.round(tc * 0.15); // 위 아래 15퍼

for (let i = per15; i < tc - per15; i++) {
  sum += parseInt(arr[i]);
}
trimmedMean = sum / (tc - 2 * per15);
if (tc == 0) trimmedMean = 0;
console.log(Math.round(trimmedMean));
