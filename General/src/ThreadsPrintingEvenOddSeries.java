
public class ThreadsPrintingEvenOddSeries extends Thread
{
	int number = 10;
	public static void main(String [] args) throws InterruptedException
	{		
		ThreadsPrintingEvenOddSeries t1 = new ThreadsPrintingEvenOddSeries();
		ThreadsPrintingEvenOddSeries t2 = new ThreadsPrintingEvenOddSeries();
		t1.start();
		t1.join();
		t2.start();
	}
		
}
