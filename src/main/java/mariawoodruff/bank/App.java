package mariawoodruff.bank;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	int action = 0;
        List<BankAccount> bankAccounts = new LinkedList<BankAccount>();
        
        while (action != 5) {
        	System.out.println( "Welcome to the Bank" );
            System.out.println("Menu: \n"
            		+ "1. Create bank account \n"
            		+ "2. See bank accounts \n"
            		+ "3. Send a bank transfer \n"
            		+ "4. See movements \n"
            		+ "5. Exit \n");
            
            Scanner scanner = new Scanner (System.in);
            action = scanner.nextInt();
            
        	switch(action) {
        		case 1:
        			System.out.println("Introduce the id: ");
        			Integer idInteger = scanner.nextInt();
        			String id = idInteger.toString();
        			
        			BankAccount bankAccount = new BankAccount(id, null, null, new Date(), 0);
        			bankAccounts.add(bankAccount);
        			break;
        		
        		case 2:
        			for (BankAccount account : bankAccounts) {
        	            System.out.println("ID: " + account.getId());
        	            System.out.println("Owner Name: " + account.getOwnerName());
        	            System.out.println("Owner DNI: " + account.getOwnerDNI());
        	            System.out.println("Creation Date: " + account.getCreationDate());
        	            System.out.println("Balance: " + account.getBalance());
        	            System.out.print("\n");
        	            break;
        	        }
            }
        }
    }
}
