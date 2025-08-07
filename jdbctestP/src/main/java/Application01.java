import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

/*
Date : 20250806
Source : Application1
Author : JeongHoon
Email : hnjh12195@gmail.com
Comment : 코드설명(목적, 동작원리, 결과)
           목적 : jdbc 접속 TEST
           내용 : 1. 의존성
                    build.gradle/dependencies
//                    implementation 'mysql:mysql-connector-java:8.0.33'추가
                 2. Connection con = null;
                 DB접속을 위한 Connection 인스턴스 생성을 위한 레퍼런스 변수 선언
                 3. Class.forName("com.mysql.cj.jdbc.Driver");
                  클래스의 static 초기화 블록을 실행
                  동적으로 로드하는 기능을 함
                 4. DriverManager를 이용해 Connection 생성
                5. catch는  Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection
                con.close();
                총 3번 발생한다.
                 6.getconnection으로 연결한다.
                 7.con.close()는 db와의 연결을 종료한다. 인스턴스는 여전히 메모리에 남아있다. 
           결과 : 접속성공
Version 1.0 : 프로그램 작성
*/
public class Application01 {
    public static void main(String[] args) {
        System.out.println("start");
        Connection con = null;
        /*접속*/
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost/employeedb",
                    "ohgiraffers",
                    "ohgiraffers");
            System.out.println("URL = " + con.getMetaData().getURL());
            System.out.println("User = " + con.getMetaData().getUserName());
            System.out.println("Is Closed = " + con.isClosed());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            if(con!=null){
                try {
                    con.close();// DB와의 연결종료, 인스턴스는 여전히 남아있음.
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        /*접속 끝*/
        System.out.println(con);/*인스턴스는 남아있음 */
        System.out.println("return 0");
    }
}
