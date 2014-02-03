public class HashTableOpenAddress<K, V> extends HashTable<K, V>  {
	
	private Entry<K, V>[] entryArray;
	
	public void put(K key, V value) {
		int location = hash(key);
		if(size < capacity) {
			while(entryArray[location] != null) {
				if(entryArray[location].getKey() == key) { // If key already exist
					entryArray[location].setValue(value);
					return;
				}
				location = (location < entryArray.length - 1) ? location + 1 : 0;
			}
			Entry<K, V> entry = new Entry<K, V>(key, value);
			entryArray[location] = entry; // Add entry to next available empty[null] spot
		}
		else { // size >= capacity
			reHash();
			put(key, value);
		}
	}
}
