
package com.ohgiraffers.practice02.level101.basic.member.run;
import com.ohgiraffers.practice02.level101.basic.member.model.dto.MemberDTO;

public class Application {
        public static void main(String[] args) {
                MemberDTO mdt = new MemberDTO();
                //getter를 이용해서 필드의 초기값 확인
                //				 //setter를 이용해서 필드 값 변경
                //				 //getter를 이용해서 변경된 필드값 확인
                System.out.println("id : "+mdt.getId());
                System.out.println("pwd : "+mdt.getPwd());
                System.out.println("name : "+mdt.getName());
                System.out.println("age : "+mdt.getAge());
                System.out.println("gender : "+mdt.getgender());
                System.out.println("phone : "+mdt.getPhone());
                System.out.println("email : "+mdt.getEmail());

                /*setter후 getter*/

                mdt.setId("user01");
                mdt.setPwd("pass01");
                mdt.setName("홍길동");
                mdt.setAge(20);
                mdt.setGender('M');
                mdt.setPhone("010-1234+5678");
                mdt.setEmail("hong123@ohgiraffers.com");


                System.out.println("id : "+mdt.getId());
                System.out.println("pwd : "+mdt.getPwd());
                System.out.println("name : "+mdt.getName());
                System.out.println("age : "+mdt.getAge());
                System.out.println("gender : "+mdt.getgender());
                System.out.println("phone : "+mdt.getPhone());
                System.out.println("email : "+mdt.getEmail());




        }
}
/*다음과 같은 조건을 만족하는 프로그램을 작성하시오. (1)

반환형과 매개변수 유무에 따라 메소드를 작성하고, 이를 호출하거나 출력하시오.

1. 구현 클래스 및 구현 내용

com.ohgiraffers.practice02.level01.basic.member.model.dto.MemberDTO.java

- id : String
- pwd : String
- name : String
- age : int
- gender : char
- phone : String
- email : String

+ MemberDTO()

+ setters / getters             // 필드 수정용 메소드 / 필드값 리턴용 메소드


com.ohgiraffers.practice02.level01.basic.member.run.Application.java

+ main(args:String[]):void       // 모든 메소드는 main함수에서 호출하여 출력시킨다.

------------------------------------------------------------------------------------

2. Application 클래스 작성 내용

public class Application {
    public static void main(String args[]) {
         //getter를 이용해서 필드의 초기값 확인
				 //setter를 이용해서 필드 값 변경
				 //getter를 이용해서 변경된 필드값 확인
    }
}

------------------------------------------------------------------------------------

3. 실행 결과 예시c

id : null
pwd : null
name : null
age : 0
gender :
phone : null
email : null
변경 후 id : user01
변경 후 pwd : pass01
변경 후 name : 홍길동
변경 후 age : 20
변경 후 gender : M
변경 후 phone : 010-1234-5678
변경 후 email : hong123@ohgiraffers.com
*
* */




