const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

function compare(a, b) {
  if (a.length - b.length == 0) {
    // a와 b의 길이가 같은 경우
    for (let i = 0; i < a.length; i++) {
      if (a[i] > b[i]) {
        return 1;
      } else if (a[i] == b[i]) {
        continue;
      } else {
        return -1;
      }
    }
  } else {
    // a와 b의 길이가 다른 경우
    return a.length - b.length;
  }
}

let unitedArr = [];

for (let i = 1; i <= parseInt(input[0]); i++) {
  let word = input[i];
  if (unitedArr.indexOf(word) == -1) {
    unitedArr.push(word);
  }
}
unitedArr.sort(compare);
console.log(unitedArr.join("\n"));
