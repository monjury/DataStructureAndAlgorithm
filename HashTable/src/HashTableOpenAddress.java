

public class HashTableOpenAddress<K, V> {

	private Entry<K, V>[] entryArray;
	private int capacity;

	public void put(K key, V value) {
		int location = hash(key);
		while(entryArray[location] != null) {
			if(entryArray[location].getKey() == key) { // If key already exist
				entryArray[location].setValue(value);
				return;
			}
			location++;
		}
		Entry<K, V> entry = new Entry<K, V>(key, value);
		entryArray[location] = entry; // Add entry to next available empty[null] spot
	}
	
	public void get() {
		
	}

	public void remove() {
	
	}
	
	private int hash(K key) {
		return key.hashCode() % capacity;
	}
}
