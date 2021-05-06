package ApplicationCommons.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseDataInteraction extends CrudRepository<Course,String> {
	public List<Course> findByTopicId(String topicId);
}
