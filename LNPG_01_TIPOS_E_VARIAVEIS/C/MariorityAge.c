#include <stdio.h>
#include <stdlib.h>
int main()
{
    /* code */
    int age;
    printf("Qual sua idade: ");
    scanf("%d", &age);
    if (age < 18) {
        printf("Nao Pode ser preso");
    } else {
        printf("Pode ser preso");
    }
    return 0;
}
