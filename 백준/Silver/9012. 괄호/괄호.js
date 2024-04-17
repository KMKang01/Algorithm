const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
let tc = parseInt(input[0]);
let answer = "";
let stack = [];

for (let i = 0; i < tc; i++) {
  let arr = input[i + 1].split("");
  arr.forEach((element) => {
    let top = stack.length;
    if (stack[top - 1] == "(" && element == ")") {
      stack.pop();
    } else {
      stack.push(element);
    }
  });
  stack.length == 0 ? (answer += "YES\n") : (answer += "NO\n");
  stack = [];
}
console.log(answer.trim());
