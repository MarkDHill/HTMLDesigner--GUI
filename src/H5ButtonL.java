
public class H5ButtonL extends Init {

	
	public static H5ButtonL execute() {
		
		ArrayDisplay.append("\n" + "<h5>");
		tagArray.add("<h5>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		FooterButton.setEnabled(false);
		DummySaveButton.setVisible(false);
		textEditFalse();
		return null;
	}
	
}
