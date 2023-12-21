#include<stdio.h>
int main()
{
    char arr[100];
    for(int i = 0;i<100;i++)
    arr[i] ='\0';
    printf("Enter a string : ");
    scanf("%s",arr);
    int has_upper = 0;
    int has_lower = 0;
    int has_spl = 0;
    int len = 0;
    for(int i = 0;i<100;i++)
    {
        if(arr[i]=='\0')
        break;
        if((arr[i]<65 ||arr[i]>90) ||(arr[i]>90 && arr[i]<98) || (arr[i]>122))
        has_spl=1;
        if((arr[i]>=98 && arr[i]<=122))
        has_lower = 1;
        if((arr[i]>=65 && arr[i]<=90))
        has_upper = 1;
        len++;
    }
    if(has_upper && has_lower && has_spl && len>8)
    printf("Password is strong");
    else
    printf("Password is not strong");
}