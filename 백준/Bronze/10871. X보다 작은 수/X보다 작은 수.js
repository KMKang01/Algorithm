const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

const line1 = input[0].split(" ").map(Number);
const line2 = input[1].split(" ").map(Number);
let ans = "";
line2.forEach((element) => {
  element < line1[1] ? (ans = ans + element + " ") : " ";
});
console.log(ans);
