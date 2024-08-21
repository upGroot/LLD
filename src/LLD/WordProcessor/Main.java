package LLD.WordProcessor;

public class Main {
    public static void main(String[] args){
      Letter obj = LetterFactory.getLetterObj('t');
      obj.display(1, 2);
    }
}
