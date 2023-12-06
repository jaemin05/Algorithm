#include <stdio.h>

int main() {
    int num;  
    scanf("%d", &num);

    while(1) {
        if(num <= 1) return 0;
        for(int i=2; i <= num; i++) {
            if(num % i == 0) {
                num /= i;
                printf("%d\n", i);
                break;
            }
        }
    }
}