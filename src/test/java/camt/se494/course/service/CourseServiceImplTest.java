package camt.se494.course.service;

import camt.se494.course.dao.CourseEnrolmentDao;
import camt.se494.course.entity.Course;
import camt.se494.course.entity.CourseEnrolment;
import camt.se494.course.entity.CourseReport;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
/**
 * Created by Chertpong on 14/10/2558.
 */
public class CourseServiceImplTest {
    @Test
    public void testGetCourseReport() throws Exception {
        CourseServiceImpl courseService = spy(CourseServiceImpl.class);
        CourseEnrolmentDao courseEnrolmentDao = mock(CourseEnrolmentDao.class);
        courseService.setCourseEnrolmentDao(courseEnrolmentDao);
        Course course = new Course();
        CourseReport courseReport = new CourseReport();
        courseReport.setCourse(course);

        when(courseEnrolmentDao.getCourseEnrolments(course,2558)).thenReturn(Arrays.asList());
        assertThat(courseService.getCourseReport(course,2558),is(courseReport));
    }

    @Test
    public void testGetCourseGpa() throws Exception {
        CourseServiceImpl courseService = spy(CourseServiceImpl.class);
        List<CourseEnrolment> courseEnrolments = new ArrayList<>();
        assertThat(courseService.getCourseGpa(courseEnrolments),is(0.00));
    }
}
