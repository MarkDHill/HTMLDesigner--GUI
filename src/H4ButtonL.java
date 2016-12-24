
public class H4ButtonL extends Init {

	public static H4ButtonL execute() {
		ArrayDisplay.append("\n" + "<h4>");
		tagArray.add("<h4>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		FooterButton.setEnabled(false);
		DummySaveButton.setVisible(false);
		textEditFalse();
		return null;
	}
	
}
