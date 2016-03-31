package org.home.sziolkow.filtering.attempt1;

import org.home.sziolkow.filtering.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Parametrized behavior. Whole decision logic is implemented in predicates. Filter logic stays untouched.
 *
 */
public class AppleFilter
{
    public List<Apple> filterAppel(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> filtered = new ArrayList<Apple>();
        for (Apple apple:inventory) {
            if (predicate.test(apple)) {
                filtered.add(apple);
            }
        }
        return filtered;
    }
}
