package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int maxNumber = first;
        maxNumber = second > maxNumber ? second: maxNumber;
        maxNumber = third > maxNumber ? third: maxNumber;
        System.out.println(maxNumber);
    }
}
