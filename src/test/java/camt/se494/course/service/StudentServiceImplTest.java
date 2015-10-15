package camt.se494.course.service;

import camt.se494.course.dao.CourseEnrolmentDao;
import camt.se494.course.entity.CourseEnrolment;
import camt.se494.course.entity.Student;
import camt.se494.course.entity.StudentReport;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.number.IsCloseTo.*;
/**
 * Created by Dto on 10/2/2015.
 */
public class StudentServiceImplTest {
    @Test
    public void testGetStudentReport(){
        StudentServiceImpl studentService = spy(StudentServiceImpl.class);
        CourseEnrolmentDao courseEnrolmentDao = mock(CourseEnrolmentDao.class);
        List<CourseEnrolment> courseEnrolments = new ArrayList<>();
        studentService.setCourseEnrolmentDao(courseEnrolmentDao);
        when(studentService.getRegisterYear(courseEnrolments)).thenReturn(Arrays.asList(2554,2555,2556));
        Student student = new Student();
        StudentReport studentReport = new StudentReport();
        studentReport.setStudent(student);
        assertThat(studentService.getStudentReport(student), is(studentReport));
    }

    @Test
    public void testGetStudentGpa1Paramter() throws Exception {
        StudentServiceImpl studentService = spy(StudentServiceImpl.class);
        List<CourseEnrolment> courseEnrolments = new ArrayList<>();
        Student student = new Student();
        assertThat(studentService.getStudentGpa(student),is(0.00));

    }

    @Test
    public void testGetStudentGpa2Parameters() throws Exception {
        StudentServiceImpl studentService = spy(StudentServiceImpl.class);
        Student student = new Student();
        assertThat(studentService.getStudentGpa(student,2556),is(0.00));

    }
}
