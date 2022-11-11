package io.github.astrapi69.greekchareditor.panels;

import io.github.astrapi69.greekchareditor.model.AlphabetLetter;
import io.github.astrapi69.swing.table.model.BaseTableModel;
import io.github.astrapi69.swing.table.model.TableColumnsModel;

import java.util.List;

public class AlphabetLetterTableModel extends BaseTableModel<AlphabetLetter>
{


	public AlphabetLetterTableModel(List<AlphabetLetter> list, TableColumnsModel columnsModel)
	{
		super(list, columnsModel);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		AlphabetLetter row = getData().get(rowIndex);
		switch (columnIndex)
		{
			case 0 :
				return row.getUtf8();
			case 1 :
				return row.getLatin();
			case 2 :
				return row.getHtml();
			case 3 :
				return row.getIso();
			default :
				return null;
		}
	}
}
