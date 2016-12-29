import javax.swing.ImageIcon;

public class HTMLButtonL extends Init {


		public static HTMLButtonL execute() {
		 
		
		tagArray.add("<!DOCTYPE html>");
		tagArray.add("<HTML>");
		ArrayDisplay.append("\n" + "\n" + "<!DOCTYPE html>");
		ArrayDisplay.append("\n" + "<html>");
		HTMLButton.setEnabled(false);
		HeadButton.setEnabled(true);
		ImageIcon tutBanImg = new ImageIcon("IMG/pg-2-head-png.png");
		tutBanner.setIcon(tutBanImg);
		ImageIcon HeadNImg = new ImageIcon("IMG/Nhead.png");
		HeadButton.setIcon(HeadNImg);
		UndoButton.setEnabled(true);
		return null;
	}
}