const fs = require("fs");
let input = parseInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때

let answerArr = new Array();

for (let i = 2; i <= input; i++) {
  if (input == 1) break;
  if (input % i == 0 && input == i) {
    answerArr.push(i);
  } else if (input % i == 0) {
    while (input % i == 0) {
      input /= i;
      answerArr.push(i);
    }
  }
}
console.log(answerArr.join("\n"));
//2 3 5 7 11 13 ...
