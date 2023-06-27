package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> squares = new TreeSet<>();
        for (Integer temp : sourceList) {
            squares.add(temp * temp);
        }
        NavigableSet<Integer> subset;
        subset = squares.subSet(lowerBound,true, upperBound, true);
        return subset;
    }
}
