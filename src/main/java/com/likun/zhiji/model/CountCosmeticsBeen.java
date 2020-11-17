package com.likun.zhiji.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/17
 */
public class CountCosmeticsBeen implements Serializable {

	private static final long serialVersionUID = -1650259054993757238L;

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
	private BigDecimal hushoushuangPrice = new BigDecimal(0);
	private BigDecimal hushoushuangCost = new BigDecimal(0);
	private BigDecimal moshagaoPrice = new BigDecimal(0);
	private BigDecimal moshagaoCost = new BigDecimal(0);
	private BigDecimal shengtiruPrice = new BigDecimal(0);
	private BigDecimal shengtiruCost = new BigDecimal(0);
	private BigDecimal xifashuiPrice = new BigDecimal(0);
	private BigDecimal xifashuiCost = new BigDecimal(0);
	private BigDecimal JMPrice = new BigDecimal(0);
	private BigDecimal JMCost = new BigDecimal(0);
	private BigDecimal othersPrice = new BigDecimal(0);
	private BigDecimal othersCost = new BigDecimal(0);
	private BigDecimal qujiaozhiPrice = new BigDecimal(0);
	private BigDecimal qujiaozhiCost = new BigDecimal(0);
	private BigDecimal AHCPrice = new BigDecimal(0);
	private BigDecimal AHCCost = new BigDecimal(0);
	private BigDecimal lanzhiPrice = new BigDecimal(0);
	private BigDecimal lanzhiCost = new BigDecimal(0);

	public CountCosmeticsBeen() {
	}

