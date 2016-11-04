package com.qianyan.po;

/**
 * Created by Administrator on 2016/11/4.
 */
public class Emp {
    private String empno;
    private String ename;
    private String sal;
    private String loc;
    private String tel;
    public Emp(){}

    public Emp(String empno, String ename, String sal, String loc, String tel) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.loc = loc;
        this.tel = tel;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno='" + empno + '\'' +
                ", ename='" + ename + '\'' +
                ", sal='" + sal + '\'' +
                ", loc='" + loc + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
