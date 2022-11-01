package io.github.astrapi69.greekchareditor.action;

import io.github.astrapi69.greekchareditor.util.Constants;
import io.github.astrapi69.greekchareditor.util.ClipboardUtils;
import io.github.astrapi69.greekchareditor.CharEditorApplicationFrame;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InputTACopyHtmlEntitys2ClipboardAction extends AbstractAction implements Constants
{

	public InputTACopyHtmlEntitys2ClipboardAction(String name)
	{
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		CharEditorApplicationFrame frame = CharEditorApplicationFrame.getInstance();
		JTextArea textAreaInput = frame.getApplicationPanel().getJtaInput();
		JTextArea textAreaHtmlEntitys = frame.getApplicationPanel().getJtaHtmlEntitys();
		ClipboardUtils.copy2Clipboard(textAreaInput, textAreaHtmlEntitys, false);

	}

}
