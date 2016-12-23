
public class LinkAddL extends Init {

	public static LinkAddL execute() {
		String userLinkAddy = linkAddy.getText();
		String userLinkName = linkName.getText();
		tagArray.add("<a href=\"http://" + userLinkAddy + "\">" + userLinkName + "</a><br>");
		ArrayDisplay.append("\n <a href=\"http://" + userLinkAddy + "\">" + userLinkName + "</a>");
		frmWebgetLink.setVisible(false);
		linkAddy.setText("");
		linkName.setText("");
		return null;
	}
	
}
