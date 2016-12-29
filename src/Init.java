import java.awt.BorderLayout;
import java.awt.Color;
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
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;

import junit.framework.Test;

//import HTMLDesigner.ListenForButton;

public class Init extends JFrame {

	JFrame frmWebPageBasics;
	static JFrame frmWebgetLink;
	JFrame frmWebgetImg;
	JFrame frmWebgetList;
	JFrame bgframe;
	JMenuItem menuFinalize, ResetPage;
	static JMenuItem CSSStyling;
	static JButton HTMLButton;
	static JButton HeadButton;
	static JButton TitleButton;
	static JButton TitleSaveButton;
	static JButton BodyButton;
	static JButton FooterButton;
	static JButton FooterSaveButton;
	static JButton h1Button;
	static JButton h2Button;
	static JButton h3Button;
	static JButton h4Button;
	static JButton h5Button;
	static JButton h6Button;
	static JButton PButton;
	static JButton emButton;
	static JButton StrongButton;
	static JButton textEditSave;
	static JButton DummySaveButton;
	static JButton BrButton;
	static JButton linkButton;
	static JButton imgButton;
	static JButton bgColorButton;
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
	static JButton defaultSaveButton;
	JButton listSave;
	JButton listCancel;
	static JButton listButton;
	static TextArea ArrayDisplay;
	static TextArea MultiLineEntry;
	JFileChooser FileChooser;
	String ChooserTitle;
	static JTextArea TutConsole;
	static JTextArea linkAddy;
	static JTextArea linkName;
	JLabel SelectedImg;
	static JLabel tutBanner;
	ImageIcon cakeImg, cityImg, puppyImg, carImg, lakeImg, travelImg;
	static ImageIcon footerNImg;
	JTextField Li1, Li2, Li3, Li4, Li5, Li6;
	JRadioButton OrderedLi, UnOrderedLi;
	JComboBox liNum;
	String liNumVal = null;
	HTMLDesignerApp htmld;
	ImageIcon tutBannerHTML;
	static JMenuItem UndoButton;
	static int userTitleLen;
	static int totTextBefore;
	static int totTextAfter;
	static int totTextDif;
	// this arrayList writes the final document all text and tags are added
	static ArrayList<String> tagArray = new ArrayList<>();
	// this arrayList keeps track of button hit for the undo method 
	static ArrayList<String> buttonHitList = new ArrayList<>();
	
	
	public static JLabel getTutBanner() {
		return tutBanner;
	}

	public static void setTutBanner(JLabel tutBanner) {
		Init.tutBanner = tutBanner;
	}

	public static ArrayList<String> getButtonHitList() {
		return buttonHitList;
	}

	public static void setButtonHitList(ArrayList<String> buttonHitList) {
		Init.buttonHitList = buttonHitList;
	}

	
	public static JButton getTitleButton() {
		return TitleButton;
	}

	public static void setTitleButton(JButton titleButton) {
		TitleButton = titleButton;
	}

	public static JButton getBgColorButton() {
		return bgColorButton;
	}

	public static void setBgColorButton(JButton bgColorButton) {
		Init.bgColorButton = bgColorButton;
	}

	public static TextArea getArrayDisplay() {
		return ArrayDisplay;
	}

	public static void setArrayDisplay(TextArea arrayDisplay) {
		ArrayDisplay = arrayDisplay;
	}

	public static ArrayList<String> getTagArray() {
		return tagArray;
	}

	public static void setTagArray(ArrayList<String> tagArray) {
		Init.tagArray = tagArray;
	}

