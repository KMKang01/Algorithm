const fs = require("fs");
const input = parseInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때

/*
  서로 다른 색상 : 모든 경우의 수 - N
 => N**2 - N
*/
console.log(input ** 2 - input);
