#include <iostream>
#include <vector>
#include <deque>

// ---------- brute-force O(n · k) ----------
std::vector<int> maxSlidingWindow(const std::vector<int>& nums, int k) {
    std::vector<int> res;
    if (k == 0 || nums.size() < static_cast<size_t>(k)) return res;

    for (size_t i = 0; i + k <= nums.size(); ++i) {
        int mx = nums[i];
        for (size_t j = i + 1; j < i + k; ++j)
            if (nums[j] > mx) mx = nums[j];
        res.push_back(mx);
    }
    return res;
}

// ---------- deque O(n) ----------
std::vector<int> maxSlidingWindowDeque(const std::vector<int>& nums, int k) {
    std::vector<int> res;
    if (k == 0 || nums.size() < static_cast<size_t>(k)) return res;

    std::deque<int> dq;                       // stores indices
    for (int i = 0; i < static_cast<int>(nums.size()); ++i) {
        if (!dq.empty() && dq.front() <= i - k) dq.pop_front();          // out of window
        while (!dq.empty() && nums[i] >= nums[dq.back()]) dq.pop_back(); // discard smaller
        dq.push_back(i);

        if (i >= k - 1) res.push_back(nums[dq.front()]);
    }
    return res;
}

int main() {
    std::vector<int> nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;

    auto result = maxSlidingWindowDeque(nums, k);
    std::cout << "[";
    for (size_t i = 0; i < result.size(); ++i) {
        std::cout << result[i] << (i + 1 < result.size() ? ", " : "");
    }
    std::cout << "]\n";   // prints: [3, 3, 5, 5, 6, 7]
    return 0;
}
