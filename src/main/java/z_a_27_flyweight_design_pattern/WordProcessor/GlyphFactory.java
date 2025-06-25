package z_a_27_flyweight_design_pattern.WordProcessor;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory: manages shared CharacterGlyphs
public class GlyphFactory {

    private static final Map<String, CharacterGlyph> glyphs = new HashMap<>();

    public static CharacterGlyph getGylph(char symbol, String font, int size) {
        String key = symbol + ":" + font + ":" + size;
        glyphs.putIfAbsent(key, new CharacterGlyph(symbol, font, size));
        return glyphs.get(key);
    }
}
