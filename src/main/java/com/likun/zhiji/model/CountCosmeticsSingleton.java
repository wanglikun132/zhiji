package com.likun.zhiji.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/17
 */
public class CountCosmeticsSingleton {

	private volatile static CountCosmeticsSingleton uniqueInstance;

	private BigDecimal dijiatingprice = new BigDecimal(0) ;
	private BigDecimal diJiaTingCost = new BigDecimal(0);
	private BigDecimal RNWHuFaJingYouPrice = new BigDecimal(0);
	private BigDecimal RNWHuFaJingYouCost = new BigDecimal(0);
	private BigDecimal RNWShuiYangPrice = new BigDecimal(0);
	private BigDecimal RNWShuiYangCost = new BigDecimal(0);
	private BigDecimal RNWDongMoPrice = new BigDecimal(0);
	private BigDecimal RNWDongMoCost = new BigDecimal(0);
	private BigDecimal yuanCengPrice = new BigDecimal(0);
	private BigDecimal yuanCengCost = new BigDecimal(0);
	private BigDecimal aiYishenPrice = new BigDecimal(0);
	private BigDecimal aiYishenCost = new BigDecimal(0);
	//		摇滚动物园系列-护手霜
	private BigDecimal hushoushuangPrice = new BigDecimal(0);
	private BigDecimal hushoushuangCost = new BigDecimal(0);
	//		摇滚动物园系列-磨砂膏
	private BigDecimal moshagaoPrice = new BigDecimal(0);
	private BigDecimal moshagaoCost = new BigDecimal(0);
	//		摇滚动物园系列-身体乳
	private BigDecimal shengtiruPrice = new BigDecimal(0);
	private BigDecimal shengtiruCost = new BigDecimal(0);
	//		摇滚动物园系列-洗发水/洗发素
	private BigDecimal xifashuiPrice = new BigDecimal(0);
	private BigDecimal xifashuiCost = new BigDecimal(0);
	//		JM系列
	private BigDecimal JMPrice = new BigDecimal(0);
	private BigDecimal JMCost = new BigDecimal(0);
	//				其他产品
	private BigDecimal othersPrice = new BigDecimal(0);
	private BigDecimal othersCost = new BigDecimal(0);
	/**
	 * 	菊正宗去角质
 	 */
	private BigDecimal qujiaozhiPrice = new BigDecimal(0);
	private BigDecimal qujiaozhiCost = new BigDecimal(0);
	//		AHC系列
	private BigDecimal AHCPrice = new BigDecimal(0);
	private BigDecimal AHCCost = new BigDecimal(0);
	//				兰芝系列
	private BigDecimal lanzhiPrice = new BigDecimal(0);
	private BigDecimal lanzhiCost = new BigDecimal(0);

	private CountCosmeticsSingleton() {
	}

	public static CountCosmeticsSingleton getInstance(){
		if (uniqueInstance == null){
			synchronized (CountCosmeticsSingleton.class){
				if (uniqueInstance == null){
					uniqueInstance = new CountCosmeticsSingleton();
				}
			}
		}
		return uniqueInstance;
	}

	public BigDecimal getDijiatingprice() {
		return dijiatingprice.setScale(2);
	}

