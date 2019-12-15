package reportcardparser;

public class ReportCard
{
    private String name;
    private String dob;
    private CourseMark[] marks;
    private double average;
    
    public ReportCard(final String name, final String dob, final CourseMark[] marks, final double average) {
        this.name = name;
        this.dob = dob;
        this.marks = marks;
        this.average = average;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDob() {
        return this.dob;
    }
    
    public CourseMark[] getMarks() {
        return this.marks;
    }
    
    public double getAverage() {
        return this.average;
    }
}
