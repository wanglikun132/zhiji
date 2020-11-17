package com.likun.zhiji.service;

import com.likun.zhiji.model.CountCosmeticsBeen;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 汪立坤
 * @version 1.0
 * @description 化妆品总价,成本计算接口
 * @create 2020/11/17
 */
public interface CalculationStrategyService {


	/**
	 * 计算总价
	 * @param list
	 * @param countCosmeticsBeen
	 * @return
	 */
	void countTotalPrice(List<Object> list, CountCosmeticsBeen countCosmeticsBeen);

	/**
	 * 计算总成本
	 * @param list
	 * @param countCosmeticsBeen
	 * @return
	 */
    void countTotalCost(List<Object> list, CountCosmeticsBeen countCosmeticsBeen);

	/**
	 * 计算总促销
	 * @param list
	 * @param countCosmeticsBeen
	 * @return
	 */
    void countTotalPromotion(List<Object> list, CountCosmeticsBeen countCosmeticsBeen);

	/**
	 * 计算总样品
	 * @param list
	 * @param countCosmeticsBeen
	 * @return
	 */
    void countTotalSample(List<Object> list, CountCosmeticsBeen countCosmeticsBeen);



}
