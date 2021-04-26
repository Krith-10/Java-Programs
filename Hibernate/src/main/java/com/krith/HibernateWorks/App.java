package com.krith.HibernateWorks;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee emp1 = new Employee();
        //CountryVisit cv = new CountryVisit();
        
        //cv.setCountry1("Fra");
        //cv.setCountry2("Aus");
        
        /*Laptop lp = new Laptop();
    	lp.setLapId(104);
        lp.setBrand("Asus");
        lp.setEmployee(emp1);*/
        
        emp1.setId(15);
        emp1.setName("FF");
        emp1.setDomain("TM");
        //emp1.setTour(cv);
        //emp1.getLapList().add(lp);
    	
    	
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Query q3 = session.createQuery("FROM Employee WHERE id=14 ");
        q3.setCacheable(true);
        Employee emp2 = (Employee) session.get(Employee.class, 12); //To get the data entry from the table arg1 is the class and arg2 is the primary key
        Employee emp3  = (Employee)q3.uniqueResult();
        Employee emp4  = (Employee) session.get(Employee.class, 15);
        //session.save(emp1);
        //session.save(lp);	//To save an object to entry
        
        //tx.commit();
        
        //session.detach();
        
        /*Employee emp2 = session.get(Employee.class, 4);
        System.out.println(emp2.getName());
        
        List<Laptop> myLap = emp2.getLapList();
        
        for(Laptop l : myLap) {
        	System.out.println(l.getBrand());
        }*/
        //System.out.println(emp2);
        System.out.println(emp3);
        //System.out.println(emp4);
        
        session.getTransaction().commit();
        session.close();
        
        Session session2 = sf.openSession();
        session2.beginTransaction();
        
        Query q4 = session2.createQuery("FROM Employee WHERE id=14 ");	//Will return as list Incase SELECT used then returns as Object
        q4.setCacheable(true);
        
        Query q5 = session2.createQuery("From Employee");
        List<Employee> employees = q5.list();
        
        System.out.println("The entire list are:");
        for(Employee e:employees) {
        	System.out.println(e);
        }
        
        //Native Queries
        SQLQuery q6 = session2.createSQLQuery("SELECT * from Employee WHERE id>13");
        q6.addEntity(Employee.class);
        
        //q6.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        
        List<Employee> employeesObj = (List<Employee>) q6.list();
        
        for(Employee emp: employeesObj) {
        	System.out.println(emp);
        }
        
        emp2 =(Employee) session2.get(Employee.class, 12); 
        emp4 = (Employee)q4.uniqueResult(); 
        session2.getTransaction().commit();
        
        System.out.println(emp2);
    }
}
