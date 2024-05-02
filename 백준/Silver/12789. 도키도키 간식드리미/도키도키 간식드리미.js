const fs = require("fs");
let [N, arr] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let readyStack = arr.split(" ").map((e) => {
  return (e = parseInt(e));
});
let waitStack = []; // 대기 순서가 아닌 경우 들어갈 스택
let correctArr = []; // 제대로 된 대기열
let turn = 1;
let isCorrect = true;

for (let i = 0; i < readyStack.length; i++) {
  if (readyStack[i] == turn) {
    // 올바른 순서인 경우
    correctArr.push(readyStack[i]);
    turn++;
  } else {
    // 올바른 순서가 아닌 경우
    waitStack.push(readyStack[i]);
  }
  while (waitStack[waitStack.length - 1] == turn) {
    // waitStack의 제일 위가 맞는 순서라면
    correctArr.push(waitStack.pop());
    turn++;
  }
}

for (let i = waitStack.length - 1; i >= 0; i--) {
  if (waitStack[i] == turn) {
    waitStack.pop();
    turn++;
  } else {
    isCorrect = false;
    break;
  }
}

isCorrect ? console.log("Nice") : console.log("Sad");
