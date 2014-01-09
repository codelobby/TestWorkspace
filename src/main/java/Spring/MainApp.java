package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        ComponentWire obj = (ComponentWire) context.getBean("componentWire");

        obj.getMessage();

        BeanProperty obj2 = (BeanProperty) context.getBean("helloWorld");

        obj2.printMessage();
    }
}