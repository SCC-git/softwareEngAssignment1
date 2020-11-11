import static org.junit.Assert.assertEquals;

import assignment1.Student;
import org.joda.time.DateTime;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetUsername_returnsCorrectlyFormattedUsername() {
        Student testStudent = new Student("Doug Dimmadome", 34, new DateTime(1986, 1,1, 0, 0), 15443451);

        String expectedUsername = "DougDimmadome34";

        String result = testStudent.getUsername();

        assertEquals(expectedUsername, result);
    }
}
