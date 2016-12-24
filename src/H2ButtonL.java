
public class H2ButtonL extends Init {

	public static H2ButtonL execute() {
		ArrayDisplay.append("\n" + "<h2>");
		tagArray.add("<h2>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		FooterButton.setEnabled(false);
		DummySaveButton.setVisible(false);
		textEditFalse();
		return null;
	}
}
