
import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("This is my first SQT code");
	    Zoo zoo= new Zoo();
	        Zookeeper keeper=new Zookeeper("Ion");
	        zoo.setZookeper(keeper);
	        Zebra z1=new Zebra("Ollie");
	        Zebra z2=new Zebra("Millie");
	        zoo.add(z1);
	        zoo.add(z2);
	        zoo.allAnimals();
	        Giraffe g1=new Giraffe("Lily");
	        Giraffe g2=new Giraffe("Kiki");
	        zoo.add(g1);
	        zoo.add(g2);
	        zoo.allAnimals();
	    }

}
