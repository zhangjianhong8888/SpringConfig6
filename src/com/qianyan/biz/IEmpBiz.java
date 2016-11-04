package com.qianyan.biz;

import com.qianyan.po.Emp;

/**
 * Created by Administrator on 2016/11/4.
 */
public interface IEmpBiz {
    /**
     *登录
     * @param emp
     * @return
     */
    public Emp login(Emp emp);

    /**
     * 添加新用户
     * @param emp
     * @return
     */
    public boolean insertEmp(Emp emp);
}
