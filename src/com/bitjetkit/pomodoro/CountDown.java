package com.bitjetkit.pomodoro;

import java.text.DecimalFormat;

public class CountDown
{
	//fields
	private static long totalTimeBySec;
	private static long perSec = 1000;
	
	//method
	public static void bySleep(int totalTime) throws InterruptedException		//Countdown method using sleep method
	{
		totalTimeBySec =totalTime * 60;
		for(long i = totalTimeBySec; i >= 0; i--)
		{
			Thread.sleep(perSec);				//Wait a second
			remainTime(i);			//Show remaining time
		}
	}
	public static void remainTime(long timeBySec)
	{
			long min = timeBySec/60;
			long sec = timeBySec%60;
			
			DecimalFormat df = new DecimalFormat("00");	//Output minutes and seconds in two digits
			
			System.out.println(df.format(min) + ":" + df.format(sec));
	}
}
