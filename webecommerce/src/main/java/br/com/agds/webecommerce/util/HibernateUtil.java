/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agds.webecommerce.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 *
 * @author André
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    public static final String HIBERNATE_SESSION = "hirbernate_sessionn";
    
    static {
        try {
            System.out.println("Tentando abrir uma Session Factory");
            
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            
            System.out.println("Session Factory Criada Corretamente!");
        } catch (Exception ex) {
            System.out.println("Ocorreu um erro ao iniciar a Session Factory" + ex);
            
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
