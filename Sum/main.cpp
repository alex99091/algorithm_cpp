#include <iostream>
#include <vector>
#include <unordered_map>

/*
    ✅ Two-Sum (인덱스 쌍 찾기) - O(n)
    - nums   : 입력 배열
    - target : 목표 합
    - 반환   : {i, j}  (nums[i] + nums[j] == target)
               못 찾으면 {-1, -1}
*/
std::pair<int,int> twoSum(const std::vector<int>& nums, int target) {
    std::unordered_map<int,int> idx;              // 값  ➜ 인덱스

    for (int i = 0; i < static_cast<int>(nums.size()); ++i) {
        int complement = target - nums[i];
        auto it = idx.find(complement);
        if (it != idx.end())                      // 이미 봤던 값이면 정답
            return {it->second, i};
        idx[nums[i]] = i;                         // 현재 값 기록
    }
    return {-1, -1};                              // (정답이 반드시 하나 있다고 했으므로 이 경로는 이론상 도달 X)
}

int main() {
    std::vector<int> nums = {2, 7, 11, 15};
    int target = 22;                              // 예: 7 + 15 = 22

    auto [i, j] = twoSum(nums, target);
    std::cout << "[" << i << ", " << j << "]\n";  // 출력: [1, 3]

    return 0;
}
