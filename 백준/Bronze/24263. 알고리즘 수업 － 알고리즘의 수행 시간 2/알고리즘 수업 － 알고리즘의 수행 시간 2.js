const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때
/*
  
  MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        sum <- sum + A[i]; # 코드1
    return sum;
  } => 배열의 합을 구하는 알고리즘

  배열 인덱스 수만큼 증가.
  ∴ 수행 횟수: n, 차수: 1

*/
console.log(`${input}\n1`);
