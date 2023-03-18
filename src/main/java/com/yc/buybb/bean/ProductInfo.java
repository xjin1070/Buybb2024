package com.yc.buybb.bean;

public class ProductInfo {
    private Long pno;
    private String pname;
    private Integer tno;
    private Double price;
    private String intro;
    private Integer balance;
    private String pics;
    private String descr;
    private Integer status;

    @Override
    public String toString() {
        return "ProductInfo{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", tno=" + tno +
                ", price=" + price +
                ", intro='" + intro + '\'' +
                ", balance=" + balance +
                ", pics='" + pics + '\'' +
                ", descr='" + descr + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getPno() {
        return pno;
    }

    public void setPno(Long pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((balance == null) ? 0 : balance.hashCode());
        result = prime * result + ((descr == null) ? 0 : descr.hashCode());
        result = prime * result + ((intro == null) ? 0 : intro.hashCode());
        result = prime * result + ((pics == null) ? 0 : pics.hashCode());
        result = prime * result + ((pname == null) ? 0 : pname.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((pno == null) ? 0 : pno.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((tno == null) ? 0 : tno.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductInfo other = (ProductInfo) obj;
        if (balance == null) {
            if (other.balance != null)
                return false;
        } else if (!balance.equals(other.balance))
            return false;
        if (descr == null) {
            if (other.descr != null)
                return false;
        } else if (!descr.equals(other.descr))
            return false;
        if (intro == null) {
            if (other.intro != null)
                return false;
        } else if (!intro.equals(other.intro))
            return false;
        if (pics == null) {
            if (other.pics != null)
                return false;
        } else if (!pics.equals(other.pics))
            return false;
        if (pname == null) {
            if (other.pname != null)
                return false;
        } else if (!pname.equals(other.pname))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (pno == null) {
            if (other.pno != null)
                return false;
        } else if (!pno.equals(other.pno))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (tno == null) {
            if (other.tno != null)
                return false;
        } else if (!tno.equals(other.tno))
            return false;
        return true;
    }
}
