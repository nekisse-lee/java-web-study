package pro10.sec04.ex02;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class Pro10Sec04Ex02LoginImpl implements HttpSessionListener {
    String user_id;
    String user_pw;
    static int total_user = 0;
    // Public constructor is required by servlet spec


    public Pro10Sec04Ex02LoginImpl() {
    }

    public Pro10Sec04Ex02LoginImpl(String user_id, String user_pw) {
        this.user_id = user_id;
        this.user_pw = user_pw;
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("세션 생성");
        ++total_user;
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("세션 소멸");
        --total_user;
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------


}
