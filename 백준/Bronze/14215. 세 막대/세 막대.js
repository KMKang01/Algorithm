const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때

let a = parseInt(input.shift());
let b = parseInt(input.shift());
let c = parseInt(input.shift());
/* 
    1. 가장 긴 막대를 선정
      1-1. 막대의 길이가 모두 같은 경우 => 정삼각형
    2. 나머지 두 막대의 합을 구함
    3. 가장 긴 막대의 길이 = (두 막대의 합 - 1) 이므로, 정삼각형이 아닌 모든 경우에서 둘레는 2 * 두 막대의 합 - 1이 됨
*/
function makeTriangle(a, b, c) {
  if (a == b && b == c) {
    return a + b + c;
  }
  let max = a;
  let stick1 = 0;
  let stick2 = 0;
  if (max < b) {
    stick1 = max;
    max = b;
  } else {
    stick1 = b;
  }
  if (max < c) {
    stick2 = max;
    max = c;
  } else {
    stick2 = c;
  }
  if (max >= stick1 + stick2) {
    max = stick1 + stick2 - 1;
  }

  return max + stick1 + stick2;
}
console.log(makeTriangle(a, b, c));
