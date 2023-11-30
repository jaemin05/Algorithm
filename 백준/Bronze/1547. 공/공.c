#include <stdio.h>

int main() {
    int num;
    int ball = 1;
    scanf("%d", &num);

    for(int i = 0; i < num; i++){
        int a, b;
        scanf("%d %d", &a, &b);

        if(ball == a) {
            ball = b;
        } else if(ball == b) {
            ball = a;
        }
    }

    printf("%d", ball);
}
