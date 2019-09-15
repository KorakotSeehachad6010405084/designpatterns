package simulator;

import factory.CounterDecoratorFactory;
import factory.FullDecoratorFactory;
import factory.SimpleFactory;
import quack.Quackable;

public class DuckSimulator {
    public static void main(String arg[]){


        Simulator simulator = new CompositeSimulator();
        simulator.setFactory(new SimpleFactory());
        
        simulator.start();
    }

    public static void simulator(Quackable duck) {
        duck.quack();
    }

}
