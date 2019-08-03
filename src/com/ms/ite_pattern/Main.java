package com.ms.ite_pattern;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		BreakFast breakFast = new BreakFast();
		Lunch lunch = new Lunch();
		
		MenuItem[] breakItem = breakFast.getMenuItems();
		
		ArrayList<MenuItem> lunchItem = lunch.getMenuItems();
		
		Ite iteBreakFast = breakFast.createIte();
		Ite iteLunch = lunch.createIte();

		
//		for (MenuItem menuItem : breakItem)
//		{
//			System.out.println("�̸� " + menuItem.getName());
//			System.out.println("���� " + menuItem.getPrice());
//		}
//		for(MenuItem menuItem : lunchItem)
//		{
//			System.out.println("�̸� " + menuItem.getName());
//			System.out.println("���� " + menuItem.getPrice());
//		}
	}
}
