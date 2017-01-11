import java.awt.EventQueue;
import javax.swing.*;



@SuppressWarnings("serial")
public class HTMLDesignerApp extends JFrame {

	HTMLDesignerApp inputhtmld;

	/**
	 * Launch the application.
	 * Passes to Init (initialize)
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