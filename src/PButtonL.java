
public class PButtonL extends Init {

	public static PButtonL execute() {
		
		ArrayDisplay.append("\n" + "<p>");
		tagArray.add("<p>");
		MultiLineEntry.setEditable(true);
		textEditSave.setVisible(true);
		DummySaveButton.setVisible(false);
		textEditFalse();
		emButton.setVisible(true);
		StrongButton.setVisible(true);
		return null;
	}
	
}
