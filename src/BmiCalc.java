public class BmiCalc {
    // BMI = 体重 / (身長 * 身長)
    public static void main(String[] args) {
        double weight, height,bmi;
        weight = 70;
        height = 180;

        height /= 100;

        bmi = weight / (height * height);

        System.out.println("BMIは " + bmi);

        if (bmi < 18.5) {
            System.out.println("痩せ形です");
        } else if (bmi < 25) {
            System.out.println("標準です");
        } else {
            System.out.println("肥満です");
        }
    }
}
