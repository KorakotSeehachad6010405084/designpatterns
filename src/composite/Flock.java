package composite;

import quack.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private ArrayList<Quackable> flock = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable x:flock) {
            x.quack();
        }
    }

    public void add(Quackable one){
        flock.add(one);
    }
}
