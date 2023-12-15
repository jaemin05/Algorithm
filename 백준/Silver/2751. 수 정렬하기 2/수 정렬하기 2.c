#include <stdio.h>
#include <stdlib.h>

int compare(const void* n1, const void* n2) {
    if(*(int*)n1 > *(int*)n2) {
        return 1;
    } else if(*(int*)n1 < *(int*)n2) {
        return -1;
    } else {
        return 0;
    }
}

int main() {
    int n1;
    scanf("%d", &n1);
    int arr[n1];
    for(int i = 0; i < n1; i++) {
        int n2;
        scanf("%d", &n2);
        arr[i] = n2;
    }

    qsort(arr, n1, sizeof(int), compare);

    for(int i = 0; i < n1; i++) {
        printf("%d\n", arr[i]);
    }
}
