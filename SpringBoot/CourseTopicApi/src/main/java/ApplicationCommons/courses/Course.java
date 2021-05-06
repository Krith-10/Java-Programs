package ApplicationCommons.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ApplicationCommons.topics.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String descrp;
	@ManyToOne
	private Topic topic;
	
	public Course(){}
	
	public Course(String id, String name, String descrp, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.descrp = descrp;
		this.topic = new Topic(topicId, "", "");
	}

	public Topic getTopic() {
		return topic;
	}
	
	public void setTopic(Topic topic) {
		this.topic = topic;
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
	public String getDescription() {
		return descrp;
	}
	public void setDescription(String descrp) {
		this.descrp = descrp;
	}
}
