package java2017;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(34500.00);
        System.out.println(bd);	
        
        BigDecimal modelVal = new BigDecimal("24.45555");
        BigDecimal displayVal = modelVal.setScale(2, RoundingMode.HALF_EVEN);
        
        System.out.println(modelVal);
        System.out.println(displayVal);
        
        //You could use the setMinimumFractionDigits and 
        //setMaximumFractionDigits method calls to restrict the amount of data being displayed.
        NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance(Locale.US);
        usdCostFormat.setMinimumFractionDigits( 1 );
        usdCostFormat.setMaximumFractionDigits( 2 );
        System.out.println( usdCostFormat.format(displayVal.doubleValue()) );
	}
  
  
}
