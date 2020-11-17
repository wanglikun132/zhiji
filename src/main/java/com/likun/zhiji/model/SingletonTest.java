package com.likun.zhiji.model;

import java.math.BigDecimal;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/17
 */
public class SingletonTest {

	public static void main(String[] args) {
		CountCosmeticsSingleton instance = CountCosmeticsSingleton.getInstance();
		instance.setAHCCost(new BigDecimal(1000));
		System.out.println(instance.getAHCCost());
		CountCosmeticsSingleton instance1 = CountCosmeticsSingleton.getInstance();
		instance1.setAHCCost(new BigDecimal(2000));
		System.out.println(instance.getAHCCost());

		instance.setDijiatingprice(new BigDecimal(888.88));
		System.out.println(instance.getDijiatingprice());
		instance.setDijiatingprice(new BigDecimal(888.88));
		System.out.println(instance.getDijiatingprice());
		instance.setDijiatingprice(new BigDecimal(888.88));
		System.out.println(instance.getDijiatingprice());
		instance1.setDijiatingprice(new BigDecimal(888.88));
		System.out.println(instance.getDijiatingprice());
		instance1.setDijiatingprice(new BigDecimal(888.88));
		System.out.println(instance.getDijiatingprice());
		instance1.setDijiatingprice(new BigDecimal(888.88));
		System.out.println(instance.getDijiatingprice());

	}
}
