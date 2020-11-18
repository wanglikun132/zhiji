package com.likun.zhiji.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.*;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/11/17
 */
public class CountCosmeticsBeen implements Serializable {

	private static final long serialVersionUID = -1650259054993757238L;

	private BigDecimal dijiatingprice = new BigDecimal(0) ;
	private BigDecimal KLdijiatingprice = new BigDecimal(0) ;
	private BigDecimal diJiaTingCost = new BigDecimal(0);
    private BigDecimal diJiaTingPromotion = new BigDecimal(0);
    private BigDecimal diJiaTingSample = new BigDecimal(0);

	private BigDecimal RNWHuFaJingYouPrice = new BigDecimal(0);
	private BigDecimal KLRNWHuFaJingYouPrice = new BigDecimal(0);
	private BigDecimal RNWHuFaJingYouCost = new BigDecimal(0);
    private BigDecimal RNWHuFaJingYouPromotion = new BigDecimal(0);
    private BigDecimal RNWHuFaJingYouSample = new BigDecimal(0);

	private BigDecimal RNWShuiYangPrice = new BigDecimal(0);
	private BigDecimal KLRNWShuiYangPrice = new BigDecimal(0);
	private BigDecimal RNWShuiYangCost = new BigDecimal(0);
    private BigDecimal RNWShuiYangPromotion = new BigDecimal(0);
    private BigDecimal RNWShuiYangSample = new BigDecimal(0);

	private BigDecimal RNWDongMoPrice = new BigDecimal(0);
	private BigDecimal KLRNWDongMoPrice = new BigDecimal(0);
	private BigDecimal RNWDongMoCost = new BigDecimal(0);
    private BigDecimal RNWDongMoPromotion = new BigDecimal(0);
    private BigDecimal RNWDongMoSample = new BigDecimal(0);


	private BigDecimal yuanCengPrice = new BigDecimal(0);
	private BigDecimal KLyuanCengPrice = new BigDecimal(0);
	private BigDecimal yuanCengCost = new BigDecimal(0);
    private BigDecimal yuanCengPromotion = new BigDecimal(0);
    private BigDecimal yuanCengSample = new BigDecimal(0);


	private BigDecimal aiYishenPrice = new BigDecimal(0);
	private BigDecimal KLaiYishenPrice = new BigDecimal(0);
	private BigDecimal aiYishenCost = new BigDecimal(0);
    private BigDecimal aiYishenPromotion = new BigDecimal(0);
    private BigDecimal aiYishenSample = new BigDecimal(0);

	private BigDecimal hushoushuangPrice = new BigDecimal(0);
	private BigDecimal KLhushoushuangPrice = new BigDecimal(0);
	private BigDecimal hushoushuangCost = new BigDecimal(0);
    private BigDecimal hushoushuangPromotion = new BigDecimal(0);
    private BigDecimal hushoushuangSample = new BigDecimal(0);

	private BigDecimal moshagaoPrice = new BigDecimal(0);
	private BigDecimal KLmoshagaoPrice = new BigDecimal(0);
	private BigDecimal moshagaoCost = new BigDecimal(0);
    private BigDecimal moshagaoPromotion = new BigDecimal(0);
    private BigDecimal moshagaoSample = new BigDecimal(0);

	private BigDecimal shengtiruPrice = new BigDecimal(0);
	private BigDecimal KLshengtiruPrice = new BigDecimal(0);
	private BigDecimal shengtiruCost = new BigDecimal(0);
    private BigDecimal shengtiruPromotion = new BigDecimal(0);
    private BigDecimal shengtiruSample = new BigDecimal(0);

	private BigDecimal xifashuiPrice = new BigDecimal(0);
	private BigDecimal KLxifashuiPrice = new BigDecimal(0);
	private BigDecimal xifashuiCost = new BigDecimal(0);
    private BigDecimal xifashuiPromotion = new BigDecimal(0);
    private BigDecimal xifashuiSample = new BigDecimal(0);

	private BigDecimal JMPrice = new BigDecimal(0);
	private BigDecimal KLJMPrice = new BigDecimal(0);
	private BigDecimal JMCost = new BigDecimal(0);
    private BigDecimal JMPromotion = new BigDecimal(0);
    private BigDecimal JMSample = new BigDecimal(0);

	private BigDecimal othersPrice = new BigDecimal(0);
	private BigDecimal KLothersPrice = new BigDecimal(0);
	private BigDecimal othersCost = new BigDecimal(0);
    private BigDecimal othersPromotion = new BigDecimal(0);
    private BigDecimal othersSample = new BigDecimal(0);

