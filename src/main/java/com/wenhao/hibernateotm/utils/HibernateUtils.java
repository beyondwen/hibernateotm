package com.wenhao.hibernateotm.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by lenovo on 2016/09/24.
 */
public class HibernateUtils {
    private static SessionFactory sessionFactory;

    static {
        try {
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
            sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println("读取配置文件失败" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
