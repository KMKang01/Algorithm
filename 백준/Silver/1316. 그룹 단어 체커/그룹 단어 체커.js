const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때
const wordCount = input.shift(); //단어 개수
let minimizedArr = new Array();

function splitAndMinimize(arr) {
  //input을 자르고 같은 문자를 줄이는 함수
  let returnArr = new Array();
  let tmpArr = new Array();
  tmpArr = arr.toString().split("");
  returnArr.push(arr[0]);
  for (let i = 0; i < tmpArr.length; i++) {
    if (tmpArr[i] != tmpArr[i + 1]) {
      returnArr.push(tmpArr[i + 1]);
    }
  }
  if (returnArr[returnArr.length - 1] == undefined) {
    returnArr.pop();
  }

  tmpArr = [];
  let trigger = returnArr[0];
  returnArr.shift();
  tmpArr.push(trigger);
  for (let i = 0; i < returnArr.length; i++) {
    if (tmpArr.indexOf(returnArr[i]) == -1) {
      tmpArr.push(returnArr[i]);
    } else {
      return false;
    }
  }
  return true;
}
let count = 0;
for (let i = 0; i < wordCount; i++) {
  splitAndMinimize(input[i]) ? count++ : "";
}
console.log(count);
