package music.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;

public class WelcomeScreen {
	private static final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlPatricksMusicApp = new Shell();
		shlPatricksMusicApp.setBackground(SWTResourceManager.getColor(204, 255, 255));
		shlPatricksMusicApp.setSize(450, 300);
		shlPatricksMusicApp.setText("Patrick's Music App");
		shlPatricksMusicApp.setLayout(null);
		
		Menu menu = new Menu(shlPatricksMusicApp, SWT.BAR);
		shlPatricksMusicApp.setMenuBar(menu);
		
		MenuItem fileMenu = new MenuItem(menu, SWT.CASCADE);
		fileMenu.setText("File");
		
		Menu menu_1 = new Menu(fileMenu);
		fileMenu.setMenu(menu_1);
		
		MenuItem mntmImportFile = new MenuItem(menu_1, SWT.NONE);
		mntmImportFile.setText("Import File");
		
		Button artists = new Button(shlPatricksMusicApp, SWT.NONE);
		artists.setBounds(176, 111, 75, 25);
		formToolkit.adapt(artists, true, true);
		artists.setText("Artists");

		shlPatricksMusicApp.open();
		shlPatricksMusicApp.layout();
		while (!shlPatricksMusicApp.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
