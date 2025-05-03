/*
✅ 문제: 사용자 정의 객체 정렬
사용자 이름과 점수를 가진 객체 배열이 주어졌을 때,
다음 기준으로 정렬하여 출력하세요.

1. 점수(score)를 기준으로 **내림차순**
2. 점수가 같으면 이름(name)을 **오름차순(사전순)**

입력 예시:
List<User> users = List.of(
    new User("Alice", 90),
    new User("Bob", 95),
    new User("Charlie", 90),
    new User("David", 80)
);

출력 예시:
Bob 95
Alice 90
Charlie 90
David 80
*/


import java.util.*;

class User {
    String name;
    int score;

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class SortCustomTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
            new User("Alice", 90),
            new User("Bob", 95),
            new User("Charlie", 90),
            new User("David", 80)
        ));

        users.sort((u1, u2) -> {
            if(u1.score != u2.score) {
                return Integer.compare(u2.score, u1.score);
            } else {
                return u1.name.compareTo(u2.name);
            }
        });

        for (User u : users) {
            System.out.println(u.name + " " + u.score);
        }
    }
}
