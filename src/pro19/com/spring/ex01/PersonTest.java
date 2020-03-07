package pro19.com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("person.xml");
        PersonService person = (PersonService) factory.getBean("personService");
//        PersonService personService = new PersonService();
        person.sayHello();

    }
}
