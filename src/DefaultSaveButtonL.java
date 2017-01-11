
public class DefaultSaveButtonL extends Init{

	/**
	 * Save button logic pulled from initialize.
	 */
	
	public static DefaultSaveButtonL execute() {
		String userInput = MultiLineEntry.getText();
		ArrayDisplay.append("\n" + userInput);
		tagArray.add(userInput);
		MultiLineEntry.setText("");
		FooterButton.setEnabled(true);
		textEditTrue();
		
		return null;
	}
}
