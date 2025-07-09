/**Student class 
 * 생성자 변수 group, name
 * 메소드 introduce
 * 
 * 
 */

class Student
{
    constructor(name)
    {
        this.group=1;
        this.name=name;
    }
    introduce()
    {
        console.log(`${this.group}`);//내부값, 고정된 인스턴스
        console.log(`${this.inputp}`);//외부에서 받은 변수
    }
}
//인스턴스 생성
let studi1 = new Student("홍길동");
let studi2 = new Student("2길동");
let studi3 = new Student("3길동");
//메소드
//studi1.introduce();

/*타입 */
//console.log(typeof Student);//클래스의 타입 : function
//console.log(typeof Student.constructor); //생성자의 타입 : function
//console.log(typeof Student.introduce());


//console.log(typeof name);
//name 접근 불가능 : undefined 
//이유 : 전역변수가 아니여서

console.log(typeof Student.group);
console.log(typeof studi1.name);
//클래스의 변수 undefined 
//이유 : 인스턴스 생성시 생김
console.log(typeof Student.group);
//클래스의 변수 undefined
//이유 : 인스턴스 생성시 생김
 console.log(typeof Student.constructor);
console.log(typeof Student.constructor.name1);

// console.log(typeof Student.constructor.group);

