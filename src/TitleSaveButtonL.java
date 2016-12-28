import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TitleSaveButtonL extends Init {

	public static TitleSaveButtonL execute() {
		String userInput = MultiLineEntry.getText();
		userTitleLen = MultiLineEntry.getText().length();
		ArrayDisplay.append("\n" + userInput);
		ArrayDisplay.append("\n" + "</title>");
		ArrayDisplay.append("\n" + "</head>");
		tagArray.add(userInput);
		tagArray.add("</title>");
		tagArray.add("</head>");
		MultiLineEntry.setText("");
		TitleButton.setVisible(false);
		MultiLineEntry.setEditable(false);
		TitleSaveButton.setVisible(false);
		BodyButton.setEnabled(true);
		DummySaveButton.setVisible(true);
		ImageIcon BodyNImg = new ImageIcon("IMG/Nbody.png");
		BodyButton.setIcon(BodyNImg);
		return null;
	}
}