package ApplicationCommons.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicDataInteraction topicData;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>(); 
		topicData.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicData.findById(id);
	}
	
	public void addTopic(Topic t) {
		topicData.save(t);
	}

	public void updateTopic(Topic topic, String id) {
		topicData.save(topic);
	}
	
	public void removeTopic(String id) {
		topicData.deleteById(id);
	}
}
