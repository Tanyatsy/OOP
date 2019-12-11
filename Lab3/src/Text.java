import java.util.*;

public class Text {
    public static String text = "Vending machines kill 4 times as many people as sharks per year. Fredric Baur invented the Pringles can. When he passed away in 2008, his ashes were buried in one. Psychology is the brain trying to comprehend itself. The average four year-old child asks over four hundred questions a day. Humans shed 40 pounds of skin in their lifetime, completely replacing their outer skin every month.";
    static String words = text.replaceAll("[^A-z| ]", "");


    public static void printWorldLength() {
        //String words = text.replaceAll("[^A-z| ]", "");
        System.out.println(words);
        String[] wordlist = words.split("\\s+");
        System.out.println("Number of words:  " + wordlist.length);
    }

    public static void countSentences() {
        String[] sentences = text.split("[!?.;]+");
        System.out.println("Number of sentences: " + sentences.length);
    }

    public static void countLetters() {
        String letters = text.replaceAll("[^A-z]", "");
        System.out.println("Number of letters: " + letters.length());

    }

    public static void countVowelsAndConsonants() {
        text = text.toLowerCase();
        int vowels = 0, consonants = 0, spaces = 0;
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            } else if (ch == ' ') {
                ++spaces;
            }
        }
        System.out.println("Number of vowels:" + vowels + "\n " + "Number of consonants:" + consonants + "\n" + "Number of spaces:" + spaces);
    }

    public static void repeatedWords() {

        String[] thesameword = words.toLowerCase().split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        for (String word : thesameword) {
            Integer count = wordCounts.get(word);
            if (count == null) {
                count = 0;
            }
            wordCounts.put(word, count + 1);
        }
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);
        System.out.println(wordCounts);

    }

    public static void longestWord() {
        String[] longw = words.split(" ");
        String longword = " ";
        System.out.println(Arrays.toString(longw));
        for (int i = 0; i < longw.length; i++) {
            //for (int j = i + 1; j < longw.length; j++) {
            if (longw[i].length() >= longword.length()) {
                longword = longw[i];
            }

        }

        System.out.println(longword+" is longest word with "+longword.length()+" characters");
   }
   public static void topFive(){
   HashMap<String, Integer> map = new HashMap<String, Integer>();
    ArrayList<String> arrayList = new ArrayList(Arrays.asList(text.split(" ")));
        for (int i = 1; i < 6; i++) {
        int maxValue = 0;

        for (String word : arrayList) {
            Integer number = map.get(word);
            if (number == null) number = 1;
            else number = ++number;
            map.put(word, number);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
            }
        }
        String key = getKeyFromValue(map, maxValue);
        System.out.println(" Top " + i + " = " + key);
        map.remove(key);
        arrayList.removeAll(Collections.singleton(key));
    }
}

    public static String getKeyFromValue(Map<String, Integer> hashMap, Integer value) {
        for (String word : hashMap.keySet()) {
            if (hashMap.get(word).equals(value)) {
                return word;
            }
        }
        return null;
    }

}



