#include<stdio.h>
int main()
{
    int arr[100],num[100],count[100];
    int arr_size = 0,res_size = 0,f=0,s=0;
    printf("Enter the size of Arr : ");
    scanf("%d",&arr_size);
    printf("\nEnter array elements : \n");
    for(int i = 0;i<arr_size;i++)
    scanf("%d",&arr[i]);
    for(int i = 0;i<arr_size;i++)
    {
        if(arr[f]!=arr[s])
        {
            num[res_size] = arr[f];
            count[res_size] = s-f;
            f = s; 
            res_size++;
        }
        s++;
    }
    num[res_size] = arr[f];
    count[res_size] = s-f;
    //Print results that satisfy the condition
    for(int i = 0;i<=res_size;i++)
    {
        if(count[i]>1)
        printf("\n number : %d  count : %d ",num[i],count[i]);
    }

}