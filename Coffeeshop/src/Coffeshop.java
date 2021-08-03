import java.util.ArrayList;
import java.awt.Point;
import java.util.Scanner;

public class Coffeshop {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Menu menu=new Menu();
	    Scanner s = new Scanner(System.in);
	    Scanner s2 = new Scanner(System.in);
	   
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
			         System.out.println("추가");
			         System.out.println("추가할 메뉴명, 가격을 입력해 주세요.");
			         input=s.nextLine();
			         menu.addName(input);
			         int n=s2.nextInt();
			         menu.addPrice(n);
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
			         System.out.println("수정");
			         System.out.println("수정할 메뉴번호, 메뉴명, 가격 입력해 주세요.");
			         int menu_num=s2.nextInt();
			         input=s.nextLine();
			         n=s2.nextInt();
			         menu.changeMenu(menu_num, input, n);
			         //수정할 메뉴번호 읽기
			         //수정된 메뉴명 읽기
			         //수정된 가격 읽기
			         //메뉴번호에 해당하는 메뉴명&가격 수정.
			         break;
			    //"d":기존메뉴 삭제
		    	case "d":
			         System.out.println("삭제");
			         menu_num=s2.nextInt();
			         menu.deleteMenu(menu_num);
			         //삭제할 메뉴번호 읽기
			         //메뉴 삭제.
			         break;
		    		}//switch
		    	System.out.println("메뉴작업 선택으로 돌아가기");
		    	input=s.nextLine();//switch 닫으면서 입력값을 받는다.
		    	}//while-q
		    break;
		    case "o":
		         System.out.println("주문받기");
		         break;
		    case "s":
		         System.out.println("실적보기");
		         break;
		      }
		      System.out.println("작업을 선택하시오 (m:메뉴관리, o:주문, s:실적보기, x:프로그램종료)");
		      input=s.nextLine();
	      }
	      System.out.println("프로그램 종료");
	      s.close();

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
	}
}
