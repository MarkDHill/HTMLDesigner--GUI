
public class H3ButtonL extends Init {

	/**
	 * General header HTML tag logic extracted from initialize
	 */
	
	public static H3ButtonL execute() {
	ArrayDisplay.append("\n" + "<h3>");
	tagArray.add("<h3>");
	MultiLineEntry.setEditable(true);
	textEditSave.setVisible(true);
	FooterButton.setEnabled(false);
	DummySaveButton.setVisible(false);
	textEditFalse();
	return null;
	}
}
