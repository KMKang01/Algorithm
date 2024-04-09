const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" ")
  .map((e) => {
    return Number(e);
  }); //여러 줄 입력받을 때

let x = 0;
let y = 0;

let [a, b, c, d, e, f] = input;

if (a != 0 && b * d - e * a != 0) {
  y = (c * d - a * f) / (b * d - e * a);
  x = (c - b * y) / a;
} else if (a == 0 && b != 0 && d != 0 && b * d - e * a != 0) {
  y = c / b;
  x = (f - e * y) / d;
}
console.log(`${x} ${y}`);
