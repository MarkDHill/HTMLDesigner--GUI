import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TitleSaveButtonL extends Init {

	public static TitleSaveButtonL execute() {
		String userInput = MultiLineEntry.getText();
		userTitleLen = MultiLineEntry.getText().length();
		boolean isValid = false;

		while (isValid == false) {
			if (MultiLineEntry.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, String.format("Please add a title to your webpage"));
				break;
			}

			String titleCheck = userInput.trim();
			if (titleCheck.length() == 0) {
				JOptionPane.showMessageDialog(null, String.format("Please add a title to your webpage"));
				break;
			}

			else {
				ArrayDisplay.append("\n" + userInput);
				ArrayDisplay.append("\n" + "</title>");
				ArrayDisplay.append("\n" + "</head>");
				tagArray.add(userInput);
				tagArray.add("</title>");
				tagArray.add("</head>");
				MultiLineEntry.setText("");
				TitleButton.setVisible(false);
				MultiLineEntry.setEditable(false);
				ImageIcon tutBanImg = new ImageIcon("IMG/pg-6-tag-body png.png");
				tutBanner.setIcon(tutBanImg);
				TitleSaveButton.setVisible(false);
				BodyButton.setEnabled(true);
				DummySaveButton.setVisible(true);
				ImageIcon BodyNImg = new ImageIcon("IMG/Nbody.png");
				BodyButton.setIcon(BodyNImg);
				isValid = true;
			}
		}
		return null;
	}
}