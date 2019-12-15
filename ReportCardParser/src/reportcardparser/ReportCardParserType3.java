package reportcardparser;

import java.io.IOException;
import java.io.BufferedReader;

public class ReportCardParserType3 extends AbstractReportCardParser
{
    private String filePath;
    
    public ReportCardParserType3(final String filePath) {
        super(filePath);
    }
    
    @Override
    ReportCard parseFile(final BufferedReader br) {
        try {
            String nameLine = br.readLine();
            nameLine = nameLine.replace("Name: ", "");
            String DOBLine = br.readLine();
            DOBLine = DOBLine.replace("Date of Birth: ", "");
            br.readLine();
            final String[] subjectName = br.readLine().split("\\t+");
            final String[] subjectMark = br.readLine().split("\\t+");
            final CourseMark[] subject = new CourseMark[subjectName.length];
            double sum = 0.0;
            for (int i = 0; i < subject.length; ++i) {
                subject[i] = new CourseMark(subjectName[i], Integer.parseInt(subjectMark[i]));
                sum += Integer.parseInt(subjectMark[i]);
            }
            final double average = sum / subject.length;
            return new ReportCard(nameLine, DOBLine, subject, average);
        }
        catch (IOException ioe) {
            ioe.printStackTrace(System.out);
            return null;
        }
    }
}