	public void setDijiatingprice(BigDecimal dijiatingprice) {

		this.dijiatingprice = getDijiatingprice().add(dijiatingprice).setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal getDiJiaTingCost() {
		return diJiaTingCost.setScale(2);
	}

	public void setDiJiaTingCost(BigDecimal diJiaTingCost) {
		this.diJiaTingCost = diJiaTingCost;
	}

	public BigDecimal getRNWHuFaJingYouPrice() {
		return RNWHuFaJingYouPrice;
	}

	public void setRNWHuFaJingYouPrice(BigDecimal RNWHuFaJingYouPrice) {
		this.RNWHuFaJingYouPrice = RNWHuFaJingYouPrice;
	}

	public BigDecimal getRNWHuFaJingYouCost() {
		return RNWHuFaJingYouCost;
	}

	public void setRNWHuFaJingYouCost(BigDecimal RNWHuFaJingYouCost) {
		this.RNWHuFaJingYouCost = RNWHuFaJingYouCost;
	}

	public BigDecimal getRNWShuiYangPrice() {
		return RNWShuiYangPrice;
	}

	public void setRNWShuiYangPrice(BigDecimal RNWShuiYangPrice) {
		this.RNWShuiYangPrice = RNWShuiYangPrice;
	}

	public BigDecimal getRNWShuiYangCost() {
		return RNWShuiYangCost;
	}

	public void setRNWShuiYangCost(BigDecimal RNWShuiYangCost) {
		this.RNWShuiYangCost = RNWShuiYangCost;
	}

	public BigDecimal getRNWDongMoPrice() {
		return RNWDongMoPrice;
	}

	public void setRNWDongMoPrice(BigDecimal RNWDongMoPrice) {
		this.RNWDongMoPrice = RNWDongMoPrice;
	}

	public BigDecimal getRNWDongMoCost() {
		return RNWDongMoCost;
	}

	public void setRNWDongMoCost(BigDecimal RNWDongMoCost) {
		this.RNWDongMoCost = RNWDongMoCost;
	}

	public BigDecimal getYuanCengPrice() {
		return yuanCengPrice;
	}

	public void setYuanCengPrice(BigDecimal yuanCengPrice) {
		this.yuanCengPrice = yuanCengPrice;
	}

	public BigDecimal getYuanCengCost() {
		return yuanCengCost;
	}

	public void setYuanCengCost(BigDecimal yuanCengCost) {
		this.yuanCengCost = yuanCengCost;
	}

	public BigDecimal getAiYishenPrice() {
		return aiYishenPrice;
	}

	public void setAiYishenPrice(BigDecimal aiYishenPrice) {
		this.aiYishenPrice = aiYishenPrice;
	}

	public BigDecimal getAiYishenCost() {
		return aiYishenCost;
	}

	public void setAiYishenCost(BigDecimal aiYishenCost) {
		this.aiYishenCost = aiYishenCost;
	}

	public BigDecimal getHushoushuangPrice() {
		return hushoushuangPrice;
	}

	public void setHushoushuangPrice(BigDecimal hushoushuangPrice) {
		this.hushoushuangPrice = hushoushuangPrice;
	}

	public BigDecimal getHushoushuangCost() {
		return hushoushuangCost;
	}

	public void setHushoushuangCost(BigDecimal hushoushuangCost) {
		this.hushoushuangCost = hushoushuangCost;
	}

	public BigDecimal getMoshagaoPrice() {
		return moshagaoPrice;
	}

	public void setMoshagaoPrice(BigDecimal moshagaoPrice) {
		this.moshagaoPrice = moshagaoPrice;
	}

	public BigDecimal getMoshagaoCost() {
		return moshagaoCost;
	}

	public void setMoshagaoCost(BigDecimal moshagaoCost) {
		this.moshagaoCost = moshagaoCost;
	}

	public BigDecimal getShengtiruPrice() {
		return shengtiruPrice;
	}

	public void setShengtiruPrice(BigDecimal shengtiruPrice) {
		this.shengtiruPrice = shengtiruPrice;
	}

	public BigDecimal getShengtiruCost() {
		return shengtiruCost;
	}

	public void setShengtiruCost(BigDecimal shengtiruCost) {
		this.shengtiruCost = shengtiruCost;
	}

	public BigDecimal getXifashuiPrice() {
		return xifashuiPrice;
	}

	public void setXifashuiPrice(BigDecimal xifashuiPrice) {
		this.xifashuiPrice = xifashuiPrice;
	}

	public BigDecimal getXifashuiCost() {
		return xifashuiCost;
	}

	public void setXifashuiCost(BigDecimal xifashuiCost) {
		this.xifashuiCost = xifashuiCost;
	}

	public BigDecimal getJMPrice() {
		return JMPrice;
	}

	public void setJMPrice(BigDecimal JMPrice) {
		this.JMPrice = JMPrice;
	}

	public BigDecimal getJMCost() {
		return JMCost;
	}

	public void setJMCost(BigDecimal JMCost) {
		this.JMCost = JMCost;
	}

	public BigDecimal getOthersPrice() {
		return othersPrice;
	}

	public void setOthersPrice(BigDecimal othersPrice) {
		this.othersPrice = othersPrice;
	}

	public BigDecimal getOthersCost() {
		return othersCost;
	}

	public void setOthersCost(BigDecimal othersCost) {
		this.othersCost = othersCost;
	}

	public BigDecimal getQujiaozhiPrice() {
		return qujiaozhiPrice;
	}

	public void setQujiaozhiPrice(BigDecimal qujiaozhiPrice) {
		this.qujiaozhiPrice = qujiaozhiPrice;
	}

	public BigDecimal getQujiaozhiCost() {
		return qujiaozhiCost;
	}

	public void setQujiaozhiCost(BigDecimal qujiaozhiCost) {
		this.qujiaozhiCost = qujiaozhiCost;
	}

	public BigDecimal getAHCPrice() {
		return AHCPrice;
	}

	public void setAHCPrice(BigDecimal AHCPrice) {
		this.AHCPrice = AHCPrice;
	}

	public BigDecimal getAHCCost() {
		return AHCCost;
	}

	public void setAHCCost(BigDecimal AHCCost) {
		this.AHCCost = AHCCost;
	}

	public BigDecimal getLanzhiPrice() {
		return lanzhiPrice;
	}

	public void setLanzhiPrice(BigDecimal lanzhiPrice) {
		this.lanzhiPrice = lanzhiPrice;
	}

	public BigDecimal getLanzhiCost() {
		return lanzhiCost;
	}

	public void setLanzhiCost(BigDecimal lanzhiCost) {
		this.lanzhiCost = lanzhiCost;
	}
}
