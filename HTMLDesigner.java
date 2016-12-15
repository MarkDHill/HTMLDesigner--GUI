import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Point;

public class HTMLDesigner extends JFrame {

	JFrame frmWebPageBasics;
	JMenuItem menuFinalize;
	JButton HTMLButton;
	TextArea ArrayDisplay;
	JButton HeadButton;
	JButton TitleButton;
	JButton TitleSaveButton;
	JButton BodyButton;
	JButton FooterButton;
	JButton FooterSaveButton;
	JFileChooser FileChooser;
	String ChooserTitle;
	JButton h1Button;
	JButton h2Button;
	JButton h3Button;
	JButton h4Button;
	JButton PButton;
	JButton emButton;
	JButton StrongButton;
	JButton DefaultSaveButton;
	JButton DummySaveButton;
	TextArea MultiLineEntry;
	JTextArea TutConsole;
	JButton BrButton;
	JMenuItem ResetPage;
	JButton h5Button;
	JButton h6Button;
	JButton linkButton;
	JButton imgButton;

	private ArrayList<String> tagArray = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HTMLDesigner window = new HTMLDesigner();
					window.frmWebPageBasics.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public HTMLDesigner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmWebPageBasics = new JFrame();
		frmWebPageBasics.setResizable(false);
		frmWebPageBasics.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frmWebPageBasics.setTitle("Web Page Basics");
		frmWebPageBasics.setBounds(100, 100, 1150, 750);
		frmWebPageBasics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWebPageBasics.getContentPane().setLayout(null);

		ListenForButton lforbuttons = new ListenForButton();

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

		ArrayDisplay = new TextArea();
		ArrayDisplay.setBackground(SystemColor.scrollbar);
		ArrayDisplay.setEditable(false);
		ArrayDisplay.setText("Page in Progress...");
		ArrayDisplay.setBounds(981, 20, 153, 692);
		frmWebPageBasics.getContentPane().add(ArrayDisplay);

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
		ImageIcon HeadNImg = new ImageIcon("IMG/Nhead.png");
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
		ImageIcon BodyNImg = new ImageIcon("IMG/Nbody.png");
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
		ImageIcon footerNImg = new ImageIcon("IMG/Nfooter.png");
		FooterButton.setIcon(footerImg);
		FooterButton.setDisabledIcon(footerImg);
		FooterButton.setRolloverIcon(footerRImg);

		TitleButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/title.png").getImage().getScaledInstance(127, 27, java.awt.Image.SCALE_SMOOTH)))));
		TitleButton.setBounds(486, 299, 127, 27);
		TitleButton.setBorderPainted(false);
		ImageIcon TitleImg = new ImageIcon("IMG/title.png");
		ImageIcon TitleRImg = new ImageIcon("IMG/RTitle.png");
		ImageIcon TitleNImg = new ImageIcon("IMG/NTitle.png");
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
		MultiLineEntry.setBounds(480, 552, 285, 150);
		frmWebPageBasics.getContentPane().add(MultiLineEntry);

		TitleSaveButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		TitleSaveButton.setBounds(787, 640, 127, 27);
		TitleSaveButton.setOpaque(false);
		TitleSaveButton.setBorderPainted(false);
		ImageIcon TitleSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon TitleSaveRImg = new ImageIcon("IMG/RSave.png");
		ImageIcon TitleSaveNImg = new ImageIcon("IMG/NSave.png");
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
		ImageIcon FooterSaveNImg = new ImageIcon("IMG/NSave.png");
		FooterSaveButton.setIcon(FooterSaveImg);
		FooterSaveButton.setDisabledIcon(FooterSaveImg);
		FooterSaveButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(FooterSaveButton);
		FooterSaveButton.addActionListener(lforbuttons);
		FooterSaveButton.setRolloverIcon(FooterSaveRImg);

		DefaultSaveButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		DefaultSaveButton.setBounds(787, 640, 127, 27);
		DefaultSaveButton.setOpaque(false);
		DefaultSaveButton.setBorderPainted(false);
		ImageIcon DefaultSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon DefaultSaveRImg = new ImageIcon("IMG/RSave.png");
		ImageIcon DefaultSaveNImg = new ImageIcon("IMG/NSave.png");
		DefaultSaveButton.setIcon(DefaultSaveImg);
		DefaultSaveButton.setDisabledIcon(DefaultSaveImg);
		DefaultSaveButton.setVisible(false);
		frmWebPageBasics.getContentPane().add(DefaultSaveButton);
		DefaultSaveButton.addActionListener(lforbuttons);
		DefaultSaveButton.setRolloverIcon(DefaultSaveRImg);

		DummySaveButton = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(84, 31, java.awt.Image.SCALE_SMOOTH)))));
		DummySaveButton.setBounds(787, 640, 127, 27);
		DummySaveButton.setOpaque(false);
		DummySaveButton.setBorderPainted(false);
		ImageIcon DummySaveImg = new ImageIcon("IMG/save.png");
		ImageIcon DummySaveRImg = new ImageIcon("IMG/RSave.png");
		ImageIcon DummySaveNImg = new ImageIcon("IMG/NSave.png");
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

		TutConsole = new JTextArea();
		TutConsole.setWrapStyleWord(true);
		// TutConsole.setColumns (100);
		TutConsole.setLineWrap(true);
		TutConsole.setFont(new Font("Dialog", Font.PLAIN, 14));
		TutConsole.setBackground(SystemColor.scrollbar);
		TutConsole.setEditable(false);
		TutConsole.setText(
				"\r\n\r\n\r\nWelcome to the Web Design Basic: Brief Tutorial. To get started on your project hit the HTML button. This adds an <html> tag to your page. All HTML documents must start with a document type declaration: <!DOCTYPE html>.The HTML document itself begins with <html> and ends with </html>.");
		TutConsole.setBounds(10, 32, 332, 680);
		frmWebPageBasics.getContentPane().add(TutConsole);

		JLabel BannerLab = new JLabel("Your banner is broke yo");
		BannerLab.setBounds(363, 42, 600, 115);
		frmWebPageBasics.getContentPane().add(BannerLab);
		ImageIcon BannerImg = new ImageIcon("IMG/BannerTest-png.png");
		BannerLab.setIcon(BannerImg);

	}

	/**
	 * Handles button presses.
	 */
	private class ListenForButton implements ActionListener {

		@Override
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
								+ "\n\n For now we will add just a title. Continue by placing your Head tag");
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
						"\r\n\r\n\r\nYou can see on the far right pane that when you add tags to your website that it encloses them with < and >. These brackets are needed to close tags for your web page to be interpreted by a browser. \n\n Continue by adding a title tag to your page by typing in the textbox and saving your progress");
				ImageIcon TitleNImg = new ImageIcon("IMG/NTitle.png");
				TitleButton.setIcon(TitleNImg);
			}
			if (e.getSource() == TitleButton) {
				tagArray.add("<TITLE>");
				ArrayDisplay.append("\n" + "<title>");
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
				BodyButton.setEnabled(false);
				FooterButton.setEnabled(true);
				textEditTrue();
				ImageIcon footerNImg = new ImageIcon("IMG/Nfooter.png");
				FooterButton.setIcon(footerNImg);
				imgButton.setVisible(true);
				linkButton.setVisible(true);

			}
			if (e.getSource() == FooterButton) {
				tagArray.add("</body>");
				ArrayDisplay.append("\n" + "</body>");
				tagArray.add("<footer>");
				ArrayDisplay.append("\n" + "<footer>");
				FooterButton.setEnabled(false);
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
				tagArray.add(userInput);
				tagArray.add("</footer>");
				tagArray.add("</html>");
				MultiLineEntry.setText("");
				TitleButton.setVisible(false);
				MultiLineEntry.setEditable(false);
				FooterSaveButton.setVisible(false);
				DummySaveButton.setVisible(true);
			}
			if (e.getSource() == PButton) {
				ArrayDisplay.append("\n" + "<p>");
				tagArray.add("<p>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				DummySaveButton.setVisible(false);
				textEditFalse();

			}
			if (e.getSource() == DefaultSaveButton) {
				String userInput = MultiLineEntry.getText();
				ArrayDisplay.append("\n" + userInput);
				tagArray.add(userInput);
				MultiLineEntry.setText("");
				MultiLineEntry.setEditable(false);
				DefaultSaveButton.setVisible(false);
				String findLastTag = tagArray.get(tagArray.size() - 2);
				StringBuilder sb = new StringBuilder(findLastTag).insert(1, '/');
				String exitTag = sb.toString();
				tagArray.add(exitTag);
				ArrayDisplay.append("\n" + exitTag);
				FooterButton.setEnabled(true);
				DummySaveButton.setVisible(true);
				textEditTrue();
			}
			if (e.getSource() == h1Button) {
				ArrayDisplay.append("\n" + "<h1>");
				tagArray.add("<h1>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h2Button) {
				ArrayDisplay.append("\n" + "<h2>");
				tagArray.add("<h2>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h3Button) {
				ArrayDisplay.append("\n" + "<h3>");
				tagArray.add("<h3>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h4Button) {
				ArrayDisplay.append("\n" + "<h4>");
				tagArray.add("<h4>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h5Button) {
				ArrayDisplay.append("\n" + "<h5>");
				tagArray.add("<h5>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == h6Button) {
				ArrayDisplay.append("\n" + "<h6>");
				tagArray.add("<h6>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == emButton) {
				ArrayDisplay.append("\n" + "<em>");
				tagArray.add("<em>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
				FooterButton.setEnabled(false);
				DummySaveButton.setVisible(false);
				textEditFalse();
			}
			if (e.getSource() == StrongButton) {
				ArrayDisplay.append("\n" + "<strong>");
				tagArray.add("<strong>");
				MultiLineEntry.setEditable(true);
				DefaultSaveButton.setVisible(true);
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
	/*		if (e.getSource() == imgButton) {

				
				 * imgPicked = ArrayDisplay.append("\n" + "<img src="+ imgPicked
				 * + ">"); tagArray.add("<img src=" + imgPicked + ".gif>");
				 

				// textEditFalse();
			}
			if (e.getSource() == linkButton) {
				String userInputLink = MultiLineEntry.getText();
				String userLinkText = MultiLineEntry.getText();
				ArrayDisplay.append("\n" + "<a href=" + userInputLink + ">" + userLinkText + "</a>");
				tagArray.add("<a href=" + userInputLink + ">" + userLinkText + "</a>");

			}*/
		}
	}

	private void FinishPage() {
		
		FileChooser = new JFileChooser();
		FileChooser.setCurrentDirectory(new java.io.File("\\"));
		FileChooser.setAcceptAllFileFilterUsed(false);

		
		if (FileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {

			FileWriter writer = null;
			try {
				writer = new FileWriter(FileChooser.getSelectedFile()+ ".html");
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

	private void textEditTrue() {
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

	private void textEditFalse() {
		h1Button.setVisible(false);
		h2Button.setVisible(false);
		h3Button.setVisible(false);
		h4Button.setVisible(false);
		h5Button.setVisible(false);
		h6Button.setVisible(false);
		PButton.setVisible(false);
		emButton.setVisible(false);
		StrongButton.setVisible(false);
		BrButton.setVisible(false);
	}

	private boolean resetPage() {

		Component temporaryLostComponent = null;
		int n = JOptionPane.showConfirmDialog(temporaryLostComponent, "Would you like to reset your current page?",
				"ALERT", JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {

			for (int i = 0; i < tagArray.size(); i++) {
				tagArray.remove(i);
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
			DefaultSaveButton.setVisible(false);
			MultiLineEntry.setText("");
			MultiLineEntry.setEditable(false);
			TutConsole.setText(
					"\r\n\r\n\r\nWelcome to the Web Design Basic: Brief Tutorial. To get started on your project hit the HTML button. This adds an <html> tag to your page. All HTML documents must start with a document type declaration: <!DOCTYPE html>.The HTML document itself begins with <html> and ends with </html>.");
			TitleButton.setVisible(false);

		} else if (n == JOptionPane.NO_OPTION) {

		} else {

		}
		return false;

	}

}