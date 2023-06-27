package com.epam.mjc.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> sumOfThreeSets = new HashSet<>(firstSet);
        sumOfThreeSets.addAll(secondSet);
        sumOfThreeSets.addAll(thirdSet);
        Set<String> resultSet = new HashSet<>();
        for (String temp : sumOfThreeSets) {
            if (firstSet.contains(temp) && secondSet.contains(temp)) {
                resultSet.add(temp);
            } else if (thirdSet.contains(temp) && !firstSet.contains(temp) && !secondSet.contains(temp)) {
                resultSet.add(temp);
            }
        }
        return resultSet;
    }
}
