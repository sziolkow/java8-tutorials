package org.home.sziolkow.filtering;

/**
 * Created by slawomir.ziolkowski on 31.03.2016.
 */
public class AppleGreenAnHHeavy implements ApplePredicate {
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
