package assignment1;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {
    private String name;
    private ArrayList<Module> modules = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;

        for (Student student : students) {
            student.getCourses().add(this.toString());
        }
        for(Module module : modules) {
            module.getCourses().add(this.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
        for(Module module : modules) {
            module.getCourses().add(this.toString());
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
        for (Student student : students) {
            student.getCourses().add(this.toString());
        }
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return name;
    }
}
