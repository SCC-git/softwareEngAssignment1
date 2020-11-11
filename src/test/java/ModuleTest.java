import static org.junit.Assert.assertEquals;

import assignment1.Module;
import assignment1.Student;
import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;

public class ModuleTest {

    @Test
    public void testConstructor_addsModuleToStringToStudentsModules() {
        Student testStudent = new Student("Doug Dimmadome", 34, new DateTime(1986, 1,1, 0, 0), 15443451);
        ArrayList<Student> testStudents = new ArrayList<>();
        testStudents.add(testStudent);

        Module testModule = new Module("English", "EN101", testStudents);
        String expectedModule = testModule.toString();

        String result = testStudent.getModules().get(0);

        assertEquals(expectedModule, result);
    }

    @Test
    public void testSetStudents_addsStudentsToModule_and_addsModuleToStringToStudentsModulesIfNotAlreadyThere() {
        Student firstStudent = new Student("Doug Dimmadome", 34, new DateTime(1986, 1,1, 0, 0), 15443451);
        ArrayList<Student> firstStudents = new ArrayList<>();
        firstStudents.add(firstStudent);

        Student secondStudent = new Student("Timmy Turner", 17, new DateTime(2003, 1,1, 0, 0), 17894679);
        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(firstStudent);
        allStudents.add(secondStudent);

        Module testModule = new Module("English", "EN101", firstStudents);
        String expectedModule = testModule.toString();

        testModule.setStudents(allStudents);

        for(Student student : allStudents) {
            int numberOfModules = student.getModules().size();
            String registeredModules = student.getModules().get(0);

            assertEquals(1, numberOfModules);
            assertEquals(registeredModules, expectedModule);
        }
    }
}
