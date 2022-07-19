package sec05_제네릭.EX02;

class keyValue<K, V>{
	private K k;
	private V v;
	
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
}// 제네릭 클래스


public class TwoGenericArgument {

	public static void main(String[] args) {
		keyValue<String, Integer> kv1 = new keyValue<>();
		kv1.setK("사과");
		kv1.setV(1000);
		String key1 = kv1.getK();
		int value1 = kv1.getV();
		
		System.out.println("key1: " + key1 + "value1: " + value1);
		//
		keyValue<Integer, String> kv2 = new keyValue<>();
		kv2.setK(10);
		kv2.setV("포도");
		int key2 = kv2.getK();
		String value2 = kv2.getV();
		
		System.out.println("key2: " + key2 + "value2: " + value2);
		//
		
		keyValue<String, Void> kv3 = new keyValue<>();
		kv3.setK("키값만 사용");
		String key3 = kv3.getK();
		
		System.out.println("key3: " + key3);
		
	}//main
	
}// end class
















