const fs = require("fs");
const [a, b] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
if (a.split("").length >= b.split("").length) {
  console.log("go");
} else {
  console.log("no");
}
