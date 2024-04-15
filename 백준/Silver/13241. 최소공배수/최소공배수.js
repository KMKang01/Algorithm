const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때

function lcmFunction(n1, n2) {
  let divisionMulti = 0;

  for (let i = n1; i >= 1; i--) {
    if (n1 % i == 0) {
      if (n2 % i == 0) {
        divisionMulti = i;
        break;
      }
    }
  }
  let lcm = BigInt((n1 * n2) / divisionMulti);
  return lcm;
}
console.log(lcmFunction(BigInt(input[0]), BigInt(input[1])).toString());
