const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

const cnt = parseInt(input[0]);
const score = new Array(cnt);

for (let i = 0; i < cnt; i++) {
  score[i] = parseInt(input[1].split(" ")[i]);
}

const maxScore = score.reduce((a, b) => (a > b ? a : b));
const cheating = (n) => parseFloat((n / maxScore) * 100);

const cheatedScore = score.map(cheating);
const cheatedAvg = parseFloat(
  cheatedScore.reduce((prev, cur) => prev + cur) / cnt
);

console.log(cheatedAvg);
