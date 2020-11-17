package com.likun.zhiji.util;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.google.common.util.concurrent.AtomicDouble;
import com.likun.zhiji.model.CountCosmeticsBeen;
import com.likun.zhiji.service.CalculationStrategyService;
import com.likun.zhiji.service.CalculationStrategyServiceFactory;

import java.util.List;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/16
 */
public class ExportExcel {
	private static String[] keyWords = {"RNW护发精油","RNW冻膜","水杨酸","原辰","艾医生","护手霜","磨砂膏","身体乳","摇滚动物园,洗发水,洗发膏","JM","菊正宗去角质","蒂甲婷","AHC","兰芝"};

	public static void main(String[] args) {


		AtomicDouble dijiatingprice = new AtomicDouble();
		AtomicDouble diJiaTingCost = new AtomicDouble();
		AtomicDouble RNWHuFaJingYouPrice = new AtomicDouble();
		AtomicDouble RNWHuFaJingYouCost = new AtomicDouble();
		AtomicDouble RNWShuiYangPrice = new AtomicDouble();
		AtomicDouble RNWShuiYangCost = new AtomicDouble();
		AtomicDouble RNWDongMoPrice = new AtomicDouble();
		AtomicDouble RNWDongMoCost = new AtomicDouble();
		AtomicDouble yuanCengPrice = new AtomicDouble();
		AtomicDouble yuanCengCost = new AtomicDouble();
		AtomicDouble aiYishenPrice = new AtomicDouble();
		AtomicDouble aiYishenCost = new AtomicDouble();
		//		摇滚动物园系列-护手霜
		AtomicDouble hushoushuangPrice = new AtomicDouble();
		AtomicDouble hushoushuangCost = new AtomicDouble();
		//		摇滚动物园系列-磨砂膏
		AtomicDouble moshagaoPrice = new AtomicDouble();
		AtomicDouble moshagaoCost = new AtomicDouble();
		//		摇滚动物园系列-身体乳
		AtomicDouble shengtiruPrice = new AtomicDouble();
		AtomicDouble shengtiruCost = new AtomicDouble();
		//		摇滚动物园系列-洗发水/洗发素
		AtomicDouble xifashuiPrice = new AtomicDouble();
		AtomicDouble xifashuiCost = new AtomicDouble();
		//		JM系列
		AtomicDouble JMPrice = new AtomicDouble();
		AtomicDouble JMCost = new AtomicDouble();
		//				其他产品
		AtomicDouble othersPrice = new AtomicDouble();
		AtomicDouble othersCost = new AtomicDouble();
		//		菊正宗去角质
		AtomicDouble qujiaozhiPrice = new AtomicDouble();
		AtomicDouble qujiaozhiCost = new AtomicDouble();
		//		AHC系列
		AtomicDouble AHCPrice = new AtomicDouble();
		AtomicDouble AHCCost = new AtomicDouble();
		//				兰芝系列
		AtomicDouble lanzhiPrice = new AtomicDouble();
		AtomicDouble lanzhiCost = new AtomicDouble();


		ExcelReader reader = ExcelUtil.getReader("E:\\ideaproject\\zhiji\\11.1-11.16.xlsx", 1);
		List<List<Object>> readAll = reader.read();
		System.out.println(readAll.size());

		CountCosmeticsBeen countCosmeticsBeen = new CountCosmeticsBeen();

		for (int a = 1; a < readAll.size(); a++){

		}

		readAll.forEach(totalTable -> {

			Object o = totalTable.get(7);
			String productName = String.valueOf(o);
			boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
			int num = 0;
			if (productName.contains(""))
			if (b){
				CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(8);
				byIndex.countTotalPrice(totalTable,countCosmeticsBeen);
				num++;
				return;
			}else{
				for (int i = 0;i < keyWords.length;i++){
					if (productName.toLowerCase().contains(keyWords[i].toLowerCase())){
						CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(i);
						byIndex.countTotalPrice(totalTable,countCosmeticsBeen);
						num++;
						continue;
					}
				}
			}
			if (num == 0){
				CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(-1);
				byIndex.countTotalPrice(totalTable,countCosmeticsBeen);
			}

			if (productName.toLowerCase().contains("蒂佳婷".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, dijiatingprice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, diJiaTingCost.doubleValue());
				dijiatingprice.set(totalPrice1);
				diJiaTingCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("RNW护发精油".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, RNWHuFaJingYouPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, RNWHuFaJingYouCost.doubleValue());
				RNWHuFaJingYouPrice.set(totalPrice1);
				RNWHuFaJingYouCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("水杨酸".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, RNWShuiYangPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, RNWShuiYangCost.doubleValue());
				RNWShuiYangPrice.set(totalPrice1);
				RNWShuiYangCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("RNW冻膜".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, RNWDongMoPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, RNWDongMoCost.doubleValue());
				RNWDongMoPrice.set(totalPrice1);
				RNWDongMoCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
				yuanCengPrice.set(totalPrice1);
				yuanCengCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("艾医生".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, aiYishenPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, aiYishenCost.doubleValue());
				aiYishenPrice.set(totalPrice1);
				aiYishenCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("护手霜".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, hushoushuangPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, hushoushuangCost.doubleValue());
				hushoushuangPrice.set(totalPrice1);
				hushoushuangCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("磨砂膏".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, moshagaoPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, moshagaoCost.doubleValue());
				moshagaoPrice.set(totalPrice1);
				moshagaoCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("身体乳".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, shengtiruPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, shengtiruCost.doubleValue());
				shengtiruPrice.set(totalPrice1);
				shengtiruCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
				yuanCengPrice.set(totalPrice1);
				yuanCengCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
				yuanCengPrice.set(totalPrice1);
				yuanCengCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
				yuanCengPrice.set(totalPrice1);
				yuanCengCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
				yuanCengPrice.set(totalPrice1);
				yuanCengCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
				yuanCengPrice.set(totalPrice1);
				yuanCengCost.set(totalCost1);
			} else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
				Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
				Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
				yuanCengPrice.set(totalPrice1);
				yuanCengCost.set(totalCost1);
			}
		});

		System.out.println("蒂佳婷系列的销售额为:" + dijiatingprice + "总成本为:" + diJiaTingCost);
		System.out.println("RNW护发精油的销售额为:" + RNWHuFaJingYouPrice + "总成本为:" + RNWHuFaJingYouCost);
		System.out.println("RNW水杨酸棉片的销售额为:" + RNWShuiYangPrice + "总成本为:" + RNWShuiYangCost);
		System.out.println("RNW冻膜的销售额为:" + RNWDongMoPrice + "总成本为:" + RNWDongMoCost);


	}

	public static Double getTotalPrice(List<Object> objects, Double currentPrice) {
		Object totalPrice = objects.get(10);
		double v1 = Double.parseDouble(totalPrice.toString());
		return v1 + currentPrice;
	}

	public static Double getTotalCost(List<Object> objects, Double currentPrice) {
		Object totalPrice = objects.get(12);
		double v1 = Double.parseDouble(totalPrice.toString());
		return v1 + currentPrice;
	}


}
