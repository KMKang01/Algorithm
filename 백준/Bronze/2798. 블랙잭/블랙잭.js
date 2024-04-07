const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
/* 
    N 장의 카드를 숫자가 보이도록 놓는다
    N 장의 카드 중 3장을 골라서 M을 넘지않으면서 M과 최대한 가깝게
*/
let [N, M] = input
  .shift()
  .split(" ")
  .map((e) => {
    return e;
  });
let numArr = input
  .shift()
  .split(" ")
  .map((e) => {
    return parseInt(e);
  });
numArr.sort((a, b) => b - a);

let answer = 0;

for (let i = 0; i < numArr.length - 2; i++) {
  let a = numArr[i];
  for (let j = i + 1; j < numArr.length - 1; j++) {
    let b = numArr[j];
    let sum = a + b;
    if (sum >= M) continue;
    for (let k = j + 1; k < numArr.length; k++) {
      let c = numArr[k];
      if (sum + c <= M && sum + c > answer) {
        answer = sum + c;
      }
    }
  }
}

console.log(answer);
