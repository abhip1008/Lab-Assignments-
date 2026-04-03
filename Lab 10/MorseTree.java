import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;;
/*
 * MorseTree.java
 * CSSSKL 143 Binary Search Tree Lab
 * Author: Rob Nash
 * 
 * This class reads in data from a text file ("data.txt") and populates a binary tree with an 
 * ordering constraint.  See the lab instructions for more information, but in general, dots go right 
 * and dashes go left when constructing or traversing a Morse code tree.  Search for //TODO
 * in the code to see what code you have to implement.
 * 
 * Start with the constructor. In your constructor read each line in from the textfile first, 
 * calling add() for each {letter, morseCodeStr} pair.
 * 
 */

public class MorseTree {

    // root of the tree
    private TreeNode<Character> root;

    // Constructor: builds tree from data.txt
    public MorseTree() {
        root = null;

        try {
            Scanner fin = new Scanner(new File("data.txt"));

            while (fin.hasNextLine()) {
                String line = fin.nextLine().trim();
                if (line.length() > 0) {
                    String[] parts = line.split(" ");
                    char letter = parts[0].charAt(0);
                    String morse = parts[1];

                    add(morse, letter);
                }
            }
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void add(String morseStr, char letter) {
        root = insertInSubtree(morseStr, letter, root);
    }

    // Insert recursively
    private TreeNode<Character> insertInSubtree(String morseStr, char letter, TreeNode<Character> subtree) {

        // base case: create node if null
        if (subtree == null) {
            subtree = new TreeNode<>();
        }

        // base case: end of string, store letter
        if (morseStr.length() == 0) {
            subtree.data = letter;
            return subtree;
        }

        char symbol = morseStr.charAt(0);
        String rest = morseStr.substring(1);

        if (symbol == '.') {
            subtree.right = insertInSubtree(rest, letter, subtree.right);
        } else { // '-'
            subtree.left = insertInSubtree(rest, letter, subtree.left);
        }

        return subtree;
    }

    public Character translate(String morseStr) {
        return findInSubtree(morseStr, root);
    }

    // Find recursively
    private Character findInSubtree(String morseStr, TreeNode<Character> subtree) {

        // base case: dead end
        if (subtree == null) {
            return null;
        }

        // base case: reached node
        if (morseStr.length() == 0) {
            return (Character) subtree.data;
        }

        char symbol = morseStr.charAt(0);
        String rest = morseStr.substring(1);

        if (symbol == '.') {
            return findInSubtree(rest, subtree.right);
        } else { // '-'
            return findInSubtree(rest, subtree.left);
        }
    }

    // Translate multiple Morse tokens
    public String translateString(String tokens) {
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(tokens);

        while (scanner.hasNext()) {
            String morse = scanner.next();
            Character letter = translate(morse);

            if (letter != null) {
                result.append(letter);
            }
        }

        scanner.close();
        return result.toString();
    }

    // OPTIONAL (not required)
    public String toMorseCode(Character c) {
        return "You wish.";
    }

    public String toString() {
        return inorderWalk();
    }

    private String inorderWalk() {
        return "Another wish.";
    }

    public static void main(String[] args) {
        MorseTree mt = new MorseTree();

        System.out.println(mt.translate("..."));       // S
        System.out.println(mt.translate("---"));       // O
        System.out.println(mt.translate("... --- ...")); // null (invalid single token)

        System.out.println(mt.translateString("... --- ...")); // SOS
    }

    // Inner TreeNode class
    private class TreeNode<Character> {
        Object data;
        TreeNode<Character> left;
        TreeNode<Character> right;

        public TreeNode() {
            data = null;
            left = null;
            right = null;
        }
    }
}
