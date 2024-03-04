const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  let tc = parseInt(input[i].split(" ")[0]);
  let word = input[i].split("");
  word = word.slice(2, word.length);

  let answer = "";

  for (let j = 0; j < word.length; j++) {
    for (let k = 0; k < tc; k++) {
      answer += word[j];
    }
  }
  if (word[0] != undefined) {
    console.log(answer);
  }
}
