
public class PButtonL extends Init {

	/**
	 * Adds paragraph to page/array
	 */
	
	public static PButtonL execute() {
		
		ArrayDisplay.append("\n" + "<p>");
		tagArray.add("<p>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		DummySaveButton.setVisible(false);
		textEditFalse();
		// Change how emButton and Strongbutton work via PButton. Logic could be better.
		emButton.setVisible(true);
		StrongButton.setVisible(true);
		return null;
	}
	
}
