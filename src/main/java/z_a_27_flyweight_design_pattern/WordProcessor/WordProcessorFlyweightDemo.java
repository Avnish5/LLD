package z_a_27_flyweight_design_pattern.WordProcessor;

public class WordProcessorFlyweightDemo {
    public static void main(String[] args) {
        String document = "hello world flyweight pattern example";
        String font = "Arial";
        int size = 12;

        int x = 0;
        int  y = 0;

        for (char c : document.toCharArray()) {
            if (c == ' ')
            {
                x += 5;
                continue;
            }

            CharacterGlyph glyph = GlyphFactory.getGylph(c, font, size);
            String color = (x % 2 == 0) ? "black" : "gray";

            glyph.display(x, y, color);

            x += 10;
        }
    }




}
