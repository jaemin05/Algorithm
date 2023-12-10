#include <stdio.h>

int era(int n, int k) {
    int arr[n+1];
    int cnt = 0;
    int result = 2;

    for(int i = 2; i <= n; i++) {
        arr[i] = i;
    }

    for(int i = 2; i <= n; i++) {
        for(int j = 1; i * j <= n; j++) {
            if(cnt == k) break;
            if(arr[i * j] == 0) continue;
            
            arr[i * j] = 0;
            cnt += 1;
            result = i * j;
        }
    }

    return result;
}

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    printf("%d", era(n, k));
}