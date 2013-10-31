package after.impl;

import java.util.HashMap;
import java.util.Map;

import after.MenuAction;
import after.MenuItem;

public class ActionManager {
	// => @Java 6
	// private Map<String, Class<? extends MenuAction>> actionManager = new
	// HashMap&ltString, Class&lt? extends MenuAction&gt&gt();

	// => @Java 7
	private Map<String, Class<? extends MenuAction>> actionManager = new HashMap();

	public ActionManager() {
		this.registerAction("add-student", AddAction.class);
		this.registerAction("update-student", UpdateAction.class);
		this.registerAction("delete-student", DeleteAction.class);
		this.registerAction("display-student", DisplayAction.class);
		this.registerAction("exit", ExitAction.class);
	}

	public MenuAction dispatch(MenuItem item) {
		String actionKey = item.getAction();
		Class classAction = this.actionManager.get(actionKey);

		MenuAction action = null;
		try {
			action = (MenuAction) classAction.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}

	@SuppressWarnings("unchecked")
	public void registerAction(String key, Class classAction) {
		this.actionManager.put(key, classAction);
	}

	public Map<String, Class<? extends MenuAction>> getActionManager() {
		return actionManager;
	}

}
