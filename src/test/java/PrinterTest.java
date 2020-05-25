import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){ printer = new Printer(100, 50);}

    @Test
    public void checkPaperLevel(){
        assertEquals(100, printer.checkPaper());
    }

    @Test
    public void checkTonerLevel(){
        assertEquals(20, printer.checkToner());
    }

    @Test
    public void print(){
        printer.print(5, 5);
        assertEquals(75, printer.checkPaper());
        assertEquals(25, printer.checkToner());
    }

    @Test
    public void cantPrint(){
        printer.print(100, 1000);
        assertEquals(100, printer.checkPaper());
    }
}
