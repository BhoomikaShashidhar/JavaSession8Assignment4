
public class ArrayThreadDemo {
public static void main(String args[])
{
	ArrayThread at=new ArrayThread();
    at.start();
    while(at.isAlive())
    {
    	System.out.println("Main thread will be alive till the child thread is live");
    }
	ArrayThread at1=new ArrayThread();
	at1.start();
	
}
}
