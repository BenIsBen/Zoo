public class Giraffe extends Animal {
    public Giraffe(String x, String y){
        super(x, y);
    }
    public void eat(String food){
        if(this.favortiefood.equals(food)){
            super.eat(food);
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }
}
