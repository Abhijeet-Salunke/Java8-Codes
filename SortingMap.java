package JavaCodes;

import java.util.*;

public class SortingMap {
    public static void main(String [] args){
        String [] names = {"Marry","Bob","Adam"};
        Integer [] heights = {180,155,160};

        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < names.length; i++){
            map.put(heights[i],names[i]);
        }

        // Sort heights in descending order and collect corresponding names
        List<String> sortedNames = map.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())) // Sort by key in reverse order
                .map(Map.Entry::getValue) // Extract names (values)
                .toList(); // Collect as a list
        sortedNames.forEach(name -> System.out.print(name + " "));

//        ArrayList<Integer> allHeights = new ArrayList<>(map.keySet());
//        allHeights.sort(Collections.reverseOrder());
//        String [] ans = new String[heights.length];
//        for(int i = 0; i < heights.length; i++){
//            ans[i] = map.get(allHeights.get(i));
//        }
//        for(int i = 0; i < ans.length; i++){
//            System.out.print(ans[i]+" ");
//        }
    }
}
