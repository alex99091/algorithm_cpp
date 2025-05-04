#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void printVector(const vector<int>& nums) {
    cout << "[";
    for (size_t i = 0; i < nums.size(); ++i) {
        cout << nums[i];
        if (i != nums.size() - 1) cout << ", ";
    }
    cout << "]" << endl;
}

void bubbleSort(vector<int>& nums) {
    int n = nums.size();
    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - 1 - i; ++j) {
            if (nums[j] > nums[j + 1]) {
                swap(nums[j], nums[j + 1]);
            }
        }
    }
}

void selectionSort(vector<int>& nums) {
    int n = nums.size();
    for (int i = 0; i < n - 1; ++i) {
        int minIdx = i;
        for (int j = i; j < n; ++j) {
            if (nums[j] < nums[minIdx]) {
                minIdx = j;
            }
        }
        swap(nums[i], nums[minIdx]);
    }
}

void insertionSort(vector<int>& nums) {
    int n = nums.size();
    for (int i = 1; i < n; ++i) {
        int key = nums[i];
        int j = i - 1;
        while (j >= 0 && nums[j] > key) {
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j + 1] = key;
    }
}

int main() {
    vector<int> nums = {5, 3, 8, 1, 2};

    vector<int> nums1 = nums;
    bubbleSort(nums1);
    printVector(nums1); // [1, 2, 3, 5, 8]

    vector<int> nums2 = nums;
    selectionSort(nums2);
    printVector(nums2); // [1, 2, 3, 5, 8]

    vector<int> nums3 = nums;
    insertionSort(nums3);
    printVector(nums3); // [1, 2, 3, 5, 8]

    return 0;
}
