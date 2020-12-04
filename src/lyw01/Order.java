package lyw01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Order {
	public static void main(String[] args) {
		List<String> orders = new ArrayList<String>(
				Arrays.asList("alex pizza pasta steak", 
		                "bob noodle sandwich pasta", "choi pizza sandwich pizza", 
		                "alex pizza pasta steak"));
			
		ArrayList<String> name_list = new ArrayList<String>();
		ArrayList<String> menu_list = new ArrayList<String>();
		ArrayList<Integer> menu_cnt_list = new ArrayList<Integer>();
		HashMap<String, Integer> name_menu = new HashMap<String,Integer>();
		
		// �̸� ����Ʈ ����ϱ�
		
		// orders�� ���� ���ʴ�� �����ͼ� xx�� �־��
		for (String xx : orders) {
			String[] name = xx.split(" ");
			if (! name_list.contains(name[0])) // �̸� �ߺ� ����
				name_list.add(name[0]);
		}
		System.out.println(name_list);
		
		for (String name : name_list) {
			for (String xx : orders) {
				String[] order = xx.split(" ");
				if(name.equals(order[0])) {
					for (int j= 1; j < order.length; j++) {
						if(!menu_list.contains(order[j])) // �޴� �ߺ� üũ
						menu_list.add(order[j]);
					}
				}
			}
			System.out.println(name + ":"+ menu_list);
			name_menu.put(name, menu_list.size()); // python���� len�� ���� ��Ȱ
			menu_cnt_list.add(menu_list.size());
			menu_list.clear();
		}
		
		System.out.println(name_menu);
		Collections.sort(menu_cnt_list);
		int top_cnt = menu_cnt_list.get(menu_cnt_list.size()-1);
		
		for (String name: name_menu.keySet()) {
			if ( name_menu.get(name)==top_cnt)
				System.out.println(name);
		}
	
	}

}
