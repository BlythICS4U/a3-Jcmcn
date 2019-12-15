package reportcardparser;

import java.io.IOException;
import java.io.BufferedReader;

public class ReportCardParserType2 extends AbstractReportCardParser
{
    private String filePath;
    
    public ReportCardParserType2(final String filePath) {
        super(filePath);
    }
    
    @Override
    ReportCard parseFile(final BufferedReader br) {
        try {
            final String nameLine = br.readLine();
            final String DOBLine = br.readLine();
            br.readLine();
            final String[] placeholder = br.readLine().split(",");
            final CourseMark[] subject = new CourseMark[placeholder.length / 2];
            double sum = 0.0;
            for (int i = 0; i < subject.length; ++i) {
                subject[i] = new CourseMark(placeholder[i * 2], Integer.parseInt(placeholder[i * 2 + 1]));
                sum += subject[i].getMark();
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
