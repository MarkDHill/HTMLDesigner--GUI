import javax.swing.JOptionPane;

public class LinkAddL extends Init {

	public static LinkAddL execute() {
		String userLinkAddy = linkAddy.getText();
		String userLinkName = linkName.getText();

		if (userLinkAddy.isEmpty() || userLinkName.isEmpty()) {
			JOptionPane.showMessageDialog(null, String.format("Please fill in both the Address and the Name boxes!"));
		}

		else {
			tagArray.add("<a href=\"http://" + userLinkAddy + "\">" + userLinkName + "</a><br>");

			ArrayDisplay.append("\n <a href=\"http://" + userLinkAddy + "\">" + userLinkName + "</a>");
			frmWebgetLink.setVisible(false);
			linkAddy.setText("");
			linkName.setText("");
		}
		return null;
	}
}
