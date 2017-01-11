import javax.swing.ImageIcon;

public class FooterSaveButtonL extends Init {

	
	public static FooterSaveButtonL execute () {
		
		
		/**
		 * Save button after adding footer. This button sets up the page to be finished/finalized and ends the tutorial.
		 */
		
		String userInput = MultiLineEntry.getText();
		ArrayDisplay.append("\n" + userInput);
		ArrayDisplay.append("\n" + "</footer>");
		ArrayDisplay.append("\n" + "</html>");
		tagArray.add(userInput);
		tagArray.add("</footer>");
		ImageIcon tutBanImg = new ImageIcon("IMG/pg-9-finish-finalize png.png");
		tutBanner.setIcon(tutBanImg);
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
