const fs = require("fs");
const { isPromise } = require("util/types");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let tc = parseInt(input[0]);
let result = "";
for (let i = 1; i <= tc; i++) {
  let [n1, n2] = input[i].split(" ");
  result += lcmFunction(n1, n2) + "\n";
}
console.log(result.trim());

function lcmFunction(n1, n2) {
  n1 = parseInt(n1);
  n2 = parseInt(n2);
  let divisionMulti = 0;

  for (let i = n1; i >= 1; i--) {
    if (n1 % i == 0) {
      if (n2 % i == 0) {
        divisionMulti = i;
        break;
      }
    }
  }
  let lcm = (n1 * n2) / divisionMulti;
  return lcm;
}
