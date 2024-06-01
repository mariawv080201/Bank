package mariawoodruff.bank;

import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountMovementTest extends TestCase
{
	private AccountMovement accountMovement;
	
    /**
     * Create the test case
     */
    public AccountMovementTest(String testName)
    {
    	super(testName);
    	
        AccountMovement accountMovement = new AccountMovement();
        accountMovement.setDate(new Date());
        accountMovement.setId("1");
        accountMovement.setQuantity(5000);
        
        this.accountMovement = accountMovement;
    }
    
	
    public static Test suite()
    {
        return new TestSuite( AccountMovementTest.class );
    }

    /**
     * Tests the methods setDate and getDate
     */
    public void testDate()
    {
    	Date date = new Date();
        accountMovement.setDate(date);
        assertEquals(date, accountMovement.getDate());
    }
    
    /**
     * Tests the methods setId and getId
     */
    public void testId()
    {
    	String id = "1";
        accountMovement.setId(id);
        assertEquals(id, accountMovement.getId());
    }

    /**
     * Tests the methods setQuantity and getQuantity
     */
    public void testQuantity()
    {
    	Double quantity = (double) 5000;
        accountMovement.setQuantity(5000);
        assertEquals(quantity, accountMovement.getQuantity(),0.01);
    }
}
