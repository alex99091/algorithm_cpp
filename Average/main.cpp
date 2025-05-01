#include <iostream>

int average(const int nums[], int size) {
    if (size == 0) return 0;

    int sum = 0;
    for (int i = 0; i < size; ++i) {
        sum += nums[i];
    }
    return sum / size;  // 정수 나눗셈
}

int main() {
    int nums[] = {2, 4, 6, 8};
    int size = sizeof(nums) / sizeof(nums[0]);

    std::cout << average(nums, size) << '\n';  // 5 출력
    return 0;
}
