package gr.characters.constants;

import de.alpharogroup.collections.array.ArrayFactory;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AlphabetLetter {
    String utf8;
    String latin;
    String html;
    String iso;

    public static AlphabetLetter of(final @NonNull String[] values){
        if(values.length != 4) {
            throw new RuntimeException("value length is " + values.length + ", but must be 4");
        }
        return AlphabetLetter.builder()
                .utf8(values[0])
                .latin(values[1])
                .html(values[2])
                .iso(values[3])
                .build();
    }

    public String[] toStringArray() {
        return ArrayFactory.newArray(this.utf8, this.latin, this.html, this.iso);
    }



}
