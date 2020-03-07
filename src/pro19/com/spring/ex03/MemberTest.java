package pro19.com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberTest {
    public static void main(String[] args) {

        BeanFactory factory = new GenericXmlApplicationContext("member.xml");
        MemberService service = (MemberService) factory.getBean("memberService");
        service.listMembers();
    }
}
