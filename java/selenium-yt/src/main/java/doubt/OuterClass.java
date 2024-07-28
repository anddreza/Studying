package doubt;

public class OuterClass {
    int number = 6;

    public void heyThere(){
        System.out.println("Hey there!");
    }

    public class InnerClass{
        int innerNumber = 8;

        //I think we can create a new class inside to another one.
        public void whatsUp(){
            System.out.println("Whats up from the Inner Class");
        }

    }

}
