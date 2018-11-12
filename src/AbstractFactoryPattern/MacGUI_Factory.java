package AbstractFactoryPattern;

public class MacGUI_Factory implements GUIFactory {

	@Override
	public Button CreateButton() {
		
		MacBtn btn = new MacBtn();
		
		return btn;
	}

	@Override
	public CheckBox createCheckbox() {
		MacChBox chb = new MacChBox();
	
		return chb;
	}

}
