const fs = require("fs");
let [N, ...arr] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
/*
  사용한 기능
  1. Map 객체
  2. Map 객체의 set, foreach
  3. Map의 정렬
  4. Map 에서 Array로 변환
*/
let dict = new Map(); // 입력을 맵 객체로 매핑
for (let i = 0; i < N; i++) {
  let [age, name] = arr[i].split(" ");
  age = parseInt(age);
  if (dict.has(age) === false) {
    //dict에 age가 없는 경우
    dict.set(age, name); //초기 설정
  } else {
    //있는 경우
    dict.set(age, `${dict.get(age)}, ${name}`); //기존값+신규값으로 dict 수정
  }
}
let dictToArr = [...dict];
dictToArr.sort((a, b) => a[0] - b[0]); //Map 객체 dict를 Array 객체로 변환

let answer = "";
dictToArr.forEach((e) => {
  let nameArr = e[1].split(", "); //age에 대응하는 이름들을 분할
  nameArr.forEach((name) => {
    answer += `${e[0]} ${name}\n`; //answer에 저장
  });
});

console.log(answer.trim());
