#include <stdio.h>
#pragma warning(disable:4996)

int main()
{
    int arr[8];
    int a = 0;
    int b = 0;

    for (int i = 0; i < 8; i++) {
        scanf("%d", &arr[i]);
    }

    if (arr[0] == 1) {
        for (int j = 0; j < 8; j++) if (arr[j] == j + 1) a++;
        if (a == 8) printf("ascending");
        else printf("mixed");
    }
    else if (arr[0] == 8) {
        for (int j = 0; j < 8; j++) if (arr[j] == 8 - j) b++;
        if (b == 8) printf("descending");
        else printf("mixed");
    }
    else printf("mixed");
}