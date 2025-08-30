#include<stdio.h>
void main(){
    char input[]="helloworld";
    char result[sizeof(input)];
    for(int i=0;i<sizeof(input)-1;i++)
        result[i]=input[i]^0;
    printf("Original String: %s\n",input);
    printf("XORed String: %s\n",result);
}