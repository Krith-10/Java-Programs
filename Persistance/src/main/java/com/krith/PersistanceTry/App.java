package com.krith.PersistanceTry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("match");
        EntityManager em = emf.createEntityManager();
        
        Student b  = em.find(Student.class, 2);
        System.out.println(b);
        
        Student a = new Student();
        a.setId(13);
        a.setRollno(13);
        a.setFirstName("M");
        a.setLastName("mm");
        a.setGpa(8.7f);
        a.setCity("Lucknow");
        
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	System.out.println(a);
    }
}
