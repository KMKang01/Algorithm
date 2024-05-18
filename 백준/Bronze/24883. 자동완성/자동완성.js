const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때
input === "N" || input === "n"
  ? console.log("Naver D2")
  : console.log("Naver Whale");
