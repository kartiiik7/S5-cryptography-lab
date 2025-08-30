#include<stdio.h>
void main(){
	char input[]="helloworld";
	int i,len=sizeof(input)-1;
	char enc[len],dec[len];
	for(i=0;i<len;i++){
 		enc[i]=(((input[i]-'a')+3)%26)+'a';
		dec[i]=(((enc[i]-'a')-3)%26)+'a';
	}
    printf("Original string: %s\n", input);
    printf("Encrypted string=%s\t\n",enc);
    printf("Decrypted string=%s\t\n",dec);
}
