
public class StrongButtonL extends Init {

	public static StrongButtonL execute() {
		ArrayDisplay.append("\n" + "<strong>");
		tagArray.add("<strong>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		FooterButton.setEnabled(false);
		DummySaveButton.setVisible(false);
		textEditFalse();
		return null;
	}
}
