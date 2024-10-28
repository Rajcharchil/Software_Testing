
public class MarksCalculator {
    
    
    public double calculateAverage(int s1, int s2, int s3, int s4) {
        return (s1 + s2 + s3 + s4) / 4.0;
    }

    
    public String findGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 75) return "B";
        if (average >= 50) return "C";
        return "D";
    }
    
    public static void main(String[] args) {
        MarksCalculator calc = new MarksCalculator();
        
        
        int sub1 = 80, sub2 = 75, sub3 = 60, sub4 = 90;
        
       
        double avg = calc.calculateAverage(sub1, sub2, sub3, sub4);
        
        
        String grade = calc.findGrade(avg);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}

