package peaksoft.mapper.views;

import org.springframework.stereotype.Component;
import peaksoft.dto.request.CourseRequest;
import peaksoft.dto.response.CourseResponse;
import peaksoft.entity.Course;
import peaksoft.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseViewMapper {

    public CourseResponse viewCourse(Course course) {
        if (course == null) {
            return null;
        }

        CourseResponse response = new CourseResponse();
        if (course.getId() != null) {
            response.setId(course.getId());
        }

        response.setCourseName(course.getCourseName());
        response.setDuration(course.getDuration());
        System.out.println("Course ViewMapper");
        return response;
    }
}
