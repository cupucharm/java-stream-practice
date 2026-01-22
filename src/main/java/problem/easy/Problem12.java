package problem.easy;

import java.util.Map;
import java.util.stream.Collectors;

public class Problem12 {

    /**
     * Map의 각 값(value)에 대해 문자열의 길이를 계산하여 새로운 Map을 생성합니다.
     *
     * @param map 원본 문자열 Map
     * @return 문자열 길이를 값으로 가지는 새 Map
     */
    public static Map<String, Integer> mapStringLength(Map<String, String> map) {
        // 2026-01-21 map 처음 써보는데 진짜 어렵다~

        return map.entrySet()
                .stream()
                .collect(Collectors.toMap(
                    e -> e.getKey(),
                    e -> e.getValue().length()
                ));
    }
}