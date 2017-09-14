package com.neusoft.platform.system.model;

import com.github.excel4j.annotation.Cell;
import com.github.excel4j.annotation.Excel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by will on 2017/6/1.
 */
@Excel
public class ExcelEntity {
    @Cell("姓名")
    private String name;
    @Cell("年龄")
    private int age;
    @Cell("工资")
    private BigDecimal money;
    @Cell(value = "创建日期")
    private Date createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
