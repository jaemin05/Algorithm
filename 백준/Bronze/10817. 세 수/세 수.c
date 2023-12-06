#include <stdio.h>
#include <stdlib.h>

int compare(const void* a, const void* b) {
    if(*(int*)a > *(int*)b) {
        return 1;
    } else if(*(int*)a < *(int*)b) {
        return -1;
    } else {
        return 0;
    }
}

int main() {
    int arr[3];
    for(int i = 0; i < 3; i++) {
        scanf("%d", &arr[i]);
    }
    qsort(arr, 3, sizeof(int), compare);

    printf("%d", arr[1]);
}
