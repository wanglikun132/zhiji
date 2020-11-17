package com.likun.zhiji.service.impl;

import com.likun.zhiji.model.CountCosmeticsBeen;
import com.likun.zhiji.service.CalculationStrategyService;
import com.likun.zhiji.service.CalculationStrategyServiceFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/17
 */
@Service
public class HuFaJingYouService implements CalculationStrategyService, InitializingBean {
	@Override
	public Boolean countTotalPrice(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
		return null;
	}

	@Override
	public Boolean countTotalCost(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
		return null;
	}

	@Override
	public Boolean countTotalPromotion(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
		return null;
	}

	@Override
	public Boolean countTotalSample(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		CalculationStrategyServiceFactory.register(0,this);
	}
}
