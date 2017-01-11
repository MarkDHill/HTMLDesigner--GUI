import javax.swing.ImageIcon;

public class FooterButtonL extends Init {

	
	/**
	 * Footer button logic. Ends main content portion of array.
	 */
	
	public static FooterButtonL execute() {
		
		tagArray.add("</body>");
		ArrayDisplay.append("\n" + "</body>");
		tagArray.add("<footer>");
		ArrayDisplay.append("\n" + "<footer>");
		FooterButton.setEnabled(false);
		listButton.setVisible(false);
		MultiLineEntry.setEditable(true);
		FooterSaveButton.setVisible(true);
		ImageIcon tutBanImg = new ImageIcon("IMG/pg-8-add-footer-png.png");
		tutBanner.setIcon(tutBanImg);
		textEditFalse();
		ImageIcon footerImg = new ImageIcon("IMG/footer.png");
		FooterButton.setIcon(footerImg);
		ImageIcon FooterSaveNImg = new ImageIcon("IMG/Nsave.png");
		FooterSaveButton.setIcon(FooterSaveNImg);
		imgButton.setVisible(false);
		linkButton.setVisible(false);
		
		return null;
	}
}
