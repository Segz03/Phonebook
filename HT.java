
package phonebook;

/**
 * @author Francisco J Segarra Jr
 */

public class HT 
{
    // declaring variables
    int arraySize;
    LinkList myArray[];
    double loadFactor;
    
    // hash function using length of name
    public int getHash(String name)
    {
        return name.length() % arraySize;
    } // end hash function 
    
    // constructor
    public HT()
    {
        arraySize = 10;
        myArray = new LinkList[arraySize];
    
        for (int i = 0; i< arraySize; i++)
        {
            myArray[i] = null;
        }  
        loadFactor = 0;  
    } // end Constructor
    
    public boolean isCollision(int position)
    {
        if (myArray[position] == null)
        {
            return false;
        }
        else
            return true;  
    } // end method        
    
    public void resize()
    {
        LinkList newArray[] = new LinkList[arraySize * 2];

        for (int i = 0; i< arraySize; i++)
        {
            newArray[i] = myArray[i];
        }
        
        arraySize = arraySize * 2;

        myArray = newArray;
    } // end method

    public void add(int num, String name)
    {
        Node contact = new Node(num, name);

        int position = getHash(name);
        
        // if theres no collision it initiates the linked list
        if (!isCollision(position))
        {
            myArray[position] = new LinkList(contact);
        }  
        
        // if theres already a head node it passes the responsiblity
        // to the LinkList class to add the node after 
        else 
        {
            myArray[position].add(num, name);
        }
        
        // 70% load factor to resize the array
        if (loadFactor > .7)
        {
            resize();
        }

        loadFactor = loadFactor + (1/arraySize);

    } // end method

    public void delete(String key)
    {
        // find the position in the array
        int position = getHash(key);
        // find the position in the LinkList then deletes it
        myArray[position].delete(key);  
    } // end method

    public int retrieve(String name)
    {
        // find position in the array
        int position = getHash(name);
        // find the position in the LinkList and returns the PhoneNumber
        int number = myArray[position].find(name);

        return number;
    } // end method

    public void print()
    {
        for(int i = 0; i < arraySize; i++)
        {
            if (myArray[i] != null)
            {
                myArray[i].print();
            } // end if
        } // end for loop
    } // end method
} // end class
