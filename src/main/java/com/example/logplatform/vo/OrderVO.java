package com.example.logplatform.vo;

import com.example.logplatform.entity.BaseEntity;

import java.io.Serializable;

public class OrderVO extends BaseEntity implements Serializable {
    private Integer id;
    private Integer oid;
    private Integer pid;
    private String recvName;
    private String recvPhone;
    private String recvProvince;
    private String recvCity;
    private String recvArea;
    private String recvAddress;
    private String title;
    private String image;
    private Long price;
    private Long rent;
    private Integer num;
    private Integer isRent;
    private Integer rentTime;
    private Integer status;
    private Integer isReturn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRecvName() {
        return recvName;
    }

    public void setRecvName(String recvName) {
        this.recvName = recvName;
    }

    public String getRecvPhone() {
        return recvPhone;
    }

    public void setRecvPhone(String recvPhone) {
        this.recvPhone = recvPhone;
    }

    public String getRecvProvince() {
        return recvProvince;
    }

    public void setRecvProvince(String recvProvince) {
        this.recvProvince = recvProvince;
    }

    public String getRecvCity() {
        return recvCity;
    }

    public void setRecvCity(String recvCity) {
        this.recvCity = recvCity;
    }

    public String getRecvArea() {
        return recvArea;
    }

    public void setRecvArea(String recvArea) {
        this.recvArea = recvArea;
    }

    public String getRecvAddress() {
        return recvAddress;
    }

    public void setRecvAddress(String recvAddress) {
        this.recvAddress = recvAddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getRent() {
        return rent;
    }

    public void setRent(Long rent) {
        this.rent = rent;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getIsRent() {
        return isRent;
    }

    public void setIsRent(Integer isRent) {
        this.isRent = isRent;
    }

    public Integer getRentTime() {
        return rentTime;
    }

    public void setRentTime(Integer rentTime) {
        this.rentTime = rentTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Integer isReturn) {
        this.isReturn = isReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderVO)) return false;

        OrderVO orderVO = (OrderVO) o;

        if (getId() != null ? !getId().equals(orderVO.getId()) : orderVO.getId() != null) return false;
        if (getOid() != null ? !getOid().equals(orderVO.getOid()) : orderVO.getOid() != null) return false;
        if (getPid() != null ? !getPid().equals(orderVO.getPid()) : orderVO.getPid() != null) return false;
        if (getRecvName() != null ? !getRecvName().equals(orderVO.getRecvName()) : orderVO.getRecvName() != null)
            return false;
        if (getRecvPhone() != null ? !getRecvPhone().equals(orderVO.getRecvPhone()) : orderVO.getRecvPhone() != null)
            return false;
        if (getRecvProvince() != null ? !getRecvProvince().equals(orderVO.getRecvProvince()) : orderVO.getRecvProvince() != null)
            return false;
        if (getRecvCity() != null ? !getRecvCity().equals(orderVO.getRecvCity()) : orderVO.getRecvCity() != null)
            return false;
        if (getRecvArea() != null ? !getRecvArea().equals(orderVO.getRecvArea()) : orderVO.getRecvArea() != null)
            return false;
        if (getRecvAddress() != null ? !getRecvAddress().equals(orderVO.getRecvAddress()) : orderVO.getRecvAddress() != null)
            return false;
        if (getTitle() != null ? !getTitle().equals(orderVO.getTitle()) : orderVO.getTitle() != null) return false;
        if (getImage() != null ? !getImage().equals(orderVO.getImage()) : orderVO.getImage() != null) return false;
        if (getPrice() != null ? !getPrice().equals(orderVO.getPrice()) : orderVO.getPrice() != null) return false;
        if (getRent() != null ? !getRent().equals(orderVO.getRent()) : orderVO.getRent() != null) return false;
        if (getNum() != null ? !getNum().equals(orderVO.getNum()) : orderVO.getNum() != null) return false;
        if (getIsRent() != null ? !getIsRent().equals(orderVO.getIsRent()) : orderVO.getIsRent() != null) return false;
        if (getRentTime() != null ? !getRentTime().equals(orderVO.getRentTime()) : orderVO.getRentTime() != null)
            return false;
        if (getStatus() != null ? !getStatus().equals(orderVO.getStatus()) : orderVO.getStatus() != null) return false;
        return getIsReturn() != null ? getIsReturn().equals(orderVO.getIsReturn()) : orderVO.getIsReturn() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getOid() != null ? getOid().hashCode() : 0);
        result = 31 * result + (getPid() != null ? getPid().hashCode() : 0);
        result = 31 * result + (getRecvName() != null ? getRecvName().hashCode() : 0);
        result = 31 * result + (getRecvPhone() != null ? getRecvPhone().hashCode() : 0);
        result = 31 * result + (getRecvProvince() != null ? getRecvProvince().hashCode() : 0);
        result = 31 * result + (getRecvCity() != null ? getRecvCity().hashCode() : 0);
        result = 31 * result + (getRecvArea() != null ? getRecvArea().hashCode() : 0);
        result = 31 * result + (getRecvAddress() != null ? getRecvAddress().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getImage() != null ? getImage().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getRent() != null ? getRent().hashCode() : 0);
        result = 31 * result + (getNum() != null ? getNum().hashCode() : 0);
        result = 31 * result + (getIsRent() != null ? getIsRent().hashCode() : 0);
        result = 31 * result + (getRentTime() != null ? getRentTime().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getIsReturn() != null ? getIsReturn().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "id=" + id +
                ", oid=" + oid +
                ", pid=" + pid +
                ", recvName='" + recvName + '\'' +
                ", recvPhone='" + recvPhone + '\'' +
                ", recvProvince='" + recvProvince + '\'' +
                ", recvCity='" + recvCity + '\'' +
                ", recvArea='" + recvArea + '\'' +
                ", recvAddress='" + recvAddress + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", rent=" + rent +
                ", num=" + num +
                ", isRent=" + isRent +
                ", rentTime=" + rentTime +
                ", status=" + status +
                ", isReturn=" + isReturn +
                '}';
    }
}
