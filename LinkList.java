
package phonebook;

/*
 * @author Francisco J Segarra Jr
 */

public class LinkList 
{
        
    private Node head;
    private int size = 0;
            
    // constructor that creates an empty linked list
    public LinkList()
    {
        head = null;
    }
 
    // constructor that initializes the List to a Node
    public LinkList(Node n)
    {
        head = n;
    }
    
    // method to test if list is Empty
    public boolean isEmpty()
    {
        if (head == null) 
            return true;
       
        else
            return false;
    }
    
    public int size()
    {
        return size;
    }
    
    // method for inserting node at the end of list
    public void add(int data, String name)
    {
        Node temp = new Node(data, name);
        
        if (this.isEmpty())
        {
            head = temp;
        }
        else
        {
            Node temp2 = this.head;
            while(temp2.next != null)
            {
                temp2 = temp2.next;
            }    
            temp2.next = temp;
        }    
        
        size++;
    } // end  method
    
    public void delete(String name) 
    {  
        Node temp = head;
        Node temp2 = temp;
        
        //edge case: Is list empty
        if (this.isEmpty())
            return;
        
        else
        {
            boolean found = false;
            
            if (head.getName() == name)
            {
                head = temp.next;
                temp = null;
                return;
            } // end if
            
            while ((!found) && (temp != null))
            {  
                found = (temp.next.getName() == name);
                
                temp = temp.next;
                
                if (found)
                {
                    
                    temp2.next = temp2.next.next;
                    temp = null;
                    return;
                } // end if
                
                temp2 = temp;
                  
            } // end while
        } // end else
    } // end method
    
    
    public int find(String name)
    {
       Node temp = head;
       boolean found = false;
            
        //edge case: Is list empty
        if (this.isEmpty())
            return 0;     
       
        // if the node is the head
        if (head.getName() == name)
        {
            return temp.getData();
        } // end if
            
        while ((!found) && (temp != null)) 
        {
            found = (temp.next.getName() == name);

            temp = temp.next;

            if (found) 
            {
                return temp.getData();
            } // end if    
        }
        // if it checks everything and nothing applies return 0
        return 0;
    } // end method

    // method for printing list in order
    public void print()
    {
        if (head == null)
        {
            return;
        }
        
        Node temp = head;
        
        while(temp != null)
        {
            System.out.println(temp.getName() + " = " + temp.getData() + ", ");
            temp = temp.next;
        } // end while
    } // end method
} // end class
