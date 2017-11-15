import java.awt.*;
import java.awt.event.*;

public class printer 
{
    public static void main(String[] argv) {
        usePrinter useprinter = new usePrinter();
    }
}

class usePrinter extends Frame 
{
    usePrinter() 
    {
        PrintJob printjob = getToolkit().getPrintJob(this, "Print graphics", null);
        Graphics g = printjob.getGraphics();
        g.drawRect(1, 1, 100, 100);
        g.drawLine(1, 1, 100, 100);
        g.dispose();
        printjob.end();
        System.exit(0);
    }
}
        

