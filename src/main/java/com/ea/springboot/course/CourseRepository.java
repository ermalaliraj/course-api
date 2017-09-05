package com.ea.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByName(String name);//impl from framework

	public List<Course> findByTopicId(String topicId);//impl from framework
}
