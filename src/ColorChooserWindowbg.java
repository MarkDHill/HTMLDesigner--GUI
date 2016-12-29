import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;
import javax.swing.border.TitledBorder;

/* ColorChooserDemo.java requires no other files. */
public class ColorChooserWindowbg extends JPanel implements ChangeListener {

	protected JColorChooser tcc;
	protected JLabel banner;
	private final JPanel bannerPanelButtons = new JPanel((LayoutManager) null);
	private JButton bgColorCancel;
	private JButton bgColorSave;
	private static JFrame bgframe;
	ListenForButton lforbuttons = new ListenForButton();
	Color newColor;
	Color defaultColor = Color.WHITE;
	String StringColor = null;
	
	
	public ColorChooserWindowbg() {
		super(new BorderLayout());

		// Set up the banner at the top of the window
		banner = new JLabel("", JLabel.CENTER);
		banner.setForeground(Color.yellow);
		banner.setBackground(Color.white);
		banner.setOpaque(true);
		banner.setFont(new Font("SansSerif", Font.BOLD, 24));
		banner.setPreferredSize(new Dimension(100, 65));

		JPanel bannerPanel = new JPanel(new BorderLayout());
		bannerPanel.add(banner, BorderLayout.CENTER);
		bannerPanel.setBorder(BorderFactory.createTitledBorder("Preview"));
		bannerPanel.add(banner, BorderLayout.SOUTH);
		bannerPanel.setBorder(BorderFactory.createTitledBorder(""));

		// Set up color chooser for setting text color
		tcc = new JColorChooser(banner.getForeground());
		tcc.getSelectionModel().addChangeListener(this);
		tcc.setBorder(BorderFactory.createTitledBorder("Choose Background Color"));
		tcc.setColor(defaultColor);
		add(bannerPanel, BorderLayout.NORTH);
		add(tcc, BorderLayout.CENTER);
		// removes bottom preview pane
		tcc.setPreviewPanel(new JPanel());
		add(bannerPanelButtons, BorderLayout.SOUTH);
		bannerPanelButtons.setLayout(new BorderLayout());

		bgColorCancel = new JButton(new ImageIcon(((new ImageIcon("IMG/button_cancel passive.png").getImage().getScaledInstance(127,
				27, java.awt.Image.SCALE_SMOOTH)))));
		ImageIcon CancelImg = new ImageIcon("IMG/button_cancel passive.png");
		ImageIcon CancelRImg = new ImageIcon("IMG/button_cancel rollover.png");
		bgColorCancel.setRolloverIcon(CancelRImg);
		bgColorCancel.setIcon(CancelImg);
		bgColorCancel.setDisabledIcon(CancelImg);
		bgColorCancel.setToolTipText("Cancel adding link");
		//bgColorCancel.setBounds(0, 0, 127, 27);
		bgColorCancel.addActionListener(lforbuttons);
		bannerPanelButtons.add(bgColorCancel, BorderLayout.WEST);
		bgColorCancel.setOpaque(true);
		bgColorCancel.setBorderPainted(false);

		bgColorSave = new JButton(new ImageIcon(
				((new ImageIcon("IMG/save.png").getImage().getScaledInstance(127, 27, java.awt.Image.SCALE_SMOOTH)))));
		//bgColorSave.setBounds(0, 0, 127, 27);
		ImageIcon FooterSaveImg = new ImageIcon("IMG/save.png");
		ImageIcon FooterSaveRImg = new ImageIcon("IMG/RSave.png");
		bgColorSave.setIcon(FooterSaveImg);
		bgColorSave.setDisabledIcon(FooterSaveImg);
		bgColorSave.setRolloverIcon(FooterSaveRImg);
		bgColorSave.addActionListener(lforbuttons);
		bgColorSave.setBounds(0, 0, 127, 27);
		bgColorSave.setOpaque(false);
		bgColorSave.setBorderPainted(false);
		bannerPanelButtons.add(bgColorSave, BorderLayout.EAST);

		AbstractColorChooserPanel[] panels = tcc.getChooserPanels();
		for (AbstractColorChooserPanel accp : panels) {
			if (accp.getDisplayName().equals("HSV")) {
				tcc.removeChooserPanel(accp);
			}
			if (accp.getDisplayName().equals("HSL")) {
				tcc.removeChooserPanel(accp);
			}
			if (accp.getDisplayName().equals("RGB")) {
				tcc.removeChooserPanel(accp);
			}
			if (accp.getDisplayName().equals("CMYK")) {
				tcc.removeChooserPanel(accp);
			}
		}
	}

	public void stateChanged(ChangeEvent e) {
		newColor = tcc.getColor();
		banner.setBackground(newColor);
		StringColor = String.format("#%02x%02x%02x", newColor.getRed(),newColor.getGreen(),newColor.getBlue());
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	public static void createAndShowGUI() {
		// Create and set up the window.
		bgframe = new JFrame("Choosing Background Color");
		bgframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		// Display the window.

		// Create and set up the content pane.
		JComponent newContentPane = new ColorChooserWindowbg();

		newContentPane.setOpaque(true); // content panes must be opaque
		bgframe.setContentPane(newContentPane);
		bgframe.pack();
		bgframe.setVisible(true);

	}

	class ListenForButton implements ActionListener {

		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == bgColorSave) {
				bgframe.setVisible(false);
				TextArea ArrayDisplay = Init.getArrayDisplay();
				ArrayList<String> tagArray = Init.getTagArray();
				String test = tagArray.get(tagArray.size() - 1);
				JButton bgColorButton = Init.getBgColorButton();
				JButton titleButton = Init.getTitleButton();
				ArrayList<String> buttonHitList = Init.getButtonHitList();
				JLabel tutBanner = Init.getTutBanner();
				
				
				tagArray.add(3, "<style> body {background-color:" + StringColor +";} </style>");
				ArrayDisplay.append("\n<style> body {background-color:" + StringColor +";} </style>");
				bgColorButton.setVisible(false);
				titleButton.setVisible(true);
				titleButton.setEnabled(true);
				ImageIcon tutBanImg = new ImageIcon("IMG/pg-4-tag-title-png.png");
				tutBanner.setIcon(tutBanImg);
				
				}
			if (e.getSource() == bgColorCancel) {
				bgframe.setVisible(false);
			}

		}
	}
}