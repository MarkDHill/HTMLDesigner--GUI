
public class EMButtonL extends Init {

	public static EMButtonL execute() {
		ArrayDisplay.append("\n" + "<em>");
		tagArray.add("<em>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		FooterButton.setEnabled(false);
		DummySaveButton.setVisible(false);
		textEditFalse();
		return null;
	}
}
