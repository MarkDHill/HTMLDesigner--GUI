
public class H6ButtonL extends Init {

	public static H6ButtonL execute() {
		ArrayDisplay.append("\n" + "<h6>");
		tagArray.add("<h6>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		FooterButton.setEnabled(false);
		DummySaveButton.setVisible(false);
		textEditFalse();
		
		return null;
	}
}
