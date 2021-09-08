package com.bitjetkit.pomodoro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetTimer
{
	private int pomodoroTime;
	private int shortBreakTime;
	private int pomoNum;
	private int longBreakTime;
	
	//Timer setting
	public SetTimer() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Pomodoro time(Minutes)Please enter:");
		pomodoroTime = Integer.parseInt(br.readLine());
		System.out.print("Short break time(Minutes)Please enter:");
		shortBreakTime = Integer.parseInt(br.readLine());
		System.out.print("Enter the number of Pomodoros up to the long break:");
		pomoNum = Integer.parseInt(br.readLine());
		System.out.print("Long break time(Minutes)Please enter:");
		longBreakTime = Integer.parseInt(br.readLine());
	}
	
	//Reading the data of each item
	public int getPomodoroTime()
	{
		return pomodoroTime;
	}
	public int getShortBreakTime()
	{
		return shortBreakTime;
	}
	public int getPomoNum()
	{
		return pomoNum;
	}
	public int getLongBreakTime()
	{
		return longBreakTime;
	}	
}