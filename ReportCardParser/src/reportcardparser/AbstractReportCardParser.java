package reportcardparser;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public abstract class AbstractReportCardParser implements IReportCardParser
{
    private final String filePath;
    
    public AbstractReportCardParser(final String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public ReportCard parse() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(this.filePath));
            return this.parseFile(br);
        }
        catch (IOException ioe) {
            ioe.printStackTrace(System.out);
            try {
                if (br != null) {
                    br.close();
                }
            }
            catch (IOException ioe1) {
                System.out.println("Error in closing the BufferedReader");
                ioe1.printStackTrace(System.out);
            }
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            }
            catch (IOException ioe2) {
                System.out.println("Error in closing the BufferedReader");
                ioe2.printStackTrace(System.out);
            }
        }
        return null;
    }
    
    abstract ReportCard parseFile(final BufferedReader p0);
}