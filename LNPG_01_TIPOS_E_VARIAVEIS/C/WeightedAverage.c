#include <stdio.h>
#include <stdlib.h>

int main()
{
    /* code */
    double result;
    const int STUDENT_NUMBER = 3;
    double mark;
    double weight;
    double weightSum;
    for (int index = 0; index < STUDENT_NUMBER; index++) {
        printf("\nNota %d: ", index);
        scanf("%lf", &mark);
        printf("Peso %d: ", index);
        scanf("%lf", &weight);
        result += (mark * weight);
        weightSum += weight;
    };
    printf("A media ponderada foi: %.2f", result / weightSum);
    return 0;
}
