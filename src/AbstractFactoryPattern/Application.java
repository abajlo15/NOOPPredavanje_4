package AbstractFactoryPattern;

public class Application {

	private GUIFactory gui;
	private Button btn;
	private CheckBox chb;

	public Application(GUIFactory gui) {

		this.gui = gui;
		paint();
	}

	public void createGUI() {

		btn = gui.CreateButton();
		chb = gui.createCheckbox();

	}

	public void paint() {
		createGUI();
		btn.paint();
		chb.paint();
	}

}
