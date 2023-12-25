public class Main {
    public static void main(String[] args) {
        int minNumber = 100, maxNumber = 999, basNumber = 3, result;
        int basValue, basPow;
        for (int i = minNumber; i <= maxNumber; i++) {
            result = 0;
            int tempNumber = i;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int k = 1; k <= basNumber; k++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }

            if (result == i)
                System.out.println(i + " sayısı bir Armstrong sayıdır.");
        }
    }
}