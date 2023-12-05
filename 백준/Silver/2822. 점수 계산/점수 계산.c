#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    int A = *(int*)a;
    int B = *(int*)b;

    if(A > B) {
        return -1;
    } else if(A == B) {
        return 0;
    } else {
        return 1;
    }
} 

int main() {
    int sum = 0;
    int arr[8];
    int ans[8];
    int index[5];

    for(int i = 0; i < 8; i++) {
        scanf("%d", &arr[i]);
        ans[i] = arr[i];
    }

    qsort(arr, 8, sizeof(int), compare);

    for(int i = 0; i < 5; i++) {
        sum += arr[i];
    }
    
    printf("%d\n", sum);

    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 8; j++) {
            if(arr[i] == ans[j]) {
                index[i] = j+1;
            }
        }
    }

    qsort(index, 5, sizeof(int), compare);

    for(int i = 4; i >= 0; i--) {
        printf("%d ", index[i]);
    }
}
