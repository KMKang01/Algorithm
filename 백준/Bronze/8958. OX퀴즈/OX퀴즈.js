const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let tc = parseInt(input[0]);

for (let i = 1; i <= tc; i++) {
  let str = input[i].split("");
  let prev = 0;
  let score = 0;
  for (let j = 0; j < str.length; j++) {
    let cur = str[j];
    if (cur == "X") {
      score += (prev * (prev + 1)) / 2;
      prev = 0;
    }
    if (cur == "O") {
      prev++;
      if (j == str.length - 1) {
        score += (prev * (prev + 1)) / 2;
      }
    }
  }
  console.log(score);
}
