const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
let answer = "";
let i = 0;
while (input[i] != "0 0") {
  let [a, b] = input[i].split(" ");
  parseInt(a) > parseInt(b) ? (answer += "Yes\n") : (answer += "No\n");
  i++;
}
console.log(answer.trim());
