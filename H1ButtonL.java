
public class H1ButtonL extends Init {

	public static H1ButtonL execute() {
		ArrayDisplay.append("\n" + "<h1>");
		tagArray.add("<h1>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		FooterButton.setEnabled(false);
		DummySaveButton.setVisible(false);
		textEditFalse();
		return null;
	}
}
