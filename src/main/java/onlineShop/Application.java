package onlineShop;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import onlineShop.log.PaymentAction;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("payment.xml"); //classpath。。。是spring定义的，import进来的
        PaymentAction paymentAction = (PaymentAction) context.getBean("paymentAction");
        paymentAction.pay(new BigDecimal(2)); 
     }
}
