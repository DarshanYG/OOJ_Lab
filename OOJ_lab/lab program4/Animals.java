abstract class Animal {
    public abstract void Eat();
    public abstract void Sleep();
}
class Lion extends Animal {
    @Override
    public void Eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void Sleep() {
        System.out.println("Lion sleeps during the day");
    }
}
class Deer extends Animal {
    @Override
    public void Eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    public void Sleep() {
        System.out.println("Deer sleeps at night");
    }
}
class Tiger extends Animal {
    @Override
    public void Eat() {
        System.out.println("Tiger eats other animals");
    }

    @Override
    public void Sleep() {
        System.out.println("Tiger sleeps for many hours");
    }
}
public class Animals {
    public static void main(String args[]) {
        System.out.println("Darshan YG, 1BM23CS087");
        Lion lion = new Lion();
        lion.Sleep();
        lion.Eat();  

        Tiger tiger = new Tiger();
        tiger.Sleep(); 
        tiger.Eat();   

        Deer deer = new Deer();
        deer.Sleep();  
        deer.Eat();  
    }
}
