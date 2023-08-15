package com.angelee.community.entity;

import lombok.Data;

@Data
public class Page {
    private Integer current = 1;
    private Integer limit = 5;
    private Integer totalRows;
    private Integer totalPage;
    private String path = "/index";

    public Integer getTotalPage(){
        if(totalRows % limit == 0)
            totalPage = totalRows / limit;
        else
            totalPage = totalRows / limit + 1;
        return totalPage;
    }

    public void setCurrent(Integer current) {
        if(current >= 1)
            this.current = current;
    }

    public void setLimit(Integer limit) {
        if(limit >= 1 && limit <= 100)
            this.limit = limit;
    }

    //    获取当前页的起始行
    public int getOffset() {
        return (current - 1) * limit;
    }

    public int getTo(){
        int to = current + 2;
        return Math.min(to, getTotalPage());
    }

    public int getFrom(){
        int from = current - 2;
        return Math.max(from, 1);
    }
}
