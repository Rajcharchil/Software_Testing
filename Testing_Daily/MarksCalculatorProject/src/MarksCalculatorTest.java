
import org.testng.Assert;
import org.testng.annotations.Test;

public class MarksCalculatorTest {

    
    @Test
    public void testAverage() {
        MarksCalculator calc = new MarksCalculator();
        double avg = calc.calculateAverage(80, 70, 60, 90);
        Assert.assertEquals(avg, 75.0);
    }

   
    @Test
    public void testGrade() {
        MarksCalculator calc = new MarksCalculator();
        String grade = calc.findGrade(75.0);
        Assert.assertEquals(grade, "B");
    }
}

