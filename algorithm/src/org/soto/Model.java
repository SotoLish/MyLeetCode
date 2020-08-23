package org.soto;

/**
 * @author: liuqixin
 * @date: 2020/05/10 17:04
 */
public class Model {
    private Integer num;
    private Double dou;

    public Integer getNum() {
        return num;
    }

    public Model setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Double getDou() {
        return dou;
    }

    public Model setDou(Double dou) {
        this.dou = dou;
        return this;
    }

    @Override
    public String toString() {
        return "Model{" +
                "num=" + num +
                ", dou=" + dou +
                '}';
    }
}
