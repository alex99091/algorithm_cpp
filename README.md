# 📘 Basic Algorithm Practice in JAVA

기초 알고리즘 12종 java & cpp
각 알고리즘은 핵심 개념과 함께 예제 포함

---

## 1. Sum Algorithm (합계 알고리즘)

- **설명**: 수열 또는 배열의 전체 합을 구함  
- **핵심 포인트**: 반복문과 누적 변수  

```cpp
int sum = 0;  
for (int i = 0; i < n; i++) sum += arr[i];
```

```java
int sum = 0;
for (int val : arr) sum += val;
```

---

## 2. Count Algorithm (개수 알고리즘)

- **설명**: 특정 조건을 만족하는 원소 개수  
- **핵심 포인트**: 조건문과 카운팅  

```cpp
int count = 0;  
for (int i = 0; i < n; i++)  
    if (arr[i] > 0) count++;
```

```java
int count = 0;
for (int val : arr)
    if (val > 0) count++;

```
---

## 3. Average Algorithm (평균 알고리즘)

- **설명**: 배열 평균 = 합 / 개수  
- **핵심 포인트**: 형 변환 주의 (정수/실수)  

```cpp
double avg = (double)sum / n;
```

```java
double avg = (double) sum / arr.length;
```

---

## 4. Max Algorithm (최댓값 알고리즘)

- **설명**: 가장 큰 값을 찾음  
- **핵심 포인트**: 비교 갱신  

```cpp
int maxVal = arr[0];  
for (int i = 1; i < n; i++)  
    if (arr[i] > maxVal) maxVal = arr[i];
```

```java
int maxVal = arr[0];
for (int i = 1; i < arr.length; i++)
    if (arr[i] > maxVal) maxVal = arr[i];
```

---

## 5. Min Algorithm (최솟값 알고리즘)

- **설명**: 가장 작은 값을 찾음  

```cpp
int minVal = arr[0];  
for (int i = 1; i < n; i++)  
    if (arr[i] < minVal) minVal = arr[i];
```

```java
int minVal = arr[0];
for (int i = 1; i < arr.length; i++)
    if (arr[i] < minVal) minVal = arr[i];
```

---

## 6. Near Algorithm (근삿값 알고리즘)

- **설명**: 기준값에 가장 가까운 수 찾기  

```cpp
int near = arr[0], gap = abs(arr[0] - target);  
for (int i = 1; i < n; i++) {  
    int diff = abs(arr[i] - target);  
    if (diff < gap) {  
        gap = diff;  
        near = arr[i];  
    }  
}
```

```java
int near = arr[0];
int gap = Math.abs(arr[0] - target);
for (int i = 1; i < arr.length; i++) {
    int diff = Math.abs(arr[i] - target);
    if (diff < gap) { gap = diff; near = arr[i]; }
}
```

---

## 7. Rank Algorithm (순위 알고리즘)

- **설명**: 큰 값이 많을수록 순위가 낮음  

```cpp
int rank = 1;  
for (int i = 0; i < n; i++)  
    if (arr[i] > target) rank++;
```

```java
int rank = 1;
for (int val : arr)
    if (val > target) rank++;
```

---

## 8. Sort Algorithm (정렬 알고리즘)

- **설명**: 데이터 오름차순 정렬  
- **기본 예시**: 선택 정렬  

```cpp
for (int i = 0; i < n - 1; i++) {  
    int minIdx = i;  
    for (int j = i + 1; j < n; j++)  
        if (arr[j] < arr[minIdx]) minIdx = j;  
    swap(arr[i], arr[minIdx]);  
}
```

```java
for (int i = 0; i < arr.length - 1; i++) {
    int minIdx = i;
    for (int j = i + 1; j < arr.length; j++)
        if (arr[j] < arr[minIdx]) minIdx = j;
    int tmp = arr[i]; arr[i] = arr[minIdx]; arr[minIdx] = tmp;
}
```

---

## 9. Search Algorithm (검색 알고리즘)

- **설명**: 원하는 값을 배열에서 찾기  
- **기본 예시**: 선형 탐색  

```cpp
int index = -1;  
for (int i = 0; i < n; i++)  
    if (arr[i] == target) {  
        index = i;  
        break;  
    }
```

```java
int index = -1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) { index = i; break; }
}
```

---

## 10. Merge Algorithm (병합 알고리즘)

- **설명**: 두 정렬된 배열 병합  

```cpp
vector<int> merged;  
int i = 0, j = 0;  
while (i < n && j < m) {  
    if (a[i] < b[j]) merged.push_back(a[i++]);  
    else merged.push_back(b[j++]);  
}  
while (i < n) merged.push_back(a[i++]);  
while (j < m) merged.push_back(b[j++]);
```

```java
List<Integer> merged = new ArrayList<>();
int i = 0, j = 0;
while (i < a.length && j < b.length) {
    if (a[i] < b[j]) merged.add(a[i++]);
    else merged.add(b[j++]);
}
while (i < a.length) merged.add(a[i++]);
while (j < b.length) merged.add(b[j++]);
```
---

## 11. Mode Algorithm (최빈값 알고리즘)

- **설명**: 가장 많이 등장한 값 찾기  

```cpp
unordered_map<int, int> freq;  
for (int x : arr) freq[x]++;  
int mode = arr[0], maxFreq = 0;  
for (auto& [val, cnt] : freq)  
    if (cnt > maxFreq) {  
        maxFreq = cnt;  
        mode = val;  
    }
```

```java
Map<Integer,Integer> freq = new HashMap<>();
for (int x : arr) freq.merge(x, 1, Integer::sum);
int mode = arr[0], maxFreq = 0;
for (Map.Entry<Integer,Integer> e : freq.entrySet())
    if (e.getValue() > maxFreq) { maxFreq = e.getValue(); mode = e.getKey(); }
```

---

## 12. Group Algorithm (그룹 알고리즘)

- **설명**: 특정 조건에 따라 그룹화 처리  

```cpp
map<string, vector<string>> groups;  
for (auto& item : data)  
    groups[item.type].push_back(item.name);
```

```java
Map<String, List<String>> groups = new HashMap<>();
for (Item item : data) {
    groups.computeIfAbsent(item.type, k -> new ArrayList<>())
          .add(item.name);
}
```
---

## 🏁 학습 정리

- 💡 총 12개 알고리즘을 직접 구현하면서, 반복문·조건문·배열·해시맵 등 Java && C++ 기초 알고리즘 학습. 