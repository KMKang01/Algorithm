const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

const tc = parseInt(input.shift());
let result = "";
for (let i = 0; i < tc; i++) {
  let [a, b] = input[i].split(" ");
  let location = 0;
  a = parseInt(a);
  b = parseInt(b);
  let remember = a;
  for (let j = 1; j <= b; j++) {
    location = a % 10;
    a = (a % 10) * remember;
  }
  location == 0 ? (location = 10) : "";
  result += location + "\n";
}
console.log(result.trim());
