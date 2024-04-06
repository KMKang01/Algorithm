const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let ctrNum = parseInt(input.shift());

let stack = new Array();
let answer = "";
for (let i = 0; i < ctrNum; i++) {
  let [control, num] = input[i].split(" ");
  switch (control) {
    case "1":
      stack.push(num);
      break;
    case "2":
      stack.length > 0 ? (answer += `${stack.pop()}\n`) : (answer += "-1\n");
      break;
    case "3":
      answer += `${stack.length}\n`;
      break;
    case "4":
      stack.length == 0 ? (answer += "1\n") : (answer += "0\n");
      break;
    case "5":
      stack.length > 0
        ? (answer += `${stack[stack.length - 1]}\n`)
        : (answer += "-1\n");
      break;
    default:
      break;
  }
}

console.log(answer.trim());
