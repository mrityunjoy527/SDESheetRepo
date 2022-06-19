package sdeSheetQues;

class Node {
    Node[] links;
    boolean fl;
    Node() {
        links = new Node[26];
        fl = false;
    }
    boolean containsKey(char c) {
        return links[c-'a'] != null;
    }
    void put(char c, Node node) {
        links[c-'a'] = node;
    }
    Node get(char c) {
        return links[c-'a'];
    }
}
public class Trie {
    static Node root;
    Trie() {
        root = new Node();
    }
    public static void insert(String word) {
        Node node = root;
        for(char c: word.toCharArray()) {
            if(!node.containsKey(c)) {
                node.put(c, new Node());
            }
            node = node.get(c);
        }
        node.fl = true;
    }
    public static boolean search(String word) {
        Node node = root;
        for(char c: word.toCharArray()) {
            if(!node.containsKey(c)) {
                return false;
            }
            node = node.get(c);
        }
        return node.fl;
    }
    public static boolean startsWith(String pref) {
        Node node = root;
        for(char c: pref.toCharArray()) {
            if(!node.containsKey(c)) {
                return false;
            }
            node = node.get(c);
        }
        return true;
    }
}
