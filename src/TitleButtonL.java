import javax.swing.ImageIcon;

public class TitleButtonL extends Init {

	public static TitleButtonL execute() {
		tagArray.add("<TITLE>");
		ArrayDisplay.append("\n" + "<title>");
		TutConsole.setText("\n\nTo CONTINUE please click the Save button after entering your title");
		TitleButton.setEnabled(false);
		TitleButton.setEnabled(false);
		TitleButton.setVisible(false);
		MultiLineEntry.setEditable(true);
		TitleSaveButton.setVisible(true);
		TitleSaveButton.setEnabled(true);
		DummySaveButton.setVisible(false);
		ImageIcon TitleSaveNImg = new ImageIcon("IMG/Nsave.png");
		TitleSaveButton.setIcon(TitleSaveNImg);
		return null;
	}
}