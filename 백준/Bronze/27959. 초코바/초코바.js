const fs = require("fs");
let [a, b] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
a = parseInt(a);
b = parseInt(b);
a * 100 >= b ? console.log("Yes") : console.log("No");
