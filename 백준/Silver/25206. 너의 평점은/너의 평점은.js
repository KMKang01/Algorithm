// 전공평점 = 학점 * 과목 평점
const fs = require("fs");

let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때
input = input.map((e) => {
  e = e.split(" ");
  e.shift();
  return e;
});

let sum = 0;
let gradeSum = 0;
for (let i = 0; i < input.length; i++) {
  let grade = input[i][1];
  switch (grade) {
    case "A+":
      sum += parseFloat(input[i][0]) * 4.5;
      break;
    case "A0":
      sum += parseFloat(input[i][0]) * 4.0;
      break;
    case "B+":
      sum += parseFloat(input[i][0]) * 3.5;
      break;
    case "B0":
      sum += parseFloat(input[i][0]) * 3.0;
      break;
    case "C+":
      sum += parseFloat(input[i][0]) * 2.5;
      break;
    case "C0":
      sum += parseFloat(input[i][0]) * 2.0;
      break;
    case "D+":
      sum += parseFloat(input[i][0]) * 1.5;
      break;
    case "D0":
      sum += parseFloat(input[i][0]) * 1.0;
      break;
    case "F":
      sum += parseFloat(input[i][0]) * 0.0;
      break;
    case "P":
      break;
  }
  if (grade != "P") gradeSum += parseFloat(input[i][0]);
}
console.log(sum / gradeSum);
