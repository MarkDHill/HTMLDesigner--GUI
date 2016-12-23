import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

//import HTMLDesigner.ListenForButton;

public class Init extends JFrame {

	JFrame frmWebPageBasics;
	JFrame frmWebgetLink;
	JFrame frmWebgetImg;
	JFrame frmWebgetList;
	JMenuItem menuFinalize;
	JMenuItem ResetPage;
	JButton HTMLButton;
	JButton HeadButton;
	JButton TitleButton;
	JButton TitleSaveButton;
	JButton BodyButton;
	JButton FooterButton;
	JButton FooterSaveButton;
	JButton h1Button;
	JButton h2Button;
	JButton h3Button;
	JButton h4Button;
	JButton h5Button;
	JButton h6Button;
	JButton PButton;
	JButton emButton;
	JButton StrongButton;
	JButton textEditSave;
	JButton DummySaveButton;
	JButton BrButton;
	JButton linkButton;
	JButton imgButton;
	JButton linkCancel;
	JButton linkAdd;
	JButton RandImg1;
	JButton RandImg2;
	JButton RandImg3;
	JButton RandImg4;
	JButton RandImg5;
	JButton RandImg6;
	JButton saveImg;
	JButton cancelImg;
	JButton defaultSaveButton;
	JButton listSave;
	JButton listCancel;
	JButton listButton;
	TextArea ArrayDisplay;
	TextArea MultiLineEntry;
	JFileChooser FileChooser;
	String ChooserTitle;
	JTextArea TutConsole;
	JTextArea linkAddy;
	JTextArea linkName;
	JLabel SelectedImg;
	ImageIcon cakeImg, cityImg, puppyImg, carImg, lakeImg, travelImg, footerNImg;
	JTextField Li1, Li2, Li3, Li4, Li5, Li6;
	JRadioButton OrderedLi, UnOrderedLi;
	JComboBox liNum;
	String liNumVal = null;
	HTMLDesigner htmld;

	static ArrayList<String> tagArray = new ArrayList<>();

	void textEditTrue() {

		h1Button.setVisible(true);
		h2Button.setVisible(true);
		h3Button.setVisible(true);
		h4Button.setVisible(true);
		h5Button.setVisible(true);
		h6Button.setVisible(true);
		PButton.setVisible(true);
		emButton.setVisible(true);
		StrongButton.setVisible(true);
		BrButton.setVisible(true);
	}

	void textEditFalse() {
		h1Button.setVisible(false);
		h2Button.setVisible(false);
		h3Button.setVisible(false);
		h4Button.setVisible(false);
		h5Button.setVisible(false);
		h6Button.setVisible(false);
		emButton.setVisible(false);
		StrongButton.setVisible(false);
		BrButton.setVisible(false);
		PButton.setVisible(false);
	}

