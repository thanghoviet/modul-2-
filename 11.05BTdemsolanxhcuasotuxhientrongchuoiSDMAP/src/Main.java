

import java.util.Scanner;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map= new TreeMap<Character, Integer>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the key:");
        String Word;
        Word = scanner.nextLine();
        String format=Word.toUpperCase();
        System.out.println(format);
        for (int i = 0; i < format.length(); i++) {
            char thisWord = format.charAt(i);
            if (thisWord == ' ') {
                continue;
            }
            if (!map.containsKey(thisWord)) {
                map.put(thisWord, 1);
            } else {
                map.put(thisWord, map.get(thisWord) + 1);
            }
        }
        for (Character character : map.keySet()) {
            System.out.println(character + ": " + map.get(character));
        }
    }
}
