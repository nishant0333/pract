package com.jtc.thread;

class Producer extends Thread
{

	Company c;
	Producer(Company c)
	{
		this.c=c;
	}
	public void run()
	{ 
		int i=1;
		while((true)&&(i<10))
		{
		try{
			this.c.produce_item(i);
			Thread.sleep(1000);
			}
			catch(Exception e){}
			i++;
		}
	}
}
