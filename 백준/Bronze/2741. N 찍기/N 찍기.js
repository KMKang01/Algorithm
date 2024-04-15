const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때
let answer = "";
for (let i = 1; i <= parseInt(input); i++) {
  answer += i.toString() + "\n";
}
console.log(answer.trim());
