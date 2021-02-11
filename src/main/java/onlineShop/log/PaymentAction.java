package onlineShop.log;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 用来实例化一个bean
public class PaymentAction {
	@Autowired
	private Logger logger;

	public void pay(BigDecimal payValue) {
		logger.log("pay begin, payValue is " + payValue);
		logger.log("pay end");
	}
}
