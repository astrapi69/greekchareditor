package gr.characters.constants;

import com.thoughtworks.xstream.XStream;
import io.github.astrapi69.collection.list.ListFactory;
import io.github.astrapi69.file.create.FileFactory;
import io.github.astrapi69.file.create.FileInfo;
import io.github.astrapi69.file.search.PathFinder;
import io.github.astrapi69.file.write.WriteFileExtensions;
import io.github.astrapi69.greekchareditor.model.AlphabetLetter;
import io.github.astrapi69.greekchareditor.util.AlphabetLoader;
import io.github.astrapi69.greekchareditor.viewmodel.GreekAlphabet;
import io.github.astrapi69.xstream.XmlToObjectExtensions;
import io.github.astrapi69.xstream.factory.XStreamFactory;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExportAlphabetArray
{


	@Test
	public void extractGreekAlphabet() throws IOException
	{
		List<AlphabetLetter> hellenicAlphabet;
		List<AlphabetLetter> restoredGreekAlphabet;
		Map<String, Class<?>> aliases;
		hellenicAlphabet = ListFactory.newArrayList();
		for (String[] letter : GreekAlphabet.greekAlphabet)
		{
			hellenicAlphabet.add(AlphabetLetter.of(letter));
		}
		aliases = new HashMap<>();
		String lqSimpleName = AlphabetLetter.class.getSimpleName().toLowerCase();
		aliases.put(lqSimpleName, AlphabetLetter.class);

		XStream xStream = XStreamFactory.initializeXStream(new XStream(), aliases);
		xStream
			.allowTypesByWildcard(new String[] { "io.github.astrapi69.greekchareditor.model.**", });
		String xml = io.github.astrapi69.xstream.ObjectToXmlExtensions.toXml(xStream,
			hellenicAlphabet);
		System.out.println(xml);
		restoredGreekAlphabet = XmlToObjectExtensions.toObject(xStream, xml, aliases);
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
