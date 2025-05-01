#include <iostream>
#include <vector>
#include <deque>

/*
    ✅ Sliding Window Minimum (O(n) using deque)
    - nums : 입력 배열
    - k    : 윈도우 크기
    - 반환 : 각 윈도우 구간의 최소값 벡터
*/
std::vector<int> minSlidingWindow(const std::vector<int>& nums, int k) {
    std::vector<int> res;
    if (k == 0 || nums.size() < static_cast<size_t>(k)) return res;

    std::deque<int> dq;                // 인덱스를 저장 (값 아님)
    for (int i = 0; i < static_cast<int>(nums.size()); ++i) {

        // 1) 윈도우 범위 밖 인덱스 제거
        if (!dq.empty() && dq.front() <= i - k)
            dq.pop_front();

        // 2) 현재 값보다 큰(또는 같은) 인덱스 뒤에서 제거
        //    ➜ 최소값을 구하므로 큰 값은 쓸모없음
        while (!dq.empty() && nums[i] <= nums[dq.back()])
            dq.pop_back();

        // 3) 현재 인덱스 삽입
        dq.push_back(i);

        // 4) 윈도우가 완성되면 결과에 최소값 저장
        if (i >= k - 1)
            res.push_back(nums[dq.front()]);
    }
    return res;
}

int main() {
    std::vector<int> nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;

    std::vector<int> result = minSlidingWindow(nums, k);

    std::cout << "[";
    for (size_t i = 0; i < result.size(); ++i) {
        std::cout << result[i];
        if (i + 1 < result.size()) std::cout << ", ";
    }
    std::cout << "]\n";   // 기대 출력: [1, -1, -3, -3, 3, 3]

    return 0;
}
