const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

/*
  1. input 배열을 차례대로 순회하면서 약수를 찾는다.
    1-1. 약수를 찾는 방법?
      - for 문 이용: i = 1부터 자기 자신까지 증가하면서 나머지 연산의 결과값이 0인 경우
        -> 시간복잡도: O(n)
        -> 약수를 찾으면서 배열에 저장
*/
let answer = "";
for (let i = 0; i < input.length - 1; i++) {
  let arr = new Array();
  let check = 0;
  let num = parseInt(input[i]);
  for (let j = 1; j < num; j++) {
    if (num % j == 0) {
      arr.push(j);
      check += j;
    }
  }
  if (check == num) {
    answer += `${num} = ${arr.join(" + ")}\n`;
  } else {
    answer += `${num} is NOT perfect.\n`;
  }
}
console.log(answer.trim());
