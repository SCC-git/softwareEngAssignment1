import static org.junit.Assert.assertEquals;

import assignment1.CourseProgramme;
import assignment1.Module;
import assignment1.Student;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

public class CourseProgrammeTest {

    @Test
    public void testConstructor_addsCourseProgrammeToStringToStudentsCourses_and_addsCourseProgrammeToStringToModulesCourses() {
        Student testStudent = new Student("Doug Dimmadome", 34, new DateTime(1986, 1,1, 0, 0), 15443451);
        ArrayList<Student> testStudents = new ArrayList<>();
        testStudents.add(testStudent);

        Module testModule = new Module("English", "EN101", testStudents);
        ArrayList<Module> testModules = new ArrayList<>();
        testModules.add(testModule);

        CourseProgramme testCourseProgramme = new CourseProgramme("Engineering", testModules, testStudents,  new DateTime(2018, 1, 1, 0, 0), new DateTime(2022, 1, 1, 0, 0));
        String expectedCourse = testCourseProgramme.toString();

        String studentResult = testStudent.getCourses().get(0);
        String moduleResult = testModule.getCourses().get(0);

        assertEquals(expectedCourse, studentResult);
        assertEquals(expectedCourse, moduleResult);
    }

    @Test
    public void testSetStudents_addsStudentsToCourse_and_addsCourseToStringToStudentsCoursesIfNotAlreadyThere() {
        Student firstStudent = new Student("Doug Dimmadome", 34, new DateTime(1986, 1,1, 0, 0), 15443451);
        ArrayList<Student> firstStudents = new ArrayList<>();
        firstStudents.add(firstStudent);

        Student secondStudent = new Student("Timmy Turner", 17, new DateTime(2003, 1,1, 0, 0), 17894679);
        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(firstStudent);
        allStudents.add(secondStudent);

        Module testModule = new Module("English", "EN101", firstStudents);
        ArrayList<Module> testModules = new ArrayList<>();
        testModules.add(testModule);

        CourseProgramme testCourseProgramme = new CourseProgramme("Engineering", testModules, firstStudents,  new DateTime(2018, 1, 1, 0, 0), new DateTime(2022, 1, 1, 0, 0));
        String expectedCourse = testCourseProgramme.toString();

        testCourseProgramme.setStudents(allStudents);

        for(Student student : allStudents) {
            int numberOfCourses = student.getCourses().size();
            String registeredCourses = student.getCourses().get(0);

            assertEquals(1, numberOfCourses);
            assertEquals(registeredCourses, expectedCourse);
        }
    }

    @Test
    public void testSetModules_addsModulesToCourse_and_addsCourseToStringToModulesCoursesIfNotAlreadyThere() {
        Student testStudent = new Student("Doug Dimmadome", 34, new DateTime(1986, 1, 1, 0, 0), 15443451);
        ArrayList<Student> testStudents = new ArrayList<>();
        testStudents.add(testStudent);

        Module firstModule = new Module("English", "EN101", testStudents);
        ArrayList<Module> firstModules = new ArrayList<>();
        firstModules.add(firstModule);

        Module secondModule = new Module("Maths", "MA101", testStudents);
        ArrayList<Module> allModules = new ArrayList<>();
        allModules.add(firstModule);
        allModules.add(secondModule);

        CourseProgramme testCourseProgramme = new CourseProgramme("Engineering", firstModules, testStudents, new DateTime(2018, 1, 1, 0, 0), new DateTime(2022, 1, 1, 0, 0));
        String expectedCourse = testCourseProgramme.toString();

        testCourseProgramme.setModules(allModules);

        for (Module module : allModules) {
            int numberOfCourses = module.getCourses().size();
            String registeredCourses = module.getCourses().get(0);

            assertEquals(1, numberOfCourses);
            assertEquals(registeredCourses, expectedCourse);
        }
    }
}
