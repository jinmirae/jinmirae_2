import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alName;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	
	Order() {
		alMobile=new ArrayList<String>();
		alName=new ArrayList<String>();
		alCount=new ArrayList<Integer>();
		alTotal=new ArrayList<Integer>();
	}
	
	Scanner s1 = new Scanner(System.in);//String
	Scanner s2 = new Scanner(System.in);//int
	
	void addOreder(String name,int price, int cnt) {
		this.alName.add(name);
		this.alCount.add(cnt);
		int total = price*cnt;
		System.out.println(cnt+"잔하시면 "+total+"원입니다.");
		this.alTotal.add(total);
	}
	
	int addOredernum(int order_num, int cnt) {
		return this.alCount.set(order_num, cnt);
	}
	
	/*int addTot() {
		this.alTotal.add(total)
	}*/
	
//	String getName(int order_num, String name, int price, int cnt) {
//		return this.alName.get(number);
//	}
	//int getTotalSum() {
		//주문리스트의 총액을 모두 더한다
	//}
}