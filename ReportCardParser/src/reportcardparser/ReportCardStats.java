package reportcardparser;

public class ReportCardStats
{
    public static String GetBestStudent(final ReportCard[] reportCards) {
        double highestAverage = 0.0;
        String bestStudent = "";
        for (int i = 0; i < reportCards.length; ++i) {
            if (highestAverage < reportCards[i].getAverage()) {
                highestAverage = reportCards[i].getAverage();
                bestStudent = reportCards[i].getName();
            }
        }
        return bestStudent;
    }
    
    public static String GetBestSubject(final ReportCard reportCard) {
        int bestSubject = 0;
        int index = 0;
        for (int i = 0; i < reportCard.getMarks().length; ++i) {
            if (bestSubject < reportCard.getMarks()[i].getMark()) {
                bestSubject = reportCard.getMarks()[i].getMark();
                index = i;
            }
        }
        return reportCard.getMarks()[index].getName();
    }
    
    public static double SubjectAverage(final ReportCard[] reportCards, final String subject) {
        int subjectIndex = 0;
        switch (subject) {
            case "English": {
                subjectIndex = 0;
                break;
            }
            case "Business Studies": {
                subjectIndex = 1;
                break;
            }
            case "Computer Science": {
                subjectIndex = 2;
                break;
            }
            case "Calculus": {
                subjectIndex = 3;
                break;
            }
            case "Principles of Mathematics": {
                subjectIndex = 4;
                break;
            }
            case "Chemistry": {
                subjectIndex = 5;
                break;
            }
            case "Physics": {
                subjectIndex = 6;
                break;
            }
            case "Biology": {
                subjectIndex = 7;
                break;
            }
        }
        double sum = 0.0;
        for (int i = 0; i < reportCards.length; ++i) {
            sum += reportCards[i].getMarks()[subjectIndex].getMark();
        }
        final double average = Math.round(sum / reportCards.length * 100.0) / 100.0;
        return average;
    }
}
