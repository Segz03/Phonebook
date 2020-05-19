
package phonebook;

/**
 * @author Francisco J Segarra Jr
 */

// the Phonebook class
public class PB
{
    HT phoneBook;
    
    // constructor
    public PB()
    {
        phoneBook = new HT(); 
    } // end Constructor
    
    public boolean isCollision(int position)
    {  
        return phoneBook.isCollision(position);
    } // end method
    
    public void insert(int num, String name)
    {
        phoneBook.add(num, name); 
    } // end method
    
    public void delete(String key)
    {
        phoneBook.delete(key);   
    } // end method
    
    public int retrieve(String name)
    {
        int number = phoneBook.retrieve(name);
        return number;
    } // end method
    
    public void print()
    {
        phoneBook.print();   
    } // end method
} // end class
