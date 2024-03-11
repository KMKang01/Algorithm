const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(); //여러 줄 입력받을 때

const num = input[0].split(" ")[0];
const formation = parseInt(input[0].split(" ")[1]);
let answer = 0;

for (let i = num.length - 1; i >= 0; i--) {
  if (typeof num[i] == "string" && num[i].charCodeAt() >= 65) {
    answer += (num[i].charCodeAt() - 55) * formation ** (num.length - 1 - i);
  } else {
    answer += num[i] * formation ** (num.length - 1 - i);
  }
}

console.log(answer);
