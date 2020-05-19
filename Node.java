
package phonebook;

/**
 * @author Francisco J Segarra Jr
 */

public class Node 
{
    //pointers to the next node in a linked list
    Node next;
    private int data;
    private String name;
    
    // Constructor of the node with data in it
    public Node(int d, String n)
    {
	this.data = d;
        this.name = n;
	next = null;
    }
    
    // setters
    public void setData(int d)
    {
        data = d;
    }
    
    public void setName(String n)
    {
        name = n;
    }        
    
    public void setNext(Node n)
    {
        next = n;
    }        
     
    // getters
    public int getData()
    {
        return data;
    }
    
    public String getName()
    {
        return name;
    }        
    
    public Node getNext()
    {
	return next;
    }       
   
} // end class
