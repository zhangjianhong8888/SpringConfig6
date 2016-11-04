package com.qianyan.dao.impl;

import com.qianyan.dao.IEmpDAO;
import com.qianyan.po.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Administrator on 2016/11/4.
 */
public class EmpDaoImpl implements IEmpDAO {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    public EmpDaoImpl(Connection conn){
        this.conn = conn;
    }

    public Emp login(Emp emp)throws Exception {
        Emp po = new Emp();
        String sql = "select empno,ename,sal,loc,tel from emp where empno=? and ename=?";
        this.ps = conn.prepareStatement(sql);
        this.ps.setString(1,emp.getEmpno());
        this.ps.setString(2,emp.getEname());
        rs = this.ps.executeQuery();
        while(rs.next()){
            po.setEmpno(rs.getString(1));
            po.setEname(rs.getString(2));
            po.setSal(rs.getString(3));
            po.setLoc(rs.getString(4));
            po.setTel(rs.getString(5));
        }
        return po;
    }

    public boolean insertEmp(Emp emp) throws Exception {
        String sql = "insert into emp(empno,ename,sal,loc,tel) values(?,?,?,?,?)";
        this.ps = conn.prepareStatement(sql);
        this.ps.setString(1,emp.getEmpno());
        this.ps.setString(2,emp.getEname());
        this.ps.setString(3,emp.getSal());
        this.ps.setString(4,emp.getLoc());
        this.ps.setString(5,emp.getTel());
        if(this.ps.executeUpdate()>0){
            return true;
        }
        return false;
    }
}
