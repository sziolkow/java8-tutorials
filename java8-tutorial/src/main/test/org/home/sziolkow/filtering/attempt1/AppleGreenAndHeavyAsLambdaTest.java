package org.home.sziolkow.filtering.attempt1;

import org.home.sziolkow.filtering.Apple;
import org.home.sziolkow.filtering.AppleFilter;
import org.home.sziolkow.filtering.ApplePredicate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by slawek on 31/03/16.
 */
public class AppleGreenAndHeavyAsLambdaTest extends CoreTest{

    @Test
    public void should_find_only_green_and_heavier_than_150_apples() throws Exception {

        AppleFilter filter = new AppleFilter();
        List<Apple> filtered;
        filtered = filter.filterAppel(inventory, (Apple apple) -> "green".equals(apple.getColor())
                && apple.getWeight() > 150);
        assertThat(filtered.size(), is(1));
    }

}