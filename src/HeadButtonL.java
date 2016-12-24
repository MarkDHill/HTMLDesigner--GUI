import javax.swing.ImageIcon;

public class HeadButtonL extends Init {

		public static HeadButtonL execute() {
			
			tagArray.add("<HEAD>");
			ArrayDisplay.append("\n" + "<head>");
			HeadButton.setEnabled(false);
			TitleButton.setEnabled(true);
			TitleButton.setVisible(true);
			TutConsole.setText(
					"\r\n\r\n\r\nYou can see on the far right pane that when you add tags to your website that it encloses them with < and >. These brackets are needed to close tags for your web page to be interpreted by a browser. \n\n CONTINUE by adding a title tag to your page by typing in the textbox and saving your progress");
			ImageIcon TitleNImg = new ImageIcon("IMG/NTitle.png");
			TitleButton.setIcon(TitleNImg);
			
			
			
			return null;
			}
	}
