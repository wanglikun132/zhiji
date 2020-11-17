package com.likun.zhiji.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private BigDecimal diJiaTingPromotion = new BigDecimal(0);
    private BigDecimal diJiaTingSample = new BigDecimal(0);

	private BigDecimal RNWHuFaJingYouPrice = new BigDecimal(0);
	private BigDecimal RNWHuFaJingYouCost = new BigDecimal(0);
    private BigDecimal RNWHuFaJingYouPromotion = new BigDecimal(0);
    private BigDecimal RNWHuFaJingYouSample = new BigDecimal(0);

	private BigDecimal RNWShuiYangPrice = new BigDecimal(0);
	private BigDecimal RNWShuiYangCost = new BigDecimal(0);
    private BigDecimal RNWShuiYangPromotion = new BigDecimal(0);
    private BigDecimal RNWShuiYangSample = new BigDecimal(0);

	private BigDecimal RNWDongMoPrice = new BigDecimal(0);
	private BigDecimal RNWDongMoCost = new BigDecimal(0);
    private BigDecimal RNWDongMoPromotion = new BigDecimal(0);
    private BigDecimal RNWDongMoSample = new BigDecimal(0);


	private BigDecimal yuanCengPrice = new BigDecimal(0);
	private BigDecimal yuanCengCost = new BigDecimal(0);
    private BigDecimal yuanCengPromotion = new BigDecimal(0);
    private BigDecimal yuanCengSample = new BigDecimal(0);


	private BigDecimal aiYishenPrice = new BigDecimal(0);
	private BigDecimal aiYishenCost = new BigDecimal(0);
    private BigDecimal aiYishenPromotion = new BigDecimal(0);
    private BigDecimal aiYishenSample = new BigDecimal(0);

	private BigDecimal hushoushuangPrice = new BigDecimal(0);
	private BigDecimal hushoushuangCost = new BigDecimal(0);
    private BigDecimal hushoushuangPromotion = new BigDecimal(0);
    private BigDecimal hushoushuangSample = new BigDecimal(0);

	private BigDecimal moshagaoPrice = new BigDecimal(0);
	private BigDecimal moshagaoCost = new BigDecimal(0);
    private BigDecimal moshagaoPromotion = new BigDecimal(0);
    private BigDecimal moshagaoSample = new BigDecimal(0);

	private BigDecimal shengtiruPrice = new BigDecimal(0);
	private BigDecimal shengtiruCost = new BigDecimal(0);
    private BigDecimal shengtiruPromotion = new BigDecimal(0);
    private BigDecimal shengtiruSample = new BigDecimal(0);

	private BigDecimal xifashuiPrice = new BigDecimal(0);
	private BigDecimal xifashuiCost = new BigDecimal(0);
    private BigDecimal xifashuiPromotion = new BigDecimal(0);
    private BigDecimal xifashuiSample = new BigDecimal(0);

	private BigDecimal JMPrice = new BigDecimal(0);
	private BigDecimal JMCost = new BigDecimal(0);
    private BigDecimal JMPromotion = new BigDecimal(0);
    private BigDecimal JMSample = new BigDecimal(0);

	private BigDecimal othersPrice = new BigDecimal(0);
	private BigDecimal othersCost = new BigDecimal(0);
    private BigDecimal othersPromotion = new BigDecimal(0);
    private BigDecimal othersSample = new BigDecimal(0);

	private BigDecimal qujiaozhiPrice = new BigDecimal(0);
	private BigDecimal qujiaozhiCost = new BigDecimal(0);
    private BigDecimal qujiaozhiPromotion = new BigDecimal(0);
    private BigDecimal qujiaozhiSample = new BigDecimal(0);

	private BigDecimal AHCPrice = new BigDecimal(0);
	private BigDecimal AHCCost = new BigDecimal(0);
    private BigDecimal AHCPromotion = new BigDecimal(0);
    private BigDecimal AHCSample = new BigDecimal(0);

	private BigDecimal lanzhiPrice = new BigDecimal(0);
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

//    public List<Map<String,BigDecimal>> convert(){
//        List<Map<String,BigDecimal>> list = new ArrayList<>();
//        Map<String,BigDecimal> map = new HashMap<>();
//    }
}
