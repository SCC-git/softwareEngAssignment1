package assignment1;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {
    private String name;
    private ArrayList<Module> associatedModules;
    private ArrayList<Student> associatedStudents;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String name, ArrayList<Module> associatedModules, ArrayList<Student> associatedStudents, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.associatedModules = associatedModules;
        this.associatedStudents = associatedStudents;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getAssociatedModules() {
        return associatedModules;
    }

    public void setAssociatedModules(ArrayList<Module> associatedModules) {
        this.associatedModules = associatedModules;
    }

    public ArrayList<Student> getAssociatedStudents() {
        return associatedStudents;
    }

    public void setAssociatedStudents(ArrayList<Student> associatedStudents) {
        this.associatedStudents = associatedStudents;
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
}
