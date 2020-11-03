package assignment1;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private long id;
    private DateTime dateOfBirth;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<String> modules = new ArrayList<>();

    public Student(String name, int age, DateTime dateOfBirth, long id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
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

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public ArrayList<String> getModules() {
        return modules;
    }

    public void setModules(ArrayList<String> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return String.format("%-10d %s", id, name);
    }
}
