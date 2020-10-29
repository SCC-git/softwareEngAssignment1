package assignment1;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private long id;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, long id, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.modules = modules;
    }

    public String getUsername() {
        return (name+age).replaceAll("\\s+", "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
