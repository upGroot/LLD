package LLD.WordProcessor;

public class LetterImpl implements Letter{
    private Character letter;
    private String font;
    private int fontSize;

    public LetterImpl(Character letter, String font, int fontSize) {
        this.letter = letter;
        this.font = font;
        this.fontSize = fontSize;
    }

    public Character getLetter() {
        return letter;
    }

    public String getFont() {
        return font;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public void display(int x, int y) {
        System.out.println(letter + " with font size: " + fontSize + " and font used is : " + font);
    }
}
