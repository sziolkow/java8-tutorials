package org.home.sziolkow.filtering.attempt1;

import org.home.sziolkow.filtering.Apple;
import org.home.sziolkow.filtering.ApplePredicate;

/**
 * Created by slawomir.ziolkowski on 31.03.2016.
 */
public class AppleGreenAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
