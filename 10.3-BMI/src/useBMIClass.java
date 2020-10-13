//Jada Hillwick
//October 12, 2020
//10.3 - BMI 

public class useBMIClass {
    
    public static void main(String[] args) {
    
        BMI bmi1 = new BMI("John Doe", 18, 145, 70);
        
        System.out.println("The BMI for " + bmi1.getName() + " is "
        + bmi1.getBMI() + " " + bmi1.getStatus());
        
        BMI bmi2 = new BMI("Peter King", 215, 70);
        
        System.out.println("The BMI for " + bmi2.getName() + " is "
        + bmi2.getBMI() + " " + bmi2.getStatus());
        
    }//End of Main
    
}
