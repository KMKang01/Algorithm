const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
let [N, K] = input;
let answer = 0;
function factorial(a) {
  a = parseInt(a);
  let result = 1;
  for (let i = a; i >= 1; i--) {
    result *= i;
  }
  return result;
}

answer = factorial(N) / (factorial(K) * factorial(N - K));
console.log(answer);
