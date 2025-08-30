// chaining or bucketing is nothing but a array of linkedlist
// we can use a linkedlist method
// in linkedlist method we can store a multiple a key value pair in same index 
// we cant need to use a rehash function in chaining or bucketing in hash table 

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class HashTable{
	
	static class Entry{
		private int key;
		private String value;
		public Entry(int key , String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private static final int NSLOTS = 10;
	private List<Entry>[] table;
	
	public HashTable() {
		table = new List[NSLOTS];
		
		// initially all list are empty
		for(int i = 0 ; i < table.length ; i++) {
			table[i] = new LinkedList<>();
		}
	}
	
	// add key value pair
	public void put(int key , String value) {
		// find slots
		int index = hash(key);
		
		// get the bucket in the slot and search key in all entries in that bucket
		List<Entry> bucket = table[index];
		for(Entry en : bucket) {
			// if key is found overwrite the value
			if(en.key == key) {
				en.value = value;
				return;
			}
		}
		
		// if key is not found ( in bucket ) , create a new entry and add in that bucket
		Entry en = new Entry (key ,  value);
		bucket.add(en);
	}
	
	// find value for given key from table
	public String get(int key) {
		// find slot 
		int index = hash(key);
		
		// get the bucket in the slot and search key in all entries in that bucket
		List<Entry> bucket = table[index];
		for(Entry en : bucket) {
			// if key is find return value
			if(en.key == key) {
				return en.value;
			}
		}
		// if key is not available in slot return null
		return null;
	}
	
	public int hash(int key) {
		int index = key % NSLOTS;
		return index;
	}
	
	public void displayall() {
	    System.out.println("\n--- HashTable Contents ---");
	    for (int i = 0; i < NSLOTS; i++) {
	        List<Entry> bucket = table[i];
	        if (!bucket.isEmpty()) {
	            System.out.print("Slot " + i + " -> ");
	            for (Entry en : bucket) {
	                System.out.print("[" + en.key + " : " + en.value + "] ");
	            }
	            System.out.println();
	        }
	    }
	}

}

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashTable ht = new HashTable();
		
		ht.put(89, "v1");
		ht.put(18, "v2");
		ht.put(49, "v3");
		ht.put(58, "v4");
		ht.put(29, "v5");
		ht.put(36, "v6");
		
		ht.displayall();
		
		System.out.println("enter a key to find : ");
		int key = sc.nextInt();
		
		String value = ht.get(key);
		if(value == null) {
			System.out.println("not found");
		}
		else {
			System.out.println("found : " +value);
		}
	}

}
