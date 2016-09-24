package com.wenhao.hibernateotm.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2016/09/24.
 */
public class Department {
    private Long id;
    private String name;
    /*set是不重复的所以此处使用set集合*/
    private Set<Employees> employees = new HashSet<Employees>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employees> employees) {
        this.employees = employees;
    }
}
