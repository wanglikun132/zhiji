package com.likun.zhiji.service.impl;

import com.likun.zhiji.model.CountCosmeticsBeen;
import com.likun.zhiji.service.CalculationStrategyService;
import com.likun.zhiji.service.CalculationStrategyServiceFactory;
import com.likun.zhiji.util.MathUtils;
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
public class QuJiaoZhiService implements CalculationStrategyService, InitializingBean {
	@Override
	public void countTotalPrice(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
        Object totalPrice = list.get(10);
        countCosmeticsBeen.setQujiaozhiPrice(MathUtils.getBigDecimal(totalPrice));
	}

	@Override
	public void countTotalCost(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
        Object totalPrice = list.get(12);
        countCosmeticsBeen.setQujiaozhiCost(MathUtils.getBigDecimal(totalPrice));
	}

	@Override
	public void countTotalPromotion(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
        Object totalPrice = list.get(12);
        countCosmeticsBeen.setQujiaozhiPromotion(MathUtils.getBigDecimal(totalPrice));
	}

	@Override
	public void countTotalSample(List<Object> list, CountCosmeticsBeen countCosmeticsBeen) {
        Object totalPrice = list.get(12);
        countCosmeticsBeen.setQujiaozhiSample(MathUtils.getBigDecimal(totalPrice));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		CalculationStrategyServiceFactory.register(10,this);
	}
}
