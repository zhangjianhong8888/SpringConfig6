package com.qianyan.test;

import com.qianyan.biz.IEmpBiz;
import com.qianyan.biz.impl.EmpBizImpl;
import com.qianyan.po.Emp;

/**
 * Created by Administrator on 2016/11/4.
 */
public class EmpTest {
    public static void main(String[] args){
       /* IEmpBiz ie = new EmpBizImpl();
        Emp emp = new Emp();
        emp.setEmpno("8888");
        emp.setEname("张建宏");
        Emp po = ie.login(emp);
        System.out.println(po.toString());*/
        IEmpBiz ie = new EmpBizImpl();
        Emp emp = new Emp();
        emp.setEmpno("9991");
        emp.setEname("袁小帅");
        emp.setTel("18945927345");
        emp.setLoc("北京");
        emp.setSal("3000");
        System.out.println(ie.insertEmp(emp));

    }
}
