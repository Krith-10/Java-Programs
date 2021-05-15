package com.krith.SpringData;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krith.SpringData.DAO.HibernateDaoImpl;
import com.krith.SpringData.DAO.JdbcDao;
import com.krith.SpringData.DAO.SimpleJdbcDaoImpl;
import com.krith.SpringData.model.Circle;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	JdbcDao dao = ctx.getBean("jdbcDao",JdbcDao.class);
    	
    	Circle circle = dao.getCircle(1);
    	//System.out.println(dao.getCount());
    	//System.out.println(dao.getCircleName(1));
    	//System.out.println(dao.getCircleByJdbc(1).getName());
    	//dao.insertCircle(new Circle(4, "Fourth circle"));
    	List<Circle> circleList = dao.getAllCircle();
    	for(Circle c:circleList) {
    		System.out.println(c.getId()+" "+c.getName());
    	}
    	//dao.createTriangle();
    	
    	//SimpleJdbcDaoImpl sjdl = ctx.getBean("simpleJdbcDaoImpl", SimpleJdbcDaoImpl.class);
    	//System.out.println(sjdl.getCount());
    	
    	HibernateDaoImpl hdi = ctx.getBean("hibernateDaoImpl",HibernateDaoImpl.class);
    	System.out.println(hdi.getCount());
    }
}
