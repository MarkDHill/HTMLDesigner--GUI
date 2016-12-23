import java.awt.Desktop;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.Font;

@SuppressWarnings("serial")
public class HTMLDesigner extends JFrame {

	HTMLDesigner inputhtmld;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HTMLDesigner window = new HTMLDesigner();
					Init init = new Init();
					init.initialize(window);
					
					//window.frmWebPageBasics.setVisible(true);
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
	//	 Init init = Init.initialize(tagArray);

	}
	}