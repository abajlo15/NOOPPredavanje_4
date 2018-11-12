package AbstractFactoryPattern;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String ui;
		Application app;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite WIN for windows ili MAC for mac gui: \n");
		ui = sc.nextLine();
		
		if(ui.equals("WIN")) {
			app = new Application(new WinGUI_Factory());
		} else if (ui.equals("MAC")) {
			app = new Application(new MacGUI_Factory());
		}
		
		
		
	}

	

}
