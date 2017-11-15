//program to demo sort technique
import java.io.*;
public class SortDemo 
{
    public static void main(String[] args)
	{
        int a[] = { 32, 87, 3, 589, 12, 1076,2000, 8, 622, 127  };
			                          

        for (int i = a.length; --i >= 0; ) 
		{
            for (int j = 0; j < i; j++) 
			{
                if (a[j] > a[j+1])
				{
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) 
		{
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

