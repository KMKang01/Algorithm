const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때
/*
  MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2 1 ~ n-2
        for j <- i + 1 to n - 1 i+1 ~ n-1
            for k <- j + 1 to n j+1 ~ n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
  }
  if ( n = 5 ) -> i = 1,2,3 / j = 2,3,4 | 3,4 | 4 / k = 
    i = 1
      j = 2, 3, 4
        k = 3, 4, 5 / 4, 5 / 5 -----> 6
    i = 2
      j = 3, 4
        k = 4, 5 / 5 -----> 3
    i = 3
      j = 4
        k = 5 =====> 1

  if ( n = 6 ) -> i = 1~4 / j = 2~5 / k = 3~6
    i = 1
      j = 2, 3, 4, 5
        k = 3, 4, 5, 6 / 4, 5, 6 / 5, 6 / 6 ----> 10 j의 반복 횟수까지의 합
    i = 2
      j = 3, 4, 5
        k = 4, 5, 6 / 5, 6 / 6 -----> 6
    i = 3
      j = 4, 5
        k = 5, 6 / 6 -----> 3
    i = 4
      j = 5
        k = 6 ----> 1
  Sigma(x(x+1)/2) x = 1 to n - 2
  1/2 * {Sigma(x^2 + x)}

*/

let n = BigInt(input) - BigInt(2);

let result =
  ((n * (n + BigInt(1)) * (BigInt(2) * n + BigInt(1))) / BigInt(6) +
    (n * (n + BigInt(1))) / BigInt(2)) /
  BigInt(2);
console.log(`${result}\n3`);
