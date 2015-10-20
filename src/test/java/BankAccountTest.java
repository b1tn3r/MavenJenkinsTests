import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() throws Exception {
        account = new BankAccount(10);
    }

    @Test
    public void testDebit() throws Exception {
        double amount = account.debit(5);
        assertEquals(5.0, amount);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test Finished");
    }
}