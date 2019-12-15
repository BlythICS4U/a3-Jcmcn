package reportcardparser;

import java.io.IOException;
import java.io.BufferedReader;

public class ReportCardParserType1 extends AbstractReportCardParser
{
    private String filePath;
    
    public ReportCardParserType1(final String filePath) {
        super(filePath);
    }
    
    @Override
    ReportCard parseFile(final BufferedReader br) {
        try {
            String nameLine = br.readLine();
            nameLine = nameLine.replace("Name: ", "");
            String DOBLine = br.readLine();
            DOBLine = DOBLine.replace("DOB: ", "");
            br.readLine();
            final CourseMark[] subject = new CourseMark[8];
            int i = 0;
            String subjectLine;
            while ((subjectLine = br.readLine()) != null) {
                final String[] placeholder = subjectLine.split("\\t+");
                subject[i] = new CourseMark(placeholder[0], Integer.parseInt(placeholder[1]));
                ++i;
            }
            double sum = 0.0;
            for (int a = 0; a < subject.length; ++a) {
                sum += subject[a].getMark();
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