	public CountCosmeticsBeen(BigDecimal dijiatingprice, BigDecimal diJiaTingCost, BigDecimal RNWHuFaJingYouPrice, BigDecimal RNWHuFaJingYouCost, BigDecimal RNWShuiYangPrice, BigDecimal RNWShuiYangCost, BigDecimal RNWDongMoPrice, BigDecimal RNWDongMoCost, BigDecimal yuanCengPrice, BigDecimal yuanCengCost, BigDecimal aiYishenPrice, BigDecimal aiYishenCost, BigDecimal hushoushuangPrice, BigDecimal hushoushuangCost, BigDecimal moshagaoPrice, BigDecimal moshagaoCost, BigDecimal shengtiruPrice, BigDecimal shengtiruCost, BigDecimal xifashuiPrice, BigDecimal xifashuiCost, BigDecimal JMPrice, BigDecimal JMCost, BigDecimal othersPrice, BigDecimal othersCost, BigDecimal qujiaozhiPrice, BigDecimal qujiaozhiCost, BigDecimal AHCPrice, BigDecimal AHCCost, BigDecimal lanzhiPrice, BigDecimal lanzhiCost) {
		this.dijiatingprice = dijiatingprice;
		this.diJiaTingCost = diJiaTingCost;
		this.RNWHuFaJingYouPrice = RNWHuFaJingYouPrice;
		this.RNWHuFaJingYouCost = RNWHuFaJingYouCost;
		this.RNWShuiYangPrice = RNWShuiYangPrice;
		this.RNWShuiYangCost = RNWShuiYangCost;
		this.RNWDongMoPrice = RNWDongMoPrice;
		this.RNWDongMoCost = RNWDongMoCost;
		this.yuanCengPrice = yuanCengPrice;
		this.yuanCengCost = yuanCengCost;
		this.aiYishenPrice = aiYishenPrice;
		this.aiYishenCost = aiYishenCost;
		this.hushoushuangPrice = hushoushuangPrice;
		this.hushoushuangCost = hushoushuangCost;
		this.moshagaoPrice = moshagaoPrice;
		this.moshagaoCost = moshagaoCost;
		this.shengtiruPrice = shengtiruPrice;
		this.shengtiruCost = shengtiruCost;
		this.xifashuiPrice = xifashuiPrice;
		this.xifashuiCost = xifashuiCost;
		this.JMPrice = JMPrice;
		this.JMCost = JMCost;
		this.othersPrice = othersPrice;
		this.othersCost = othersCost;
		this.qujiaozhiPrice = qujiaozhiPrice;
		this.qujiaozhiCost = qujiaozhiCost;
		this.AHCPrice = AHCPrice;
		this.AHCCost = AHCCost;
		this.lanzhiPrice = lanzhiPrice;
		this.lanzhiCost = lanzhiCost;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public BigDecimal getDijiatingprice() {
		return dijiatingprice;
	}

	public void setDijiatingprice(BigDecimal dijiatingprice) {
		this.dijiatingprice = getDijiatingprice().add(dijiatingprice);
	}

	public BigDecimal getDiJiaTingCost() {
		return diJiaTingCost;
	}

	public void setDiJiaTingCost(BigDecimal diJiaTingCost) {
		this.diJiaTingCost = getDiJiaTingCost().add(diJiaTingCost);
	}

	public BigDecimal getRNWHuFaJingYouPrice() {
		return RNWHuFaJingYouPrice;
	}

	public void setRNWHuFaJingYouPrice(BigDecimal RNWHuFaJingYouPrice) {
		this.RNWHuFaJingYouPrice = getRNWHuFaJingYouPrice().add(RNWHuFaJingYouPrice);
	}

	public BigDecimal getRNWHuFaJingYouCost() {
		return RNWHuFaJingYouCost;
	}

	public void setRNWHuFaJingYouCost(BigDecimal RNWHuFaJingYouCost) {
		this.RNWHuFaJingYouCost = getRNWHuFaJingYouCost().add(RNWHuFaJingYouCost);
	}

	public BigDecimal getRNWShuiYangPrice() {
		return RNWShuiYangPrice;
	}

	public void setRNWShuiYangPrice(BigDecimal RNWShuiYangPrice) {
		this.RNWShuiYangPrice = getRNWShuiYangPrice().add(RNWShuiYangPrice);
	}

	public BigDecimal getRNWShuiYangCost() {
		return RNWShuiYangCost;
	}

	public void setRNWShuiYangCost(BigDecimal RNWShuiYangCost) {
		this.RNWShuiYangCost = getRNWShuiYangCost().add(RNWShuiYangCost);
	}

	public BigDecimal getRNWDongMoPrice() {
		return RNWDongMoPrice;
	}

	public void setRNWDongMoPrice(BigDecimal RNWDongMoPrice) {
		this.RNWDongMoPrice = getRNWDongMoPrice().add(RNWDongMoPrice);
	}

	public BigDecimal getRNWDongMoCost() {
		return RNWDongMoCost;
	}

	public void setRNWDongMoCost(BigDecimal RNWDongMoCost) {
		this.RNWDongMoCost = getRNWDongMoCost().add(RNWDongMoCost);
	}

	public BigDecimal getYuanCengPrice() {
		return yuanCengPrice;
	}

	public void setYuanCengPrice(BigDecimal yuanCengPrice) {
		this.yuanCengPrice = getYuanCengPrice().add(yuanCengPrice);
	}

	public BigDecimal getYuanCengCost() {
		return yuanCengCost;
	}

	public void setYuanCengCost(BigDecimal yuanCengCost) {
		this.yuanCengCost = getYuanCengCost().add(yuanCengCost);
	}

	public BigDecimal getAiYishenPrice() {
		return aiYishenPrice;
	}

	public void setAiYishenPrice(BigDecimal aiYishenPrice) {
		this.aiYishenPrice = getAiYishenPrice().add(aiYishenPrice);
	}

	public BigDecimal getAiYishenCost() {
		return aiYishenCost;
	}

	public void setAiYishenCost(BigDecimal aiYishenCost) {
		this.aiYishenCost = getAiYishenCost().add(aiYishenCost);
	}

	public BigDecimal getHushoushuangPrice() {
		return hushoushuangPrice;
	}

	public void setHushoushuangPrice(BigDecimal hushoushuangPrice) {
		this.hushoushuangPrice = getHushoushuangPrice().add(hushoushuangPrice);
	}

	public BigDecimal getHushoushuangCost() {
		return hushoushuangCost;
	}

	public void setHushoushuangCost(BigDecimal hushoushuangCost) {
		this.hushoushuangCost = getHushoushuangCost().add(hushoushuangCost);
	}

	public BigDecimal getMoshagaoPrice() {
		return moshagaoPrice;
	}

	public void setMoshagaoPrice(BigDecimal moshagaoPrice) {
		this.moshagaoPrice = getMoshagaoPrice().add(moshagaoPrice);
	}

	public BigDecimal getMoshagaoCost() {
		return moshagaoCost;
	}

	public void setMoshagaoCost(BigDecimal moshagaoCost) {
		this.moshagaoCost = getMoshagaoCost().add(moshagaoCost);
	}

	public BigDecimal getShengtiruPrice() {
		return shengtiruPrice;
	}

	public void setShengtiruPrice(BigDecimal shengtiruPrice) {
		this.shengtiruPrice = getShengtiruPrice().add(shengtiruPrice);
	}

	public BigDecimal getShengtiruCost() {
		return shengtiruCost;
	}

	public void setShengtiruCost(BigDecimal shengtiruCost) {
		this.shengtiruCost = getShengtiruCost().add(shengtiruCost);
	}

	public BigDecimal getXifashuiPrice() {
		return xifashuiPrice;
	}

	public void setXifashuiPrice(BigDecimal xifashuiPrice) {
		this.xifashuiPrice = getXifashuiPrice().add(xifashuiPrice);
	}

	public BigDecimal getXifashuiCost() {
		return xifashuiCost;
	}

	public void setXifashuiCost(BigDecimal xifashuiCost) {
		this.xifashuiCost = getXifashuiCost().add(xifashuiCost);
	}

	public BigDecimal getJMPrice() {
		return JMPrice;
	}

	public void setJMPrice(BigDecimal JMPrice) {
		this.JMPrice = getJMPrice().add(JMPrice);
	}

	public BigDecimal getJMCost() {
		return JMCost;
	}

	public void setJMCost(BigDecimal JMCost) {
		this.JMCost = getJMCost().add(JMCost);
	}

	public BigDecimal getOthersPrice() {
		return othersPrice;
	}

	public void setOthersPrice(BigDecimal othersPrice) {
		this.othersPrice = getOthersPrice().add(othersPrice);
	}

	public BigDecimal getOthersCost() {
		return othersCost;
	}

	public void setOthersCost(BigDecimal othersCost) {
		this.othersCost = getOthersCost().add(othersCost);
	}

	public BigDecimal getQujiaozhiPrice() {
		return qujiaozhiPrice;
	}

	public void setQujiaozhiPrice(BigDecimal qujiaozhiPrice) {
		this.qujiaozhiPrice = getQujiaozhiPrice().add(qujiaozhiPrice);
	}

	public BigDecimal getQujiaozhiCost() {
		return qujiaozhiCost;
	}

	public void setQujiaozhiCost(BigDecimal qujiaozhiCost) {
		this.qujiaozhiCost = getQujiaozhiCost().add(qujiaozhiCost);
	}

	public BigDecimal getAHCPrice() {
		return AHCPrice;
	}

	public void setAHCPrice(BigDecimal AHCPrice) {
		this.AHCPrice = getAHCPrice().add(AHCPrice);
	}

	public BigDecimal getAHCCost() {
		return AHCCost;
	}

	public void setAHCCost(BigDecimal AHCCost) {
		this.AHCCost = getAHCCost().add(AHCCost);
	}

	public BigDecimal getLanzhiPrice() {
		return lanzhiPrice;
	}

	public void setLanzhiPrice(BigDecimal lanzhiPrice) {
		this.lanzhiPrice = getLanzhiPrice().add(lanzhiPrice);
	}

	public BigDecimal getLanzhiCost() {
		return lanzhiCost;
	}

	public void setLanzhiCost(BigDecimal lanzhiCost) {
		this.lanzhiCost = getLanzhiCost().add(lanzhiCost);
	}
}
