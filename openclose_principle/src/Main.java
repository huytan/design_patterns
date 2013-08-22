import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m= new Main();
		m.menu();
	}
	
	public void menu(){
		GraphicEditor gp = new GraphicEditor();
		
		System.out.println("---------Menu-------");
		System.out.println("Choose a Shape:");
		System.out.println("1.Rectangle");
		System.out.println("2.Cricle");
		System.out.print("Input a number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		switch (num) {
		case 1:
			gp.drawShape(new Rectangle());
			break;
		case 2:
			gp.drawShape(new Cricle());
			break;
		default:
			System.out.println("choose a shape");
			break;
		}
	}
}
