const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
let answer = "";
for (let i = 0; i < input.length; i++) {
  let e = parseInt(input[i]);
  if (e == 0) break;
  answer += ((e * (e + 1)) / 2).toString() + "\n";
}
console.log(answer.trim());
