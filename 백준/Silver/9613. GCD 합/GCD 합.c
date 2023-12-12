#include <stdio.h>
#include <stdlib.h>

#define ll long long

int compare (const void* first, const void* second)
{
    if (*(int*)first > *(int*)second)
        return -1;
    else if (*(int*)first < *(int*)second)
        return 1;
    else
        return 0;
}


int gcd(int a, int b) {
    if(b == 0) {
        return a;
    }

    return gcd(b, a % b);
}

int main() {
    int num;
    scanf("%d", &num);

    for(int i = 0; i < num; i++) {
        int n1;
        scanf("%d", &n1);
        int arr[n1];

        for(int j = 0; j < n1; j++) {
            scanf("%d", &arr[j]);
        }

        qsort(arr, n1, sizeof(int), compare);

        ll sum = 0;
        for(int j = 0; j < n1 - 1; j++) {
            for(int k = j + 1; k < n1; k++) {
                sum += gcd(arr[j], arr[k]);
            }
        }

        printf("%lld\n", sum);
    }
}
