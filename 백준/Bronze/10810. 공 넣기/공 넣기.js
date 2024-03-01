const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  input[i] = input[i].split(" ").map(Number);
}

const bucket = input[0][0];
const trial = input[0][1];
let answerArray = [];
for (let i = 0; i < bucket; i++) {
  answerArray.push(0);
}

for (let i = 1; i <= trial; i++) {
  let e1 = input[i][0];
  let e2 = input[i][1];
  let e3 = input[i][2];
  for (let j = e1 - 1; j <= e2 - 1; j++) {
    answerArray[j] = e3;
  }
}

let answer = "";
answerArray.forEach((element) => {
  answer = answer + element + " ";
});
console.log(answer);
