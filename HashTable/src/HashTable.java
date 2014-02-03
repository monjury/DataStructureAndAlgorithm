public abstract class HashTable<K, V> {
	protected int capacity;
	protected int size;
	
	protected void reHash() {
		// TODO
	}
	
	protected int hash(K key) {
		return key.hashCode() % capacity;
	}
	
	public abstract void put(K key, V value);
}
