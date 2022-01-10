import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLeftWordsTest {
    ReverseLeftWords reverseLeftWords = new ReverseLeftWords();

    @ParameterizedTest
    @MethodSource("getReverseLeftWords")
    void testForReverseLeftWords(String s, int n, String target) {
        assertEquals(target, reverseLeftWords.reverseLeftWords(s, n));
    }

    static Stream<Arguments> getReverseLeftWords() {
        return Stream.of(Arguments.of("abcdefg",2, "cdefgab"),
                Arguments.of("lrloseumgh",6, "umghlrlose"));

    }
}
