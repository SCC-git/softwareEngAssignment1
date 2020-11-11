package assignment1;

import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();

    public Module(String name, String id, ArrayList<Student> students) {
        this.name = name;
        this.id = id;
        this.students = students;
        for (Student student : students) {
            student.getModules().add(this.toString());
        }
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        for (Student student : students) {
            if(!student.getModules().contains(this.toString())) {
                student.getModules().add(this.toString());
            }
        }
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return String.format("%-7s %s", id, name);
    }
}
