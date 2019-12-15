package reportcardparser;

public class Main {
    private static final String Folder = "ReportCards";
    private static IReportCardParser[] reportCardParsers = new IReportCardParser[]{
        new ReportCardParserType1("ReportCards/ReportType1_1.txt"), 
        new ReportCardParserType1("ReportCards/ReportType1_2.txt"), 
        new ReportCardParserType1("ReportCards/ReportType1_3.txt"), 
        new ReportCardParserType2("ReportCards/ReportType2_1.txt"), 
        new ReportCardParserType2("ReportCards/ReportType2_2.txt"), 
        new ReportCardParserType2("ReportCards/ReportType2_3.txt"), 
        new ReportCardParserType3("ReportCards/ReportType3_1.txt"), 
        new ReportCardParserType3("ReportCards/ReportType3_2.txt"), 
        new ReportCardParserType3("ReportCards/ReportType3_3.txt")};

    public static void main(String[] args) {
        ReportCard[] reportCards = new ReportCard[reportCardParsers.length];
        for (int i = 0; i < reportCardParsers.length; ++i) {
            reportCards[i] = reportCardParsers[i].parse();
        }
        System.out.println("Best student is " + ReportCardStats.GetBestStudent(reportCards));
        for (ReportCard reportCard : reportCards) {
            System.out.println("Best subject for " + reportCard.getName() + " is " + ReportCardStats.GetBestSubject(reportCard));
        }
        System.out.println("Average mark for English is " + ReportCardStats.SubjectAverage(reportCards, "English"));
        System.out.println("Average mark for Physics is " + ReportCardStats.SubjectAverage(reportCards, "Physics"));
        System.out.println("Average mark for Computer Science is " + ReportCardStats.SubjectAverage(reportCards, "Computer Science"));
        System.out.println("Average mark for Calculus is " + ReportCardStats.SubjectAverage(reportCards, "Calculus"));
    }
}