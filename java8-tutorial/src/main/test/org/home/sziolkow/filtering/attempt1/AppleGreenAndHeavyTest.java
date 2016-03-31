package org.home.sziolkow.filtering.attempt1;

import org.home.sziolkow.filtering.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by slawek on 31/03/16.
 */
public class AppleGreenAndHeavyTest {

    @Test
    public void should_find_only_green_and_heavier_than_150_apples() throws Exception {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple("red", 200));
        inventory.add(new Apple("green", 170));
        inventory.add(new Apple("red", 200));
        inventory.add(new Apple("red", 20));
        inventory.add(new Apple("green", 17));
        inventory.add(new Apple("red", 20));

        AppleFilter filter = new AppleFilter();
        List<Apple> filtered = filter.filterAppel(inventory, new AppleGreenAndHeavy());
        assertThat(filtered.size(), is(1));
    }

}