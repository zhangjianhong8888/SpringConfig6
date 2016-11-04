package com.qianyan.biz.impl;

import com.qianyan.biz.IEmpBiz;
import com.qianyan.dao.IEmpDAO;
import com.qianyan.dao.impl.EmpDaoImpl;
import com.qianyan.dbc.DataBaseConnection;
import com.qianyan.po.Emp;

/**
 * Created by Administrator on 2016/11/4.
 */
public class EmpBizImpl implements IEmpBiz {
    private IEmpDAO ied = null;
    private DataBaseConnection dc = new DataBaseConnection();
    public Emp login(Emp emp) {
        Emp po = null;
        ied = new EmpDaoImpl(this.dc.getConnection());
        try {
            po = ied.login(emp);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            dc.close();
        }
        return po;
    }

    public boolean insertEmp(Emp emp) {
        ied = new EmpDaoImpl(this.dc.getConnection());
        boolean flag = false;
        try {
            flag =  ied.insertEmp(emp);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            dc.close();
        }
        return flag;
    }
}
