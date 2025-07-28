
// sentence();
/** */
//배열 + rest 를 사용해 ??칸을 채우세요

const colors = ['red', 'blue', 'green', 'yellow', 'purple'];

const [first,second,...rest] = colors;

console.log(first);  // 'red'
console.log(second); // 'blue'
console.log(rest);   // ['green', 'yellow', 'purple']

/** */
function getLength(text) {
  return [...text].length;
}
console.log(getLength("111aaaa"));
/** */

//console.log 안에 있는 ${} 안에 적절한 변수를 넣어 콘솔로 감자튀김이 출력되게 해주세요.

let [name1="맛있는",name2="복",name3="분",name4="자"] = "곶감";
let [,num2,num3]="갑툭튀";

let kim = "김";
let lee = "이";
let park = "박";
let choi = "최";

[kim,lee,park,choi]=[park,lee,kim,choi];

function sentence() {
    console.log(`${name2} ${name4} ${num3} ${park}`);
};

sentence();