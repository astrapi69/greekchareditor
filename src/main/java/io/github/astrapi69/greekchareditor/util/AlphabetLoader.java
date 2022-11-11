package io.github.astrapi69.greekchareditor.util;

import io.github.astrapi69.file.create.FileFactory;
import io.github.astrapi69.file.create.FileInfo;
import io.github.astrapi69.file.read.ReadFileExtensions;
import io.github.astrapi69.file.search.PathFinder;
import io.github.astrapi69.greekchareditor.model.AlphabetLetter;
import io.github.astrapi69.throwable.RuntimeExceptionDecorator;
import io.github.astrapi69.xml.jackson.XmlToObjectExtensions;
import io.github.astrapi69.xml.jackson.factory.JavaTypeFactory;
import lombok.NonNull;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphabetLoader
{

	public static final String HELENIC_ALPHABET_XML = "helenic-alphabet.xml";

	public static List<AlphabetLetter> readAlphabet(final @NonNull File xmlFile) throws IOException
	{
		List<AlphabetLetter> alphabet;
		Map<String, Class<?>> aliases;
		aliases = new HashMap<>();
		String lqSimpleName = AlphabetLetter.class.getSimpleName().toLowerCase();
		aliases.put(lqSimpleName, AlphabetLetter.class);

		String xml = ReadFileExtensions.readFromFile(xmlFile, Charset.forName("UTF-8"));
		alphabet = RuntimeExceptionDecorator.decorate(() -> XmlToObjectExtensions.toObject(xml,
			JavaTypeFactory.newCollectionType(ArrayList.class, AlphabetLetter.class)));
		return alphabet;
	}

	public static List<AlphabetLetter> readAlphabetQuietly(final @NonNull File xmlFile)
	{
		List<AlphabetLetter> alphabet;
		Map<String, Class<?>> aliases;
		aliases = new HashMap<>();
		String lqSimpleName = AlphabetLetter.class.getSimpleName().toLowerCase();
		aliases.put(lqSimpleName, AlphabetLetter.class);

		String xml = RuntimeExceptionDecorator
			.decorate(() -> ReadFileExtensions.readFromFile(xmlFile, Charset.forName("UTF-8")));

		alphabet = RuntimeExceptionDecorator.decorate(() -> XmlToObjectExtensions.toObject(xml,
			JavaTypeFactory.newCollectionType(ArrayList.class, AlphabetLetter.class)));
		return alphabet;
	}

	public static List<AlphabetLetter> loadHelenicAlphabet()
	{
		File xmlFile = FileFactory.newFileQuietly(FileInfo.builder()
			.name(AlphabetLoader.HELENIC_ALPHABET_XML)
			.path(PathFinder.getSrcMainResourcesDir().getAbsolutePath()).directory(false).build());
		List<AlphabetLetter> alphabetLetters = AlphabetLoader.readAlphabetQuietly(xmlFile);
		return alphabetLetters;
	}

}
