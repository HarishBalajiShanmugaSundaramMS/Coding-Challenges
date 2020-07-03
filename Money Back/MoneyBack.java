import java.util.Arrays;
import java.util.List;

public class MoneyBack {
    public static void main(String[] args) {
        double moneyBack = 1600;
        double finalTotal = 0.0;
        List<Double> arrayList = Arrays.asList(500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05,
                0.02, 0.01);
        System.out.println(arrayList);
        for (int i = 0; i <= arrayList.size() - 1; i++) {

            while (moneyBack >= arrayList.get(i)) {
                System.out.println(arrayList.get(i));
                moneyBack = moneyBack - arrayList.get(i);
                finalTotal = finalTotal + arrayList.get(i);
                if (i == arrayList.size()) {
                    break;
                }
            }
            
        }
        System.out.println("Total Sum Paid: " + finalTotal);
    }
}