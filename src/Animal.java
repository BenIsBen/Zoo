public class Animal {

    public String favortiefood;
    public String name;
    static int population;

    public Animal(String x, String y){
        this.favortiefood = y;
        this.name = x;
        population++;
    }
    public void sleep(){
        System.out.println(this.name + " sleeps for 8 hours.");
    }
    public void eat(String food){
        if(food.equals(this.favortiefood)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }else{
            System.out.println(this.name + " eats " + food);
            this.sleep();
        }
    }
}
