package hung.java.ex6;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestAccount { 
        Account a = new Account("5", "hung", 500); 
        Account a2 = new Account("8", "hai", 900);
      
      @Test

      public void testCredit() {
        assertEquals(600, a.credit(100));
      }

      @Test

      public void testDebit() {
      	assertEquals("afssf", a.debit(600));
      }

      @Test
      public void testTransferto() {
      	assertEquals(100, a.transferTo(a2, 200));

      }
   
}