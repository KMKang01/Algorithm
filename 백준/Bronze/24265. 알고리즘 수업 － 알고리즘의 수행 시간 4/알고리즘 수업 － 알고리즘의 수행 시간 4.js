const fs = require("fs");
const input = parseInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때
/*
    MenOfPassion(A[], n) {
    sum <- 0; sum을 0으로 초기화
    for i <- 1 to n - 1 => i는 1부터 n-1까지
        for j <- i + 1 to n i + 1부터 n까지
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
    }
    if n = 5 
      i = 1 -> j = 2,3,4,5
      i = 2 -> j = 3,4,5
      i = 3 -> j = 4,5
      i = 4 -> j = 5        
    수행횟수 = 10
    if n = 6
      i = 1 -> j = 2,3,4,5,6
      i = 2 -> j = 3,4,5,6
      i = 3 -> j = 4,5,6
      i = 4 -> j = 5,6
      i = 5 -> j = 6
    수행횟수 = 15 = (6 - 1)*(6 - 1 + 1) / 2

    즉, 이 알고리즘의 시간 복잡도 식 => (n - 1) * n / 2 = (n^2 - n) / 2
*/
console.log((input ** 2 - input) / 2 + "\n2");
