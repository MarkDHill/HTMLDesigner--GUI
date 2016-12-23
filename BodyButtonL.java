import javax.swing.ImageIcon;

public class BodyButtonL extends Init {

	public static BodyButtonL execute() {
		tagArray.add("<body>");
		ArrayDisplay.append("\n" + "<body>");
		TutConsole
				.setText("\n\n\n Add body tags and text here \n\n To CONTINUE please click the Footer button");
		BodyButton.setEnabled(false);
		FooterButton.setEnabled(true);
		textEditTrue();
		footerNImg = new ImageIcon("IMG/Nfooter.png");
		FooterButton.setIcon(footerNImg);
		imgButton.setVisible(true);
		linkButton.setVisible(true);
		MultiLineEntry.setEditable(true);
		DummySaveButton.setVisible(false);
		defaultSaveButton.setVisible(true);
		listButton.setVisible(true);
		return null;
	}
	
}
