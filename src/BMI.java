import java.util.Arrays;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {


    }

    public static void main(String[] args) {
       BMI testOBJ = new BMI("Logan", 19, 165, 5.6);
        System.out.println(testOBJ.name);
    }
}
