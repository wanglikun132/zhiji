package com.likun.zhiji.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.google.common.util.concurrent.AtomicDouble;
import com.likun.zhiji.model.CountCosmeticsBeen;
import com.likun.zhiji.service.CalculationStrategyService;
import com.likun.zhiji.service.CalculationStrategyServiceFactory;

import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/16
 */
public class ExportExcel {
	private static String[] keyWords = {"RNW护发精油","RNW冻膜","水杨酸","原辰","艾医生","护手霜","磨砂膏","身体乳","摇滚动物园,洗发水,洗发膏","JM","菊正宗去角质","蒂佳婷","AHC","兰芝"};

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


		ExcelReader reader = ExcelUtil.getReader("/Users/wlk/Documents/myproject/zhiji/11.1-11.16.xlsx", 1);
		List<List<Object>> readAll = reader.read();
		System.out.println(readAll.size());

		CountCosmeticsBeen countCosmeticsBeen = new CountCosmeticsBeen();

		for (int a = 1; a < readAll.size(); a++){
            Object o = readAll.get(a).get(7);
            String productName = String.valueOf(o);
            boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
            int num = 0;
                if (b){
                    CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(8);
                    byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
                    num++;
                    return;
                }else{
                    for (int i = 0;i < keyWords.length;i++){
                        if (productName.toLowerCase().contains(keyWords[i].toLowerCase())){
                            CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(i);
                            byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
                            num++;
                            continue;
                        }
                    }
                }
            if (num == 0){
                CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(-1);
                byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
            }
		}

