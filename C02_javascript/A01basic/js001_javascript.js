/*
250710 NODE.js에 대해 더 알아봐야됨 


    javascript
        web browser에서 동작하는 programming lan
        인터프린터 언어 (컴파일 x)
        문법은 c와 java와 비슷
            일급 함수
                Lisp, Scheme, ML에서 가져옴, 
                javascript에서 함수는 변수에 할당됨
                다른 함수에 인자를 넘길 수 있음
                반환값으로도 사용가능
                    고차함수구현가능 map, filter, reduce
                    클로저 지원
                        내부함수가 외부함수의 변수에 접근가능
                        private변수구현, 상태유지등
                    동적로직처리
                     함수를 다른 함수의 인자로 넘기기 가능, 반환값 사용가능 콜백패턴 이벤트핸들링에 매우유용
                     DLS처럼 표현가능 
                     특정 도메인에 맞쳐 유연한표현가능
            프로토타입
                - Self, Lua, smalltalk에서 가져옴
                전통적인 클래스 기반이 아님
                객체가 다른 객체를 직접 상속하는 프로토타입 모델
                    동적상속가능
                    메모리효율성
                    객체확장 자유로움
                    다형성

    개발환경
        브라우저환경, Node.js환경에서 실행가능
        공통점: ECMAScript 실행가능 ( 코어)

        차이점
            브라우저는 DOMAPI기본제공
            Node.js는 제공하지 않음

Node.js?


*/