package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxNumber = first;
        if (second >= maxNumber) {
            maxNumber = second;
        }
        if (third >= maxNumber) {
            maxNumber = third;
        }
        System.out.println(maxNumber);
    }
}
