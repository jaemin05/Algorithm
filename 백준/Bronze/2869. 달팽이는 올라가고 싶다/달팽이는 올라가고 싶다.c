#include <stdio.h>
#include <math.h>

int arr[1000];

int main() {
    int n1, n2, n3;
    int h = 0;

    scanf("%d %d %d", &n1, &n2, &n3);

    int day = (n3 - n2 - 1) / (n1 - n2) + 1;

    printf("%d", day);
}
