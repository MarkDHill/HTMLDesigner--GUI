import javax.swing.ImageIcon;

public class HeadButtonL extends Init {

		public static HeadButtonL execute() {
			
			tagArray.add("<HEAD>");
			ArrayDisplay.append("\n" + "<head>");
			HeadButton.setEnabled(false);
			bgColorButton.setVisible(true);
			ImageIcon tutBanImg = new ImageIcon("IMG/tutBannerTitle.png");
			tutBanner.setIcon(tutBanImg);
			ImageIcon TitleNImg = new ImageIcon("IMG/NTitle.png");
			TitleButton.setIcon(TitleNImg);
			
			return null;
			}
	}
