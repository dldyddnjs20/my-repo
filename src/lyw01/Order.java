package lyw01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.source.tree.SwitchExpressionTree;

public class Order {
	public static void main(String[] args) {
		String[] orders = {"alex pizza pasta steak", "bob noodle sandwich pasta",
				"choi pizza sandwich pizza" ,"alex pizza pasta steak"};
		ArrayList order = new ArrayList();
		for(int i=0;i <orders.length; i++) {
			order.add(orders[i]);
		}
		Collections.sort(order);
		String[] names = {};
		for(int i=0; i<order.size(); i++) {
			
		}
		
		
		System.out.println(order);
	
	}

}
