package com.ms.ite_pattern;

import java.util.ArrayList;

public class LunchIte implements Ite{
	int position = 0;
	ArrayList<MenuItem> menuItems;
	
	public LunchIte(ArrayList<MenuItem> menuItems)
	{
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position >= menuItems.size())
		{
		return false;	
		}
		else
		{
			return true;
		}
	}

	@Override
	public MenuItem next() {

		MenuItem menuItem = menuItems.get(position);
		
		return menuItem;
	}
	
}
