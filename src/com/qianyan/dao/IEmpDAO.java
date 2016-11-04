package com.qianyan.dao;
import com.qianyan.po.Emp;

/**
 * Created by Administrator on 2016/11/4.
 */
public interface IEmpDAO {
    /**
     *登录
     * @param emp
     * @return
     */
    public Emp login(Emp emp)throws Exception;

    /**
     * 添加一个用户
     * @param emp
     * @return
     * @throws Exception
     */
    public boolean insertEmp(Emp emp)throws Exception;
}
