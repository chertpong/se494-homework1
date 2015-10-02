# se494-homework1
This is the source code for the homework 1 find the test case 
You can get the source code from
Create the automated test code from the given source code.
Your test code will test at least on these methods.
```java
CourseServiceImpl
-getCourseReport(Course course, Integer academicYear);
-getCourseGpa(List<CourseEnrolment> courseEnrolments)

StudentServiceImpl
- getStudentGpa(Student student)
- getStudentGpa(Student student, Integer academicYear)
- getStudentReport(Student student);
```
<b><i>Hint</i></b> you can mock your own service (as some of the methods here refer to it own service) using the <code>Mockito.spy<code> method. The example is shown in the test folder The StudentServiceImplTest.

The grading
After you complete the test, the mutate code will be given to you with 5 errors. If your test case can find 5 error. You will get 10 point.
If you have any questions, feel free to ask me in any channel.