		readAll.forEach(totalTable -> {

			Object o = totalTable.get(7);
			String productName = String.valueOf(o);
			boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
			int num = 0;
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

        System.out.println(countCosmeticsBeen.getRNWHuFaJingYouPrice().setScale(2,RoundingMode.HALF_UP));

	}

	public static void testExcel(){

//        ExcelReader reader = ExcelUtil.getReader("/Users/wlk/Documents/myproject/zhiji/11.1-11.16.xlsx", 1);
//        List<List<Object>> readAll = reader.read();
//
//        CountCosmeticsBeen countCosmeticsBeen = new CountCosmeticsBeen();
//
//        for (int a = 1; a < readAll.size(); a++){
//            Object o = readAll.get(a).get(7);
//            String productName = String.valueOf(o);
//            boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
//            int num = 0;
//            if (b){
//                CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(8);
//                byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
//                byIndex.countTotalCost(readAll.get(a),countCosmeticsBeen);
//                num++;
//                return;
//            }else{
//                for (int i = 0;i < keyWords.length;i++){
//                    if (productName.toLowerCase().contains(keyWords[i].toLowerCase())){
//                        CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(i);
//                        byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
//                        byIndex.countTotalCost(readAll.get(a),countCosmeticsBeen);
//                        num++;
//                        continue;
//                    }
//                }
//            }
//            if (num == 0){
//                CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(-1);
//                byIndex.countTotalCost(readAll.get(a),countCosmeticsBeen);
//                byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
//            }
//        }


        CountCosmeticsBeen countCosmeticsBeen = new CountCosmeticsBeen();
        countExcel(1,countCosmeticsBeen);
        countExcel(2,countCosmeticsBeen);
        countExcel(3,countCosmeticsBeen);
        if (Objects.nonNull(countCosmeticsBeen)){
            System.out.println(countCosmeticsBeen.getRNWHuFaJingYouPrice());
            System.out.println(countCosmeticsBeen.toString());
            exportExcel(countCosmeticsBeen);
        }



//        readAll.forEach(totalTable -> {
//
//            Object o = totalTable.get(7);
//            String productName = String.valueOf(o);
//            boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
//            int num = 0;
//            if (b){
//                CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(8);
//                byIndex.countTotalPrice(totalTable,countCosmeticsBeen);
//                num++;
//                return;
//            }else{
//                for (int i = 0;i < keyWords.length;i++){
//                    if (productName.toLowerCase().contains(keyWords[i].toLowerCase())){
//                        CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(i);
//                        byIndex.countTotalPrice(totalTable,countCosmeticsBeen);
//                        num++;
//                        continue;
//                    }
//                }
//            }
//            if (num == 0){
//                CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(-1);
//                byIndex.countTotalPrice(totalTable,countCosmeticsBeen);
//            }
//
//            if (productName.toLowerCase().contains("蒂佳婷".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, dijiatingprice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, diJiaTingCost.doubleValue());
//                dijiatingprice.set(totalPrice1);
//                diJiaTingCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("RNW护发精油".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, RNWHuFaJingYouPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, RNWHuFaJingYouCost.doubleValue());
//                RNWHuFaJingYouPrice.set(totalPrice1);
//                RNWHuFaJingYouCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("水杨酸".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, RNWShuiYangPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, RNWShuiYangCost.doubleValue());
//                RNWShuiYangPrice.set(totalPrice1);
//                RNWShuiYangCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("RNW冻膜".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, RNWDongMoPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, RNWDongMoCost.doubleValue());
//                RNWDongMoPrice.set(totalPrice1);
//                RNWDongMoCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
//                yuanCengPrice.set(totalPrice1);
//                yuanCengCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("艾医生".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, aiYishenPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, aiYishenCost.doubleValue());
//                aiYishenPrice.set(totalPrice1);
//                aiYishenCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("护手霜".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, hushoushuangPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, hushoushuangCost.doubleValue());
//                hushoushuangPrice.set(totalPrice1);
//                hushoushuangCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("磨砂膏".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, moshagaoPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, moshagaoCost.doubleValue());
//                moshagaoPrice.set(totalPrice1);
//                moshagaoCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("身体乳".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, shengtiruPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, shengtiruCost.doubleValue());
//                shengtiruPrice.set(totalPrice1);
//                shengtiruCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
//                yuanCengPrice.set(totalPrice1);
//                yuanCengCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
//                yuanCengPrice.set(totalPrice1);
//                yuanCengCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
//                yuanCengPrice.set(totalPrice1);
//                yuanCengCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
//                yuanCengPrice.set(totalPrice1);
//                yuanCengCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
//                yuanCengPrice.set(totalPrice1);
//                yuanCengCost.set(totalCost1);
//            } else if (productName.toLowerCase().contains("原辰".toLowerCase())) {
//                Double totalPrice1 = getTotalPrice(totalTable, yuanCengPrice.doubleValue());
//                Double totalCost1 = getTotalCost(totalTable, yuanCengCost.doubleValue());
//                yuanCengPrice.set(totalPrice1);
//                yuanCengCost.set(totalCost1);
//            }
//        });
//
//        System.out.println("蒂佳婷系列的销售额为:" + dijiatingprice + "总成本为:" + diJiaTingCost);
//        System.out.println("RNW护发精油的销售额为:" + RNWHuFaJingYouPrice + "总成本为:" + RNWHuFaJingYouCost);
//        System.out.println("RNW水杨酸棉片的销售额为:" + RNWShuiYangPrice + "总成本为:" + RNWShuiYangCost);
//        System.out.println("RNW冻膜的销售额为:" + RNWDongMoPrice + "总成本为:" + RNWDongMoCost);

//        System.out.println(countCosmeticsBeen.getRNWHuFaJingYouPrice().setScale(2,RoundingMode.HALF_UP));



    }

    public static void countExcel(int page,CountCosmeticsBeen countCosmeticsBeen){
        ExcelReader reader = ExcelUtil.getReader("/Users/wlk/Documents/myproject/zhiji/11.1-11.16.xlsx", page);
        List<List<Object>> readAll = reader.read();
	    if (page == 1){
            for (int a = 1; a < readAll.size(); a++){
                Object o = readAll.get(a).get(7);
                String productName = String.valueOf(o);
                boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
                int num = 0;
                if (b){
                    CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(8);
                    byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
                    byIndex.countTotalCost(readAll.get(a),countCosmeticsBeen);
                    num++;
                    return;
                }else{
                    for (int i = 0;i < keyWords.length;i++){
                        if (productName.toLowerCase().contains(keyWords[i].toLowerCase())){
                            CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(i);
                            byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
                            byIndex.countTotalCost(readAll.get(a),countCosmeticsBeen);
                            num++;
                            continue;
                        }
                    }
                }
                if (num == 0){
                    CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(-1);
                    byIndex.countTotalCost(readAll.get(a),countCosmeticsBeen);
                    byIndex.countTotalPrice(readAll.get(a),countCosmeticsBeen);
                }
            }
        }
        if (page == 2){
            for (int a = 1; a < readAll.size(); a++){
                Object o = readAll.get(a).get(7);
                String productName = String.valueOf(o);
                boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
                int num = 0;
                if (b){
                    CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(8);
                    byIndex.countTotalPromotion(readAll.get(a),countCosmeticsBeen);
                    num++;
                    return;
                }else{
                    for (int i = 0;i < keyWords.length;i++){
                        if (productName.toLowerCase().contains(keyWords[i].toLowerCase())){
                            CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(i);
                            byIndex.countTotalPromotion(readAll.get(a),countCosmeticsBeen);
                            num++;
                            continue;
                        }
                    }
                }
                if (num == 0){
                    CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(-1);
                    byIndex.countTotalPromotion(readAll.get(a),countCosmeticsBeen);
                }
            }
        }
        if (page == 3){
            for (int a = 1; a < readAll.size(); a++){
                Object o = readAll.get(a).get(7);
                String productName = String.valueOf(o);
                boolean b = productName.contains("摇滚动物园") && (productName.contains("洗发水") || productName.contains("洗发膏"));
                int num = 0;
                if (b){
                    CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(8);
                    byIndex.countTotalSample(readAll.get(a),countCosmeticsBeen);
                    num++;
                    return;
                }else{
                    for (int i = 0;i < keyWords.length;i++){
                        if (productName.toLowerCase().contains(keyWords[i].toLowerCase())){
                            CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(i);
                            byIndex.countTotalSample(readAll.get(a),countCosmeticsBeen);
                            num++;
                            continue;
                        }
                    }
                }
                if (num == 0){
                    CalculationStrategyService byIndex = CalculationStrategyServiceFactory.getByIndex(-1);
                    byIndex.countTotalSample(readAll.get(a),countCosmeticsBeen);
                }
            }
        }
        System.out.println(countCosmeticsBeen.getRNWHuFaJingYouPrice().setScale(2,RoundingMode.HALF_UP));

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

	public static void exportExcel(CountCosmeticsBeen countCosmeticsBeen){

        List<Object> row1 = CollUtil.newArrayList("项目", "销售额", "总成本", "其中促销","其中样品","毛利","毛利率");
        List<Object> row2 = CollUtil.newArrayList("RNW护发精油", countCosmeticsBeen.getHushoushuangPrice().setScale(2,RoundingMode.HALF_UP), countCosmeticsBeen.getRNWHuFaJingYouCost().setScale(2,RoundingMode.HALF_UP), countCosmeticsBeen.getHushoushuangPromotion().setScale(2,RoundingMode.HALF_UP),countCosmeticsBeen.getHushoushuangSample().setScale(2,RoundingMode.HALF_UP),countCosmeticsBeen.getRNWHuFaJingYouPrice().subtract(countCosmeticsBeen.getRNWHuFaJingYouCost()).setScale(2,RoundingMode.HALF_UP),countCosmeticsBeen.getRNWHuFaJingYouPrice().subtract(countCosmeticsBeen.getRNWHuFaJingYouCost()).divide(countCosmeticsBeen.getRNWHuFaJingYouPrice(),20,RoundingMode.HALF_UP).setScale(2,RoundingMode.HALF_UP));
        List<List<Object>> rows = CollUtil.newArrayList(row1, row2);

        //通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getWriter("/Users/wlk/Documents/myproject/zhiji/产品分析.xlsx");
//通过构造方法创建writer
//ExcelWriter writer = new ExcelWriter("d:/writeTest.xls");

//跳过当前行，既第一行，非必须，在此演示用
        writer.passCurrentRow();

//合并单元格后的标题行，使用默认标题样式
        writer.merge(row1.size() - 1, "11.1-11.15产品分布表");
//一次性写出内容，强制输出标题
        writer.write(rows, true);
//关闭writer，释放内存
        writer.close();

    }


}
