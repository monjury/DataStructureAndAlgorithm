import java.util.Iterator;
import java.util.LinkedList;

public class HashTableChain<K, V> extends HashTable<K, V> {
	
	private LinkedList<Entry<K, V>>[] table;
	
	public void put(K key, V value) {
		int location = hash(key);
		Entry<K, V> entry = new Entry<K, V>(key, value);
		if(table[location] != null) {
			LinkedList<Entry<K, V>> linkedList = table[location];
			Iterator<Entry<K, V>> iterator = linkedList.iterator();
			while(iterator.hasNext()) {
				Entry<K, V> currentEntry = iterator.next();
				if(currentEntry != null && key.equals(currentEntry.getKey())) {
					currentEntry.setValue(value);
					return;
				}
			}
			linkedList.addLast(entry);
		}
		else if(size < capacity) { // table[location] == null
			LinkedList<Entry<K, V>> linkedList = new LinkedList<Entry<K, V>>();
			linkedList.addLast(entry);
			table[location] = linkedList;
		}
		else { // size >= capacity
			capacity *= 2;
			reHash();
			put(key, value);
		}
		size++;
	}
}
