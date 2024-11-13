package Nov13;
interface Playable{
	void play();
}
class Guitar implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play the guitar");
	}
	
}
class Piano implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play the piano");
	}

}
public class Interfaces {
	public static void main(String[] args) {
		Playable obj1=new Guitar();
		Playable obj2=new Piano();
		obj1.play();
		obj2.play();
	}
}
