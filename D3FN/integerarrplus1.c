#include<stdio.h>
int *shiftByOne(int *arr,int size)
{
    int temp = 0;
    for(int i = 0;i<size;i++)
    {
        *(arr+i) = *(arr+i) ^ temp;
        temp = *(arr+i) ^ temp;
        *(arr+i) = *(arr+i) ^ temp;
    }
    *(arr+size) =temp;
    return arr;
}
int *performIncrement(int *arr,int size)
{
    int extra = 1;
    for(int i = size-1;i>=0;i--)
    {
        *(arr+i) = *(arr+i)+extra;
        if(*(arr+i)>9)
        {
        extra = *(arr+i)==10 ? 1 :  *(arr+i)/10;
        *(arr+i)-=10;
        }
        else 
        extra = 0;
    }
    //if the most significant number is greater than 9, shift the array by one digit
    if(extra==1)
    {
    arr = shiftByOne(arr,size);
    *arr = extra;
    size++;
    }
    for(int i = 0;i<size;i++)
    printf(" %d ",arr[i]);
}
int main()
{
    int arr[100],size=0;
    printf("Enter the size of arr : ");
    scanf("%d",&size);
    printf("Enter Array elements");
    for(int i = 0;i<size;i++)
    scanf("%d",&arr[i]);
    performIncrement(arr,size);
    return 0;
}