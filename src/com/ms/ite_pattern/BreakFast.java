package com.ms.ite_pattern;

public class BreakFast{

	MenuItem[] menuItems;
	int NumberItems = 0;
    int position = 0;

	// 최대로 등록할 수 있는 메뉴의 개수
	static final int MaxItems = 6;

	public BreakFast() {

		menuItems = new MenuItem[MaxItems];
		addItem("샌드위치", "카츠샌드위치", true, 3.99);
		addItem("삼각김밥", "전주비빔밥", false, 2.99);
		addItem("햄버거", "말죽거리 잔혹사", false, 3.29);
		addItem("음료수", "콜르난 역시 코카콜라", false, 1.00);
		addItem("오니기리", "소금&밥", true, 0.99);
		addItem("라면", "만두라면", true, 4);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems[NumberItems] = menuItem;
		NumberItems = NumberItems + 1;
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public Ite createIte()
	{
		return new BreatIte(menuItems);
		
	}
	
	

}
