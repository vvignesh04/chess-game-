
// Counter.java with synchronized methods
public class counter 
{
private int val;
public counter()
{  
  val = 0;  
}
public synchronized void increment()
{  
  ++val; 
  print();  
}
public synchronized void decrement()
{  
  --val; 
  print();
}

public void print()
{
  System.out.print(val);

}
public static void main(String []args)
{
  counter c=new counter();
  increment i=new increment(c);
  decrement d=new decrement(c);
  c.start();
  d.start();
  


}
}

