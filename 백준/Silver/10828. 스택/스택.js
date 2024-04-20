const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
let tc = parseInt(input[0]);
let stack = [];
let answer = "";
for (let i = 1; i <= tc; i++) {
  let ctrl = input[i].split(" ");

  switch (ctrl[0]) {
    case "push":
      stack.push(parseInt(ctrl[1]));
      break;
    case "pop":
      if (stack.length != 0) {
        let tmp = stack.pop();
        answer += tmp.toString() + "\n";
      } else {
        answer += "-1\n";
      }
      break;
    case "size":
      answer += stack.length.toString() + "\n";
      break;
    case "empty":
      if (stack.length == 0) {
        answer += "1\n";
      } else {
        answer += "0\n";
      }
      break;
    case "top":
      if (stack.length != 0) {
        answer += stack[stack.length - 1].toString() + "\n";
      } else {
        answer += "-1\n";
      }
      break;
  }
}
console.log(answer.trim());
