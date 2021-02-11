package onlineShop.log;

import org.springframework.stereotype.Component;

@Component(value = "serverLogger") //给bean加个名字
public class ServerLogger implements Logger {
    public void log(String info) {
        System.out.println("server log = " + info);
    }
}
