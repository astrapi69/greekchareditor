package gr.characters.constants;

import io.github.astrapi69.collection.list.ListFactory;
import io.github.astrapi69.file.create.FileFactory;
import io.github.astrapi69.file.create.FileInfo;
import io.github.astrapi69.file.search.PathFinder;
import io.github.astrapi69.file.write.WriteFileExtensions;
import io.github.astrapi69.greekchareditor.model.AlphabetLetter;
import io.github.astrapi69.greekchareditor.util.AlphabetLoader;
import io.github.astrapi69.greekchareditor.viewmodel.GreekAlphabet;
import io.github.astrapi69.xml.jackson.ObjectToXmlExtensions;
import io.github.astrapi69.xml.jackson.XmlToObjectExtensions;
import io.github.astrapi69.xml.jackson.factory.JavaTypeFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExportAlphabetArray
{


	@Test
	public void extractGreekAlphabet() throws IOException
	{
		List<AlphabetLetter> hellenicAlphabet;
		List<AlphabetLetter> restoredGreekAlphabet;
		hellenicAlphabet = ListFactory.newArrayList();
		for (String[] letter : GreekAlphabet.greekAlphabet)
		{
			hellenicAlphabet.add(AlphabetLetter.of(letter));
		}

		String xml = ObjectToXmlExtensions.toXml(hellenicAlphabet);
		System.out.println(xml);
		restoredGreekAlphabet = XmlToObjectExtensions.toObject(xml,
			JavaTypeFactory.newCollectionType(ArrayList.class, AlphabetLetter.class));
		System.out.println(restoredGreekAlphabet);
		File xmlFile = FileFactory.newFileQuietly(FileInfo.builder()
			.name(AlphabetLoader.HELENIC_ALPHABET_XML)
			.path(PathFinder.getSrcMainResourcesDir().getAbsolutePath()).directory(false).build());
		WriteFileExtensions.string2File(xmlFile, xml, "UTF-8");
	}

	@Test
	public void testRead()
	{
		File xmlFile = FileFactory.newFileQuietly(FileInfo.builder()
			.name(AlphabetLoader.HELENIC_ALPHABET_XML)
			.path(PathFinder.getSrcMainResourcesDir().getAbsolutePath()).directory(false).build());
		List<AlphabetLetter> alphabetLetters = AlphabetLoader.readAlphabetQuietly(xmlFile);
		assertNotNull(alphabetLetters);
	}

}
