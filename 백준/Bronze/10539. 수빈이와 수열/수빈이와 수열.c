#include <stdio.h>

int main() {
    int num;
    scanf("%d", &num);
    int arr[num];
    int arr2[num];

    for(int i=0; i<num; i++){
        scanf("%d", &arr[i]);
    }

    arr2[0] = arr[0];
    printf("%d ", arr2[0]);

    for(int i=1; i<num; i++){
        int sum = arr[i] * (i+1); 
        int sum2 = 0;
        for(int j=0; j<i; j++){
            sum2 += arr2[j]; 
        }
        arr2[i] = sum - sum2; 

        printf("%d ", arr2[i]);
    }
}
