const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
/*
  f(n) = a1 * n + a0
  O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}
  <빅오표기법>
  O(g(n)) = f(n)
    g(n) 식은 f(n)의 최고차항임
    if, f(n) = 2n^2 + n + 1 => g(n) = n^2

  이 문제에서는 g(n) = n, 따라서 O(n) = a1*n + a0인 것.
  
  f(n) ≤ c × g(n)
  n >= n0
*/
let aArr = input.shift().split(" ");
let a1 = parseInt(aArr[0]);
let a0 = parseInt(aArr[1]);
let c = parseInt(input.shift());
let n0 = parseInt(input.shift());

if (a1 * n0 + a0 <= c * n0 && a1 <= c) {
  console.log("1");
} else {
  console.log("0");
}
// a0 <= (c - a1) * n

