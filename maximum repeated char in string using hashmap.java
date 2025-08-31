import java.util.LinkedHashMap;
import java.util.Map.Entry;

class HashTable{

	public static char maxRepeated(String str) {
		
		LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			Integer count = map.get(ch);
			if(count == null) {
				count = 1;
			}
			else {
				count = count + 1;
			}
			map.put(ch, count);
		}
		System.out.println(map);
		
		// find char with maximum occurrences
		
		int maxcount = 0;
		char maxchar = '\0';
		
		for(Entry<Character, Integer> en : map.entrySet()) {
			if(en.getValue() > maxcount) {
				maxcount = en.getValue();
				maxchar = en.getKey();
			}
		}
		return maxchar;
	}
}

public class Program {

	public static void main(String[] args) {

		HashTable ht = new HashTable();
		
		String str = " abcdabacdacaa";
		char ch = ht.maxRepeated(str);
		System.out.println("max repeated char is : " +ch);
	}

}
