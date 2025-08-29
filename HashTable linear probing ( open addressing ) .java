// linear probing 

import java.util.Scanner;

class HashTable{
	
	static class Entry{
		private int key; // roll
		private String value; // name
		
		public Entry(int key , String value) {
			this.key = key;
			this.value = value;
		}
	}
	// hashtable fields
	private static final int NSLOTS = 10;
	private Entry[] table;
	
	// hashtable methods
	public HashTable() {
		table = new Entry[NSLOTS];
	}
	
	// index calculation (hash function)
	public int hash(int key) {
		int index = key % NSLOTS;
		return index;
	}
	
	// rehashing function
	public int rehash(int key , int probe) {
		
		int CONST = 1;
		int index = (hash(key) + probe * CONST) % NSLOTS;
		return index;
	}
	
	// add key value pair in hashtable
	public void put(int key , String value) {
		int probe = 1;
		// calculate index

		int index = hash(key);
		
		while(true) {
			if(table[index] == null) {
				Entry en = new Entry(key, value);
				table[index] = en;
				return;
			}
			
			// if key is present on index ( key is matched on index kay ) overwrite value
			Entry en = table[index];
			if(key == en.key) {
				en.value = value;
				return;
			}
			
			// if key is not matched on index , again calculate index using rehash
			index = rehash(key, probe);
			probe++;
		}// repeat process
	}
	
	// find key value pair in hashtable
	public String get(int key) {
		
		int probe = 1;
		// calculate index
		int index = hash(key);
		
		while(true) {
			
			// if no any key is found in table
			if(table[index] == null) 
				return null;
			
			// if kay is matched on index return value
			Entry en = table[index];
			if(key == en.key) {
				return en.value;
			}
			
			// if key is not matched on index , again calculate index using rehash
			index = rehash(key, probe);
			probe++;
		}// repeat process
	}
	
	// display all 
	public void display() {
		System.out.println("\n--- HashTable Contents ---");
		for(int i = 0; i < NSLOTS; i++) {
			if(table[i] != null) {
				System.out.println("Key: " + table[i].key + " , Value: " + table[i].value+ "index: " +i);
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
		ht.put(58, "item4"); // if key duplicates, the value should overwrite
		
		ht.display();
		System.out.println();
		
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
