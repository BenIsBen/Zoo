public class Bee extends Animal {
    public Bee(String x, String y){
        super(x, y);
    }
    public void eat(String food){
        if(this.favortiefood.equals(food)){
            super.eat(food);
            this.sleep();
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }
    public void sleep(){
        System.out.println(this.name + " never sleeps");
    }
}
