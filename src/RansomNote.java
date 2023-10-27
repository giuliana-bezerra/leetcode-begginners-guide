import java.util.HashMap;

public class RansomNote {
  public static void main(String[] args) {
    var ransomNote = "aa";
    var magazine = "aba";

    System.out.println(new Solution().canConstruct(ransomNote, magazine));
  }
}

class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    var hashMap = new HashMap<Character, Integer>();

    // Count characters
    for (char magazineCh : magazine.toCharArray()) {
      var currentCounter = hashMap.getOrDefault(magazineCh, 0);
      hashMap.put(magazineCh, currentCounter + 1);
    }

    // Consume characters
    for (char ransomNoteCh : ransomNote.toCharArray()) {
      var charCount = hashMap.get(ransomNoteCh);
      if (charCount != null && charCount > 0)
        hashMap.put(ransomNoteCh, charCount - 1);
      else
        return false;
    }

    return true;
  }
}