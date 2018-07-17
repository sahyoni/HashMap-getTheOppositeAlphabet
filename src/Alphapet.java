import java.util.HashMap;

class Alphapet {

    private HashMap<Character, Character> hashmap;

    Alphapet() {
        hashmap = new HashMap<>();
        hashmap.put('a', 'ß');
        hashmap.put('b', 'ü');
        hashmap.put('c', 'ö');
        hashmap.put('d', 'ä');
        hashmap.put('e', 'z');
        hashmap.put('f', 'y');
        hashmap.put('g', 'x');
        hashmap.put('h', 'w');
        hashmap.put('i', 'v');
        hashmap.put('j', 'u');
        hashmap.put('k', 't');
        hashmap.put('l', 's');
        hashmap.put('m', 'r');
        hashmap.put('n', 'q');
        hashmap.put('o', 'p');
        hashmap.put('p', 'o');
        hashmap.put('q', 'n');
        hashmap.put('r', 'm');
        hashmap.put('s', 'l');
        hashmap.put('t', 'k');
        hashmap.put('u', 'j');
        hashmap.put('v', 'i');
        hashmap.put('w', 'h');
        hashmap.put('x', 'g');
        hashmap.put('y', 'f');
        hashmap.put('z', 'e');
        hashmap.put('ä', 'd');
        hashmap.put('ö', 'c');
        hashmap.put('ü', 'b');
        hashmap.put('ß', 'a');
    }

    void printVauesOfAlphapet(String line) {

        char[] linePart = line.toCharArray();
        for (char key : linePart) {
            System.out.print(hashmap.get(key));

        }
    }

}
