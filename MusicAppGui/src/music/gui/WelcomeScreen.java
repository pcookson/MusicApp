package music.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class WelcomeScreen {
	private static final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		final Shell shlPatricksMusicApp = new Shell();
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
		artists.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				Artists artistScreen = new Artists();
				shlPatricksMusicApp.dispose();
				artistScreen.open();
				
				
			}
		});
		artists.setImage(SWTResourceManager.getImage("C:\\Users\\cookson\\Downloads\\stockArtistImage.jpg"));
		artists.setBounds(22, 36, 218, 165);
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
