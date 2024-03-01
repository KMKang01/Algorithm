const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  input[i] = Number(input[i]);
}

const array = new Array();
let count = 0;

for (let i = 0; i < input.length; i++) {
  input[i] = input[i] % 42;
}

for (let i = 0; i < input.length; i++) {
  // i = 0 ~ 9까지 증가하면서 총 10번의 반복문이 실행
  for (let j = 0; j < input.length; j++) {
    // j = 0 -> 10번, j = 1 -> 9번, ... j = 9 -> 1번
    if (array.indexOf(input[j]) == -1) {
      // array에 input[j]의 값이 없으면 실행
      if (input.indexOf(input[i]) != -1) {
        // input에 input[j]의 값이 있으면 count를 증가
        count++;
        array.push(input[j]); // array에 input[j]의 값을 추가
      }
    }
  }
}

console.log(count);
