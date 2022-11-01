package io.github.astrapi69.greekchareditor.action;


import io.github.astrapi69.greekchareditor.CharEditorApplicationFrame;
import io.github.astrapi69.greekchareditor.util.Constants;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 * The Class NewFileAction.
 */
public class SaveFileAction extends AbstractAction implements Constants
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	String dialogTitle;

	/**
	 * Instantiates a new new file action.
	 *
	 * @param name
	 *            the name
	 */
	public SaveFileAction(String name)
	{
		super(name);
		this.dialogTitle = name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		CharEditorApplicationFrame frame = CharEditorApplicationFrame.getInstance();
		JTextArea textAreaInput = frame.getApplicationPanel().getJtaInput();
		JTextArea textAreaPreview = frame.getApplicationPanel().getJtaPreview();
		JTextArea textAreaHtmlEntitys = frame.getApplicationPanel().getJtaHtmlEntitys();
		JTextArea textAreaIso_8859_7 = frame.getApplicationPanel().getJtaIso8859_7();
		saveFile(textAreaInput, textAreaPreview, textAreaHtmlEntitys, textAreaIso_8859_7);
	}


	private void saveFile(JTextArea textAreaInput, JTextArea textAreaPreview,
		JTextArea textAreaHtmlEntitys, JTextArea textAreaIso_8859_7)
	{
		CharEditorApplicationFrame frame = CharEditorApplicationFrame.getInstance();
		JFileChooser fc = frame.getJfileChooser();
		fc.setDialogTitle(dialogTitle);
		int returnVal = fc.showSaveDialog(frame);
		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			File savedFile = null;
			String filename = file.getAbsoluteFile().toString();
			if (filename.endsWith(FILE_SUFFIX_GRC))
			{
				savedFile = new File(filename);
			}
			else
			{
				savedFile = new File(filename + FILE_SUFFIX_GRC);
			}

			SaveModel model = new SaveModel();
			model.setInputFromTAPreview(textAreaPreview.getText());
			model.setInputFromTAInput(textAreaInput.getText());
			model.setInputFromTAHtmlEntitys(textAreaHtmlEntitys.getText());
			model.setInputFromTAIso_8859_7(textAreaIso_8859_7.getText());
			ObjectOutputStream oos = null;
			try
			{
				oos = new ObjectOutputStream(new FileOutputStream(savedFile));
				oos.writeObject(model);
				oos.close();
			}
			catch (IOException e1)
			{
				System.err.println("Error by saving the editors.");
			}
			finally
			{
				try
				{
					oos.close();
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		}
		else
		{
			// Do nothing
			// System.err.println("Abbrechen wurde gedr�ckt.");
		}
	}

}
