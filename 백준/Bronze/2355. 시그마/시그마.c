#include <stdio.h>

#define ll long long

int main() {
    ll a,b;
    int result = 0;
    scanf("%lld %lld", &a, &b);

    if(a < b) {
        result = (b - a + 1) * (a + b)/2;
    } else {
        result = (a - b + 1) * (a + b)/2;
    }

    printf("%d", result);
}
