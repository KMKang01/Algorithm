const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때

let n = 0; //몇 층인지에 대한 변수
for (n = 0; (n * (n + 1)) / 2 < input; n++) {}
input = input - ((n - 1) * n) / 2; //n층에서 몇 번째인지 구해서 input에 대입
//console.log(`${n}층 ${input}번째`);
//분자: 1 / 1, 2 / 3, 2, 1 / 1, 2, 3, 4 / …
let numerator = 0;
let denominator = 0;
if (n % 2 == 0) {
  //짝수 층
  numerator = input;
} else {
  //홀수 층
  numerator = n + 1 - input;
}

//분모: 1 / 2, 1 / 1, 2, 3 / 4, 3, 2, 1 / …
if (n % 2 == 0) {
  denominator = n + 1 - input;
} else {
  denominator = input;
}
console.log(numerator + "/" + denominator);
