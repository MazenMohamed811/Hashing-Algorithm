
package hashing;

public class Chaining 
{
    Node head;
    Node[] array;
    int current;

    public Chaining(int arraySize) 
    {
        array = new Node [arraySize];
        current = 0;
    }
    
    public boolean isEmpty()
    {
        return current ==0;
    }

    public int getCurrent()
    {
        return current;
    }
    
    public int hash(Integer input)
    {
       int val = input.hashCode();
       val%=array.length;
       return val;
    }
    
    public void add(int input)
    {
        current++;
        int index = hash(input);
        Node node = new Node(input);
        if (array[index]==null)
            array[index]=node;
        else
        {
            node.next =array[index];
            array[index]=node;
        }
    }
    
    public int getcount()
    {   
        int key=0;
        int max = 0;
        for(int i=0;i<array.length;i++)
        {
            int count = 0;
            head=array[i]; 
            Node temp = head; 
            while (temp != null) 
            { 
                count++; 
                temp = temp.next;  
            }
            if (count>max)
            {
                max=count;
                key=i;
            }
        }
        System.out.print("The character which occurs the maximum number of times is: ");
        if (array[key].state==32)
        {
            System.out.println("Space"+(char)array[key].state+" ");
        }
        System.out.println((char)array[key].state+" ");
        return max; 
    }

    public void printTimes()
    {
        System.out.println("The number of its occurrence is: "+getcount()+" "+"times");
    }
}
