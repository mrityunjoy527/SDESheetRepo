package sdeSheetQues;

class Nodes{
    Nodes links[] = new Nodes[26];
    int cntEndsWith = 0;
    int cntPrefix = 0;
    public Nodes(){

    }
    boolean containsKey(char c){
        return links[c - 'a'] != null;
    }
    void put(char c, Nodes node){
        links[c - 'a'] = node;
    }
    Nodes get(char c){
        return links[c - 'a'];
    }
    void increaseEndsWith(){
        cntEndsWith++;
    }
    void increasePrefix(){
        cntPrefix++;
    }
    void reduceEndsWith(){
        cntEndsWith--;
    }
    void reducePrefix(){
        cntPrefix--;
    }
    int getEnd(){
        return cntEndsWith;
    }
    int getPrefix(){
        return cntPrefix;
    }
}
public class Trie2 {
    private static Nodes root;
    Trie2(){
        root = new Nodes();
    }
    void insert(String word){
        Nodes node = root;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(!node.containsKey(c)){
                node.put(c, new Nodes());
            }
            node = node.get(c);
            node.increasePrefix();
        }
        node.increaseEndsWith();
    }
    int countWordsEqualTo(String word){
        Nodes node = root;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.containsKey(c)){
                node = node.get(c);
            }else{
                return 0;
            }
        }
        return node.getEnd();
    }
    int countWordsStartingWith(String word){
        Nodes node = root;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.containsKey(c)){
                node = node.get(c);
            }else return 0;
        }
        return node.getPrefix();
    }
    void erase(String word){
        Nodes node = root;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(node.containsKey(c)){
                node = node.get(c);
                node.reducePrefix();
            }else return;
        }
        node.reduceEndsWith();
    }
}

