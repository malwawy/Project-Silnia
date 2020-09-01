public class FactorialCalculation {
    public static int factorial (int factorialBase) {
        int result = 1;
        for (int i=1; i<=factorialBase; i++) {
            result *= i;
        }
        return result;
    }
}