	static void textEditTrue() {

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

	static void textEditFalse() {
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

	void orderedListSave() {

		String userLi1 = Li1.getText();
		String userLi2 = Li2.getText();
		String userLi3 = Li3.getText();
		String userLi4 = Li4.getText();
		String userLi5 = Li5.getText();
		String userLi6 = Li6.getText();
		liNumVal = liNum.getSelectedItem().toString();
		totTextBefore = ArrayDisplay.getText().length();
				
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
		totTextAfter = ArrayDisplay.getText().length();
		totTextDif = (totTextAfter - totTextBefore);
	}

	void unOrderedListSave() {
		String userLi1 = Li1.getText();
		String userLi2 = Li2.getText();
		String userLi3 = Li3.getText();
		String userLi4 = Li4.getText();
		String userLi5 = Li5.getText();
		String userLi6 = Li6.getText();
		liNumVal = liNum.getSelectedItem().toString();
		totTextBefore = ArrayDisplay.getText().length();
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
		totTextAfter = ArrayDisplay.getText().length();
		totTextDif = (totTextAfter - totTextBefore);
	}

	void finishPage() {

		String decodedPath = null;

		String path = HTMLDesignerApp.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		try {
			decodedPath = URLDecoder.decode(path, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}

		String getProperty = System.getProperty("java.class.path");
		final File dirToLock = new File(getProperty + decodedPath);
		JFileChooser fc = new JFileChooser(dirToLock);
		fc.setFileView(new FileView() {
			@Override
			public Boolean isTraversable(File f) {
				return dirToLock.equals(f);
			}
		});

		if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {

			FileWriter writer = null;
			try {
				writer = new FileWriter(fc.getSelectedFile() + ".html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String SavedF = (fc.getSelectedFile() + "html");
			StringBuilder sb = new StringBuilder(SavedF);
			sb.setLength(sb.length() - 4);
			sb.append(".html");
			String sbSavedF = sb.toString();
			File filesb = new File(sbSavedF);
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
				Desktop.getDesktop().browse(filesb.toURI());

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Something broke");
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
			HTMLButton.setVisible(true);
			HeadButton.setVisible(true);
			BodyButton.setVisible(true);
			FooterButton.setVisible(true);
			HTMLButton.setEnabled(true);
			HeadButton.setEnabled(false);
			BodyButton.setEnabled(false);
			FooterButton.setEnabled(false);
			FooterSaveButton.setVisible(false);
			TitleSaveButton.setVisible(false);
			DummySaveButton.setVisible(true);
			textEditSave.setVisible(false);
			imgButton.setVisible(false);
			linkButton.setVisible(false);
			defaultSaveButton.setVisible(false);
			ImageIcon tutBanImg = new ImageIcon("IMG/pg-1-welcome png.png");
			tutBanner.setIcon(tutBanImg);
			listButton.setVisible(false);
			bgColorButton.setVisible(false);
			if (!MultiLineEntry.getText().isEmpty()) {
				MultiLineEntry.setText("");
			}
			MultiLineEntry.setEditable(false);
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
			if (bgframe.isVisible()) {
				bgframe.setVisible(false);
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
		linkAddy.setBounds(100, 250, 180, 20);
		frmWebgetLink.getContentPane().add(linkAddy);

		linkName = new JTextArea();
		linkName.setEditable(true);
		linkName.setVisible(true);
		linkName.setBounds(100, 180, 180, 20);
		frmWebgetLink.getContentPane().add(linkName);

		linkAdd = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		linkAdd.setBounds(200, 320, 127, 27);
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

		linkCancel = new JButton(new ImageIcon(((new ImageIcon("IMG/button_cancel passive.png").getImage()
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		linkCancel.setBounds(50, 320, 127, 27);
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

		/*
		 * JLabel sBar = new JLabel(new ImageIcon( ((new
		 * ImageIcon("IMG/sBar.png").getImage().getScaledInstance(380, 5,
		 * java.awt.Image.SCALE_SMOOTH))))); sBar.setBounds(5, 360, 380, 5);
		 * frmWebgetLink.getContentPane().add(sBar); ImageIcon sBarImg = new
		 * ImageIcon("IMG/sBar.png"); sBar.setIcon(sBarImg);
		 */

		JLabel addLink = new JLabel(new ImageIcon(((new ImageIcon("IMG/addLink.png").getImage().getScaledInstance(400,
				400, java.awt.Image.SCALE_SMOOTH)))));
		addLink.setBounds(0, -30, 400, 400);
		frmWebgetLink.getContentPane().add(addLink);
		ImageIcon addLinkImg = new ImageIcon("IMG/addLink.png");
		addLink.setIcon(addLinkImg);

	}

	@SuppressWarnings("unchecked")
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
		listSave.setBounds(215, 314, 127, 27);
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
		listCancel.setBounds(51, 314, 127, 27);
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
		saveImg.setBounds(319, 514, 127, 27);
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
		cancelImg.setBounds(143, 514, 127, 27);
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

	public void initialize(HTMLDesignerApp inputhtmld) {

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

		tutBanner = new JLabel("Dev note- Import blue screen of death for funsies");
		tutBanner.setBounds(10, 32, 332, 680);
		frmWebPageBasics.getContentPane().add(tutBanner);
		ImageIcon tutBanImg = new ImageIcon("IMG/pg-1-welcome png.png");
		tutBanner.setIcon(tutBanImg);

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
		// frmWebPageBasics.getContentPane().add(TutConsole);

		MultiLineEntry = new TextArea();
		MultiLineEntry.setBackground(UIManager.getColor("CheckBox.light"));
		MultiLineEntry.setVisible(true);
		MultiLineEntry.setEditable(false);
		MultiLineEntry.setBounds(481, 543, 285, 150);
		frmWebPageBasics.getContentPane().add(MultiLineEntry);

		JLabel BannerLab = new JLabel("Sorry Mario, but our banner is in another castle");
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
				.getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		listButton.setBounds(527, 169, 87, 27);
		ImageIcon ListImg = new ImageIcon("IMG/button_list passive.png");
		ImageIcon ListRImg = new ImageIcon("IMG/button_list rollover.png");
		listButton.setIcon(ListImg);
		listButton.setDisabledIcon(ListImg);
		listButton.setOpaque(false);
		listButton.setBorderPainted(false);
		listButton.setToolTipText("Adds either an ordered or unordered list");
		listButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(listButton);
		listButton.addActionListener(lforbuttons);
		listButton.setRolloverIcon(ListRImg);

		bgColorButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/button_background next.png").getImage().getScaledInstance(127, 27, java.awt.Image.SCALE_SMOOTH)))));
		bgColorButton.setOpaque(false);
		bgColorButton.setBorderPainted(false);
		bgColorButton.setToolTipText("Adds a uniform background color to the webpage");
		bgColorButton.setBounds(486, 299, 127, 27);
		frmWebPageBasics.getContentPane().add(bgColorButton);
		bgColorButton.setVisible(false);
		bgColorButton.addActionListener(lforbuttons);
		 ImageIcon bgImg = new ImageIcon("IMG/button_background passive.png");
		 ImageIcon bgRImg = new ImageIcon("IMG/button_background rollover.png");
		 ImageIcon bgNImg = new ImageIcon("IMG/button_background next.png");
		bgColorButton.setIcon(bgNImg);
		bgColorButton.setDisabledIcon(bgImg);
		bgColorButton.setRolloverIcon(bgRImg);
	}

	private void initMenu(ListenForButton lforbuttons) {
		JMenuBar MainMenu = new JMenuBar();
		MainMenu.setBounds(0, 0, 1134, 21);
		frmWebPageBasics.getContentPane().add(MainMenu);

		JMenu mnNewMenu = new JMenu("Options");
		MainMenu.add(mnNewMenu);

		UndoButton = new JMenuItem("Undo Last Action");
		mnNewMenu.add(UndoButton);
		UndoButton.setEnabled(false);
		UndoButton.addActionListener(lforbuttons);
		
		ResetPage = new JMenuItem("Reset Page");
		mnNewMenu.add(ResetPage);
		ResetPage.addActionListener(lforbuttons);

		JMenu mnFinish = new JMenu("Finish");
		MainMenu.add(mnFinish);

		menuFinalize = new JMenuItem("Finalize Page");
		mnFinish.add(menuFinalize);
		menuFinalize.addActionListener(lforbuttons);

		/*
		 * JMenu mnNewMenu_1 = new JMenu("Advanced");
		 * mnNewMenu_1.setActionCommand(""); MainMenu.add(mnNewMenu_1);
		 * 
		 * CSSStyling = new JMenuItem("CSS Styling");
		 * mnNewMenu_1.add(CSSStyling); CSSStyling.setEnabled(false);
		 * CSSStyling.addActionListener(lforbuttons);
		 */
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

		bgframe = new JFrame("Choosing Background Color");
		bgframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmWebgetList.setResizable(false);
		frmWebgetList.setVisible(false);
	}

	/**
	 * Handles button presses.
	 */
	class ListenForButton implements ActionListener {

		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == menuFinalize) {
				if (tagArray.size() == 0) {
					JOptionPane.showMessageDialog(null,
							String.format("You have not added anything to your page yet!", e.getActionCommand()));
				}
				String lastAdd = tagArray.get(tagArray.size() - 1);
				if (lastAdd.equalsIgnoreCase("</html>")) {
					finishPage();
				}
				if (!lastAdd.equalsIgnoreCase("</html>")) {
					JOptionPane.showMessageDialog(null, String
							.format("Please finish your page before you attempt to create it!", e.getActionCommand()));
				}
			}
/*			if (e.getSource() == CSSStyling) {
				HTMLButton.setVisible(false);
				HeadButton.setVisible(false);
				BodyButton.setVisible(false);
				FooterButton.setVisible(false);
				bgColorButton.setVisible(true);
			}*/
			if (e.getSource() == bgColorButton) {
				ColorChooserWindowbg colorchoice = new ColorChooserWindowbg();
				colorchoice.createAndShowGUI();

			}

			if (e.getSource() == HTMLButton) {
				HTMLButtonL htmlbuttonl = HTMLButtonL.execute();
			}

			if (e.getSource() == HeadButton) {
				HeadButtonL headbuttonl = HeadButtonL.execute();
			}
			if (e.getSource() == TitleButton) {
				TitleButtonL titlebutton1 = TitleButtonL.execute();
			}
			if (e.getSource() == TitleSaveButton) {
				TitleSaveButtonL titlesavebuttonl = TitleSaveButtonL.execute();
			}
			if (e.getSource() == BodyButton) {
				BodyButtonL bodybuttonl = BodyButtonL.execute();
			}
			if (e.getSource() == FooterButton) {
				FooterButtonL footerbuttonl = FooterButtonL.execute();
			}
			if (e.getSource() == FooterSaveButton) {
				FooterSaveButtonL footersavebuttonl = FooterSaveButtonL.execute();
			}
			if (e.getSource() == PButton) {
				PButtonL pbuttonl = PButtonL.execute();
			}
			if (e.getSource() == UndoButton) {
				UndoButtonL undobuttonl = UndoButtonL.execute();
			}
			if (e.getSource() == textEditSave) {
				TextEditSaveL texteditsavel = TextEditSaveL.execute();
			}
			if (e.getSource() == defaultSaveButton) {
				DefaultSaveButtonL defaultsavebuttonl = DefaultSaveButtonL.execute();
			}
			if (e.getSource() == h1Button) {
				H1ButtonL h1buttonl = H1ButtonL.execute();
			}
			if (e.getSource() == h2Button) {
				H2ButtonL h2buttonl = H2ButtonL.execute();
			}
			if (e.getSource() == h3Button) {
				H3ButtonL h3buttonl = H3ButtonL.execute();
			}
			if (e.getSource() == h4Button) {
				H4ButtonL h4buttonl = H4ButtonL.execute();
			}
			if (e.getSource() == h5Button) {
				H5ButtonL h5buttonl = H5ButtonL.execute();
			}
			if (e.getSource() == h6Button) {
				H6ButtonL h6buttonl = H6ButtonL.execute();
			}
			if (e.getSource() == emButton) {
				EMButtonL embuttonl = EMButtonL.execute();
			}
			if (e.getSource() == StrongButton) {
				StrongButtonL strongbuttonl = StrongButtonL.execute();
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
				LinkAddL linkaddl = LinkAddL.execute();
			}
			if (e.getSource() == linkButton) {
				getLink(tagArray);
			}
			if (e.getSource() == listButton) {
				getList(tagArray);
			}
			if (e.getSource() == listSave) {
				if (OrderedLi.isSelected()) {
					orderedListSave();
				}
				if (UnOrderedLi.isSelected()) {
					unOrderedListSave();
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
