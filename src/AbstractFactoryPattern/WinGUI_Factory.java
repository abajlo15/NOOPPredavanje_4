package AbstractFactoryPattern;

public class WinGUI_Factory implements GUIFactory {

	@Override
	public Button CreateButton() {

		WinBtn btn = new WinBtn();

		return btn;
	}

	@Override
	public CheckBox createCheckbox() {
		WinChBox chb = new WinChBox();

		return chb;
	}

}
