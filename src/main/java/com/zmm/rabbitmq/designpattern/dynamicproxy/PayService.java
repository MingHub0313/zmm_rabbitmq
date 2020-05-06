package com.zmm.rabbitmq.designpattern.dynamicproxy;

import java.math.BigDecimal;

/**
 * @Name PayService
 * @Author 900045
 * @Created by 2020/5/6 0006
 */
public interface PayService {

	void pay(String username, BigDecimal money);

	void a();

	void b();
}