	private BigDecimal qujiaozhiPrice = new BigDecimal(0);
	private BigDecimal KLqujiaozhiPrice = new BigDecimal(0);
	private BigDecimal qujiaozhiCost = new BigDecimal(0);
    private BigDecimal qujiaozhiPromotion = new BigDecimal(0);
    private BigDecimal qujiaozhiSample = new BigDecimal(0);

	private BigDecimal AHCPrice = new BigDecimal(0);
	private BigDecimal KLAHCPrice = new BigDecimal(0);
	private BigDecimal AHCCost = new BigDecimal(0);
    private BigDecimal AHCPromotion = new BigDecimal(0);
    private BigDecimal AHCSample = new BigDecimal(0);

	private BigDecimal lanzhiPrice = new BigDecimal(0);
	private BigDecimal KLlanzhiPrice = new BigDecimal(0);
	private BigDecimal lanzhiCost = new BigDecimal(0);
    private BigDecimal lanzhiPromotion = new BigDecimal(0);
    private BigDecimal lanzhiSample = new BigDecimal(0);

	public CountCosmeticsBeen() {
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

    public BigDecimal getDiJiaTingPromotion() {
        return diJiaTingPromotion;
    }

    public void setDiJiaTingPromotion(BigDecimal diJiaTingPromotion) {
        this.diJiaTingPromotion = getDiJiaTingPromotion().add(diJiaTingPromotion);
    }

    public BigDecimal getDiJiaTingSample() {
        return diJiaTingSample;
    }

    public void setDiJiaTingSample(BigDecimal diJiaTingSample) {
        this.diJiaTingSample = getDiJiaTingSample().add(diJiaTingSample);
    }

    public BigDecimal getRNWHuFaJingYouPromotion() {
        return RNWHuFaJingYouPromotion;
    }

    public void setRNWHuFaJingYouPromotion(BigDecimal RNWHuFaJingYouPromotion) {
        this.RNWHuFaJingYouPromotion = getRNWHuFaJingYouPromotion().add(RNWHuFaJingYouPromotion);
    }

    public BigDecimal getRNWHuFaJingYouSample() {
        return RNWHuFaJingYouSample;
    }

    public void setRNWHuFaJingYouSample(BigDecimal RNWHuFaJingYouSample) {
        this.RNWHuFaJingYouSample = getRNWHuFaJingYouSample().add(RNWHuFaJingYouSample);
    }

    public BigDecimal getRNWShuiYangPromotion() {
        return RNWShuiYangPromotion;
    }

    public void setRNWShuiYangPromotion(BigDecimal RNWShuiYangPromotion) {
        this.RNWShuiYangPromotion = getRNWShuiYangPromotion().add(RNWShuiYangPromotion);
    }

    public BigDecimal getRNWShuiYangSample() {
        return RNWShuiYangSample;
    }

    public void setRNWShuiYangSample(BigDecimal RNWShuiYangSample) {
        this.RNWShuiYangSample = getRNWShuiYangSample().add(RNWShuiYangSample);
    }

    public BigDecimal getRNWDongMoPromotion() {
        return RNWDongMoPromotion;
    }

    public void setRNWDongMoPromotion(BigDecimal RNWDongMoPromotion) {
        this.RNWDongMoPromotion = getRNWDongMoPromotion().add(RNWDongMoPromotion);
    }

    public BigDecimal getRNWDongMoSample() {
        return RNWDongMoSample;
    }

    public void setRNWDongMoSample(BigDecimal RNWDongMoSample) {
        this.RNWDongMoSample = getRNWDongMoSample().add(RNWDongMoSample);
    }

    public BigDecimal getYuanCengPromotion() {
        return yuanCengPromotion;
    }

    public void setYuanCengPromotion(BigDecimal yuanCengPromotion) {
        this.yuanCengPromotion = getYuanCengPromotion().add(yuanCengPromotion);
    }

    public BigDecimal getYuanCengSample() {
        return yuanCengSample;
    }

    public void setYuanCengSample(BigDecimal yuanCengSample) {
        this.yuanCengSample = getYuanCengSample().add(yuanCengSample);
    }

    public BigDecimal getAiYishenPromotion() {
        return aiYishenPromotion;
    }

    public void setAiYishenPromotion(BigDecimal aiYishenPromotion) {
        this.aiYishenPromotion = getAiYishenPromotion().add(aiYishenPromotion);
    }

    public BigDecimal getAiYishenSample() {
        return aiYishenSample;
    }

    public void setAiYishenSample(BigDecimal aiYishenSample) {
        this.aiYishenSample = getAiYishenSample().add(aiYishenSample);
    }

    public BigDecimal getHushoushuangPromotion() {
        return hushoushuangPromotion;
    }

    public void setHushoushuangPromotion(BigDecimal hushoushuangPromotion) {
        this.hushoushuangPromotion = getHushoushuangPromotion().add(hushoushuangPromotion);
    }

    public BigDecimal getHushoushuangSample() {
        return hushoushuangSample;
    }

    public void setHushoushuangSample(BigDecimal hushoushuangSample) {
        this.hushoushuangSample = getHushoushuangSample().add(hushoushuangSample);
    }

    public BigDecimal getMoshagaoPromotion() {
        return moshagaoPromotion;
    }

    public void setMoshagaoPromotion(BigDecimal moshagaoPromotion) {
        this.moshagaoPromotion = getMoshagaoPromotion().add(moshagaoPromotion);
    }

    public BigDecimal getMoshagaoSample() {
        return moshagaoSample;
    }

    public void setMoshagaoSample(BigDecimal moshagaoSample) {
        this.moshagaoSample = getMoshagaoSample().add(moshagaoSample);
    }

    public BigDecimal getShengtiruPromotion() {
        return shengtiruPromotion;
    }

    public void setShengtiruPromotion(BigDecimal shengtiruPromotion) {
        this.shengtiruPromotion = getShengtiruPromotion().add(shengtiruPromotion);
    }

    public BigDecimal getShengtiruSample() {
        return shengtiruSample;
    }

    public void setShengtiruSample(BigDecimal shengtiruSample) {
        this.shengtiruSample = getShengtiruSample().add(shengtiruSample);
    }

    public BigDecimal getXifashuiPromotion() {
        return xifashuiPromotion;
    }

    public void setXifashuiPromotion(BigDecimal xifashuiPromotion) {
        this.xifashuiPromotion = getXifashuiPromotion().add(xifashuiPromotion);
    }

    public BigDecimal getXifashuiSample() {
        return xifashuiSample;
    }

    public void setXifashuiSample(BigDecimal xifashuiSample) {
        this.xifashuiSample = getXifashuiSample().add(xifashuiSample);
    }

    public BigDecimal getJMPromotion() {
        return JMPromotion;
    }

    public void setJMPromotion(BigDecimal JMPromotion) {
        this.JMPromotion = getJMPromotion().add(JMPromotion);
    }

    public BigDecimal getJMSample() {
        return JMSample;
    }

    public void setJMSample(BigDecimal JMSample) {
        this.JMSample = getJMSample().add(JMSample);
    }

    public BigDecimal getOthersPromotion() {
        return othersPromotion;
    }

    public void setOthersPromotion(BigDecimal othersPromotion) {
        this.othersPromotion = getOthersPromotion().add(othersPromotion);
    }

    public BigDecimal getOthersSample() {
        return othersSample;
    }

    public void setOthersSample(BigDecimal othersSample) {
        this.othersSample = getOthersSample().add(othersSample);
    }

    public BigDecimal getQujiaozhiPromotion() {
        return qujiaozhiPromotion;
    }

    public void setQujiaozhiPromotion(BigDecimal qujiaozhiPromotion) {
        this.qujiaozhiPromotion = getQujiaozhiPromotion().add(qujiaozhiPromotion);
    }

    public BigDecimal getQujiaozhiSample() {
        return qujiaozhiSample;
    }

    public void setQujiaozhiSample(BigDecimal qujiaozhiSample) {
        this.qujiaozhiSample = getQujiaozhiSample().add(qujiaozhiSample);
    }

    public BigDecimal getAHCPromotion() {
        return AHCPromotion;
    }

    public void setAHCPromotion(BigDecimal AHCPromotion) {
        this.AHCPromotion = getAHCPromotion().add(AHCPromotion);
    }

    public BigDecimal getAHCSample() {
        return AHCSample;
    }

    public void setAHCSample(BigDecimal AHCSample) {
        this.AHCSample = getAHCSample().add(AHCSample);
    }

    public BigDecimal getLanzhiPromotion() {
        return lanzhiPromotion;
    }

    public void setLanzhiPromotion(BigDecimal lanzhiPromotion) {
        this.lanzhiPromotion = getLanzhiPromotion().add(lanzhiPromotion);
    }

    public BigDecimal getLanzhiSample() {
        return lanzhiSample;
    }

    public void setLanzhiSample(BigDecimal lanzhiSample) {
        this.lanzhiSample = getLanzhiSample().add(lanzhiSample);
    }

	public BigDecimal getKLdijiatingprice() {
		return KLdijiatingprice;
	}

	public void setKLdijiatingprice(BigDecimal KLdijiatingprice) {
		this.KLdijiatingprice = getKLdijiatingprice().add(KLdijiatingprice);
	}

	public BigDecimal getKLRNWHuFaJingYouPrice() {
		return KLRNWHuFaJingYouPrice;
	}

	public void setKLRNWHuFaJingYouPrice(BigDecimal KLRNWHuFaJingYouPrice) {
		this.KLRNWHuFaJingYouPrice = getKLRNWHuFaJingYouPrice().add(KLRNWHuFaJingYouPrice);
	}

	public BigDecimal getKLRNWShuiYangPrice() {
		return KLRNWShuiYangPrice;
	}

	public void setKLRNWShuiYangPrice(BigDecimal KLRNWShuiYangPrice) {
		this.KLRNWShuiYangPrice = getKLRNWShuiYangPrice().add(KLRNWShuiYangPrice);
	}

	public BigDecimal getKLRNWDongMoPrice() {
		return KLRNWDongMoPrice;
	}

	public void setKLRNWDongMoPrice(BigDecimal KLRNWDongMoPrice) {
		this.KLRNWDongMoPrice = getKLRNWDongMoPrice().add(KLRNWDongMoPrice);
	}

	public BigDecimal getKLyuanCengPrice() {
		return KLyuanCengPrice;
	}

	public void setKLyuanCengPrice(BigDecimal KLyuanCengPrice) {
		this.KLyuanCengPrice = getKLyuanCengPrice().add(KLyuanCengPrice);
	}

	public BigDecimal getKLaiYishenPrice() {
		return KLaiYishenPrice;
	}

	public void setKLaiYishenPrice(BigDecimal KLaiYishenPrice) {
		this.KLaiYishenPrice = getKLaiYishenPrice().add(KLaiYishenPrice);
	}

	public BigDecimal getKLhushoushuangPrice() {
		return KLhushoushuangPrice;
	}

	public void setKLhushoushuangPrice(BigDecimal KLhushoushuangPrice) {
		this.KLhushoushuangPrice = getKLhushoushuangPrice().add(KLhushoushuangPrice);
	}

	public BigDecimal getKLmoshagaoPrice() {
		return KLmoshagaoPrice;
	}

	public void setKLmoshagaoPrice(BigDecimal KLmoshagaoPrice) {
		this.KLmoshagaoPrice = getKLmoshagaoPrice().add(KLmoshagaoPrice);
	}

	public BigDecimal getKLshengtiruPrice() {
		return KLshengtiruPrice;
	}

	public void setKLshengtiruPrice(BigDecimal KLshengtiruPrice) {
		this.KLshengtiruPrice = getKLshengtiruPrice().add(KLshengtiruPrice);
	}

	public BigDecimal getKLxifashuiPrice() {
		return KLxifashuiPrice;
	}

	public void setKLxifashuiPrice(BigDecimal KLxifashuiPrice) {
		this.KLxifashuiPrice = getKLxifashuiPrice().add(KLxifashuiPrice);
	}

	public BigDecimal getKLJMPrice() {
		return KLJMPrice;
	}

	public void setKLJMPrice(BigDecimal KLJMPrice) {
		this.KLJMPrice = getKLJMPrice().add(KLJMPrice);
	}

	public BigDecimal getKLothersPrice() {
		return KLothersPrice;
	}

	public void setKLothersPrice(BigDecimal KLothersPrice) {
		this.KLothersPrice = getKLothersPrice().add(KLothersPrice);
	}

	public BigDecimal getKLqujiaozhiPrice() {
		return KLqujiaozhiPrice;
	}

	public void setKLqujiaozhiPrice(BigDecimal KLqujiaozhiPrice) {
		this.KLqujiaozhiPrice = getKLqujiaozhiPrice().add(KLqujiaozhiPrice);
	}

	public BigDecimal getKLAHCPrice() {
		return KLAHCPrice;
	}

	public void setKLAHCPrice(BigDecimal KLAHCPrice) {
		this.KLAHCPrice = getKLAHCPrice().add(KLAHCPrice);
	}

	public BigDecimal getKLlanzhiPrice() {
		return KLlanzhiPrice;
	}

	public void setKLlanzhiPrice(BigDecimal KLlanzhiPrice) {
		this.KLlanzhiPrice = getKLlanzhiPrice().add(KLlanzhiPrice);
	}

	public List<Map<String,Object>> convert(){
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> huFaJingYouMap = new LinkedHashMap<>(16);
		huFaJingYouMap.put("项目","RNW护发精油");
		huFaJingYouMap.put("销售额",getRNWHuFaJingYouPrice().setScale(2, RoundingMode.HALF_UP));
		huFaJingYouMap.put("总成本",getRNWHuFaJingYouCost().setScale(2, RoundingMode.HALF_UP));
		huFaJingYouMap.put("其中促销",getRNWHuFaJingYouPromotion().setScale(2, RoundingMode.HALF_UP));
		huFaJingYouMap.put("其中样品",getRNWHuFaJingYouSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal huFaJingYouSubtract = getRNWHuFaJingYouPrice().subtract(getRNWHuFaJingYouCost());
		huFaJingYouMap.put("毛利",huFaJingYouSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getRNWHuFaJingYouPrice().equals(BigDecimal.ZERO)){
			BigDecimal huFaJingYouDivide = huFaJingYouSubtract.divide(getRNWHuFaJingYouPrice(),20,BigDecimal.ROUND_HALF_UP);
			huFaJingYouMap.put("毛利率",percent.format(huFaJingYouDivide));
		}else {
			huFaJingYouMap.put("毛利率",BigDecimal.ZERO);
		}
		huFaJingYouMap.put("可乐",getKLRNWHuFaJingYouPrice().setScale(2, RoundingMode.HALF_UP));

		list.add(huFaJingYouMap);

		Map<String,Object> dongMoMap = new LinkedHashMap<>(16);
		dongMoMap.put("项目","RNW冻膜");
		dongMoMap.put("销售额",getRNWDongMoPrice().setScale(2, RoundingMode.HALF_UP));
		dongMoMap.put("总成本",getRNWDongMoCost().setScale(2, RoundingMode.HALF_UP));
		dongMoMap.put("其中促销",getRNWDongMoPromotion().setScale(2, RoundingMode.HALF_UP));
		dongMoMap.put("其中样品",getRNWDongMoSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal dongMoSubtract = getRNWDongMoPrice().subtract(getRNWDongMoCost());
		dongMoMap.put("毛利",dongMoSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getRNWDongMoPrice().equals(BigDecimal.ZERO)){
			BigDecimal dongMoDivide = dongMoSubtract.divide(getRNWDongMoPrice(),20,BigDecimal.ROUND_HALF_UP);
			dongMoMap.put("毛利率",percent.format(dongMoDivide));
		}else {
			dongMoMap.put("毛利率",BigDecimal.ZERO);
		}
		dongMoMap.put("可乐",getKLRNWDongMoPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(dongMoMap);

		Map<String,Object> shuiyangshaungMap = new LinkedHashMap<>(16);
		shuiyangshaungMap.put("项目","RNW水杨酸棉片");
		shuiyangshaungMap.put("销售额",getRNWShuiYangPrice().setScale(2, RoundingMode.HALF_UP));
		shuiyangshaungMap.put("总成本",getRNWShuiYangCost().setScale(2, RoundingMode.HALF_UP));
		shuiyangshaungMap.put("其中促销",getRNWShuiYangPromotion().setScale(2, RoundingMode.HALF_UP));
		shuiyangshaungMap.put("其中样品",getRNWShuiYangSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal shuiyangSubtract = getRNWShuiYangPrice().subtract(getRNWShuiYangCost());
		shuiyangshaungMap.put("毛利",shuiyangSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getRNWShuiYangPrice().equals(BigDecimal.ZERO)){
			BigDecimal ShuiYangDivide = shuiyangSubtract.divide(getRNWShuiYangPrice(),20,BigDecimal.ROUND_HALF_UP);
			shuiyangshaungMap.put("毛利率",percent.format(ShuiYangDivide));
		}else {
			shuiyangshaungMap.put("毛利率",BigDecimal.ZERO);
		}
		shuiyangshaungMap.put("可乐",getKLRNWShuiYangPrice().setScale(2, RoundingMode.HALF_UP));

		list.add(shuiyangshaungMap);

		Map<String,Object> yuanCenMap = new LinkedHashMap<>(16);
		yuanCenMap.put("项目","原辰系列");
		yuanCenMap.put("销售额",getYuanCengPrice().setScale(2, RoundingMode.HALF_UP));
		yuanCenMap.put("总成本",getYuanCengCost().setScale(2, RoundingMode.HALF_UP));
		yuanCenMap.put("其中促销",getYuanCengPromotion().setScale(2, RoundingMode.HALF_UP));
		yuanCenMap.put("其中样品",getYuanCengSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal yuanCenSubtract = getYuanCengPrice().subtract(getYuanCengCost());
		yuanCenMap.put("毛利",yuanCenSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getYuanCengPrice().equals(BigDecimal.ZERO)){
			BigDecimal yuanCenDivide = yuanCenSubtract.divide(getYuanCengPrice(),20,BigDecimal.ROUND_HALF_UP);
			yuanCenMap.put("毛利率",percent.format(yuanCenDivide));
		}else {
			yuanCenMap.put("毛利率",BigDecimal.ZERO);
		}
		yuanCenMap.put("可乐",getKLyuanCengPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(yuanCenMap);

		Map<String,Object> aiYisheng = new LinkedHashMap<>(16);
		aiYisheng.put("项目","艾医生系列");
		aiYisheng.put("销售额",getAiYishenPrice().setScale(2, RoundingMode.HALF_UP));
		aiYisheng.put("总成本",getAiYishenCost().setScale(2, RoundingMode.HALF_UP));
		aiYisheng.put("其中促销",getAiYishenPromotion().setScale(2, RoundingMode.HALF_UP));
		aiYisheng.put("其中样品",getAiYishenSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal aiYishengSubtract = getAiYishenPrice().subtract(getAiYishenCost());
		aiYisheng.put("毛利",aiYishengSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getAiYishenPrice().equals(BigDecimal.ZERO)){
			BigDecimal aiYishengDivide = aiYishengSubtract.divide(getAiYishenPrice(),20,BigDecimal.ROUND_HALF_UP);
			aiYisheng.put("毛利率",percent.format(aiYishengDivide));
		}else {
			aiYisheng.put("毛利率",BigDecimal.ZERO);
		}
		aiYisheng.put("可乐",getKLaiYishenPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(aiYisheng);

		Map<String,Object> huShouShuangMap = new LinkedHashMap<>(16);
		huShouShuangMap.put("项目","摇滚动物园系列-护手霜");
		huShouShuangMap.put("销售额",getHushoushuangPrice().setScale(2, RoundingMode.HALF_UP));
		huShouShuangMap.put("总成本",getHushoushuangCost().setScale(2, RoundingMode.HALF_UP));
		huShouShuangMap.put("其中促销",getHushoushuangPromotion().setScale(2, RoundingMode.HALF_UP));
		huShouShuangMap.put("其中样品",getHushoushuangSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal huShouShuangSubtract = getHushoushuangPrice().subtract(getHushoushuangCost());
		huShouShuangMap.put("毛利",huShouShuangSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getHushoushuangPrice().equals(BigDecimal.ZERO)){
			BigDecimal hushoushuangDivide = huShouShuangSubtract.divide(getHushoushuangPrice(),20,BigDecimal.ROUND_HALF_UP);
			huShouShuangMap.put("毛利率",percent.format(hushoushuangDivide));
		}else {
			huShouShuangMap.put("毛利率",BigDecimal.ZERO);
		}
		huShouShuangMap.put("可乐",getKLhushoushuangPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(huShouShuangMap);

		Map<String,Object> moshagaoMap = new LinkedHashMap<>(16);
		moshagaoMap.put("项目","摇滚动物园系列-磨砂膏");
		moshagaoMap.put("销售额",getMoshagaoPrice().setScale(2, RoundingMode.HALF_UP));
		moshagaoMap.put("总成本",getMoshagaoCost().setScale(2, RoundingMode.HALF_UP));
		moshagaoMap.put("其中促销",getMoshagaoPromotion().setScale(2, RoundingMode.HALF_UP));
		moshagaoMap.put("其中样品",getMoshagaoSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal moshagaoSubtract = getMoshagaoPrice().subtract(getMoshagaoCost());
		moshagaoMap.put("毛利",moshagaoSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getMoshagaoPrice().equals(BigDecimal.ZERO)){
			BigDecimal moshagaoDivide = moshagaoSubtract.divide(getMoshagaoPrice(),20,BigDecimal.ROUND_HALF_UP);
			moshagaoMap.put("毛利率",percent.format(moshagaoDivide));
		}else {
			moshagaoMap.put("毛利率",BigDecimal.ZERO);
		}
		moshagaoMap.put("可乐",getKLmoshagaoPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(moshagaoMap);

		Map<String,Object> shentiruMap = new LinkedHashMap<>(16);
		shentiruMap.put("项目","摇滚动物园系列-身体乳");
		shentiruMap.put("销售额",getShengtiruPrice().setScale(2, RoundingMode.HALF_UP));
		shentiruMap.put("总成本",getShengtiruCost().setScale(2, RoundingMode.HALF_UP));
		shentiruMap.put("其中促销",getShengtiruPromotion().setScale(2, RoundingMode.HALF_UP));
		shentiruMap.put("其中样品",getShengtiruSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal shentiruSubtract = getShengtiruPrice().subtract(getShengtiruCost());
		shentiruMap.put("毛利",shentiruSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getShengtiruPrice().equals(BigDecimal.ZERO)){
			BigDecimal shentiruDivide = shentiruSubtract.divide(getShengtiruPrice(),20,BigDecimal.ROUND_HALF_UP);
			shentiruMap.put("毛利率",percent.format(shentiruDivide));
		}else {
			shentiruMap.put("毛利率",BigDecimal.ZERO);
		}
		shentiruMap.put("可乐",getKLshengtiruPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(shentiruMap);

		Map<String,Object> xifashuiMap = new LinkedHashMap<>(16);
		xifashuiMap.put("项目","摇滚动物园系列-洗发水/洗发素");
		xifashuiMap.put("销售额",getXifashuiPrice().setScale(2, RoundingMode.HALF_UP));
		xifashuiMap.put("总成本",getXifashuiCost().setScale(2, RoundingMode.HALF_UP));
		xifashuiMap.put("其中促销",getXifashuiPromotion().setScale(2, RoundingMode.HALF_UP));
		xifashuiMap.put("其中样品",getXifashuiSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal xifashuiSubtract = getXifashuiPrice().subtract(getXifashuiCost());
		xifashuiMap.put("毛利",xifashuiSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getXifashuiPrice().equals(BigDecimal.ZERO)){
			BigDecimal xifashuiDivide = xifashuiSubtract.divide(getXifashuiPrice(),20,BigDecimal.ROUND_HALF_UP);
			xifashuiMap.put("毛利率",percent.format(xifashuiDivide));
		}else {
			xifashuiMap.put("毛利率",BigDecimal.ZERO);
		}
		xifashuiMap.put("可乐",getKLxifashuiPrice().setScale(2, RoundingMode.HALF_UP));

		list.add(xifashuiMap);

		Map<String,Object> JMMap = new LinkedHashMap<>(16);
		JMMap.put("项目","JM系列");
		JMMap.put("销售额",getJMPrice().setScale(2, RoundingMode.HALF_UP));
		JMMap.put("总成本",getJMCost().setScale(2, RoundingMode.HALF_UP));
		JMMap.put("其中促销",getJMPromotion().setScale(2, RoundingMode.HALF_UP));
		JMMap.put("其中样品",getJMSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal JMSubtract = getJMPrice().subtract(getJMCost());
		JMMap.put("毛利",JMSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getJMPrice().equals(BigDecimal.ZERO)){
			BigDecimal JMDivide = JMSubtract.divide(getJMPrice(),20,BigDecimal.ROUND_HALF_UP);
			JMMap.put("毛利率",percent.format(JMDivide));
		}else {
			JMMap.put("毛利率",BigDecimal.ZERO);
		}
		JMMap.put("可乐",getKLJMPrice().setScale(2, RoundingMode.HALF_UP));

		list.add(JMMap);

		Map<String,Object> othersMap = new LinkedHashMap<>(16);
		othersMap.put("项目","其他产品");
		othersMap.put("销售额",getOthersPrice().setScale(2, RoundingMode.HALF_UP));
		othersMap.put("总成本",getOthersCost().setScale(2, RoundingMode.HALF_UP));
		othersMap.put("其中促销",getOthersPromotion().setScale(2, RoundingMode.HALF_UP));
		othersMap.put("其中样品",getOthersSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal othersSubtract = getOthersPrice().subtract(getOthersCost());
		othersMap.put("毛利",othersSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getOthersPrice().equals(BigDecimal.ZERO)){
			BigDecimal othersDivide = othersSubtract.divide(getOthersPrice(),20,BigDecimal.ROUND_HALF_UP);
			othersMap.put("毛利率",percent.format(othersDivide));
		}else {
			othersMap.put("毛利率",BigDecimal.ZERO);
		}
		othersMap.put("可乐",getKLothersPrice().setScale(2, RoundingMode.HALF_UP));

		list.add(othersMap);

		Map<String,Object> qujiaozhiMap = new LinkedHashMap<>(16);
		qujiaozhiMap.put("项目","菊正宗去角质");
		qujiaozhiMap.put("销售额",getQujiaozhiPrice().setScale(2, RoundingMode.HALF_UP));
		qujiaozhiMap.put("总成本",getQujiaozhiCost().setScale(2, RoundingMode.HALF_UP));
		qujiaozhiMap.put("其中促销",getQujiaozhiPromotion().setScale(2, RoundingMode.HALF_UP));
		qujiaozhiMap.put("其中样品",getQujiaozhiSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal qujiaozhiSubtract = getQujiaozhiPrice().subtract(getQujiaozhiCost());
		qujiaozhiMap.put("毛利",qujiaozhiSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getQujiaozhiPrice().equals(BigDecimal.ZERO)){
			BigDecimal qujiaozhiDivide = qujiaozhiSubtract.divide(getQujiaozhiPrice(),20,BigDecimal.ROUND_HALF_UP);
			qujiaozhiMap.put("毛利率",percent.format(qujiaozhiDivide));
		}else {
			qujiaozhiMap.put("毛利率",BigDecimal.ZERO);
		}
		qujiaozhiMap.put("可乐",getKLqujiaozhiPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(qujiaozhiMap);

		Map<String,Object> dijiatingMap = new LinkedHashMap<>(16);
		dijiatingMap.put("项目","蒂佳婷系列");
		dijiatingMap.put("销售额",getDijiatingprice().setScale(2, RoundingMode.HALF_UP));
		dijiatingMap.put("总成本",getDiJiaTingCost().setScale(2, RoundingMode.HALF_UP));
		dijiatingMap.put("其中促销",getDiJiaTingPromotion().setScale(2, RoundingMode.HALF_UP));
		dijiatingMap.put("其中样品",getDiJiaTingSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal dijiatingSubtract = getDijiatingprice().subtract(getDiJiaTingCost());
		dijiatingMap.put("毛利",dijiatingSubtract.setScale(2, RoundingMode.HALF_UP));
		if (!getDijiatingprice().equals(BigDecimal.ZERO)){
			BigDecimal dijiating = dijiatingSubtract.divide(getDijiatingprice(),20,BigDecimal.ROUND_HALF_UP);
			dijiatingMap.put("毛利率",percent.format(dijiating));
		}else {
			dijiatingMap.put("毛利率",BigDecimal.ZERO);
		}
		dijiatingMap.put("可乐",getKLdijiatingprice().setScale(2, RoundingMode.HALF_UP));
		list.add(dijiatingMap);

		Map<String,Object> AHCMap = new LinkedHashMap<>(16);
		AHCMap.put("项目","AHC系列");
		AHCMap.put("销售额",getAHCPrice().setScale(2, RoundingMode.HALF_UP));
		AHCMap.put("总成本",getAHCCost().setScale(2, RoundingMode.HALF_UP));
		AHCMap.put("其中促销",getAHCPromotion().setScale(2, RoundingMode.HALF_UP));
		AHCMap.put("其中样品",getAHCSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal AHCSubtract = getAHCPrice().subtract(getAHCCost());
		AHCMap.put("毛利",AHCSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getAHCPrice().equals(BigDecimal.ZERO)){
			BigDecimal AHCDivide = AHCSubtract.divide(getAHCPrice(),20,BigDecimal.ROUND_HALF_UP);
			AHCMap.put("毛利率",percent.format(AHCDivide));
		}else {
			AHCMap.put("毛利率",BigDecimal.ZERO);
		}
		AHCMap.put("可乐",getKLAHCPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(AHCMap);

		Map<String,Object> lanzhiMap = new LinkedHashMap<>(16);
		lanzhiMap.put("项目","兰芝系列");
		lanzhiMap.put("销售额",getLanzhiPrice().setScale(2, RoundingMode.HALF_UP));
		lanzhiMap.put("总成本",getLanzhiCost().setScale(2, RoundingMode.HALF_UP));
		lanzhiMap.put("其中促销",getLanzhiPromotion().setScale(2, RoundingMode.HALF_UP));
		lanzhiMap.put("其中样品",getLanzhiSample().setScale(2, RoundingMode.HALF_UP));
		BigDecimal lanzhiSubtract = getLanzhiPrice().subtract(getLanzhiCost());
		lanzhiMap.put("毛利",lanzhiSubtract.setScale(2, RoundingMode.HALF_UP));

		if (!getLanzhiPrice().equals(BigDecimal.ZERO)){
			BigDecimal lanzhiDivide = lanzhiSubtract.divide(getLanzhiPrice(),20,BigDecimal.ROUND_HALF_UP);
			lanzhiMap.put("毛利率",percent.format(lanzhiDivide));
		}else {
			lanzhiMap.put("毛利率",BigDecimal.ZERO);
		}
		lanzhiMap.put("可乐",getKLlanzhiPrice().setScale(2, RoundingMode.HALF_UP));
		list.add(lanzhiMap);

		return list;
    }

	public static void main(String[] args) {
		NumberFormat percent = NumberFormat.getPercentInstance();
		BigDecimal bigDecimal = new BigDecimal(1);
		BigDecimal bigDecimal1= new BigDecimal(3);
		BigDecimal divide = bigDecimal.divide(bigDecimal1,5,BigDecimal.ROUND_HALF_UP);
		System.out.println(divide);
		percent.setMaximumFractionDigits(2);
		System.out.println(percent.format(divide));
	}
}
