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
public class HTMLDesignerApp extends JFrame {

	HTMLDesignerApp inputhtmld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HTMLDesignerApp window = new HTMLDesignerApp();
					Init init = new Init();
					init.initialize(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public HTMLDesignerApp() {

	}
}