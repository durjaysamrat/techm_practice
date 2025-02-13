import java.util.List;
public class genTask_2 {
        public static <T extends Number> int sumEvenOdd(List<T> list) {
        int evenSum = 0, oddSum = 0;
        for (T number : list) {
            if (number.intValue() % 2 == 0) {
                evenSum += number.intValue();
            } else {
                oddSum += number.intValue();
            }
        }
        return evenSum + oddSum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(sumEvenOdd(numbers));
    }
}
