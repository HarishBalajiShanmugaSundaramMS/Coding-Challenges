import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MoneyBackCode {
    public static void main(String[] args) {
        
        BigDecimal moneyBack = new BigDecimal("567.97");
        BigDecimal finalTotal = new BigDecimal("0.0");
        BigDecimal[] denominations = new BigDecimal[] { new BigDecimal("500.0"), new BigDecimal("200.0"),
                new BigDecimal("100.0"), new BigDecimal("50.0"), new BigDecimal("20.0"), new BigDecimal("10.0"),
                new BigDecimal("5.0"), new BigDecimal("2.0"), new BigDecimal("1.0"), new BigDecimal("0.50"),
                new BigDecimal("0.20"), new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.02"),
                new BigDecimal("0.01") };

        System.out.println(denominations);
        for (BigDecimal value : denominations) {
            //System.err.println(value.doubleValue() + " " + moneyBack.doubleValue() + " " + moneyBack.compareTo(value));
            while (moneyBack.compareTo(value) >= 0) {
                System.out.println(value.doubleValue());
                moneyBack = moneyBack.subtract(value);
                finalTotal = finalTotal.add(value);
            }
            if (moneyBack.compareTo(new BigDecimal("0")) == 0) {
                break;
            }
        }
        System.out.println("Total Sum Paid: " + finalTotal);
    }
}