package lab5;

// question 1: inteface inherit multiple interface 
interface I {
    int getSum(int a, int b); // this is abstract methods
}

interface II {
    int getMultipiaction(int a, int b);// this is abstract methods
}

interface III {
    int getFactor(int a, int b);// this is abstract methods
}

interface Extender extends I, II, III {
    // Qoustion 5: interface can not have constructor;
    // /*the folloing is just commented but code is form of costructor
    // Extender(){
    // error
    // }

    int getsubs(int a, int b);// this is abstract methods
}

// Question 3: class may extend only one class but, may implement multiple
// interfaces;
class ImplementorClass implements Extender {
    void getAllInfo(int a, int b) {
        System.out.println("Sum: " + getSum(a, b) + " Multiplication: " + getMultipiaction(a, b) + " devision: "
                + getFactor(a, b) + " Substraction: " + getsubs(a, b));
    }

    public int getsubs(int a, int b) {
        return a - b;
    }

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getMultipiaction(int a, int b) {
        return a * b;
    }

    public int getFactor(int a, int b) {
        return a / b;
    }
}

// quetion 4: class can in herit abstact class and implement it all abstact
// methods;
abstract class AbsI {
    abstract public void sayHello();

    abstract public void askName();

    abstract public void sayYouName();

    void Im() { // non abstract method;
        System.out.println("I'm Java OOP");
    }

    abstract public void sayGoodBye();
}

// extending Abstract class and implement it abstact method;
class Greeting extends AbsI {
    public void sayHello() {
        System.out.println("Hello!! ");
    }

    public void sayYouName() {
        System.out.println("I'm Tokuma Abdisa");
    }

    public void askName() {
        System.out.println("What is your name:  ");
    }

    public void sayGoodBye() {
        System.out.println("good bye see you Around");
    }
}

class Numbers {
    int a = 10;
    int b = 19;
}

// question 3 about extending only one class in class;
class ExtenderMulti extends ImplementorClass /* , Numbers */ { // if uncomment it will be error
    // okay;
}

public class Quiz1 {
    public static void main(String[] args) {
        /*
         * Quetion 2: Creating instance for interface class or abstracct class will be
         * error
         */
        // I obj =new I();
        // AbsI obj =new AbsI();
        Greeting obj = new Greeting();
        obj.sayHello();
        obj.sayYouName();
        obj.askName();
        obj.Im();
        obj.sayGoodBye();
        ImplementorClass ob = new ImplementorClass();// object for class and some value; ('_')
        ob.getAllInfo(10, 8);
        /*
         * this is just for showing them by example. those are not perfect but they are
         * good enough to discibe
         */
    }
}
