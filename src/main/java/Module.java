import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> registeredStudents;
    private ArrayList<CourseProgramme> associatedCourses;

    public Module(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Module(String name, String id, ArrayList<Student> registeredStudents, ArrayList<CourseProgramme> associatedCourses) {
        this.name = name;
        this.id = id;
        this.registeredStudents = registeredStudents;
        this.associatedCourses = associatedCourses;
    }
}
