/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.librarymanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Swapnil
 */
public class HibernateConfiguration 
{
    Configuration con = new Configuration().configure().addAnnotatedClass(Admin.class).addAnnotatedClass(Librarian.class).addAnnotatedClass(Book.class);
    ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    SessionFactory sf  = con.buildSessionFactory(reg);
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();
}
