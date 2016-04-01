package org.home.sziolkow.filtering.attempt1;

import org.home.sziolkow.filtering.Apple;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slawomir.ziolkowski on 01.04.2016.
 */
public abstract class CoreTest {

    List<Apple> inventory;

    @Before
    public void setup() {
        inventory = new ArrayList<Apple>();
        inventory.add(new Apple("red", 200));
        inventory.add(new Apple("green", 170));
        inventory.add(new Apple("red", 200));
        inventory.add(new Apple("red", 20));
        inventory.add(new Apple("green", 17));
        inventory.add(new Apple("red", 20));
    }
}
