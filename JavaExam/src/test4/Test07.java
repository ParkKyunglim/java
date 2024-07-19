package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Test07 {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) {
            System.out.println(makeLotto());
        }
    }

    public static Set<Integer> makeLotto() { // 빈칸 1
        Set<Integer> lottoSet = new HashSet<>(); // 빈칸 2

        for (;;) { // 빈칸 3
            int num = (int)(Math.random() * 45) + 1; // 빈칸 4
            lottoSet.add(num); // 빈칸 5
            if (lottoSet.size() == 6) { // 빈칸 6
                break;
            }
        }

        // 정렬을 위해 TreeSet 사용
        Set<Integer> treeSet = new TreeSet<>(lottoSet);
        
        return treeSet;
    }
}