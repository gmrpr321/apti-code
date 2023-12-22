#include<stdio.h>
int main()
{
    char arr[100];
    int strlen=0,target=0,extra=0,space_nos=0,per_space=0,rem_space=0;
    //initialize char array 
    for(int i = 0;i<100;i++)
    {
        arr[i] = '\0';
    }
    printf("Enter the string : ");
    gets(arr);
    printf("\nEnter the target Length : ");
    scanf("%d",&target);
    for(int i = 0;i<100;i++)
    {
        if(arr[i]=='\0')
        break;
        if(arr[i]==' ')
        space_nos+=1;
        strlen++;
    }
    extra = target-strlen;
    per_space = extra/space_nos;
    rem_space = extra%space_nos;
    //print the result
    for(int i = 0;i<strlen;i++)
    {
        if(arr[i]==' ')
        {
            for(int j = 0;j<=per_space;j++)
            printf("%c",'*');
            if(rem_space>0)
            {
                printf("%c",'*');
                rem_space--;
            }
        }
        else
        printf("%c",arr[i]);
    }
}