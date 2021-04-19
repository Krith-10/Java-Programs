package SpringInit;

import org.springframework.beans.factory.BeanNameAware;

public class Triangle implements BeanNameAware {
	private String type;
	private int radius;
	private Coordinate coord1;
	private Coordinate coord2;
	
	public Triangle(String t, int r) {
		type=t;
		radius=r;
	}
	
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setRadius(int rad) {
		this.radius = rad;
	}
	
	
	public int getRadius() {
		return radius;
	}

	public Coordinate getCoord1() {
		return coord1;
	}

	public void setCoord1(Coordinate coord1) {
		this.coord1 = coord1;
	}

	public Coordinate getCoord2() {
		return coord2;
	}

	public void setCoord2(Coordinate coord2) {
		this.coord2 = coord2;
	}

	public void Draw() {
		System.out.println("Drawing Triangle of type "+getType()+" and coordinates are ("+coord1.getX1()+","+coord1.getX2()+") and ("+coord2.getX1()+","+coord2.getX2()+")");
	}


	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is "+beanName);
	}

}