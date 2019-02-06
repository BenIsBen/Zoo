public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }
    public void feedAnimals(Animal[] x, String food){
        System.out.println(this.name + " is feeding " + food + " to " + x.length + " animals of " + Animal.population + " total animals");
        for(int i = 0; i < x.length; i++){
            Animal temp = x[i];
            temp.eat(food);
        }
    }
}
