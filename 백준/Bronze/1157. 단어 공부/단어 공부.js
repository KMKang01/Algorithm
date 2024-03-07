const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split(""); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  input[i] = input[i].toLowerCase();
}

let alphabetArr = new Array(input[0]);
let countArr = new Array();

for (let i = 0; i < input.length; i++) {
  if (alphabetArr.indexOf(input[i]) == -1) {
    alphabetArr.push(input[i]);
  }
}

for (let i = 0; i < alphabetArr.length; i++) {
  let count = 0;
  for (let j = 0; j < input.length; j++) {
    if (input[j] == alphabetArr[i]) {
      count++;
    }
  }
  countArr.push(count);
}

let max = 0;
countArr.forEach((e) => {
  e > max ? (max = e) : "";
});

let count = 0;
for (let i = 0; i < countArr.length; i++) {
  if (countArr[i] == max) {
    count++;
  }
}

count >= 2
  ? console.log("?")
  : console.log(alphabetArr[countArr.indexOf(max)].toUpperCase());
