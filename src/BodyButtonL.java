import javax.swing.ImageIcon;

public class BodyButtonL extends Init {

	
	/**
	 * Body button logic, can be reset with reset page class/menu option
	 */
	
	public static BodyButtonL execute() {
		tagArray.add("<body>");
		ArrayDisplay.append("\n" + "<body>");
		BodyButton.setEnabled(false);
		FooterButton.setEnabled(true);
		textEditTrue();
		footerNImg = new ImageIcon("IMG/Nfooter.png");
		FooterButton.setIcon(footerNImg);
		ImageIcon tutBanImg = new ImageIcon("IMG/pg-7-add-body-content-png.png");
		tutBanner.setIcon(tutBanImg);
		bgColorButton.setVisible(false);
		imgButton.setVisible(true);
		linkButton.setVisible(true);
		MultiLineEntry.setEditable(true);
		DummySaveButton.setVisible(false);
		defaultSaveButton.setVisible(true);
		listButton.setVisible(true);
		return null;
	}
	
}
