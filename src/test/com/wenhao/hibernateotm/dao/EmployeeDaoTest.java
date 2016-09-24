package com.wenhao.hibernateotm.dao;

import com.wenhao.hibernateotm.domain.Department;
import com.wenhao.hibernateotm.domain.Employees;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import com.wenhao.hibernateotm.utils.HibernateUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2016/09/24.
 */
public class EmployeeDaoTest {
    @Test
    public void save() throws Exception {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Department department = new Department();
        Employees employee = new Employees();
        employee.setName("wenhao");
        department.setName("采购部2");
        Set<Employees> emp = new HashSet<Employees>();
        emp.add(employee);
        department.setEmployees(emp);
        session.save(department);
        session.save(employee);
        transaction.commit();
        session.close();
    }

}