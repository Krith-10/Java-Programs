package ApplicationCommons.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicDataInteraction extends CrudRepository<Topic, String> {
	
}
