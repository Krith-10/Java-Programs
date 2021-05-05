package ApplicationCommons.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("1","Machine Learning","Subjects on Math,Stats"),
				new Topic("2","Front End","HTML, CSS, Java Script"),
				new Topic("3","Back End","Java, MySQL")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic t) {
		topics.add(t);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void removeTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
