#include <stdio.h>
int main(){
    int arr[] = {13,54,89,84,25,12,45,78,90};
    int n1 = sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<n1;i++){
        if(arr[i]%arr[0]==0){
            printf("%d ",arr[i]);
        }else{
            printf("Not divisible by first element\n");
        }
    }
    int arr1[] = {1,2,3,4,6,7,8,10};
    int N = sizeof(arr1)/sizeof(arr1[0]);
    for(int i=0;i<N;i++){
        if(arr1[i]==i+1){
            continue;
        }else{
            printf("Missing number is %d\n",i+1);
            break;
        }
    }
    int max;
    int min=arr[0];
    int med;
    int temp;
    int arr2[] = {1,6,9,0,3,4,9,5,9,10};
    int n2 = sizeof(arr2)/sizeof(arr2[0]);
    for(int i = 0 ; i<=n2; i++){
        arr2[i]<=arr2[i+1];
        printf("%d ",arr2[i]);
    }
    return 0;
}
