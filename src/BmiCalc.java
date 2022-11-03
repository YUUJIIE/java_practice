public class BmiCalc {
    // BMI = 体重 / (身長 * 身長)
    public static void main(String[] args) {
        double weight, height,bmi;
        weight = 70;
        height = 180;

        height /= 100;

        bmi = weight / (height * height);

        System.out.println(bmi);
    }
}
