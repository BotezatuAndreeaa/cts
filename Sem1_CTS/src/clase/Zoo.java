package clase;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
	private List<Animal> listaAnimale;
    private Zookeeper zookeper;

    public Zoo(List<Animal> listaAnimale, Zookeeper zookeper) {
        super();
        this.listaAnimale = listaAnimale;
        this.zookeper = zookeper;
    }

    public Zoo() {
        super();
        listaAnimale=new ArrayList<Animal>();
        zookeper=new Zookeeper("Ion");

    }
    public void add(Animal a){
        listaAnimale.add(a);
    }
    public void allAnimals(){
        for(Animal animal : listaAnimale){
            zookeper.feed(animal);
        }
    }

    public List<Animal> getListaAnimale() {
        return listaAnimale;
    }

    public void setListaAnimale(List<Animal> listaAnimale) {
        this.listaAnimale = listaAnimale;
    }

    public Zookeeper getZookeper() {
        return zookeper;
    }

    public void setZookeper(Zookeeper zookeper) {
        this.zookeper = zookeper;
    }

}
