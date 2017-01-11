
public class StrongButtonL extends Init {

	/**
	 * Adds Strong tag to array/page
	 */
	
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
