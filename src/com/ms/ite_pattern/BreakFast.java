package com.ms.ite_pattern;

public class BreakFast{

	MenuItem[] menuItems;
	int NumberItems = 0;
    int position = 0;

	// �ִ�� ����� �� �ִ� �޴��� ����
	static final int MaxItems = 6;

	public BreakFast() {

		menuItems = new MenuItem[MaxItems];
		addItem("������ġ", "ī��������ġ", true, 3.99);
		addItem("�ﰢ���", "���ֺ����", false, 2.99);
		addItem("�ܹ���", "���װŸ� ��Ȥ��", false, 3.29);
		addItem("�����", "�ݸ��� ���� ��ī�ݶ�", false, 1.00);
		addItem("���ϱ⸮", "�ұ�&��", true, 0.99);
		addItem("���", "���ζ��", true, 4);
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
