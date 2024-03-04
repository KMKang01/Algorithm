const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때
const word = input[0];
const arr = new Array(26);
arr.fill(-1);

for (let i = 0; i < input[0].length; i++) {
  const loc = word.indexOf(word[i]);

  if (word[i].charCodeAt() >= 97 && word[i].charCodeAt() <= 122) {
    arr[word[i].charCodeAt() - 97] = loc;
  }
}
console.log(arr.join(" "));
