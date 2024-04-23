const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(""); //여러 줄 입력받을 때
let answer = "";
input.forEach((e) => {
  if (e.charCodeAt() >= "a".charCodeAt()) {
    answer += e.toUpperCase();
  } else {
    answer += e.toLowerCase();
  }
});
console.log(answer);
