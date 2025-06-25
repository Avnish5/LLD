package z_a_27_flyweight_design_pattern.WordProcessor;

// Flyweight class: stores shared data (intrinsic)
class CharacterGlyph {
    private final char symbol;
    private final String font;
    private final int size;

    public CharacterGlyph(char symbol, String font, int size) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
    }

    // Display uses extrinsic state (position, color)
    public void display(int x, int y, String color) {
        System.out.println("Character: '" + symbol + "' Font: " + font +
                " Size: " + size + " at (" + x + ", " + y + ") Color: " + color);
    }
}

