package com.yc.buybb.vo;


public class LayuiVO {
    private int code; //响应码,如果有返回值，则为0
    private String msg; //返回消息
    private int count;//总记录数
    private Object data;//   返回数据


    public LayuiVO() {
        super();
    }

    public LayuiVO(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }
    public LayuiVO( Object data) {
        super();
        this.code = 0;
        this.data = data;
    }

//    public LayuiVO(int code, String msg, Object data) {
//        super();
//        this.code = code;
//        this.msg = msg;
//        this.data = data;
//    }


    @Override
    public String toString() {
        return "LayuiVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", count=" + count +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        result = prime * result + count;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((msg == null) ? 0 : msg.hashCode());
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
        LayuiVO other = (LayuiVO) obj;
        if (code != other.code)
            return false;
        if (count != other.count)
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (msg == null) {
            if (other.msg != null)
                return false;
        } else if (!msg.equals(other.msg))
            return false;
        return true;
    }
}

