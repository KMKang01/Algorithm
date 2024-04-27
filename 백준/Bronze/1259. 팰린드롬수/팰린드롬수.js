const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let i = 0;
let answer = "";
while (input[i] != "0") {
  let checker = input[i].split("");
  switch (checker.length) {
    case 1:
      answer += "yes\n";
      break;
    case 2:
      if (checker[0] == checker[1]) {
        answer += "yes\n";
      } else {
        answer += "no\n";
      }
      break;

    case 3:
      if (checker[0] == checker[2]) {
        answer += "yes\n";
      } else {
        answer += "no\n";
      }
      break;

    case 4:
      if (checker[0] == checker[3] && checker[1] == checker[2]) {
        answer += "yes\n";
      } else {
        answer += "no\n";
      }
      break;

    case 5:
      if (checker[0] == checker[4] && checker[1] == checker[3]) {
        answer += "yes\n";
      } else {
        answer += "no\n";
      }
      break;
  }

  i++;
}
console.log(answer.trim());
