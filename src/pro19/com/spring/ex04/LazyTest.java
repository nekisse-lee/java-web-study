package pro19.com.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LazyTest {
    public static void main(String[] args) {

        ApplicationContext ctx = new GenericXmlApplicationContext("lazy.xml");
        System.out.println("SecondBean 얻기");
        ctx.getBean("secondBean");
    }
}
