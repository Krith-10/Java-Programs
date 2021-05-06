package ApplicationCommons.topics;

public class Topic {
	private String id;
	private String course;
	private String descrp;
	
	public Topic() {
		
	}
	
	public Topic(String id, String course, String descrp) {
		super();
		this.id = id;
		this.course = course;
		this.descrp = descrp;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDescrp() {
		return descrp;
	}

	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}
	
	
}
