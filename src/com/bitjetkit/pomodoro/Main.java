package com.bitjetkit.pomodoro;

import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException
	{
		boolean isContinue = true;
		SetTimer timer = new SetTimer();			//Time setting for each item
		do {
			for(int i = 0; i < timer.getPomoNum(); i++)
			{
				Message.startPomo();
				CountDown.bySleep(timer.getPomodoroTime());			//Pomodoro
				if(i == timer.getPomoNum() - 1)
				{
					Message.startLongBreak();
					CountDown.bySleep(timer.getLongBreakTime());		//Long break
				}
				else
				{
					Message.startShortBreak();
					CountDown.bySleep(timer.getShortBreakTime());	//Short break
				}
			}
			isContinue = Message.isContinue();
		}while(isContinue);
	}
}