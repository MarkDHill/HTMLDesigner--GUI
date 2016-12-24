
public class FooterSaveButtonL extends Init {

	
	public static FooterSaveButtonL execute () {
		
		String userInput = MultiLineEntry.getText();
		ArrayDisplay.append("\n" + userInput);
		ArrayDisplay.append("\n" + "</footer>");
		ArrayDisplay.append("\n" + "</html>");
		TutConsole.setText(
				"\n\n\n Your basic page is finished. You can add advanced options like CSS styling or CONTINUE by choosing finish and finalize from the menu above");
		tagArray.add(userInput);
		tagArray.add("</footer>");
		tagArray.add("</html>");
		MultiLineEntry.setText("");
		TitleButton.setVisible(false);
		MultiLineEntry.setEditable(false);
		FooterSaveButton.setVisible(false);
		DummySaveButton.setVisible(true);
		if (frmWebgetLink.isVisible()) {
			frmWebgetLink.setVisible(false);
			linkAddy.setText("");
			linkName.setText("");
		}
		
		return null;
	}
	
}
