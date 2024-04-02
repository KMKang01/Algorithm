const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때
/*
    MenOfPassion(A[], n) {
      sum <- 0; => sum  초기화
      for i <- 1 to n i = 1부터 n까지 반복
         for j <- 1 to n j = 1부터 n까지 반복
             sum <- sum + A[i] × A[j]; # 코드1 sum += A[i]*A[j]
       return sum;
    }
  1번 반복문 1부터 n까지 
    2번 반복문 1부터 n까지 반복

*/
console.log(parseInt(input) ** 2 + "\n2");
