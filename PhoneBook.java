
package phonebook;

/**
 * @author Francisco J Segarra Jr
 */

import java.util.*;

public class PhoneBook 
{
    
    public static void main(String[] args) 
    {
        // Constructor
        PB contact = new PB();
        
        // inserting the contacts in PhoneBook
        contact.insert(345, "BillyIdol");
        contact.insert(445, "CarlSagan");
        contact.insert(875, "AshleyTurner");
        contact.insert(222, "Tanya");
        contact.insert(979, "Francisco");
        contact.insert(354, "Nwanze");
        contact.insert(375, "BillyBobThorton");
        contact.insert(421, "MikeSingletary");
        contact.insert(564, "SteveSmith");
        contact.insert(834, "SallyJones");
        contact.insert(186, "ChrisPratt");
        contact.insert(444, "BradPit");
        contact.insert(154, "TomCruise");
        contact.insert(374, "AndyDweier");
        contact.insert(914, "RobinWilliams");
        
        // deleting a contact
        //contact.delete("Tanya");
        
        int num = contact.retrieve("Nwanze");
        System.out.println(num+"\n");
        
        contact.print();
          
    } // end main  
    
} // end class
