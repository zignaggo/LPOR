#include <stdio.h>
#include <stdlib.h>

int main()
{
    double celsius;
    double fahrenheit;
    printf("Qual a temperatura em Celcius?");
    scanf("%lf", &celsius);
    /*
    fprintf:
    %f -> double
    %Lf -> long double.

    fscanf:
    %f -> float
    %lf -> double
    %Lf -> long double.
    */
    fahrenheit = (celsius * 1.8) + 32;
    printf("\n%.2f Celsius is %.2f in Fahrenheit", celsius, fahrenheit);
    return 0;
}
