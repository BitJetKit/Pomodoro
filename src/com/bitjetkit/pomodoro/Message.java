package com.bitjetkit.pomodoro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Message
{
	public static boolean isContinue() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Do you want to do the next task?(Y/N)");
			String reply = br.readLine();
			if(reply.equals("Y"))
			{
				System.out.println("Continue. let's do our best.");
				SetTimer setNewTimer = new SetTimer();
			}
			else if(reply.equals("N"))
			{
				System.out.println("It's done. thank you for your hard work.");
				return false;
			}
			else
			{
				continue;
			}
		}
	}
	
	public static void startPomo()
	{
		System.out.print("Pomodoro, let's get started.");
	}
	
	public static void startShortBreak()
	{
		System.out.print("Let's start a short break.");
	}
	
	public static void startLongBreak()
	{
		System.out.print("Let's start a long break.");
	}
}
