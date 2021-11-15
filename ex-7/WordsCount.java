import java.util.HashSet;
import java.util.Set;

class Result {
    
    private static final Set<Character> ADMISSIBLE_CHARACTERS = new HashSet<>();
    
    private static final Set<Character> ENDING = new HashSet<>();
    
    public static void initialize() {
        ADMISSIBLE_CHARACTERS.add('-');
        ADMISSIBLE_CHARACTERS.add('a');
        ADMISSIBLE_CHARACTERS.add('b');
        ADMISSIBLE_CHARACTERS.add('c');
        ADMISSIBLE_CHARACTERS.add('d');
        ADMISSIBLE_CHARACTERS.add('e');
        ADMISSIBLE_CHARACTERS.add('f');
        ADMISSIBLE_CHARACTERS.add('g');
        ADMISSIBLE_CHARACTERS.add('h');
        ADMISSIBLE_CHARACTERS.add('i');
        ADMISSIBLE_CHARACTERS.add('j');
        ADMISSIBLE_CHARACTERS.add('k');
        ADMISSIBLE_CHARACTERS.add('l');
        ADMISSIBLE_CHARACTERS.add('m');
        ADMISSIBLE_CHARACTERS.add('n');
        ADMISSIBLE_CHARACTERS.add('o');
        ADMISSIBLE_CHARACTERS.add('p');
        ADMISSIBLE_CHARACTERS.add('q');
        ADMISSIBLE_CHARACTERS.add('r');
        ADMISSIBLE_CHARACTERS.add('s');
        ADMISSIBLE_CHARACTERS.add('t');
        ADMISSIBLE_CHARACTERS.add('u');
        ADMISSIBLE_CHARACTERS.add('v');
        ADMISSIBLE_CHARACTERS.add('w');
        ADMISSIBLE_CHARACTERS.add('x');
        ADMISSIBLE_CHARACTERS.add('y');
        ADMISSIBLE_CHARACTERS.add('z');
        ADMISSIBLE_CHARACTERS.add('A');
        ADMISSIBLE_CHARACTERS.add('B');
        ADMISSIBLE_CHARACTERS.add('C');
        ADMISSIBLE_CHARACTERS.add('D');
        ADMISSIBLE_CHARACTERS.add('E');
        ADMISSIBLE_CHARACTERS.add('F');
        ADMISSIBLE_CHARACTERS.add('G');
        ADMISSIBLE_CHARACTERS.add('H');
        ADMISSIBLE_CHARACTERS.add('I');
        ADMISSIBLE_CHARACTERS.add('J');
        ADMISSIBLE_CHARACTERS.add('K');
        ADMISSIBLE_CHARACTERS.add('L');
        ADMISSIBLE_CHARACTERS.add('M');
        ADMISSIBLE_CHARACTERS.add('N');
        ADMISSIBLE_CHARACTERS.add('O');
        ADMISSIBLE_CHARACTERS.add('P');
        ADMISSIBLE_CHARACTERS.add('Q');
        ADMISSIBLE_CHARACTERS.add('R');
        ADMISSIBLE_CHARACTERS.add('S');
        ADMISSIBLE_CHARACTERS.add('T');
        ADMISSIBLE_CHARACTERS.add('U');
        ADMISSIBLE_CHARACTERS.add('V');
        ADMISSIBLE_CHARACTERS.add('W');
        ADMISSIBLE_CHARACTERS.add('X');
        ADMISSIBLE_CHARACTERS.add('Y');
        ADMISSIBLE_CHARACTERS.add('Z');
        
        ENDING.addAll(ADMISSIBLE_CHARACTERS);
        ENDING.add('.');
        ENDING.add(',');
        ENDING.add('?');
        ENDING.add('!');
    }

    public static int howMany(String sentence) {
        int count = 0;
        
        String[] chunks = sentence.split(" ");
        
        for (String chunk : chunks) {
            if (chunk.isEmpty())
                continue; 
            
            boolean ok = true;
            for (int i = 0; i < chunk.length() - 1; i++)
                if (!ADMISSIBLE_CHARACTERS.contains(chunk.charAt(i))) 
                    ok = false;
            if (!ENDING.contains(chunk.charAt(chunk.length() - 1)) ) 
                ok = false;
            
            if (ok)
                count++;
        }
        
        return count;
    }
}