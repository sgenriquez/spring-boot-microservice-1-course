package com.sha.springbootmicroservice1course.service;

import com.sha.springbootmicroservice1course.model.Course;
import com.sha.springbootmicroservice1course.repository.CourseRespository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private CourseRespository courseRespository;

    public CourseServiceImpl(CourseRespository courseRespository) {
        this.courseRespository = courseRespository;
    }

    @Override
    public Course saveCourse(Course course) {
        course.setCreateTime(LocalDateTime.now());
        return courseRespository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRespository.deleteById(courseId);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRespository.findAll();
    }
}
