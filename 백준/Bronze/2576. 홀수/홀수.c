#include <stdio.h>

#define ll long long

int main() {
    int sum = 0;
    int min = 100;
    int cnt = 0;
    int arr[7];

    for(int  i = 0; i < 7; i++) {
        scanf("%d", &arr[i]);
    }

    for(int i = 0; i < 7; i++) {
        if(arr[i] % 2 != 0) {
            sum += arr[i];
            if(min > arr[i]) {
                min = arr[i];
            }
        } else {
            cnt += 1;
        }
    }
    if(cnt == 7) {
        printf("%d", -1);
    } else {
        printf("%d\n", sum);
        printf("%d", min);
    }
}
