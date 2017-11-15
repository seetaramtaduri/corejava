import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatDemo1
{
  public static void main(String[] args)
  {        
    System.out.println("US as location:");
    NumberFormat moneyFormater2 =
    NumberFormat.getCurrencyInstance(Locale.US);

    System.out.println(moneyFormater2.format(19.8));
    System.out.println(moneyFormater2.format(19.81111));
    System.out.println(moneyFormater2.format(19.89999));
    System.out.println(moneyFormater2.format(19));
  }
}
