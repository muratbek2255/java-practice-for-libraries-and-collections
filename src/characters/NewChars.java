package characters;

public class NewChars {
    public static void main(String[] args) {
        char chrs[] = {'1', 'g', 'j', 'y', '?'};

        for (int i = 0; i < chrs.length; i++) {
            if(Character.isDigit(chrs[i])) System.out.println(chrs[i]);
            if(Character.isAlphabetic(chrs[i])) System.out.println(chrs[i]);
        }
    }
}
