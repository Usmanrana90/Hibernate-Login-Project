package com.cloudxweb.hiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static SessionFactory sf;
    
    static
    {
    	try {
			
    		Configuration cfg=new Configuration();
        	cfg.configure("/com/cloudxweb/resource/hibernate.cfg.xml");
        	 sf=cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static SessionFactory getSessionFactory()
    {
    	return sf;
    }
    
}
