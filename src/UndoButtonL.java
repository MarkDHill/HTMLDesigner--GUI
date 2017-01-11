import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class UndoButtonL extends Init {

	/**
	 * Attempts to backtrack through both array and the text field on GUI showing array. 
	 * USE JLIST INSTEAD MUCH SIMPLER! or 
	 * Change to command design pattern for much simpler "undo" function
	 */
	
	public static UndoButtonL execute() {

		ArrayList<String> tagArray = Init.getTagArray();
		TextArea DisplayArray = Init.getArrayDisplay();
		String lastAdd = tagArray.get(tagArray.size() - 1);
		String lastAdd2 = tagArray.get(tagArray.size() - 2);
		String tagStart = "<";
		String endTag = "</";
		boolean isValid = false;

		while (isValid == false) {

			if (lastAdd.equalsIgnoreCase("<HTML>")) {
				tagArray.remove(lastAdd2);
				tagArray.remove(lastAdd);
				ArrayDisplay.setText("Page in Progress...");
				HTMLButton.setEnabled(true);
				HeadButton.setEnabled(false);
				ImageIcon tutBanImg = new ImageIcon("IMG/tutBanner.png");
				tutBanner.setIcon(tutBanImg);
				ImageIcon HTMLNImg = new ImageIcon("IMG/NHTML.png");
				HeadButton.setIcon(HTMLNImg);
				UndoButton.setEnabled(false);
				isValid = true;
				continue;
			}
			if (lastAdd.equalsIgnoreCase("<Head>")) {
				tagArray.remove(lastAdd);
				ArrayDisplay.setText("Page in Progress...");
				ArrayDisplay.append("\n" + "\n" + "<!DOCTYPE html>");
				ArrayDisplay.append("\n" + "<html>");
				HeadButton.setEnabled(true);
				bgColorButton.setVisible(false);
				ImageIcon tutBanImg = new ImageIcon("IMG/tutBanner.png");
				tutBanner.setIcon(tutBanImg);
				ImageIcon HeadNImg = new ImageIcon("IMG/NHead.png");
				TitleButton.setIcon(HeadNImg);
				isValid = true;
				continue;
			}
			if (lastAdd.startsWith("<style>")) {
				tagArray.remove(lastAdd);
				ArrayDisplay.replaceRange("", 50, 100);
				bgColorButton.setVisible(true);
				TitleButton.setVisible(false);
				TitleButton.setEnabled(false);
				isValid = true;
				continue;
			}
			if (lastAdd.equalsIgnoreCase("<title>")) {
				tagArray.remove(lastAdd);
				ArrayDisplay.replaceRange("", 100, 108);
				TitleButton.setEnabled(true);
				TitleButton.setVisible(true);
				MultiLineEntry.setEditable(false);
				TitleSaveButton.setVisible(false);
				TitleSaveButton.setEnabled(false);
				DummySaveButton.setVisible(true);
				ImageIcon TitleNImg = new ImageIcon("IMG/Ntitle.png");
				TitleSaveButton.setIcon(TitleNImg);
				if (!MultiLineEntry.getText().isEmpty()) {
					MultiLineEntry.setText("");
				}
				isValid = true;
				continue;
			}
			if (lastAdd.equalsIgnoreCase("</head>")) {
				if (!MultiLineEntry.getText().isEmpty()) {
					MultiLineEntry.setText("");
				}
				ArrayDisplay.replaceRange("", 100, userTitleLen + 20 + 108);
				String lastAdd3 = tagArray.get(tagArray.size() - 3);
				String lastAdd4 = tagArray.get(tagArray.size() - 4);
				tagArray.remove(lastAdd4);
				tagArray.remove(lastAdd3);
				tagArray.remove(lastAdd2);
				tagArray.remove(lastAdd);
				TitleButton.setEnabled(true);
				TitleButton.setVisible(true);
				MultiLineEntry.setEditable(false);
				TitleSaveButton.setVisible(false);
				TitleSaveButton.setEnabled(false);
				DummySaveButton.setVisible(true);
				ImageIcon TitleNImg = new ImageIcon("IMG/Ntitle.png");
				TitleSaveButton.setIcon(TitleNImg);
				ImageIcon BodyImg = new ImageIcon("IMG/body.png");
				BodyButton.setIcon(BodyImg);
				BodyButton.setEnabled(false);
				if (!MultiLineEntry.getText().isEmpty()) {
					MultiLineEntry.setText("");
				}
				isValid = true;
				continue;
			}
			if (lastAdd.equalsIgnoreCase("<body>")) {
				int charLen = DisplayArray.getText().length();
				tagArray.remove(lastAdd);
				ArrayDisplay.replaceRange("", charLen - 7, charLen);
				BodyButton.setEnabled(true);
				FooterButton.setEnabled(false);
				textEditFalse();
				ImageIcon footerImg = new ImageIcon("IMG/footer.png");
				FooterButton.setIcon(footerImg);
				ImageIcon BodyNImg = new ImageIcon("IMG/Nbody.png");
				BodyButton.setIcon(BodyNImg);
				imgButton.setVisible(false);
				linkButton.setVisible(false);
				MultiLineEntry.setEditable(false);
				DummySaveButton.setVisible(true);
				defaultSaveButton.setVisible(false);
				listButton.setVisible(false);
				isValid = true;
				continue;
			}
			if (lastAdd.equalsIgnoreCase("</ol>") || lastAdd.equalsIgnoreCase("</ul>")) {
				int charLen = DisplayArray.getText().length();
				ArrayDisplay.replaceRange("", (charLen - totTextDif), charLen);
				tagArray.remove(lastAdd);
				isValid = true;
				continue;
			}
			break;
		}

		return null;
	}

}
