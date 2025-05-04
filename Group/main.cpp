#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>

using namespace std;

vector<vector<string>> groupAnagrams(vector<string>& strs) {
    unordered_map<string, vector<string>> map;

    for (const string& str : strs) {
        string key = str;
        sort(key.begin(), key.end()); // 애너그램 기준 키 생성
        map[key].push_back(str);      // 그룹에 추가
    }

    vector<vector<string>> result;
    for (auto& pair : map) {
        result.push_back(pair.second); // map의 value만 추출
    }

    return result;
}

int main() {
    vector<string> input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>> result = groupAnagrams(input);

    for (const auto& group : result) {
        cout << "[ ";
        for (const auto& word : group) {
            cout << word << " ";
        }
        cout << "]" << endl;
    }

    return 0;
}
