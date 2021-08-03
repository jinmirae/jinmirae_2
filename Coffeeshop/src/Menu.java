import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { // 선언(정의) only. not 실행코드 
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		alName=new ArrayList<String>();
		alPrice=new ArrayList<Integer>();
		this.load();
//		
//		addName("Americano");
//		addName("Espresso");
//		addName("Latte");
//		addPrice(2000);
//		addPrice(2500);
//		addPrice(3000);
//		
//		showMenu();
	}
	/* 생성자 - 일종의 메소드
	 *         용도: 주로 초기화 작업용. 
	           명명법: 이름이 클래스와 같아야 함.
	           반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행)
	           실행/호출: new연산자가 실행된 직후, 자동실행
	           다른 메소드/생성자를 호출할 수 있다.
	*/
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	void changeMenu(int menu_num,String name,int price) {
		//수정
		this.alName.set(menu_num-1, name);
		this.alPrice.set(menu_num-1,price);
	}
	void deleteMenu(int menu_num) {
		//삭제
		this.alName.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
	}
	void showMenu() {
		for(int i=0;i<this.alName.size();i++) {
			System.out.println((i+1)+". "+this.alName.get(i)+"\t"+this.alPrice.get(i));
		}
	}
	void save() { //arraylist alName, alPrice를 화일 (menu.txt)에 저장
		File file=new File("d:/menu.txt");
		if(file.exists()) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				for(int i=0;i<this.alName.size();i++) {
					String line = this.alName.get(i)+","+this.alPrice.get(i);
					writer.write(line);
					if((i+1)!=this.alName.size())
						writer.write("\r\n");
				}
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	void load() { //화일(menu.txt)을 읽어서 arraylist alName, alPrice에 저장
		File file=new File("d:/menu.txt");
		if(file.exists()) {
			BufferedReader inFile = null;
			try {
				inFile = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String line;
			try {
				line = inFile.readLine();//한줄씩 읽음
				while(line!=null) {//line은 커서 또한 인식하니 메모장에서 메뉴 작성시 커서를 마지막메뉴로 맞추고 저장한다.
									//작성한 메뉴 아래 한줄을 더 작성하여 비어있는 줄에서 커서가 깜박이는것 또한 line은 인식 
					String[] parts=line.split(",");
					addName(parts[0]);
					addPrice(parts[1]);
					line=inFile.readLine();//아무것도 읽혀지지 않으면
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void set(Scanner s) {
		// TODO Auto-generated method stub
		
	}
}