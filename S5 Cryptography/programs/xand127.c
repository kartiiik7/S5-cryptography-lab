#include<stdio.h>
void main(){
    char input[]="helloworld";
    char xorresult[sizeof(input)];
    char andresult[sizeof(input)];
    for(int i=0;i<sizeof(input)-1;i++){
        xorresult[i]=input[i]^127;
        andresult[i]=input[i]&127;
    }
    printf("Original String: %s\n",input);
    printf("XORed String: %s\n",xorresult);
    printf("ANDed String: %s\n",andresult);
}