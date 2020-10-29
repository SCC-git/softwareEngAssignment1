package assignment1;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<CourseProgramme> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }
}
