package reportcardparser;

public class CourseMark
{
    private String name;
    private int mark;
    
    public CourseMark(final String name, final int mark) {
        this.name = name;
        this.mark = mark;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getMark() {
        return this.mark;
    }
}