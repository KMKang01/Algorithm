const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

const tc = input[0];
const arr = new Array(tc);
let answer = 0;

for (let i = 0; i < tc; i++) {
  arr[i] = parseInt(input[1][i]);
  answer += arr[i];
}

console.log(answer);
