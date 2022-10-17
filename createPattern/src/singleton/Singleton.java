package singleton;
//싱글톤 패턴 : 인스턴스를 한 개만 만들 수 있도록 하는 패턴 메모리측면에서 장점
public class Singleton {
	static Singleton instance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
