package clase;

public class Zookeeper {
	private String name;
    public void feed(Animal a){
        System.out.println(name+" hraneste animalul "+ a.getName());
    }

    public Zookeeper(String name) {
        this.name = name;
    }
}
