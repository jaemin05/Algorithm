#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int x;
int cnt[10001];

int main() {

    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> x;

    for(int i = 0; i < x; ++i) {
        int n; cin >> n;
        cnt[n] += 1; 
    }

    for(int i = 1; i < 10001; ++i) {
        for(int j = 0; j < cnt[i]; j++) {
            cout << i << "\n";
        }
    }
}