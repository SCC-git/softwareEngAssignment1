import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetUsername_returnsUsername() {
        ArrayList<Module> testModules = new ArrayList<Module>();
        testModules.add(new Module("Software Engineering III", "CT417"));
        testModules.add(new Module("Machine Learning", "CT4101"));
        testModules.add(new Module("Digital Signal Processing", "EE445"));
        testModules.add(new Module("Real Time Systems", "CT420"));

        Student testStudent = new Student("Doug Dimmadome", 34, 16561983, testModules);

        String expectedUsername = "DougDimmadome34";

        String result = testStudent.getUsername();

        assertEquals(expectedUsername, result);
    }
}
