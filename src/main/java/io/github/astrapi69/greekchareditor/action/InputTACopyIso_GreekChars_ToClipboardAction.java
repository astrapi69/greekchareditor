package io.github.astrapi69.greekchareditor.action;

import io.github.astrapi69.greekchareditor.util.ClipboardUtils;
import io.github.astrapi69.greekchareditor.CharEditorApplicationFrame;
import io.github.astrapi69.greekchareditor.util.Constants;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InputTACopyIso_GreekChars_ToClipboardAction extends AbstractAction implements Constants
{

	public InputTACopyIso_GreekChars_ToClipboardAction(String name)
	{
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		CharEditorApplicationFrame frame = CharEditorApplicationFrame.getInstance();
		JTextArea textAreaPreview = frame.getApplicationPanel().getJtaPreview();
		ClipboardUtils.copyToClipboard(textAreaPreview);

	}

}
