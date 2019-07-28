#include<stdio.h>
int main()
{
  int l=0,i;
  char a[100];
  scanf("%[^\n]s",a);
  for(i=0;a[i]!='\0';i++)
  {
    l++;
  }
  printf("%d",l);
  
  return 0;
}