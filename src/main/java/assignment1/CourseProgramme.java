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
}
