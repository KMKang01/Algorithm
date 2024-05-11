const fs = require("fs");
let [N, ...arr] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

arr = arr.map((e) => {
  return (e = parseInt(e));
});
arr = arr.sort((a, b) => a - b);

let [avg, midV, mode, range] = new Array(4).fill(0); //모든 변수 0으로 초기화

arr.forEach((element) => {
  avg += element;
});
avg = Math.round(avg / N); // 평균

midV = arr[Math.floor(N / 2)]; // 중앙값

/* 최빈값 알고리즘
    1. 딕셔너리를 이용
    2. 딕셔너리에 키가 없으면
    - 키를 추가하고 값을 1로 설정
    3. 딕셔너리에 키가 있으면
    - 해당 키의 값을 +1
    4. 딕셔너리를 순회하면서 값이 가장 큰 키를 가져옴
    5. 이때, 최빈값이 여러 개이면 두 번째로 작은 값을 찾아야 하는데
    최빈값에 대한 배열을 새로 만들어서 그 중에서 다시 비교...?
    - 우선 딕셔너리에서 가장 큰 값을 구함
    - 그 다음 가장 큰 값과 값이 같은 키를 모두 구해서 배열로 만듦
    - sort 함수로 정렬
    - 배열[1]번이 두번째로 작은 값일 것임.
*/
let dict = {};
arr.forEach((e) => {
  if (dict[e] != null) {
    let tmp = dict[e] + 1;
    dict[e] = tmp;
  } else {
    dict[e] = 1;
  }
}); // 딕셔너리 완성

let frequent = Object.values(dict); // 값 빈도 배열
let maxFrequent = 0; // 최빈값
frequent.forEach((e) => {
  maxFrequent < e ? (maxFrequent = e) : "";
});

let maxFreqArr = Object.keys(dict).filter((key) => dict[key] === maxFrequent); // 최빈값인 배열
maxFreqArr.sort((a, b) => a - b);
maxFreqArr.length > 1 ? (mode = maxFreqArr[1]) : (mode = maxFreqArr[0]); // 최빈값 배열이 2개 이상의 원소이면 index가 1인 원소를 택하고 1개이면 index가 0인 원소를 택함

range = arr[N - 1] - arr[0]; // 범위

console.log(`${avg}\n${midV}\n${mode}\n${range}`);
