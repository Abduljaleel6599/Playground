#include<stdio.h>
int main()
{
	char a[50];
  int l,i,c=1;
  scanf("%s",a);
  for(l=0;a[l]!='\0';l++);
  if(l>20)
  {
    printf("Invalid Input");
  }
  else
  {
    for(i=0;i<l;i++)
    {
      if(a[i]==a[i+1])
      {
        c++;
      }
       else
       {
         printf("%c%d",a[i],c);
         c=1;
       }
    }
  }
  return 0;
}