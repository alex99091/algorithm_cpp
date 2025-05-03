/*
✅ 문제: 과목별 최고 점수 학생 찾기
학생들의 이름, 과목명, 점수가 주어진다.
각 과목별로 가장 높은 점수를 받은 학생의 이름과 점수를 출력하세요.
단, 동점일 경우 이름이 사전순으로 빠른 학생을 출력하세요.

조건:
- 학생 수는 최대 10,000명
- 과목은 문자열 (예: "Math", "English")
- 점수는 0~100 사이의 정수

입력 예시:
List<StudentScore> scores = List.of(
    new StudentScore("Alice", "Math", 85),
    new StudentScore("Bob", "Math", 90),
    new StudentScore("Charlie", "Math", 90),
    new StudentScore("Alice", "English", 95),
    new StudentScore("Bob", "English", 90)
);

출력 예시:
Math: Bob (90)
English: Alice (95)
*/

import java.util.*;

class StudentScore {
    String name;
    String subject;
    int score;

    public StudentScore(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }
}

public class GroupMaxTest {
    public static void main(String[] args) {
        List<StudentScore> scores = List.of(
            new StudentScore("Alice", "Math", 85),
            new StudentScore("Bob", "Math", 90),
            new StudentScore("Charlie", "Math", 90),
            new StudentScore("Alice", "English", 95),
            new StudentScore("Bob", "English", 90)
        );

        Map<String, StudentScore> result = getTopScorers(scores);

        for (Map.Entry<String, StudentScore> entry : result.entrySet()) {
            StudentScore s = entry.getValue();
            System.out.println(entry.getKey() + ": " + s.name + " (" + s.score + ")");
        }
    }

    public static Map<String, StudentScore> getTopScorers(List<StudentScore> scores) {
        Map<String, StudentScore> topScorers = new HashMap<>();

        for(StudentScore score: scores) {
            String subject = score.subject;

            if(!topScorers.containsKey(subject)) {
                topScorers.put(subject, score);
                continue;
            }

            StudentScore currentTop = topScorers.get(subject);

            if(score.score > currentTop.score ||
              (score.score == currentTop.score && score.name.compareTo(currentTop.name) < 0 )) {
                topScorers.put(subject, score);
              }
        }

        return topScorers;
    }
}
