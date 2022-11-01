package io.github.astrapi69.greekchareditor.action;

import io.github.astrapi69.greekchareditor.CharEditorApplicationFrame;
import io.github.astrapi69.greekchareditor.util.Constants;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class InputTAClearAction extends AbstractAction implements Constants
{


	public InputTAClearAction(String name)
	{
		super(name);
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		CharEditorApplicationFrame frame = CharEditorApplicationFrame.getInstance();
		JTextArea textAreaInput = frame.getApplicationPanel().getJtaInput();
		JTextArea textAreaPreview = frame.getApplicationPanel().getJtaPreview();
		JTextArea textAreaHtmlEntitys = frame.getApplicationPanel().getJtaHtmlEntitys();
		JTextArea textAreaISO_8859_7 = frame.getApplicationPanel().getJtaIso8859_7();
		JTextArea textAreaUnicode = frame.getApplicationPanel().getJtaUnicode();
		clearJTextAreas(textAreaInput, textAreaPreview, textAreaHtmlEntitys, textAreaISO_8859_7,
			textAreaUnicode);


	}


	/**
	 * Clear j text areas.
	 *
	 * @param textAreaInput
	 *            the text area input
	 * @param textAreaPreview
	 *            the text area preview
	 * @param textAreaHtmlEntitys
	 *            the text area html entitys
	 * @param textAreaISO_8859_7
	 *            the text area is o_8859_7
	 * @param textAreaUnicode
	 *            the text area unicode
	 */
	private void clearJTextAreas(JTextArea textAreaInput, JTextArea textAreaPreview,
		JTextArea textAreaHtmlEntitys, JTextArea textAreaISO_8859_7, JTextArea textAreaUnicode)
	{
		textAreaInput.replaceRange(EMPTYSTRING, 0, textAreaInput.getText().length());
		textAreaPreview.replaceRange(EMPTYSTRING, 0, textAreaPreview.getText().length());
		textAreaHtmlEntitys.replaceRange(EMPTYSTRING, 0, textAreaHtmlEntitys.getText().length());
		textAreaISO_8859_7.replaceRange(EMPTYSTRING, 0, textAreaISO_8859_7.getText().length());
		textAreaUnicode.replaceRange(EMPTYSTRING, 0, textAreaUnicode.getText().length());
	}

}
