/*  🧠 group 개념 정리 (Java 기준)
    group은 데이터를 특정 키 기준으로 묶고, 묶인 데이터를 통계, 집계, 분류하는 데 사용됨.
    대표적인 자료구조는 Map<K, List<V>>.
    Java에서는 HashMap, Collectors.groupingBy, Map.computeIfAbsent() 등이 자주 쓰임.
 */

 /*
  *  문제:
  *  문자열 배열 strs가 주어졌을 때, 애너그램끼리 그룹으로 묶어서 리턴하세요.
  *  애너그램이란, 문자의 구성은 같지만 순서만 다른 문자열입니다.
    // 예시 입력
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    // 출력 예시
    [
    ["eat","tea","ate"],
    ["tan","nat"],
    ["bat"]
    ]
  */
  import java.util.*;

  public class GroupAnagrams {
      public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
      }
  
      public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) return result;

        Map<String, List<String>> map = new HashMap<>();
        List<String> temp;

        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            /*
            if (map.containsKey(key)) {
                temp = map.get(key);
                temp.add(str);
                map.put(key, temp);
            } else {
                temp = new ArrayList<>();
                temp.add(str);
                map.put(key, temp);
            }
             */
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }

        result.addAll(map.values());

        return result;
      }
  }
  
