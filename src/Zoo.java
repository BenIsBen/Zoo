public class Zoo {
    String favoriteFood = "bacon";
    public static Animal[] animals = new Animal[5];


    public static void main(String[] args){
//        Zoo zoo = new Zoo();
//        zoo.sleep("Tigger");
//        zoo.eat("Tigger", "meat");
//        zoo.eat("Tigger", "bacon");
//        Tiger tigger = new Tiger("Tigger", "meat");
//        tigger.eat("kibble");
//        tigger.eat("meat");
        Bear pooh = new Bear("pooh", "fish");
//        pooh.eat("fish");
//        pooh.eat("meat");
//        Bear pooh = new Bear("pooh", "fish");
        Tiger tigger = new Tiger("tigger", "meat");
//        pooh.eat("fish");
//        pooh.eat("meat");
//        //tigger.eat("kibble");
//        tigger.eat("meat");
        Unicorn rarity = new Unicorn("rarity", "marshmallow");
//        rarity.eat("marshmallow");
        Giraffe gemma = new Giraffe("gemma", "leaves");
//        gemma.eat("meat");
//        gemma.eat("leaves");
        Bee stinger = new Bee("stinger", "pollen");
//        stinger.eat("ice cream");
//        stinger.eat("pollen");
        animals[0] = pooh;
        animals[1] = tigger;
        animals[2] = rarity;
        animals[3] = gemma;
        animals[4] = stinger;
        Zookeeper Zoe = new Zookeeper("Zoe");
        Zoe.feedAnimals(animals, "meat");

    }

    public void sleep(String str){
        System.out.println(str + " sleeps for 8 hours.");
    }
    public void eat(String str, String food){
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + str + " wants more " + food);
        }else{
            System.out.println(str + " eats " + food);
            this.sleep(str);
        }
    }
}
