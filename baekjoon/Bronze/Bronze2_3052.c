#include <stdio.h>
#pragma warning(disable:4996)

int main() {
    int num;
    int a = 0;
    int result = 0;
    int remain[42] = {0,};

    for (int i = 0; i < 10; i++) {
        scanf("%d", &num);
        remain[num % 42] = 1;
    }
          
    for (int j = 0; j < 42; j++) {
        if (remain[j] != 0) a++;
    }

    printf("%d", a);
}