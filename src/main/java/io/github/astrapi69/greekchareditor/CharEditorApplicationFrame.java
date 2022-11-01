package io.github.astrapi69.greekchareditor;

import io.github.astrapi69.file.create.DirectoryFactory;
import io.github.astrapi69.greekchareditor.panels.ApplicationPanel;
import io.github.astrapi69.model.BaseModel;
import io.github.astrapi69.swing.base.ApplicationPanelFrame;
import io.github.astrapi69.swing.base.BaseDesktopMenu;
import io.github.astrapi69.swing.base.BasePanel;
import io.github.astrapi69.swing.layout.ScreenSizeExtensions;
import io.github.astrapi69.swing.plaf.LookAndFeels;
import lombok.Getter;
import lombok.NonNull;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import java.awt.Component;
import java.io.File;

public class CharEditorApplicationFrame extends ApplicationPanelFrame<ApplicationModelBean>
{

	public static final String APPLICATION_NAME = "char-editor";
	@Getter
	ApplicationPanel applicationPanel;
	@Getter
	JFileChooser jfileChooser;

	private static CharEditorApplicationFrame instance;

	public static CharEditorApplicationFrame getInstance()
	{
		return instance;
	}

	public CharEditorApplicationFrame()
	{
		super(Messages.getString("mainframe.title"));
	}

	@Override
	protected String newIconPath()
	{
		return Messages.getString("global.icon.app.path");
	}

	protected String getIconPath()
	{
		return Messages.getString("global.icon.app.path", "img/icon.png");
	}

	@Override
	protected BasePanel<ApplicationModelBean> newMainComponent()
	{
		ApplicationPanel applicationPanel = new ApplicationPanel();
		setModel(applicationPanel.getModel());
		return applicationPanel;
	}

	@Override
	protected void onBeforeInitialize()
	{
		if (instance == null)
		{
			instance = this;
		}
		// initialize model and model object
		super.onBeforeInitialize();
	}

	@Override
	protected String newApplicationName()
	{
		return Messages.getString("mainframe.project.name",
			CharEditorApplicationFrame.APPLICATION_NAME);
	}

	@Override
	protected JMenu newDesktopMenu(@NonNull Component applicationFrame)
	{
		return new DesktopMenu(applicationFrame);
	}

	@Override
	protected void onAfterInitialize()
	{
		super.onAfterInitialize();
		jfileChooser = new JFileChooser();
		applicationPanel = (ApplicationPanel)getMainComponent();
		setTitle(Messages.getString("mainframe.title"));
		setDefaultLookAndFeel(LookAndFeels.NIMBUS, this);
		this.setSize(ScreenSizeExtensions.getScreenWidth(), ScreenSizeExtensions.getScreenHeight());
	}

	@Override
	protected File newConfigurationDirectory(final @NonNull String parent,
		final @NonNull String child)
	{
		String configurationDirectoryName = "greekchareditor";
		File applicationConfigurationDirectory = new File(
			super.newConfigurationDirectory(parent, child), configurationDirectoryName);
		if (!applicationConfigurationDirectory.exists())
		{
			applicationConfigurationDirectory.mkdir();
		}
		return applicationConfigurationDirectory;
	}

	@Override
	protected LookAndFeels newLookAndFeels()
	{
		return LookAndFeels.METAL;
	}

}
