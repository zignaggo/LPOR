#include <stdio.h>
#include <stdlib.h>
int main()
{
    /* code */
    double firstNumber;
    double secondNumber;
    printf("Digite um numero: ");
    scanf("%lf", &firstNumber);
    printf("Digite outro numero: ");
    scanf("%lf", &secondNumber);
    int answer;
    printf("\nOperacoes\n[1] - Somar\n[2] - Subtrair\n[3] - Multiplicar\n[4] - Dividir\nSua resposta: ");
    char operation;
    double result = 0;
    scanf("%d", &answer);
    switch (answer)
    {
    case 1:
        operation = '+';
        result = firstNumber + secondNumber;
        break;
    case 2:
        operation = '-';
        result = firstNumber - secondNumber;
        break;
    case 3:
        operation = '*';
        result = firstNumber * secondNumber;
        break;
    case 4:
        operation = '/';
        result = firstNumber / secondNumber;
        break;

    default:
        printf("Resposta nao encontrada");
        break;
    }
    printf("\n%.2f %c %.2f = %.2f", firstNumber, operation, secondNumber, result);
    return 0;
}
