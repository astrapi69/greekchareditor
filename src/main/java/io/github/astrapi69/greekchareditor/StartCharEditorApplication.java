package io.github.astrapi69.greekchareditor;

import io.github.astrapi69.swing.layout.ScreenSizeExtensions;

public class StartCharEditorApplication
{

	/**
	 * The main method that start this {@link CharEditorApplicationFrame}
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		CharEditorApplicationFrame frame = new CharEditorApplicationFrame();
		while (!frame.isVisible())
		{
			ScreenSizeExtensions.showFrame(frame);
		}
	}
}
