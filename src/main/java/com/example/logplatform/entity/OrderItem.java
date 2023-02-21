package com.example.logplatform.entity;

import java.io.Serializable;

public class OrderItem extends BaseEntity implements Serializable {
    private Integer id;
    private Integer oid;
    private Integer pid;
    private String title;
    private String image;
    private Long price;
    private Long rent;
    private Integer num;
    private Integer isReturn;
    private Integer rentTime;
    private Integer status;

    public Long getRent() {
        return rent;
    }

    public void setRent(Long rent) {
        this.rent = rent;
    }

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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Integer isReturn) {
        this.isReturn = isReturn;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem)) return false;

        OrderItem orderItem = (OrderItem) o;

        if (getId() != null ? !getId().equals(orderItem.getId()) : orderItem.getId() != null) return false;
        if (getOid() != null ? !getOid().equals(orderItem.getOid()) : orderItem.getOid() != null) return false;
        if (getPid() != null ? !getPid().equals(orderItem.getPid()) : orderItem.getPid() != null) return false;
        if (getTitle() != null ? !getTitle().equals(orderItem.getTitle()) : orderItem.getTitle() != null) return false;
        if (getImage() != null ? !getImage().equals(orderItem.getImage()) : orderItem.getImage() != null) return false;
        if (getPrice() != null ? !getPrice().equals(orderItem.getPrice()) : orderItem.getPrice() != null) return false;
        if (getRent() != null ? !getRent().equals(orderItem.getRent()) : orderItem.getRent() != null) return false;
        if (getNum() != null ? !getNum().equals(orderItem.getNum()) : orderItem.getNum() != null) return false;
        if (isReturn != null ? !isReturn.equals(orderItem.isReturn) : orderItem.isReturn != null) return false;
        if (getRentTime() != null ? !getRentTime().equals(orderItem.getRentTime()) : orderItem.getRentTime() != null)
            return false;
        return getStatus() != null ? getStatus().equals(orderItem.getStatus()) : orderItem.getStatus() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getOid() != null ? getOid().hashCode() : 0);
        result = 31 * result + (getPid() != null ? getPid().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getImage() != null ? getImage().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getRent() != null ? getRent().hashCode() : 0);
        result = 31 * result + (getNum() != null ? getNum().hashCode() : 0);
        result = 31 * result + (isReturn != null ? isReturn.hashCode() : 0);
        result = 31 * result + (getRentTime() != null ? getRentTime().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", oid=" + oid +
                ", pid=" + pid +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", rent=" + rent +
                ", num=" + num +
                ", isReturn=" + isReturn +
                ", rentTime=" + rentTime +
                ", status=" + status +
                '}';
    }
}
