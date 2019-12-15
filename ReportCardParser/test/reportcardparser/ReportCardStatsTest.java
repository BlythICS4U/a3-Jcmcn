package reportcardparser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReportCardStatsTest {

    public ReportCardStatsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetBestStudent() {
        System.out.println("GetBestStudent");
        ReportCard[] reportCards = null;
        String expResult = "";
        String result = ReportCardStats.GetBestStudent(reportCards);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetBestSubject() {
        System.out.println("GetBestSubject");
        ReportCard reportCard = null;
        String expResult = "";
        String result = ReportCardStats.GetBestSubject(reportCard);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSubjectAverage() {
        System.out.println("SubjectAverage");
        ReportCard[] reportCards = null;
        String subject = "";
        double expResult = 0.0;
        double result = ReportCardStats.SubjectAverage(reportCards, subject);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

}
