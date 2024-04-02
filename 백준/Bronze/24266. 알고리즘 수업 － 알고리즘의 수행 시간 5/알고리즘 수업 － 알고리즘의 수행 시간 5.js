const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때
/*
  MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n 1부터 n까지
        for j <- 1 to n 1부터 n까지
            for k <- 1 to n 1부터 n까지
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
  }


*/
let n = BigInt(input);
console.log(`${n * n * n}\n3`);
