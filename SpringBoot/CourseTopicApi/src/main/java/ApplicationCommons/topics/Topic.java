package ApplicationCommons.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String descrp;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String descrp) {
		super();
		this.id = id;
		this.name = name;
		this.descrp = descrp;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrp() {
		return descrp;
	}

	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}
	
	
}
