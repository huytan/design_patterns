package after;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import after.impl.ActionManager;

public class DemoDispatcher {
	public static void main(String[] args) throws Exception {
		ActionManager dispatcher = new ActionManager();

		MenuItem item = createGUI();
		MenuAction dispatch = dispatcher.dispatch(item);
		dispatch.execute();
	}

	public static MenuItem createGUI() {
		// => tao 1 list cac menu item
		List<MenuItem> menuItems = new ArrayList<MenuItem>() {
			{
				add(new MenuItem("add-student", "Option 1. Add A New Student"));
				add(new MenuItem("update-student",
						"Option 2. Update New Student"));
				add(new MenuItem("delete-student",
						"Option 3. Delete A New Student"));
				add(new MenuItem("display-student",
						"Option 4. Display A New Student"));
				add(new MenuItem("exit", "Option 5. Exit"));
			}
		};

		// => GUI
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem);
		}
		System.out.print("Enter: ");

		// => xu ly tra ve action tuong ung
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		MenuItem menuItem = menuItems.get(choice - 1);
		return menuItem;

	}
}
