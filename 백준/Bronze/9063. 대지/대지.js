const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

/*
    1. x의 최대 최소, y의 최대 최소
    2. x의 최대 - y의 최소 * y의 최대 - y의 최소
    3. 점이 2개 이상이어야 성립
   */
let pointCount = parseInt(input.shift());
let xArr = new Array();
let yArr = new Array();
input.forEach((e) => {
  xArr.push(Number(e.split(" ")[0]));
  yArr.push(Number(e.split(" ")[1]));
});
let width = xArr.sort((a, b) => a - b).pop() - xArr.shift();
let height = yArr.sort((a, b) => a - b).pop() - yArr.shift();

pointCount < 2 ? console.log("0") : console.log(width * height);
