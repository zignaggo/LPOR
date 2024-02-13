#include <stdio.h>
#include <stdlib.h>
int main()
{
    /* code */
    int number;
    printf("Digite um numero: ");
    scanf("%d", &number);
    if (number % 2 == 0){
        printf("Par");
    } else {
        printf("Impar");
    }
    return 0;
}
