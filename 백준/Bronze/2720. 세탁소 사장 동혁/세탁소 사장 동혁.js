const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
const Quarter = 25;
const Dime = 10;
const Nickel = 5;
const Penny = 1;
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다. C의 단위는 센트이다. (1달러 = 100센트) (1<=C<=500)
// 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오
let tc = parseInt(input.shift());
let caseArr = input.map((e) => {
  return (e = Number(e));
});

let stdArr = [Quarter, Dime, Nickel, Penny];
let coinArr = [0, 0, 0, 0];

for (let i = 0; i < tc; i++) {
  for (let j = 0; j < 4; j++) {
    coinArr[j] = parseInt(caseArr[i] / stdArr[j]);
    caseArr[i] %= stdArr[j];
  }
  console.log(coinArr.join(" "));
}
