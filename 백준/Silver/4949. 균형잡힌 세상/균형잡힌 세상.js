const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let stack = [];
let answer = "";
let isRight = true;

for (let i = 0; i < input.length; i++) {
  let arr = input[i].split("");
  if (arr.length == 1 && arr[0] == ".") break; // 맨 마지막일 때 처리

  for (let j = 0; j < arr.length; j++) {
    let char = arr[j];
    if (char == "(" || char == "[") {
      // ( 또는 [ 를 만났을 때 stack에 푸쉬
      stack.push(char);
    } else if (char == ")" || char == "]") {
      // ) 또는 ] 를 만났을 때
      if (stack.length == 0) {
        // 오른쪽 괄호를 만났지만 stack에 아무것도 없는 경우
        isRight = false;
        break;
      }
      if (
        (stack[stack.length - 1] == "(" && char == ")") ||
        (stack[stack.length - 1] == "[" && char == "]") // stack의 맨 위와 char가 짝이 맞는 경우
      ) {
        stack.pop(); // pop 연산 실행
      } else {
        isRight = false;
        break;
      }
    }
    stack.length == 0 ? (isRight = true) : (isRight = false); //stack이 정상적으로 소모된 경우 true, stack이 남은 경우 false
  }

  isRight ? (answer += "yes\n") : (answer += "no\n");
  stack = [];
  isRight = true;
}
console.log(answer.trim());
