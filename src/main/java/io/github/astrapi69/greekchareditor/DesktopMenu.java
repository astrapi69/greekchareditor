/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.greekchareditor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

import javax.swing.*;

import io.github.astrapi69.greekchareditor.util.Constants;
import io.github.astrapi69.swing.action.NoAction;
import io.github.astrapi69.window.adapter.CloseWindow;
import io.github.astrapi69.swing.menu.MenuExtensions;
import io.github.astrapi69.greekchareditor.action.OpenFileAction;
import io.github.astrapi69.greekchareditor.action.SaveFileAction;
//import io.github.astrapi69.greekchareditor.actions.NoAction;
import org.springframework.core.io.Resource;

import io.github.astrapi69.swing.layout.ScreenSizeExtensions;
import io.github.astrapi69.swing.action.ExitApplicationAction;
import io.github.astrapi69.swing.action.ToggleFullScreenAction;
import io.github.astrapi69.swing.base.BaseDesktopMenu;
import lombok.NonNull;
import lombok.extern.java.Log;

/**
 * The class {@link DesktopMenu}
 */
@SuppressWarnings("serial")
@Log
public class DesktopMenu extends BaseDesktopMenu
{

	JMenu menuFile;

	JMenu menuEdit;

	JMenu menuLookAndFell;

	JMenu menuHelp;

	// File-MenuItems
	JMenuItem mifNew;

	JMenuItem mifOpen;

	JMenuItem mifSave;

	JMenuItem mifSaveAs;

	JMenuItem mifClose;

	// Look and Feel-MenuItems
	JMenuItem milafMetal;

	JMenuItem milafMotiv;

	JMenuItem milafWindows;

	CloseWindow closeWindow;

	JFileChooser jfileChooser;

	Window helpWindow;

	/**
	 * Instantiates a new desktop menu.
	 */
	public DesktopMenu(@NonNull Component applicationFrame)
	{
		super(applicationFrame);
	}

	@Override
	protected JMenu newEditMenu()
	{
		final JMenu editMenu = super.newEditMenu();
		return editMenu;
	}

	/**
	 * Creates the file menu.
	 *
	 * @return the j menu
	 */
	@Override
	protected JMenu newFileMenu()
	{
		final JMenu fileMenu = super.newFileMenu();

		// Neu
		mifNew = new JMenuItem(Messages.getString("TransformerJFrame.menu.item.new"), 'n'); //$NON-NLS-1$
		MenuExtensions.setCtrlAccelerator(mifNew, 'N');
		mifNew.addActionListener(new NoAction("New no action"));
		fileMenu.add(mifNew);
		// Oeffnen
		mifOpen = new JMenuItem(Messages.getString("TransformerJFrame.menu.item.open"), //$NON-NLS-1$
			'o');
		MenuExtensions.setCtrlAccelerator(mifOpen, 'O');
		mifOpen.addActionListener(new OpenFileAction("OpenFileAction"));
		fileMenu.add(mifOpen);
		// Speichern
		mifSave = new JMenuItem(Messages.getString("TransformerJFrame.menu.item.save"), //$NON-NLS-1$
			's');
		MenuExtensions.setCtrlAccelerator(mifSave, 'S');
		mifSave.addActionListener(new SaveFileAction(Constants.SAVE));
		fileMenu.add(mifSave);
		// Speichern unter
		mifSaveAs = new JMenuItem(Messages.getString("TransformerJFrame.menu.item.saveas"), //$NON-NLS-1$
			'u');
		MenuExtensions.setCtrlAccelerator(mifSaveAs, 'U');
		mifSaveAs.addActionListener(new SaveFileAction(Constants.SAVE_AS));
		fileMenu.add(mifSaveAs);
		// Separator
		fileMenu.addSeparator();

		// Fullscreen
		JMenuItem jmiToFullScreen;
		jmiToFullScreen = new JMenuItem("Toggle Fullscreen", 'F');
		jmiToFullScreen.addActionListener(
			new ToggleFullScreenAction("Fullscreen", CharEditorApplicationFrame.getInstance())
			{

				/**
				 * {@inheritDoc}
				 */
				@Override
				public void actionPerformed(final ActionEvent e)
				{
					ScreenSizeExtensions.toggleFullScreen(CharEditorApplicationFrame.getInstance());
				}
			});
		jmiToFullScreen
			.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, InputEvent.ALT_DOWN_MASK));
		fileMenu.add(jmiToFullScreen);
		// Exit
		JMenuItem jmiExit;
		jmiExit = new JMenuItem("Exit", 'E');
		jmiExit.addActionListener(new ExitApplicationAction("Exit"));
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		fileMenu.add(jmiExit);

		return fileMenu;
	}

	@Override
	protected String newLabelTextApplicationName()
	{
		return Messages.getString("InfoJPanel.application.name.value");
	}

	@Override
	protected String newLabelTextCopyright()
	{
		return Messages.getString("InfoJPanel.copyright.value");
	}

	@Override
	protected String newLabelTextLabelApplicationName()
	{
		return Messages.getString("InfoJPanel.application.name.key");
	}

	@Override
	protected String newLabelTextLabelCopyright()
	{
		return Messages.getString("InfoJPanel.copyright.key");
	}

	@Override
	protected String newLabelTextLabelVersion()
	{
		return Messages.getString("InfoJPanel.version.key");
	}

	@Override
	protected String newLabelTextVersion()
	{
		return Messages.getString("InfoJPanel.version.value");
	}

	@Override
	protected String newTextWarning()
	{
		return Messages.getString("InfoJPanel.warning");
	}

	@Override
	protected String onNewLicenseText()
	{
		final Resource resource = SpringBootSwingApplication.ctx
			.getResource("classpath:LICENSE.txt");
		final StringBuilder license = new StringBuilder();
		try (InputStream is = resource.getInputStream())
		{
			String thisLine;
			final BufferedReader br = new BufferedReader(new InputStreamReader(is));
			while ((thisLine = br.readLine()) != null)
			{
				license.append(thisLine);
				license.append("\n");
			}
		}
		catch (final IOException e)
		{
			log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
		return license.toString();
	}

}
