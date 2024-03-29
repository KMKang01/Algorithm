const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
let xArr = new Array();
let yArr = new Array();
input.forEach((e) => {
  xArr.push(e.split(" ")[0]);
  yArr.push(e.split(" ")[1]);
});
let rememX = new Array();
let x1 = 0;
let x2 = 0;
let rememY = new Array();
let y1 = 0;
let y2 = 0;
xArr.forEach((e) => {
  if (rememX.indexOf(e) == -1) {
    rememX.push(e);
  } else {
    x1 = e;
  }
});
yArr.forEach((e) => {
  if (rememY.indexOf(e) == -1) {
    rememY.push(e);
  } else {
    y1 = e;
  }
});
rememX.forEach((e) => {
  e == x1 ? "" : (x2 = e);
});
rememY.forEach((e) => {
  e == y1 ? "" : (y2 = e);
});
console.log(`${x2} ${y2}`);
