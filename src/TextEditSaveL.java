
public class TextEditSaveL extends Init{

	
	/**
	 * Saves a multitude of text edits. Checks if inside paragraph and finishes paragraph if so.
	 */
	
	public static TextEditSaveL execute() {
		
		String userInput = MultiLineEntry.getText();
		ArrayDisplay.append("\n" + userInput);
		tagArray.add(userInput);
		MultiLineEntry.setText("");
		MultiLineEntry.setEditable(false);
		textEditSave.setVisible(false);
		String findLastTag = tagArray.get(tagArray.size() - 2);
		StringBuilder sb = new StringBuilder(findLastTag).insert(1, '/');
		String exitTag = sb.toString();
		tagArray.add(exitTag);
		ArrayDisplay.append("\n" + exitTag);
		FooterButton.setEnabled(true);
		DummySaveButton.setVisible(true);
		textEditTrue();
		String findpTag = tagArray.get(tagArray.size() - 4);
		// are we inside a paragraph
		if (findpTag.equalsIgnoreCase("<p>")) {
			ArrayDisplay.append("\n</p>");
			tagArray.add("</p>");
		}
		if (FooterButton.getIcon() == footerNImg) {
			MultiLineEntry.setEditable(true);
		}
		
		return null;
	}
	
}
