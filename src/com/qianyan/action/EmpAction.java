package com.qianyan.action;

import com.qianyan.biz.IEmpBiz;
import com.qianyan.po.Emp;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/4.
 */
//@Controller
//@RequestMapping("/EmpAction")
//public class EmpAction {
//    @Resource
//    private IEmpBiz iEmpBiz;
//
//    @RequestMapping("/login")
//    public String login(MockHttpServletRequest request,Emp emp){
//        Emp po = iEmpBiz.login(emp);
//        if(po!=null){
//            request.setAttribute("po",po);
//            return "/index.jsp";
//        }else{
//            return "";
//        }
//    }
//    @RequestMapping("/insertEmp")
//    public String insertEmp(MockHttpServletRequest request,Emp emp) {
//        Emp po = iEmpBiz.login(emp);
//        if (po != null) {
//            request.setAttribute("po", po);
//            return "/index.jsp";
//        } else {
//            return "";
//        }
//    }
//}
