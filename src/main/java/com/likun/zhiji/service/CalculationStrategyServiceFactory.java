package com.likun.zhiji.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/17
 */
@Service
public class CalculationStrategyServiceFactory {

	private static Map<Integer,CalculationStrategyService> services = new ConcurrentHashMap<>();

	public static CalculationStrategyService getByIndex(Integer index){
		return services.get(index);
	}

	public static void register(Integer index,CalculationStrategyService calculationStrategyService){
		Assert.notNull(index,"index can not be null");
		services.put(index,calculationStrategyService);
	}

}
