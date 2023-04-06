package com.tql.pattern.bulider.demo1;

public class Bike{
    //车架
    private String frame;
    //车座
    private String seat;

    public Bike() {
    }

    public Bike(String frame, String seat) {
        this.frame = frame;
        this.seat = seat;
    }

    /**
     * 获取
     * @return frame
     */
    public String getFrame() {
        return frame;
    }

    /**
     * 设置
     * @param frame
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /**
     * 获取
     * @return seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * 设置
     * @param seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String toString() {
        return "Bike{frame = " + frame + ", seat = " + seat + "}";
    }

}
