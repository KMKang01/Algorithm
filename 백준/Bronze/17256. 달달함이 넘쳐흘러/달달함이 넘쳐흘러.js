const fs = require("fs");
let [a, b] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
let [ax, ay, az] = a.split(" ").map((e) => {
  return parseInt(e);
});

let [cx, cy, cz] = b.split(" ").map((e) => {
  return parseInt(e);
});

let bx = cx - az;
let by = cy / ay;
let bz = cz - ax;
console.log(`${bx} ${by} ${bz}`);
