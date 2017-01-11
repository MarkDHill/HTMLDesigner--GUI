import javax.swing.ImageIcon;

public class HeadButtonL extends Init {

	/**
	 * Allows user up to add title and background color in their head section.
	 */
	
		public static HeadButtonL execute() {
			
			tagArray.add("<HEAD>");
			ArrayDisplay.append("\n" + "<head>");
			HeadButton.setEnabled(false);
			bgColorButton.setVisible(true);
			ImageIcon tutBanImg = new ImageIcon("IMG/pg-3-background-png.png");
			tutBanner.setIcon(tutBanImg);
			ImageIcon TitleNImg = new ImageIcon("IMG/NTitle.png");
			TitleButton.setIcon(TitleNImg);
			
			return null;
			}
	}
