const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
/*
  1. 같은 정수 X
  2. push 스택 순서는 오름차순

  1~n까지 숫자를 차례대로 스택에 넣고 pop하면서 입력된 수열을 만들 수 있는지 확인하는 문제
*/

let [n, ...arr] = input.map((e) => {
  return (e = parseInt(e));
}); // n은 범위, arr은 비교대상 배열

let answer = ""; //정답 배열
let stack = []; //숫자 스택
let index = 0;
for (let i = 1; i <= n; i++) {
  stack.push(i);
  answer += "+\n";

  while (stack[stack.length - 1] == arr[index] && index < n) {
    stack.pop();
    answer += "-\n";
    index++;
  }
}
if (stack.length > 0) answer = "NO";
console.log(answer.trim());
