package java2017;
import java.math.BigDecimal;
import java.util.Currency;

/**
* Example of typical calculations with monetary values, implemented with
* <tt>BigDecimal</tt>.
*
* <P>This example is for a currency which has two decimal places.
*
* See
* http://java.sun.com/j2se/1.5.0/docs/api/java/math/BigDecimal.html
*
* Note in particular how the <em>default</em> scale of the result of an
* operation is calculated from the scales of the two input numbers :
* <ul>
* <li> a + b : max[ scale(a), scale(b) ]
* <li> a - b : max[ scale(a), scale(b) ]
* <li> a * b : scale(a) + scale(b)
* <li> a / b : scale(a) - scale(b)
* </ul>
*/
public final class MoneyCalculation {

  /**
  * Simple test harness.
  *
  * Takes two numeric arguments, representing monetary values, in a form
  * which can be passed successfully to the <tt>BigDecimal(String)</tt>
  * constructor (<tt>25.00, 25.0, 25</tt>, etc).
  *
  * Note that the <tt>String</tt> constructor is preferred for
  * <tt>BigDecimal</tt>.
  */
  public static void main(String... aArgs){
    BigDecimal amountOne = new BigDecimal("513.89");
    BigDecimal amountTwo = new BigDecimal("612.25");
    MoneyCalculation calc = new MoneyCalculation(amountOne, amountTwo);
    calc.doCalculations();
  }

  public MoneyCalculation(BigDecimal aAmountOne, BigDecimal aAmountTwo){
    fAmountOne = rounded(aAmountOne);
    fAmountTwo = rounded(aAmountTwo);
  }

  public void doCalculations() {
    log("Amount One: " + fAmountOne);
    log("Amount Two: " + fAmountTwo);
    log("Sum : " + getSum());
    log("Difference : " + getDifference());
    log("Average : " + getAverage());
    log("5.25% of Amount One: " + getPercentage());
    log("Percent Change From Amount One to Two: " + getPercentageChange());
  }

  // PRIVATE

  private BigDecimal fAmountOne;
  private BigDecimal fAmountTwo;

  /**
  * Defined centrally, to allow for easy changes to the rounding mode.
  */
  private static int ROUNDING_MODE = BigDecimal.ROUND_HALF_EVEN;

  /**
  * Number of decimals to retain. Also referred to as "scale".
  */
  private static int DECIMALS = 2;
  //An alternate style for this value :
  //private static int DECIMAL_PLACES =
  //  Currency.getInstance("USD").getDefaultFractionDigits()
  //;

  private static int EXTRA_DECIMALS = 4;
  private static final BigDecimal TWO = new BigDecimal("2");
  private static BigDecimal HUNDRED = new BigDecimal("100");
  private static BigDecimal PERCENTAGE = new BigDecimal("5.25");

  private void log(String aText){
    System.out.println(aText);
  }

  private BigDecimal getSum(){
    return fAmountOne.add(fAmountTwo);
  }

  private BigDecimal getDifference(){
    return fAmountTwo.subtract(fAmountOne);
  }

  private BigDecimal getAverage(){
    return getSum().divide(TWO, ROUNDING_MODE);
  }

  private BigDecimal getPercentage(){
    BigDecimal result = fAmountOne.multiply(PERCENTAGE);
    result = result.divide(HUNDRED, ROUNDING_MODE);
    return rounded(result);
  }

  private BigDecimal getPercentageChange(){
    BigDecimal fractionalChange = getDifference().divide(
      fAmountOne, EXTRA_DECIMALS, ROUNDING_MODE
    );
    return rounded(fractionalChange.multiply(HUNDRED));
  }

  private BigDecimal rounded(BigDecimal aNumber){
    return aNumber.setScale(DECIMALS, ROUNDING_MODE);
  }
} 