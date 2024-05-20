const fs = require("fs");
const [N, M] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
N === M ? console.log("1") : console.log("0");
