package io.github.astrapi69.greekchareditor.action;

import io.github.astrapi69.greekchareditor.util.Constants;
import io.github.astrapi69.greekchareditor.util.ClipboardUtils;
import io.github.astrapi69.greekchareditor.CharEditorApplicationFrame;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InputTACopyIso_8859_7_ToClipboardAction extends AbstractAction implements Constants
{

	public InputTACopyIso_8859_7_ToClipboardAction(String name)
	{
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		CharEditorApplicationFrame frame = CharEditorApplicationFrame.getInstance();
		JTextArea textAreaInput = frame.getApplicationPanel().getJtaInput();
		JTextArea textAreaISO_8859_7 = frame.getApplicationPanel().getJtaIso8859_7();
		ClipboardUtils.copy2Clipboard(textAreaInput, textAreaISO_8859_7, false);

	}

}
