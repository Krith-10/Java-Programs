package ApplicationCommons.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	private List<Course> courses = new ArrayList<>();
	
	@Autowired
	private CourseDataInteraction courseData;
	
	
	public List<Course> getAllCourses(String topicId){
		return courseData.findByTopicId(topicId);
	}
	
	//Java 8 way to do this more elegant. With streams and lambda functions
	public Course getCourse(String id) {
		return courseData.findById(id).get();
	}

	public void addCourse(Course course) {
		courseData.save(course);
	}

	public void updateCourse(Course course) {
		courseData.save(course);
	}

	public void deleteCourse(String id) {
		courseData.deleteById(id);
	}

}