package gr.characters.constants;

import de.alpharogroup.collections.list.ListFactory;
import de.alpharogroup.xml.ObjectToXmlExtensions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExportAlphabetArray {

    @Test
    public void extractGreekAlphabet()
//            throws JsonProcessingException
    {
        List<AlphabetLetter> greekAlphabet = ListFactory.newArrayList();
        for (String[] letter : GreekAlphabet.greekAlphabet) {
            greekAlphabet.add(AlphabetLetter.of(letter));
        }
//        String xmlWithJackson = ObjectToXmlExtensions.toXml
    }
}