	void OrderedListSave() {

		String userLi1 = Li1.getText();
		String userLi2 = Li2.getText();
		String userLi3 = Li3.getText();
		String userLi4 = Li4.getText();
		String userLi5 = Li5.getText();
		String userLi6 = Li6.getText();
		liNumVal = liNum.getSelectedItem().toString();

		if (liNumVal == "1") {
			tagArray.add("<ol><li>" + userLi1 + "</li></ol>");
			ArrayDisplay.append("\n <ol> \n <li>" + "\n" + userLi1 + "\n</li>\n</ol>");
		}
		if (liNumVal == "2") {
			tagArray.add("<ol><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li></ol>");
			ArrayDisplay
					.append("\n <ol> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2 + "\n</li>\n</ol>");
		}
		if (liNumVal == "3") {
			tagArray.add("<ol><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li></ol>");
			ArrayDisplay.append("\n <ol> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2
					+ "\n</li>\n<li>\n" + userLi3 + "\n</li>\n</ol>");
		}
		if (liNumVal == "4") {
			tagArray.add("<ol><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li>"
					+ "<li>" + userLi4 + "</li></ol>");
			ArrayDisplay.append("\n <ol> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2
					+ "\n</li>\n<li>\n" + userLi3 + "\n</li>\n<li>\n" + userLi4 + "\n</li>\n</ol>");
		}
		if (liNumVal == "5") {
			tagArray.add("<ol><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li>"
					+ "<li>" + userLi4 + "</li>" + "<li>" + userLi5 + "</li></ol>");
			ArrayDisplay
					.append("\n <ol> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2 + "\n</li>\n<li>\n"
							+ userLi3 + "\n</li>\n<li>\n" + userLi4 + "\n</li>\n<li>\n" + userLi5 + "\n</li>\n</ol>");
		}
		if (liNumVal == "6") {
			tagArray.add("<ol><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li>"
					+ "<li>" + userLi4 + "</li>" + "<li>" + userLi5 + "</li><li>" + userLi6 + "</li></ol>");
			ArrayDisplay.append("\n <ol> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2
					+ "\n</li>\n<li>\n" + userLi3 + "\n</li>\n<li>\n" + userLi4 + "\n</li>\n<li>\n" + userLi5
					+ "\n</li>\n<li>\n" + userLi6 + "\n</li>\n</ol>");
		}
	}

	void UnOrderedListSave() {
		String userLi1 = Li1.getText();
		String userLi2 = Li2.getText();
		String userLi3 = Li3.getText();
		String userLi4 = Li4.getText();
		String userLi5 = Li5.getText();
		String userLi6 = Li6.getText();
		liNumVal = liNum.getSelectedItem().toString();

		if (liNumVal == "1") {
			tagArray.add("<ul><li>" + userLi1 + "</li></ul>");
			ArrayDisplay.append("\n <ul> \n <li>" + "\n" + userLi1 + "\n</li>\n</ul>");
		}
		if (liNumVal == "2") {
			tagArray.add("<ul><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li></ul>");
			ArrayDisplay
					.append("\n <ul> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2 + "\n</li>\n</ul>");
		}
		if (liNumVal == "3") {
			tagArray.add("<ul><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li></ul>");
			ArrayDisplay.append("\n <ul> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2
					+ "\n</li>\n<li>\n" + userLi3 + "\n</li>\n</ul>");
		}
		if (liNumVal == "4") {
			tagArray.add("<ul><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li>"
					+ "<li>" + userLi4 + "</li></ul>");
			ArrayDisplay.append("\n <ul> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2
					+ "\n</li>\n<li>\n" + userLi3 + "\n</li>\n<li>\n" + userLi4 + "\n</li>\n</ul>");
		}
		if (liNumVal == "5") {
			tagArray.add("<ul><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li>"
					+ "<li>" + userLi4 + "</li>" + "<li>" + userLi5 + "</li></ul>");
			ArrayDisplay
					.append("\n <ul> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2 + "\n</li>\n<li>\n"
							+ userLi3 + "\n</li>\n<li>\n" + userLi4 + "\n</li>\n<li>\n" + userLi5 + "\n</li>\n</ul>");
		}
		if (liNumVal == "6") {
			tagArray.add("<ul><li>" + userLi1 + "</li>" + "<li>" + userLi2 + "</li>" + "<li>" + userLi3 + "</li>"
					+ "<li>" + userLi4 + "</li>" + "<li>" + userLi5 + "</li><li>" + userLi6 + "</li></ul>");
			ArrayDisplay.append("\n <ul> \n <li>" + "\n" + userLi1 + "\n</li>" + "\n<li>\n" + userLi2
					+ "\n</li>\n<li>\n" + userLi3 + "\n</li>\n<li>\n" + userLi4 + "\n</li>\n<li>\n" + userLi5
					+ "\n</li>\n<li>\n" + userLi6 + "\n</li>\n</ul>");
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })

	void FinishPage() {

		FileChooser = new JFileChooser();
		FileChooser.setCurrentDirectory(new java.io.File("\\"));
		FileChooser.setAcceptAllFileFilterUsed(false);

		if (FileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {

			FileWriter writer = null;
			try {
				writer = new FileWriter(FileChooser.getSelectedFile() + ".html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String SavedF = (FileChooser.getSelectedFile() + "html");
			File file = new File(SavedF);
			for (String str : tagArray) {
				try {
					writer.write(str);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Desktop.getDesktop().browse(file.toURI());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("No Selection ");
		}
	}

	boolean resetPage() {

		Component temporaryLostComponent = null;
		int n = JOptionPane.showConfirmDialog(temporaryLostComponent, "Would you like to reset your current page?",
				"ALERT", JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			if (!tagArray.isEmpty()) {
				for (int i = 0; i < tagArray.size(); i++) {
					tagArray.remove(i);
				}
			}

			textEditFalse();
			ArrayDisplay.setText("Page in Progress...");
			HTMLButton.setEnabled(true);
			HeadButton.setEnabled(false);
			BodyButton.setEnabled(false);
			FooterButton.setEnabled(false);
			FooterSaveButton.setVisible(false);
			TitleSaveButton.setVisible(false);
			DummySaveButton.setVisible(true);
			textEditSave.setVisible(false);
			MultiLineEntry.setText("");
			MultiLineEntry.setEditable(false);
			TutConsole.setText(
					"\r\n\r\n\r\n Welcome to your introduction to Web Page Basics tutorial! When you're ready to get started on your web page, please click the HTML button. This will add an <html> tag to your page,"
							+ " which you will be able to view in the panel on the right side of your screen. It will also add a document type declaration: <!DOCTYPE html>, which is a required component for all HTML documents.\n"
							+ "\nThe HTML document itself begins with the <html> tag, and will end with the closing tag </html>."
							+ "\n\nTo CONTINUE, please click the HTML button and start your web page!");
			TitleButton.setVisible(false);
			if (frmWebgetLink.isVisible()) {
				frmWebgetLink.setVisible(false);
				linkAddy.setText("");
				linkName.setText("");
			}
			if (frmWebgetImg.isVisible()) {
				frmWebgetImg.setVisible(false);
			}
			if (frmWebgetList.isVisible()) {
				frmWebgetList.setVisible(false);
			}
		} else if (n == JOptionPane.NO_OPTION) {

		} else {

		}
		return false;

	}

	void getLink(ArrayList<String> tagArray) {

		ListenForButton lforbuttons = new ListenForButton();

		frmWebgetLink = new JFrame();
		frmWebgetLink.setResizable(false);
		frmWebgetLink.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebgetLink.setTitle("Adding Links");
		frmWebgetLink.setBounds(100, 100, 400, 400);
		frmWebgetLink.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmWebgetLink.getContentPane().setLayout(null);
		frmWebgetLink.setVisible(true);

		linkAddy = new JTextArea();
		linkAddy.setEditable(true);
		linkAddy.setVisible(true);
		linkAddy.setBounds(100, 180, 180, 20);
		frmWebgetLink.getContentPane().add(linkAddy);

		linkName = new JTextArea();
		linkName.setEditable(true);
		linkName.setVisible(true);
		linkName.setBounds(100, 250, 180, 20);
		frmWebgetLink.getContentPane().add(linkName);

		linkAdd = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		linkAdd.setBounds(50, 300, 127, 27);
		linkAdd.setOpaque(false);
		linkAdd.setBorderPainted(false);
		ImageIcon DefaultSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon DefaultSaveRImg = new ImageIcon("IMG/RSave.png");
		linkAdd.setRolloverIcon(DefaultSaveRImg);
		linkAdd.setIcon(DefaultSaveImg);
		linkAdd.setDisabledIcon(DefaultSaveImg);
		linkAdd.setToolTipText("Adds link to specified address local or WWW");
		linkAdd.setVisible(true);
		frmWebgetLink.getContentPane().add(linkAdd);
		linkAdd.addActionListener(lforbuttons);
		linkAdd.setOpaque(false);
		linkAdd.setBorderPainted(false);

		linkCancel = new JButton(new ImageIcon(((new ImageIcon("IMG/button_cancel passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		linkCancel.setBounds(200, 300, 127, 27);
		linkCancel.setOpaque(false);
		linkCancel.setBorderPainted(false);
		ImageIcon CancelImg = new ImageIcon("IMG/button_cancel passive.png");
		ImageIcon CancelRImg = new ImageIcon("IMG/button_cancel rollover.png");
		linkCancel.setRolloverIcon(CancelRImg);
		linkCancel.setIcon(CancelImg);
		linkCancel.setDisabledIcon(CancelImg);
		linkCancel.setToolTipText("Cancel adding link");
		linkCancel.setVisible(true);
		frmWebgetLink.getContentPane().add(linkCancel);
		linkCancel.addActionListener(lforbuttons);
		linkCancel.setOpaque(false);
		linkCancel.setBorderPainted(false);

		JLabel sBar = new JLabel(new ImageIcon(
				((new ImageIcon("IMG/sBar.png").getImage().getScaledInstance(380, 5, java.awt.Image.SCALE_SMOOTH)))));
		sBar.setBounds(5, 360, 380, 5);
		frmWebgetLink.getContentPane().add(sBar);
		ImageIcon sBarImg = new ImageIcon("IMG/sBar.png");
		sBar.setIcon(sBarImg);

		JLabel addLink = new JLabel(new ImageIcon(((new ImageIcon("IMG/addLink.png").getImage().getScaledInstance(400,
				60, java.awt.Image.SCALE_SMOOTH)))));
		addLink.setBounds(0, 10, 400, 60);
		frmWebgetLink.getContentPane().add(addLink);
		ImageIcon addLinkImg = new ImageIcon("IMG/addLink.png");
		addLink.setIcon(addLinkImg);

	}

	void getList(ArrayList<String> tagArray) {

		ListenForButton lforbuttons = new ListenForButton();

		frmWebgetList = new JFrame();
		frmWebgetList.setResizable(false);
		frmWebgetList.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebgetList.setTitle("Add List");
		frmWebgetList.setBounds(100, 100, 400, 400);
		frmWebgetList.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmWebgetList.getContentPane().setLayout(null);
		frmWebgetList.setVisible(false);
		frmWebgetList.setVisible(true);

		Li6 = new JTextField();
		Li6.setBounds(31, 260, 180, 20);
		frmWebgetList.getContentPane().add(Li6);
		Li6.setColumns(10);
		Li6.setVisible(false);

		Li5 = new JTextField();
		Li5.setColumns(10);
		Li5.setBounds(31, 229, 180, 20);
		frmWebgetList.getContentPane().add(Li5);
		Li5.setVisible(false);

		Li4 = new JTextField();
		Li4.setColumns(10);
		Li4.setBounds(31, 198, 180, 20);
		frmWebgetList.getContentPane().add(Li4);
		Li4.setVisible(false);

		Li3 = new JTextField();
		Li3.setColumns(10);
		Li3.setBounds(31, 167, 180, 20);
		frmWebgetList.getContentPane().add(Li3);
		Li3.setVisible(false);

		Li2 = new JTextField();
		Li2.setColumns(10);
		Li2.setBounds(31, 136, 180, 20);
		frmWebgetList.getContentPane().add(Li2);
		Li2.setVisible(false);

		Li1 = new JTextField();
		Li1.setColumns(10);
		Li1.setBounds(31, 105, 180, 20);
		frmWebgetList.getContentPane().add(Li1);
		Li1.setVisible(true);

		listSave = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		listSave.setBounds(51, 314, 127, 27);
		frmWebgetList.getContentPane().add(listSave);
		ImageIcon listSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon listSaveRImg = new ImageIcon("IMG/Rsave.png");
		listSave.setRolloverIcon(listSaveRImg);
		listSave.setIcon(listSaveImg);
		listSave.setDisabledIcon(listSaveImg);
		listSave.setToolTipText("Save List");
		listSave.setVisible(true);
		listSave.addActionListener(lforbuttons);
		listSave.setOpaque(false);
		listSave.setBorderPainted(false);

		JLabel sBar = new JLabel(new ImageIcon(
				((new ImageIcon("IMG/sBar.png").getImage().getScaledInstance(380, 5, java.awt.Image.SCALE_SMOOTH)))));
		sBar.setBounds(5, 360, 380, 5);
		frmWebgetList.getContentPane().add(sBar);
		ImageIcon sBarImg = new ImageIcon("IMG/sBar.png");
		sBar.setIcon(sBarImg);

		JLabel addList = new JLabel(new ImageIcon(((new ImageIcon("IMG/addList.png").getImage().getScaledInstance(400,
				60, java.awt.Image.SCALE_SMOOTH)))));
		addList.setBounds(0, 10, 400, 60);
		frmWebgetList.getContentPane().add(addList);
		ImageIcon addListImg = new ImageIcon("IMG/addList.png");
		addList.setIcon(addListImg);

		listCancel = new JButton(new ImageIcon(((new ImageIcon("IMG/button_cancel passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		listCancel.setBounds(215, 314, 127, 27);
		frmWebgetList.getContentPane().add(listCancel);
		ImageIcon imgCancel = new ImageIcon("IMG/button_cancel passive.png");
		ImageIcon imgRCancel = new ImageIcon("IMG/button_cancel rollover.png");
		listCancel.setRolloverIcon(imgRCancel);
		listCancel.setIcon(imgCancel);
		listCancel.setDisabledIcon(imgCancel);
		listCancel.setVisible(true);
		listCancel.addActionListener(lforbuttons);
		listCancel.setOpaque(false);
		listCancel.setBorderPainted(false);

		UnOrderedLi = new JRadioButton("Unordered List");
		UnOrderedLi.setBounds(245, 155, 120, 23);
		UnOrderedLi.setBackground(SystemColor.activeCaptionBorder);
		frmWebgetList.getContentPane().add(UnOrderedLi);
		UnOrderedLi.setVisible(true);
		UnOrderedLi.addActionListener(lforbuttons);

		OrderedLi = new JRadioButton("Ordered List");
		OrderedLi.setBounds(245, 135, 120, 23);
		OrderedLi.setBackground(SystemColor.activeCaptionBorder);
		frmWebgetList.getContentPane().add(OrderedLi);
		OrderedLi.setVisible(true);
		OrderedLi.setSelected(true);
		OrderedLi.addActionListener(lforbuttons);

		liNum = new JComboBox();
		liNum.setBounds(243, 105, 99, 20);
		frmWebgetList.getContentPane().add(liNum);

		liNum.addItem("1");
		liNum.addItem("2");
		liNum.addItem("3");
		liNum.addItem("4");
		liNum.addItem("5");
		liNum.addItem("6");
		liNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liNumVal = liNum.getSelectedItem().toString();
				if (liNumVal.equalsIgnoreCase("1")) {
					Li2.setVisible(false);
					Li3.setVisible(false);
					Li4.setVisible(false);
					Li5.setVisible(false);
					Li6.setVisible(false);
				}
				if (liNumVal.equalsIgnoreCase("2")) {
					Li2.setVisible(true);
					Li3.setVisible(false);
					Li4.setVisible(false);
					Li5.setVisible(false);
					Li6.setVisible(false);
				}
				if (liNumVal.equalsIgnoreCase("3")) {
					Li2.setVisible(true);
					Li3.setVisible(true);
					Li4.setVisible(false);
					Li5.setVisible(false);
					Li6.setVisible(false);
				}
				if (liNumVal.equalsIgnoreCase("4")) {
					Li2.setVisible(true);
					Li3.setVisible(true);
					Li4.setVisible(true);
					Li5.setVisible(false);
					Li6.setVisible(false);
				}
				if (liNumVal.equalsIgnoreCase("5")) {
					Li2.setVisible(true);
					Li3.setVisible(true);
					Li4.setVisible(true);
					Li5.setVisible(true);
					Li6.setVisible(false);
				}
				if (liNumVal.equalsIgnoreCase("6")) {
					Li2.setVisible(true);
					Li3.setVisible(true);
					Li4.setVisible(true);
					Li5.setVisible(true);
					Li6.setVisible(true);
				}
			}
		});
	}

	void getImage(ArrayList<String> tagArray) {

		ListenForButton lforbuttons = new ListenForButton();

		frmWebgetImg = new JFrame();
		frmWebgetImg.setResizable(false);
		frmWebgetImg.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebgetImg.setTitle("Adding Links");
		frmWebgetImg.setBounds(100, 100, 600, 600);
		frmWebgetImg.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmWebgetImg.getContentPane().setLayout(null);
		frmWebgetImg.setVisible(true);

		RandImg1 = new JButton(new ImageIcon(((new ImageIcon("IMG/SImages/tcake.jpg").getImage().getScaledInstance(90,
				90, java.awt.Image.SCALE_SMOOTH)))));
		RandImg1.setBorderPainted(false);
		RandImg1.setBounds(494, 265, 90, 90);
		frmWebgetImg.getContentPane().add(RandImg1);
		RandImg1.addActionListener(lforbuttons);
		RandImg1.setOpaque(false);
		RandImg1.setBorderPainted(false);

		RandImg2 = new JButton(new ImageIcon(((new ImageIcon("IMG/SImages/tcar.jpg").getImage().getScaledInstance(90,
				90, java.awt.Image.SCALE_SMOOTH)))));
		RandImg2.setBorderPainted(false);
		RandImg2.setBounds(494, 365, 90, 90);
		frmWebgetImg.getContentPane().add(RandImg2);
		RandImg2.addActionListener(lforbuttons);
		RandImg2.setOpaque(false);
		RandImg2.setBorderPainted(false);

		RandImg3 = new JButton(new ImageIcon(((new ImageIcon("IMG/SImages/tlake.jpg").getImage().getScaledInstance(90,
				90, java.awt.Image.SCALE_SMOOTH)))));
		RandImg3.setBorderPainted(false);
		RandImg3.setBounds(494, 466, 90, 90);
		frmWebgetImg.getContentPane().add(RandImg3);
		RandImg3.addActionListener(lforbuttons);
		RandImg3.setOpaque(false);
		RandImg3.setBorderPainted(false);

		RandImg4 = new JButton(new ImageIcon(((new ImageIcon("IMG/SImages/tpuppy.jpeg").getImage().getScaledInstance(90,
				90, java.awt.Image.SCALE_SMOOTH)))));
		RandImg4.setBorderPainted(false);
		RandImg4.setBounds(0, 265, 90, 90);
		frmWebgetImg.getContentPane().add(RandImg4);
		RandImg4.addActionListener(lforbuttons);
		RandImg4.setOpaque(false);
		RandImg4.setBorderPainted(false);

		RandImg5 = new JButton(new ImageIcon(((new ImageIcon("IMG/SImages/ttravel.jpg").getImage().getScaledInstance(90,
				90, java.awt.Image.SCALE_SMOOTH)))));
		RandImg5.setBorderPainted(false);
		RandImg5.setBounds(0, 365, 90, 90);
		frmWebgetImg.getContentPane().add(RandImg5);
		RandImg5.addActionListener(lforbuttons);
		RandImg5.setOpaque(false);
		RandImg5.setBorderPainted(false);

		SelectedImg = new JLabel("");
		SelectedImg.setBounds(100, 111, 384, 392);
		frmWebgetImg.getContentPane().add(SelectedImg);

		saveImg = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		saveImg.setBounds(143, 514, 127, 27);
		frmWebgetImg.getContentPane().add(saveImg);
		ImageIcon imgImg = new ImageIcon("IMG/save.png");
		ImageIcon imgRImg = new ImageIcon("IMG/Rsave.png");
		saveImg.setRolloverIcon(imgRImg);
		saveImg.setIcon(imgImg);
		saveImg.setDisabledIcon(imgImg);
		saveImg.setToolTipText("Save Image");
		saveImg.setVisible(true);
		saveImg.addActionListener(lforbuttons);
		saveImg.setOpaque(false);
		saveImg.setBorderPainted(false);

		cancelImg = new JButton(new ImageIcon(((new ImageIcon("IMG/button_cancel passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		cancelImg.setBounds(319, 514, 127, 27);
		frmWebgetImg.getContentPane().add(cancelImg);
		ImageIcon imgCancel = new ImageIcon("IMG/button_cancel passive.png");
		ImageIcon imgRCancel = new ImageIcon("IMG/button_cancel rollover.png");
		cancelImg.setRolloverIcon(imgRCancel);
		cancelImg.setIcon(imgCancel);
		cancelImg.setDisabledIcon(imgCancel);
		cancelImg.setToolTipText("Cancel Adding Image");
		cancelImg.setVisible(true);
		cancelImg.addActionListener(lforbuttons);
		cancelImg.setOpaque(false);
		cancelImg.setBorderPainted(false);

		RandImg6 = new JButton(new ImageIcon(((new ImageIcon("IMG/SImages/tcity.jpg").getImage().getScaledInstance(90,
				90, java.awt.Image.SCALE_SMOOTH)))));
		RandImg6.setBounds(0, 466, 90, 90);
		frmWebgetImg.getContentPane().add(RandImg6);
		RandImg6.addActionListener(lforbuttons);
		RandImg6.setOpaque(false);
		RandImg6.setBorderPainted(false);

		JLabel lBar = new JLabel(new ImageIcon(
				((new ImageIcon("IMG/lBar.png").getImage().getScaledInstance(580, 5, java.awt.Image.SCALE_SMOOTH)))));
		lBar.setBounds(5, 560, 580, 5);
		frmWebgetImg.getContentPane().add(lBar);
		ImageIcon sBarImg = new ImageIcon("IMG/lBar.png");
		lBar.setIcon(sBarImg);

		JLabel addImageBanner = new JLabel(new ImageIcon(((new ImageIcon("IMG/addImageBanner.png").getImage()
				.getScaledInstance(600, 80, java.awt.Image.SCALE_SMOOTH)))));
		addImageBanner.setBounds(0, 5, 600, 80);
		frmWebgetImg.getContentPane().add(addImageBanner);
		ImageIcon addImageImg = new ImageIcon("IMG/addImageBanner.png");
		addImageBanner.setIcon(addImageImg);

	}

	public void initialize(HTMLDesigner inputhtmld) {

		ListenForButton lforbuttons = new ListenForButton();
		initJFrames();
		initMenu(lforbuttons);
		initButtons(lforbuttons);
		
		ArrayDisplay = new TextArea();
		ArrayDisplay.setBackground(SystemColor.scrollbar);
		ArrayDisplay.setEditable(false);
		ArrayDisplay.setText("Page in Progress...");
		ArrayDisplay.setBounds(991, 32, 153, 680);
		frmWebPageBasics.getContentPane().add(ArrayDisplay);

		TutConsole = new JTextArea();
		TutConsole.setWrapStyleWord(true);
		TutConsole.setLineWrap(true);
		TutConsole.setFont(new Font("Dialog", Font.PLAIN, 14));
		TutConsole.setBackground(SystemColor.scrollbar);
		TutConsole.setEditable(false);
		TutConsole.setText(
				"\r\n\r\n\r\n Welcome to your introduction to Web Page Basics tutorial! When you're ready to get started on your web page, please click the HTML button. This will add an <html> tag to your page,"
						+ " which you will be able to view in the panel on the right side of your screen. It will also add a document type declaration: <!DOCTYPE html>, which is a required component for all HTML documents.\n"
						+ "\nThe HTML document itself begins with the <html> tag, and will end with the closing tag </html>."
						+ "\n\nTo CONTINUE, please click the HTML button and start your web page!");
		TutConsole.setBounds(10, 32, 332, 680);
		frmWebPageBasics.getContentPane().add(TutConsole);

		JLabel BannerLab = new JLabel("Your banner is broke yo");
		BannerLab.setBounds(363, 42, 600, 115);
		frmWebPageBasics.getContentPane().add(BannerLab);
		ImageIcon BannerImg = new ImageIcon("IMG/BannerTest-png.png");
		BannerLab.setIcon(BannerImg);

		JLabel botLab = new JLabel(new ImageIcon(((new ImageIcon("IMG/button placeholder 550.png").getImage()
				.getScaledInstance(600, 14, java.awt.Image.SCALE_SMOOTH)))));
		botLab.setBounds(363, 699, 600, 14);
		frmWebPageBasics.getContentPane().add(botLab);
		ImageIcon botLabImg = new ImageIcon("IMG/button placeholder 550.png");
		botLab.setIcon(botLabImg);
		}

	private void initButtons(ListenForButton lforbuttons) {
		HTMLButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/html.png").getImage().getScaledInstance(127, 27, java.awt.Image.SCALE_SMOOTH)))));
		HTMLButton.setOpaque(false);
		HTMLButton.setBorderPainted(false);
		HTMLButton.setToolTipText("The <html> element is the root element of an HTML page");
		HTMLButton.setBounds(349, 259, 127, 27);
		frmWebPageBasics.getContentPane().add(HTMLButton);
		HTMLButton.setEnabled(true);
		HTMLButton.addActionListener(lforbuttons);
		ImageIcon htmlImg = new ImageIcon("IMG/html.png");
		ImageIcon htmlRImg = new ImageIcon("IMG/RHTML.png");
		ImageIcon htmlNImg = new ImageIcon("IMG/NHTML.png");
		HTMLButton.setIcon(htmlNImg);
		HTMLButton.setDisabledIcon(htmlImg);
		HTMLButton.setRolloverIcon(htmlRImg);

		HeadButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/head.png").getImage().getScaledInstance(106, 31, java.awt.Image.SCALE_SMOOTH)))));
		HeadButton.setOpaque(false);
		HeadButton.setBorderPainted(false);
		HeadButton.setToolTipText("The <head> element contains meta information about the document");
		HeadButton.setBounds(349, 299, 127, 27);
		frmWebPageBasics.getContentPane().add(HeadButton);
		HeadButton.setEnabled(false);
		HeadButton.addActionListener(lforbuttons);
		ImageIcon HeadImg = new ImageIcon("IMG/head.png");
		ImageIcon HeadRImg = new ImageIcon("IMG/RHead.png");
		HeadButton.setIcon(HeadImg);
		HeadButton.setDisabledIcon(HeadImg);
		HeadButton.setRolloverIcon(HeadRImg);

		BodyButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/body.png").getImage().getScaledInstance(106, 31, java.awt.Image.SCALE_SMOOTH)))));
		BodyButton.setOpaque(false);
		BodyButton.setBorderPainted(false);
		BodyButton.setToolTipText("The <body> element contains the visible page content");
		BodyButton.setBounds(349, 343, 127, 27);
		frmWebPageBasics.getContentPane().add(BodyButton);
		BodyButton.setEnabled(false);
		BodyButton.addActionListener(lforbuttons);
		ImageIcon BodyImg = new ImageIcon("IMG/body.png");
		ImageIcon BodyRImg = new ImageIcon("IMG/RBody.png");
		BodyButton.setIcon(BodyImg);
		BodyButton.setDisabledIcon(BodyImg);
		BodyButton.setRolloverIcon(BodyRImg);

		FooterButton = new JButton(new ImageIcon(((new ImageIcon("IMG/footer.png").getImage().getScaledInstance(106, 31,
				java.awt.Image.SCALE_SMOOTH)))));
		FooterButton.setBounds(349, 385, 127, 27);
		FooterButton.setOpaque(false);
		FooterButton.setBorderPainted(false);
		FooterButton.setToolTipText("The <footer> tag defines a footer for a document or section.");
		frmWebPageBasics.getContentPane().add(FooterButton);
		FooterButton.setEnabled(false);
		FooterButton.addActionListener(lforbuttons);
		ImageIcon footerImg = new ImageIcon("IMG/footer.png");
		ImageIcon footerRImg = new ImageIcon("IMG/Rfooter.png");
		FooterButton.setIcon(footerImg);
		FooterButton.setDisabledIcon(footerImg);
		FooterButton.setRolloverIcon(footerRImg);

		TitleButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/title.png").getImage().getScaledInstance(127, 27, java.awt.Image.SCALE_SMOOTH)))));
		TitleButton.setBounds(486, 299, 127, 27);
		TitleButton.setBorderPainted(false);
		ImageIcon TitleImg = new ImageIcon("IMG/title.png");
		ImageIcon TitleRImg = new ImageIcon("IMG/RTitle.png");
		TitleButton.setIcon(TitleImg);
		TitleButton.setDisabledIcon(TitleImg);
		TitleButton.setToolTipText("The <title> element specifies a title for the document");
		TitleButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(TitleButton);
		TitleButton.addActionListener(lforbuttons);
		TitleButton.setRolloverIcon(TitleRImg);

		MultiLineEntry = new TextArea();
		MultiLineEntry.setBackground(UIManager.getColor("CheckBox.light"));
		MultiLineEntry.setVisible(true);
		MultiLineEntry.setEditable(false);
		MultiLineEntry.setBounds(481, 543, 285, 150);
		frmWebPageBasics.getContentPane().add(MultiLineEntry);

		TitleSaveButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		TitleSaveButton.setBounds(787, 640, 127, 27);
		TitleSaveButton.setOpaque(false);
		TitleSaveButton.setBorderPainted(false);
		ImageIcon TitleSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon TitleSaveRImg = new ImageIcon("IMG/RSave.png");
		TitleSaveButton.setIcon(TitleSaveImg);
		TitleSaveButton.setDisabledIcon(TitleSaveImg);
		TitleSaveButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(TitleSaveButton);
		TitleSaveButton.addActionListener(lforbuttons);
		TitleSaveButton.setRolloverIcon(TitleSaveRImg);

		FooterSaveButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		FooterSaveButton.setBounds(787, 640, 127, 27);
		FooterSaveButton.setOpaque(false);
		FooterSaveButton.setBorderPainted(false);
		ImageIcon FooterSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon FooterSaveRImg = new ImageIcon("IMG/RSave.png");
		FooterSaveButton.setIcon(FooterSaveImg);
		FooterSaveButton.setDisabledIcon(FooterSaveImg);
		FooterSaveButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(FooterSaveButton);
		FooterSaveButton.addActionListener(lforbuttons);
		FooterSaveButton.setRolloverIcon(FooterSaveRImg);

		textEditSave = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		textEditSave.setBounds(787, 640, 127, 27);
		textEditSave.setOpaque(false);
		textEditSave.setBorderPainted(false);
		ImageIcon DefaultSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon DefaultSaveRImg = new ImageIcon("IMG/RSave.png");
		textEditSave.setIcon(DefaultSaveImg);
		textEditSave.setDisabledIcon(DefaultSaveImg);
		textEditSave.setVisible(false);
		frmWebPageBasics.getContentPane().add(textEditSave);
		textEditSave.addActionListener(lforbuttons);
		textEditSave.setRolloverIcon(DefaultSaveRImg);

		defaultSaveButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		defaultSaveButton.setBounds(787, 640, 127, 27);
		defaultSaveButton.setOpaque(false);
		defaultSaveButton.setBorderPainted(false);
		DefaultSaveImg = new ImageIcon("IMG/save.png");
		DefaultSaveRImg = new ImageIcon("IMG/RSave.png");
		defaultSaveButton.setIcon(DefaultSaveImg);
		defaultSaveButton.setDisabledIcon(DefaultSaveImg);
		defaultSaveButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(defaultSaveButton);
		defaultSaveButton.addActionListener(lforbuttons);
		defaultSaveButton.setRolloverIcon(DefaultSaveRImg);

		DummySaveButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		DummySaveButton.setBounds(787, 640, 127, 27);
		DummySaveButton.setOpaque(false);
		DummySaveButton.setBorderPainted(false);

		ImageIcon DummySaveRImg = new ImageIcon("IMG/RSave.png");
		DummySaveButton.setIcon(DefaultSaveImg);
		DummySaveButton.setDisabledIcon(DefaultSaveImg);
		DummySaveButton.setVisible(true);
		frmWebPageBasics.getContentPane().add(DummySaveButton);
		DummySaveButton.addActionListener(lforbuttons);
		DummySaveButton.setRolloverIcon(DummySaveRImg);

		BrButton = new JButton(new ImageIcon(((new ImageIcon("IMG/button_br passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		BrButton.setToolTipText("The <br> tag adds a line break in your text");
		BrButton.setVisible(false);
		BrButton.setBounds(782, 337, 87, 27);
		frmWebPageBasics.getContentPane().add(BrButton);
		BrButton.addActionListener(lforbuttons);
		ImageIcon BrImg = new ImageIcon("IMG/button_br passive.png");
		ImageIcon BRRImg = new ImageIcon("IMG/button_br rollover.png");
		BrButton.setIcon(BrImg);
		BrButton.setRolloverIcon(BRRImg);
		BrButton.setOpaque(false);
		BrButton.setBorderPainted(false);

		h1Button = new JButton(new ImageIcon(((new ImageIcon("IMG/button_h1 passive.png").getImage()
				.getScaledInstance(87, 27, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon h1Img = new ImageIcon("IMG/button_h1 passive.png");
		ImageIcon h1RImg = new ImageIcon("IMG/button_h1 rollover.png");
		h1Button.setIcon(h1Img);
		h1Button.setRolloverIcon(h1RImg);
		h1Button.setToolTipText("The <h1> element defines a large heading");
		h1Button.setVisible(false);
		h1Button.setBounds(669, 235, 87, 27);
		frmWebPageBasics.getContentPane().add(h1Button);
		h1Button.addActionListener(lforbuttons);
		h1Button.setOpaque(false);
		h1Button.setBorderPainted(false);

		h2Button = new JButton(new ImageIcon(((new ImageIcon("IMG/button_h2 passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon h2Img = new ImageIcon("IMG/button_h2 passive.png");
		ImageIcon h2RImg = new ImageIcon("IMG/button_h2 rollover.png");
		h2Button.setIcon(h2Img);
		h2Button.setRolloverIcon(h2RImg);
		h2Button.setVisible(false);
		h2Button.setBounds(669, 269, 87, 27);
		frmWebPageBasics.getContentPane().add(h2Button);
		h2Button.addActionListener(lforbuttons);
		h2Button.setToolTipText(
				"The <h1>-<h6> tags define headings, where the smaller the number the larger the heading");
		h2Button.setOpaque(false);
		h2Button.setBorderPainted(false);

		h3Button = new JButton(new ImageIcon(((new ImageIcon("IMG/button_h3 passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon h3Img = new ImageIcon("IMG/button_h3 passive.png");
		ImageIcon h3RImg = new ImageIcon("IMG/button_h3 rollover.png");
		h3Button.setIcon(h3Img);
		h3Button.setRolloverIcon(h3RImg);
		h3Button.setVisible(false);
		h3Button.setBounds(669, 303, 87, 27);
		frmWebPageBasics.getContentPane().add(h3Button);
		h3Button.addActionListener(lforbuttons);
		h3Button.setToolTipText(
				"The <h1>-<h6> tags define headings, where the smaller the number the larger the heading");
		h3Button.setOpaque(false);
		h3Button.setBorderPainted(false);

		h4Button = new JButton(new ImageIcon(((new ImageIcon("IMG/button_h4 passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon h4Img = new ImageIcon("IMG/button_h4 passive.png");
		ImageIcon h4RImg = new ImageIcon("IMG/button_h4 rollover.png");
		h4Button.setIcon(h4Img);
		h4Button.setRolloverIcon(h4RImg);
		h4Button.setVisible(false);
		h4Button.setBounds(669, 337, 87, 27);
		frmWebPageBasics.getContentPane().add(h4Button);
		h4Button.addActionListener(lforbuttons);
		h4Button.setToolTipText(
				"The <h1>-<h6> tags define headings, where the smaller the number the larger the heading");
		h4Button.setOpaque(false);
		h4Button.setBorderPainted(false);

		h5Button = new JButton(new ImageIcon(((new ImageIcon("IMG/button_h5 passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon h5Img = new ImageIcon("IMG/button_h5 passive.png");
		ImageIcon h5RImg = new ImageIcon("IMG/button_h5 rollover.png");
		h5Button.setIcon(h5Img);
		h5Button.setRolloverIcon(h5RImg);
		h5Button.setVisible(false);
		h5Button.setBounds(669, 368, 87, 27);
		frmWebPageBasics.getContentPane().add(h5Button);
		h5Button.addActionListener(lforbuttons);
		h5Button.setToolTipText(
				"The <h1>-<h6> tags define headings, where the smaller the number the larger the heading");
		h5Button.setOpaque(false);
		h5Button.setBorderPainted(false);

		h6Button = new JButton(new ImageIcon(((new ImageIcon("IMG/button_h6 passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon h6Img = new ImageIcon("IMG/button_h6 passive.png");
		ImageIcon h6RImg = new ImageIcon("IMG/button_h6 rollover.png");
		h6Button.setIcon(h6Img);
		h6Button.setRolloverIcon(h6RImg);
		h6Button.setVisible(false);
		h6Button.setBounds(669, 402, 87, 27);
		frmWebPageBasics.getContentPane().add(h6Button);
		h6Button.addActionListener(lforbuttons);
		h6Button.setToolTipText(
				"The <h1>-<h6> tags define headings, where the smaller the number the larger the heading");
		h6Button.setOpaque(false);
		h6Button.setBorderPainted(false);

		PButton = new JButton(new ImageIcon(((new ImageIcon("IMG/button_p passive.png").getImage().getScaledInstance(84,
				31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon PImg = new ImageIcon("IMG/button_p passive.png");
		ImageIcon PRImg = new ImageIcon("IMG/button_p rollover.png");
		PButton.setIcon(PImg);
		PButton.setRolloverIcon(PRImg);
		PButton.setToolTipText("The <p> element defines a paragraph");
		PButton.setVisible(false);
		PButton.setBounds(782, 235, 87, 27);
		frmWebPageBasics.getContentPane().add(PButton);
		PButton.addActionListener(lforbuttons);
		PButton.setOpaque(false);
		PButton.setBorderPainted(false);

		emButton = new JButton(new ImageIcon(((new ImageIcon("IMG/button_em passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon emImg = new ImageIcon("IMG/button_em passive.png");
		ImageIcon emRImg = new ImageIcon("IMG/button_em rollover.png");
		emButton.setIcon(emImg);
		emButton.setRolloverIcon(emRImg);
		emButton.setToolTipText("The <em> tag is a phrase tag. It renders as emphasized text.");
		emButton.setVisible(false);
		emButton.setBounds(782, 269, 89, 23);
		frmWebPageBasics.getContentPane().add(emButton);
		emButton.addActionListener(lforbuttons);
		emButton.setOpaque(false);
		emButton.setBorderPainted(false);

		StrongButton = new JButton(new ImageIcon(((new ImageIcon("IMG/button_strong passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon strongImg = new ImageIcon("IMG/button_strong passive.png");
		ImageIcon strongRImg = new ImageIcon("IMG/button_strong rollover.png");
		StrongButton.setIcon(strongImg);
		StrongButton.setRolloverIcon(strongRImg);
		StrongButton.setToolTipText("The <strong> tag is a phrase tag. It defines important text.");
		StrongButton.setVisible(false);
		StrongButton.setBounds(782, 303, 87, 27);
		frmWebPageBasics.getContentPane().add(StrongButton);
		StrongButton.addActionListener(lforbuttons);
		StrongButton.setOpaque(false);
		StrongButton.setBorderPainted(false);

		JButton btnNewButton_5 = new JButton("Lists");
		btnNewButton_5.setToolTipText("Adds a list to your webpage");
		btnNewButton_5.setVisible(false);
		btnNewButton_5.setBounds(782, 375, 89, 23);
		frmWebPageBasics.getContentPane().add(btnNewButton_5);

		linkButton = new JButton(new ImageIcon(((new ImageIcon("IMG/button_link passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon linkImg = new ImageIcon("IMG/button_link passive.png");
		ImageIcon linkRImg = new ImageIcon("IMG/button_link rollover.png");
		linkButton.setIcon(linkImg);
		linkButton.setRolloverIcon(linkRImg);
		linkButton.setToolTipText("Adds link to specified address local or WWW");
		linkButton.setVisible(false);
		linkButton.setBounds(724, 169, 87, 27);
		frmWebPageBasics.getContentPane().add(linkButton);
		linkButton.addActionListener(lforbuttons);
		linkButton.setOpaque(false);
		linkButton.setBorderPainted(false);

		imgButton = new JButton(new ImageIcon(((new ImageIcon("IMG/button_img passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon imgImg = new ImageIcon("IMG/button_img passive.png");
		ImageIcon imgRImg = new ImageIcon("IMG/button_img rollover.png");
		imgButton.setIcon(imgImg);
		imgButton.setRolloverIcon(imgRImg);
		imgButton.setToolTipText("Insert an Image into your webpage");
		imgButton.setVisible(false);
		imgButton.setBounds(627, 169, 87, 27);
		frmWebPageBasics.getContentPane().add(imgButton);
		imgButton.addActionListener(lforbuttons);
		imgButton.setOpaque(false);
		imgButton.setBorderPainted(false);

		listButton = new JButton(new ImageIcon(((new ImageIcon("IMG/button_list passive.png").getImage()
				.getScaledInstance(87, 27, java.awt.Image.SCALE_SMOOTH)))));
		listButton.setBounds(527, 169, 87, 27);
		listButton.setBorderPainted(false);
		ImageIcon ListImg = new ImageIcon("IMG/button_list passive.png");
		ImageIcon ListRImg = new ImageIcon("IMG/button_list rollover.png");
		listButton.setIcon(ListImg);
		listButton.setDisabledIcon(ListImg);
		listButton.setToolTipText("The <title> element specifies a title for the document");
		listButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(listButton);
		listButton.addActionListener(lforbuttons);
		listButton.setRolloverIcon(ListRImg);
		linkButton.setOpaque(false);
		linkButton.setBorderPainted(false);
	}

	private void initMenu(ListenForButton lforbuttons) {
		JMenuBar MainMenu = new JMenuBar();
		MainMenu.setBounds(0, 0, 1134, 21);
		frmWebPageBasics.getContentPane().add(MainMenu);

		JMenu mnNewMenu = new JMenu("Options");
		MainMenu.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Undo Last Action");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.setEnabled(false);

		ResetPage = new JMenuItem("Reset Page");
		mnNewMenu.add(ResetPage);
		ResetPage.addActionListener(lforbuttons);

		JMenu mnFinish = new JMenu("Finish");
		MainMenu.add(mnFinish);

		menuFinalize = new JMenuItem("Finalize Page");
		mnFinish.add(menuFinalize);
		menuFinalize.addActionListener(lforbuttons);

		JMenu mnNewMenu_1 = new JMenu("Advanced");
		mnNewMenu_1.setActionCommand("");
		MainMenu.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("CSS Styling");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.setEnabled(false);
	}

	private void initJFrames() {
		frmWebPageBasics = new JFrame();
		frmWebPageBasics.setResizable(false);
		frmWebPageBasics.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebPageBasics.setTitle("Web Page Basics");
		frmWebPageBasics.setBounds(100, 100, 1150, 750);
		frmWebPageBasics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWebPageBasics.getContentPane().setLayout(null);
		frmWebPageBasics.setVisible(true);

		frmWebgetLink = new JFrame();
		frmWebgetLink.setResizable(false);
		frmWebgetLink.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebgetLink.setTitle("Adding Links");
		frmWebgetLink.setBounds(100, 100, 400, 400);
		frmWebgetLink.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmWebgetLink.getContentPane().setLayout(null);
		frmWebgetLink.setVisible(false);

		frmWebgetImg = new JFrame();
		frmWebgetImg.setResizable(false);
		frmWebgetImg.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebgetImg.setTitle("Adding Links");
		frmWebgetImg.setBounds(100, 100, 600, 600);
		frmWebgetImg.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmWebgetImg.getContentPane().setLayout(null);
		frmWebgetImg.setVisible(false);

		frmWebgetList = new JFrame();
		frmWebgetList.setResizable(false);
		frmWebgetList.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebgetList.setTitle("Add List");
		frmWebgetList.setBounds(100, 100, 400, 400);
		frmWebgetList.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmWebgetList.getContentPane().setLayout(null);
		frmWebgetList.setVisible(false);
	}

	/**
	 * Handles button presses.
	 */
	class ListenForButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == menuFinalize) {
				if (tagArray.size() == 0) {
					JOptionPane.showMessageDialog(null,
							String.format("You have not added anything to your page yet!", e.getActionCommand()));
				}
				String lastAdd = tagArray.get(tagArray.size() - 1);
				if (lastAdd.equalsIgnoreCase("</html>")) {
					FinishPage();
				}
				if (!lastAdd.equalsIgnoreCase("</html>")) {
					JOptionPane.showMessageDialog(null, String
							.format("Please finish your page before you attempt to create it!", e.getActionCommand()));
				}

			}

			if (e.getSource() == HTMLButton) {
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

			}
			if (e.getSource() == HeadButton) {
				tagArray.add("<HEAD>");
				ArrayDisplay.append("\n" + "<head>");
				HeadButton.setEnabled(false);
				TitleButton.setEnabled(true);
				TitleButton.setVisible(true);
				TutConsole.setText(
						"\r\n\r\n\r\nYou can see on the far right pane that when you add tags to your website that it encloses them with < and >. These brackets are needed to close tags for your web page to be interpreted by a browser. \n\n CONTINUE by adding a title tag to your page by typing in the textbox and saving your progress");
				ImageIcon TitleNImg = new ImageIcon("IMG/NTitle.png");
				TitleButton.setIcon(TitleNImg);
			}
			if (e.getSource() == TitleButton) {
				tagArray.add("<TITLE>");
				ArrayDisplay.append("\n" + "<title>");
				TutConsole.setText("\n\nTo CONTINUE please click the Save button after entering your title");
				TitleButton.setEnabled(false);
				TitleButton.setEnabled(false);
				TitleButton.setVisible(false);
				MultiLineEntry.setEditable(true);
				TitleSaveButton.setVisible(true);
				TitleSaveButton.setEnabled(true);
				DummySaveButton.setVisible(false);
				ImageIcon TitleSaveNImg = new ImageIcon("IMG/Nsave.png");
				TitleSaveButton.setIcon(TitleSaveNImg);
			}
			if (e.getSource() == TitleSaveButton) {
				String userInput = MultiLineEntry.getText();
				ArrayDisplay.append("\n" + userInput);
				ArrayDisplay.append("\n" + "</title>");
				ArrayDisplay.append("\n" + "</head>");
				TutConsole.setText("\n\nTo CONTINUE please click the Body button");
				tagArray.add(userInput);
				tagArray.add("</title>");
				tagArray.add("</head>");
				MultiLineEntry.setText("");
				TitleButton.setVisible(false);
				MultiLineEntry.setEditable(false);
				TitleSaveButton.setVisible(false);
				BodyButton.setEnabled(true);
				DummySaveButton.setVisible(true);
				ImageIcon BodyNImg = new ImageIcon("IMG/Nbody.png");
				BodyButton.setIcon(BodyNImg);
			}

			if (e.getSource() == BodyButton) {
				tagArray.add("<body>");
				ArrayDisplay.append("\n" + "<body>");
				TutConsole
						.setText("\n\n\n Add body tags and text here \n\n To CONTINUE please click the Footer button");
				BodyButton.setEnabled(false);
				FooterButton.setEnabled(true);
				textEditTrue();
				footerNImg = new ImageIcon("IMG/Nfooter.png");
				FooterButton.setIcon(footerNImg);
				imgButton.setVisible(true);
				linkButton.setVisible(true);
				MultiLineEntry.setEditable(true);
				DummySaveButton.setVisible(false);
				defaultSaveButton.setVisible(true);
				listButton.setVisible(true);
			}
			if (e.getSource() == FooterButton) {
				tagArray.add("</body>");
				ArrayDisplay.append("\n" + "</body>");
				tagArray.add("<footer>");
				ArrayDisplay.append("\n" + "<footer>");
				TutConsole.setText(
						"\n\n\n Add Add footer page information here. \n\n To CONTINUE please click the Save button");
				FooterButton.setEnabled(false);
				listButton.setVisible(false);
				MultiLineEntry.setEditable(true);
				FooterSaveButton.setVisible(true);
				textEditFalse();
				ImageIcon footerImg = new ImageIcon("IMG/footer.png");
				FooterButton.setIcon(footerImg);
				ImageIcon FooterSaveNImg = new ImageIcon("IMG/Nsave.png");
				FooterSaveButton.setIcon(FooterSaveNImg);
				imgButton.setVisible(false);
				linkButton.setVisible(false);
			}
			if (e.getSource() == FooterSaveButton) {
				String userInput = MultiLineEntry.getText();
				ArrayDisplay.append("\n" + userInput);
				ArrayDisplay.append("\n" + "</footer>");
				ArrayDisplay.append("\n" + "</html>");
				TutConsole.setText(
						"\n\n\n Your basic page is finished. You can add advanced options like CSS styling or CONTINUE by choosing finish and finalize from the menu above");
				tagArray.add(userInput);
				tagArray.add("</footer>");
				tagArray.add("</html>");
				MultiLineEntry.setText("");
				TitleButton.setVisible(false);
				MultiLineEntry.setEditable(false);
				FooterSaveButton.setVisible(false);
				DummySaveButton.setVisible(true);
				if (frmWebgetLink.isVisible()) {
					frmWebgetLink.setVisible(false);
					linkAddy.setText("");
					linkName.setText("");
				}
			}
			if (e.getSource() == PButton) {
				ArrayDisplay.append("\n" + "<p>");
				tagArray.add("<p>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				DummySaveButton.setVisible(false);
				textEditFalse();
				emButton.setVisible(true);
				StrongButton.setVisible(true);

			}
			if (e.getSource() == textEditSave) {
				String userInput = MultiLineEntry.getText();
				ArrayDisplay.append("\n" + userInput);
				tagArray.add(userInput);
				MultiLineEntry.setText("");
				MultiLineEntry.setEditable(false);
				textEditSave.setVisible(false);
				String findLastTag = tagArray.get(tagArray.size() - 2);
				StringBuilder sb = new StringBuilder(findLastTag).insert(1, '/');
				String exitTag = sb.toString();
				tagArray.add(exitTag);
				ArrayDisplay.append("\n" + exitTag);
				FooterButton.setEnabled(true);
				DummySaveButton.setVisible(true);
				textEditTrue();
				String findpTag = tagArray.get(tagArray.size() - 4);
				if (findpTag.equalsIgnoreCase("<p>")) {
					ArrayDisplay.append("\n</p>");
					tagArray.add("</p>");
				}
				if (FooterButton.getIcon() == footerNImg) {
					MultiLineEntry.setEditable(true);
				}

			}
			if (e.getSource() == defaultSaveButton) {
				String userInput = MultiLineEntry.getText();
				ArrayDisplay.append("\n" + userInput);
				tagArray.add(userInput);
				MultiLineEntry.setText("");
				FooterButton.setEnabled(true);
				textEditTrue();
			}
			if (e.getSource() == h1Button) {
				ArrayDisplay.append("\n" + "<h1>");
				tagArray.add("<h1>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h2Button) {
				ArrayDisplay.append("\n" + "<h2>");
				tagArray.add("<h2>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h3Button) {
				ArrayDisplay.append("\n" + "<h3>");
				tagArray.add("<h3>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h4Button) {
				ArrayDisplay.append("\n" + "<h4>");
				tagArray.add("<h4>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h5Button) {
				ArrayDisplay.append("\n" + "<h5>");
				tagArray.add("<h5>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h6Button) {
				ArrayDisplay.append("\n" + "<h6>");
				tagArray.add("<h6>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == emButton) {
				ArrayDisplay.append("\n" + "<em>");
				tagArray.add("<em>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();

			}
			if (e.getSource() == StrongButton) {
				ArrayDisplay.append("\n" + "<strong>");
				tagArray.add("<strong>");
				MultiLineEntry.setEditable(true);
				textEditSave.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == BrButton) {
				ArrayDisplay.append("\n" + "<br>");
				tagArray.add("<br>");
			}

			if (e.getSource() == ResetPage) {
				resetPage();
			}
			if (e.getSource() == imgButton) {
				getImage(tagArray);

			}
			if (e.getSource() == linkCancel) {

				frmWebgetLink.setVisible(false);
				linkAddy.setText("");
				linkName.setText("");
			}
			if (e.getSource() == linkAdd) {
				String userLinkAddy = linkAddy.getText();
				String userLinkName = linkName.getText();
				tagArray.add("<a href=\"http://" + userLinkAddy + "\">" + userLinkName + "</a><br>");
				ArrayDisplay.append("\n <a href=\"http://" + userLinkAddy + "\">" + userLinkName + "</a>");
				frmWebgetLink.setVisible(false);
				linkAddy.setText("");
				linkName.setText("");
			}
			if (e.getSource() == linkButton) {
				getLink(tagArray);
			}
			if (e.getSource() == listButton) {
				getList(tagArray);
			}
			if (e.getSource() == listSave) {
				if (OrderedLi.isSelected()) {
					OrderedListSave();
				}
				if (UnOrderedLi.isSelected()) {
					OrderedListSave();
				}

				frmWebgetList.setVisible(false);
			}
			if (e.getSource() == listCancel) {
				frmWebgetList.setVisible(false);
			}
			if (e.getSource() == UnOrderedLi) {
				UnOrderedLi.setSelected(true);
				OrderedLi.setSelected(false);
			}
			if (e.getSource() == OrderedLi) {
				UnOrderedLi.setSelected(false);
				OrderedLi.setSelected(true);
			}
			if (e.getSource() == RandImg1) {
				cakeImg = new ImageIcon("IMG/SImages/cake.jpg");
				SelectedImg.setIcon(cakeImg);
			}
			if (e.getSource() == RandImg2) {
				carImg = new ImageIcon("IMG/SImages/car.jpg");
				SelectedImg.setIcon(carImg);
			}
			if (e.getSource() == RandImg3) {
				lakeImg = new ImageIcon("IMG/SImages/lake.jpg");
				SelectedImg.setIcon(lakeImg);
			}
			if (e.getSource() == RandImg4) {
				puppyImg = new ImageIcon("IMG/SImages/puppy.jpeg");
				SelectedImg.setIcon(puppyImg);
			}
			if (e.getSource() == RandImg5) {
				travelImg = new ImageIcon("IMG/SImages/travel.jpg");
				SelectedImg.setIcon(travelImg);
			}
			if (e.getSource() == RandImg6) {
				cityImg = new ImageIcon("IMG/SImages/city.jpg");
				SelectedImg.setIcon(cityImg);
			}
			if (e.getSource() == cancelImg) {
				frmWebgetImg.setVisible(false);
			}
			if (e.getSource() == saveImg) {
				frmWebgetImg.setVisible(false);

				if (SelectedImg.getIcon() == null) {
					JOptionPane.showMessageDialog(null,
							String.format(
									"You have not selected an image to add yet! Please use cancel if you do not wish to add an image.",
									e.getActionCommand()));
					frmWebgetImg.setVisible(true);
				}

				if (SelectedImg.getIcon() == cakeImg) {
					tagArray.add("<img src=\"IMG/SImages/cake.jpg\"><br>");
					ArrayDisplay.append("\n <img src=\"IMG/SImages/cake.jpg\">\n<br>");
				}
				if (SelectedImg.getIcon() == carImg) {
					tagArray.add("<img src=\"IMG/SImages/car.jpg\"><br>");
					ArrayDisplay.append("\n <img src=\"IMG/SImages/car.jpg\">\n<br>");
				}
				if (SelectedImg.getIcon() == cityImg) {
					tagArray.add("<img src=\"IMG/SImages/city.jpg\"><br>");
					ArrayDisplay.append("\n <img src=\"IMG/SImages/city.jpg\">\n<br>");
				}
				if (SelectedImg.getIcon() == puppyImg) {
					tagArray.add("<img src=\"IMG/SImages/puppy.jpeg\"><br>");
					ArrayDisplay.append("\n <img src=\"IMG/SImages/puppy.jpeg\">\n<br>");
				}
				if (SelectedImg.getIcon() == travelImg) {
					tagArray.add("<img src=\"IMG/SImages/travel.jpg\"><br>");
					ArrayDisplay.append("\n <img src=\"IMG/SImages/travel.jpg\">\n<br>");
				}
				if (SelectedImg.getIcon() == lakeImg) {
					tagArray.add("<img src=\"IMG/SImages/lake.jpg\"><br>");
					ArrayDisplay.append("\n <img src=\"IMG/SImages/lake.jpg\">\n<br>");
				}
			}
		}

	}
}
