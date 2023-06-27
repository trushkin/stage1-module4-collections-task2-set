package com.epam.mjc.collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class HashSetCreator {
    /**
     * 1st key - username
     */
    public Map<String, Map<String, String>> usernameToPassword;
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        if (sourceList.isEmpty()) {
            return resultSet;
        }
        for (Integer temp : sourceList) {

            if(temp % 2 == 1){
                resultSet.add(temp);
                resultSet.add(temp * 2);
            }else {
                resultSet.add(temp);
                do {
                    temp /= 2;
                    resultSet.add(temp);
                } while (temp % 2 == 0);
            }
        }
        return resultSet;
    }
}
