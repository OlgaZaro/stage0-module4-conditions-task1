package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public static void main(String[] args) {


        PositiveNumberDeterminer numberToBeDetermined = new PositiveNumberDeterminer();
        numberToBeDetermined.isPositive(5);
    }

    public void isPositive(int numberToBeDetermined) {

        if (numberToBeDetermined > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
