const fs = require("fs");
let input = parseInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때
let answer = "";
while (input > 0) {
  answer += `${input--}\n`;
}
console.log(answer.trim());
