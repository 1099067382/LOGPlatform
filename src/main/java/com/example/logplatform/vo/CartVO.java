package com.example.logplatform.vo;

import java.io.Serializable;

public class CartVO implements Serializable {
    private Integer cid;
    private Integer uid;
    private Integer pid;
    private Long price;
    private Integer num;
    private Long rent;
    private Integer rentTime;
    private String title;
    private Long realPrice;
    private String image;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getRent() {
        return rent;
    }

    public void setRent(Long rent) {
        this.rent = rent;
    }

    public Integer getRentTime() {
        return rentTime;
    }

    public void setRentTime(Integer rentTime) {
        this.rentTime = rentTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Long realPrice) {
        this.realPrice = realPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartVO)) return false;

        CartVO cartVO = (CartVO) o;

        if (getCid() != null ? !getCid().equals(cartVO.getCid()) : cartVO.getCid() != null) return false;
        if (getUid() != null ? !getUid().equals(cartVO.getUid()) : cartVO.getUid() != null) return false;
        if (getPid() != null ? !getPid().equals(cartVO.getPid()) : cartVO.getPid() != null) return false;
        if (getPrice() != null ? !getPrice().equals(cartVO.getPrice()) : cartVO.getPrice() != null) return false;
        if (getNum() != null ? !getNum().equals(cartVO.getNum()) : cartVO.getNum() != null) return false;
        if (getRent() != null ? !getRent().equals(cartVO.getRent()) : cartVO.getRent() != null) return false;
        if (getRentTime() != null ? !getRentTime().equals(cartVO.getRentTime()) : cartVO.getRentTime() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(cartVO.getTitle()) : cartVO.getTitle() != null) return false;
        if (getRealPrice() != null ? !getRealPrice().equals(cartVO.getRealPrice()) : cartVO.getRealPrice() != null)
            return false;
        if (getImage() != null ? !getImage().equals(cartVO.getImage()) : cartVO.getImage() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getCid() != null ? getCid().hashCode() : 0;
        result = 31 * result + (getUid() != null ? getUid().hashCode() : 0);
        result = 31 * result + (getPid() != null ? getPid().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getNum() != null ? getNum().hashCode() : 0);
        result = 31 * result + (getRent() != null ? getRent().hashCode() : 0);
        result = 31 * result + (getRentTime() != null ? getRentTime().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getRealPrice() != null ? getRealPrice().hashCode() : 0);
        result = 31 * result + (getImage() != null ? getImage().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CartVO{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", num=" + num +
                ", rent=" + rent +
                ", rentTime=" + rentTime +
                ", title='" + title + '\'' +
                ", realPrice=" + realPrice +
                ", image='" + image + '\'' +
                '}';
    }
}
