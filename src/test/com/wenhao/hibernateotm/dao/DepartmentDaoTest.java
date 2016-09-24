package com.wenhao.hibernateotm.dao;

import com.wenhao.hibernateotm.domain.Department;
import com.wenhao.hibernateotm.domain.Employees;
import com.wenhao.hibernateotm.utils.HibernateUtils;
import org.hibernate.Session;
import org.junit.Test;

/**
 * Created by lenovo on 2016/09/24.
 */
public class DepartmentDaoTest {
    @Test
    public void get() throws Exception {
        Session session = HibernateUtils.getSession();
        Department employees = session.get(Department.class, 1L);
        System.out.println(employees);
    }

    @Test
    public void save() throws Exception {

    }

}