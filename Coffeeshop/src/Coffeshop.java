import java.util.ArrayList;
import java.awt.Point;
import java.util.Scanner;

public class Coffeshop {

	private static final String String = null;

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Menu menu=new Menu();
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
	    String input=s.nextLine();
	    while(!input.equals("x")) {
	    	switch(input) {
	    	case "m":
		    	System.out.println("메뉴관리");
		    	menu.showMenu();
		    	//CRUD(추가/수정/삭제)
		    	System.out.println("메뉴작업을 선택하시오. (c:추가, r:목록보기, u:수정, d:삭제)");
		    	//값을 읽는다.
	    		//메뉴작업을 선택하시오(...) 출력
	    		//새값을 읽는다.
		    input=s.nextLine();
		    //"q"가 아닌 동안
		    while(!input.equals("q")) {
		    	switch(input) {
		    	//"c":새메뉴추가 작업 출력
		    	case "c":
			         menu.appendMenu();
			         //새메뉴명 읽기
			         //새가격 읽기
			         //메뉴명 추가
			         //메뉴가격 추가
			         break;
			    //"r":목록보기 출력
		    	case "r":
			         menu.showMenu();
			         break;
			    //"u":기존메뉴수정(이름/간격) 수정
		    	case "u":
			         menu.changeMenu();
			         //수정할 메뉴번호 읽기
			         //수정된 메뉴명 읽기
			         //수정된 가격 읽기
			         //메뉴번호에 해당하는 메뉴명&가격 수정.
			         break;
			    //"d":기존메뉴 삭제
		    	case "d":
		    		menu.deleteMenu();
			         //삭제할 메뉴번호 읽기
			         //메뉴 삭제.
			         break;
		    		}//switch
		    	System.out.println("메뉴작업 선택으로 돌아가기");
		    	System.out.println("메뉴작업을 선택하시오. (c:추가, r:목록보기, u:수정, d:삭제, q:종료)");
		    	input=s.nextLine();//switch 닫으면서 입력값을 받는다.
		    	}//while-q
		    menu.save();
		    break;
		    case "o":
		         System.out.println("주문받기");
		         menu.showMenu();
		         Order order = new Order();
		         System.out.println("구매할 음료 번호 입력: ");
		         input=s.nextLine();
		         while(!input.equals("")) {//메뉴번호가 ""이 아닌 동안
		        		 //출력 "메뉴번호를 선택하세요"
		        		 int number = Integer.parseInt(input);
//		        		 System.out.println("선택한 음료: "+number+"번 "+menu.getName(number));
//		        		 System.out.println(menu.getPrice(number)+"원 입니다.");
		        		 System.out.println("몇잔드릴까요?");
		        		 int cnt = sc.nextInt();
		        		 order.addOreder(menu.getName(number), menu.getPrice(number), cnt);//출력 "수량을 입력하세요"
		        		 //System.out.println(order.alTotal);
		        		 //값을 읽는다.
			         	 //메뉴번호로 메뉴명을 찾아낸다.
			         	 //메뉴번호로 메뉴가격을 찾아낸다.
				         //주문을 order에 추가. (order.addOrder(메뉴명, 수량);)
				         //계산해서 총액 출력
		        		 //System.out.println(order.addOreder(number, input, number, number));
				         //System.out.println("총액"+order.getTotalSum());
				         //menu.showMenu();
				         //출력 "메뉴번호를 선택하세요"
				         System.out.println("추가하실 메뉴번호 또는 더이상 주문 없으시면 Enter눌러 주세요 ");
				         input=s.nextLine();
				         //값을 읽는다.
				         // 총액: 99999
			         //각 메뉴의 총액을 더한 전체총액을 출력(getTotalSum())
			         //출력 "모바일번호를 입력하세요"
			         //주문고객의 모바일번호 입력받는다.
			         //실적에추가한다.(나중에)
		        	 }
		         System.out.println("주문하실 음료의 총금액은 원입니다.");/*총합구하기*/
		         System.out.println("실적보기");
		         }
	    		System.out.println("작업을 선택하시오 (m:메뉴관리, o:주문, s:실적보기, x:프로그램종료)");
	    		input=s.nextLine(); 
		      }
	    	System.out.println("프로그램 종료");
	    	s.close();
	      }
	      
}
		//menu.showMenu();//주문 받을 준비
		
		//m: 메뉴관리
		//o: 주문받기
		//s: 실적보기
		//x: 프로그램 종료.
		
//		menu.load();
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		
//		System.out.println("메뉴명 입력:");
//		String name=s1.nextLine();
//		while(!name.equals("")) {
//			System.out.println("가격입력:");
//			int price = s2.nextInt();
//			menu.addName(name);
//			menu.addPrice(price);
//			System.out.println("메뉴명 입력:");
//			name=s1.nextLine();
//		}
//		System.out.println("메뉴목록");
//		s1.close(); s2.close();


