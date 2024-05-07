const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
input = input.map((e) => {
  return (e = parseInt(e));
});
input = input.sort((a, b) => a - b);
console.log(input.join(" "));
