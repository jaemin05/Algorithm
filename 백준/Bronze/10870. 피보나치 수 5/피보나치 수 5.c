#include <stdio.h>

int fibo(int num) {
    if(num >= 2) return fibo(num - 1) + fibo(num - 2);
    else if(num == 1) return 1;
    else return 0;
}

int main() {
    int num;
    scanf("%d", &num);

    printf("%d", fibo(num));
}