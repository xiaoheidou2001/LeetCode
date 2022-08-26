public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
    }
}

class Trie {

    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        this.children = new Trie[26];
        this.isEnd = false;
    }

    public void insert(String word) {
        Trie tmpNode = this;
        for(int i = 0;i < word.length();i ++){
            int tmpIdx = word.charAt(i) - 'a';
            if(tmpNode.children[tmpIdx] == null){
                tmpNode.children[tmpIdx] = new Trie();
            }
            tmpNode = tmpNode.children[tmpIdx];
        }
        tmpNode.isEnd = true;
    }

    public boolean search(String word) {
        Trie tmpNode = this;
        for(int i  = 0;i < word.length();i ++){
            int tmpIdx = word.charAt(i) - 'a';
            if(tmpNode.children[tmpIdx] == null) return false;
            tmpNode = tmpNode.children[tmpIdx];
        }
        if(tmpNode.isEnd) return true;
        else return false; 
    }

    public boolean startsWith(String prefix) {
        Trie tmpNode = this;
        for(int i  = 0;i < prefix.length();i ++){
            int tmpIdx = prefix.charAt(i) - 'a';
            if(tmpNode.children[tmpIdx] == null) return false;
            tmpNode = tmpNode.children[tmpIdx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

// class Trie {
//     private Trie[] children;
//     private boolean isEnd;

//     public Trie() {
//         children = new Trie[26];
//         isEnd = false;
//     }
    
//     public void insert(String word) {
//         Trie node = this;
//         for (int i = 0; i < word.length(); i++) {
//             char ch = word.charAt(i);
//             int index = ch - 'a';
//             if (node.children[index] == null) {
//                 node.children[index] = new Trie();
//             }
//             node = node.children[index];
//         }
//         node.isEnd = true;
//     }
    
//     public boolean search(String word) {
//         Trie node = searchPrefix(word);
//         return node != null && node.isEnd;
//     }
    
//     public boolean startsWith(String prefix) {
//         return searchPrefix(prefix) != null;
//     }

//     private Trie searchPrefix(String prefix) {
//         Trie node = this;
//         for (int i = 0; i < prefix.length(); i++) {
//             char ch = prefix.charAt(i);
//             int index = ch - 'a';
//             if (node.children[index] == null) {
//                 return null;
//             }
//             node = node.children[index];
//         }
//         return node;
//     }
// }