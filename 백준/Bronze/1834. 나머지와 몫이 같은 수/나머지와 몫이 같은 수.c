#include <stdio.h>

#define ll long long

int main() {
    ll input;
    ll result = 0;
    scanf("%lld", &input);


    for(int i = 1; i < input; i++) {
        result += i * (input + 1);
    }

    printf("%lld", result);
}
