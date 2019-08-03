package com.ms.ite_pattern;

public class BreatIte implements Ite{
	int position = 0;
	MenuItem[] menuItems;
	
	public BreatIte(MenuItem[] menuItems)
	{
		this.menuItems = menuItems;
	}


	@Override
	public boolean hasNext() {
		if(position >= menuItems.length || menuItems[position] == null)
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
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		
		return menuItem;
	}
}
