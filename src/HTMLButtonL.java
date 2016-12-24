import javax.swing.ImageIcon;

public class HTMLButtonL extends Init {


		public static HTMLButtonL execute() {
		 
		
		tagArray.add("<!DOCTYPE html>");
		tagArray.add("<HTML>");
		ArrayDisplay.append("\n" + "\n" + "<!DOCTYPE html>");
		ArrayDisplay.append("\n" + "<html>");
		HTMLButton.setEnabled(false);
		HeadButton.setEnabled(true);
		TutConsole.setText(
				"\r\n\r\n\r\nGood job! You officially started your web page. Additional tags will be placed by pressing their corresponding buttons as we go through the tutorial."
						+ "\n\n" + "The <head> element is a container for all the head elements."
						+ " The <head> element can include a title for the document, scripts, styles, meta information, and more."
						+ "\n\n For now we will add just a title. \n\n CONTINUE by placing your Head tag");
		ImageIcon HeadNImg = new ImageIcon("IMG/Nhead.png");
		HeadButton.setIcon(HeadNImg);
		return null;
	}
}