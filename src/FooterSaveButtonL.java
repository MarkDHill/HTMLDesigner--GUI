
public class FooterSaveButtonL extends Init {

	
	public static FooterSaveButtonL execute () {
		
		String userInput = MultiLineEntry.getText();
		ArrayDisplay.append("\n" + userInput);
		ArrayDisplay.append("\n" + "</footer>");
		ArrayDisplay.append("\n" + "</html>");
		tagArray.add(userInput);
		tagArray.add("</footer>");
		tagArray.add("</html>");
		MultiLineEntry.setText("");
		MultiLineEntry.setEditable(false);
		FooterSaveButton.setVisible(false);
		DummySaveButton.setVisible(true);
		defaultSaveButton.setVisible(false);
		if (frmWebgetLink.isVisible()) {
			frmWebgetLink.setVisible(false);
			linkAddy.setText("");
			linkName.setText("");
		}
		
		return null;
	}
	
}
