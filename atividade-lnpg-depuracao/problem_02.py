# Declaração do problema: Dada uma array de números inteiros, encontre a soma máxima de um sub-array de tamanho k.

def max_subarray_sum(arr, k):
    n = len(arr)
    # Correção: validação se é maior que 0 e menor que o tamanho da lista
    if not 0 < k <= n:
        print("Invalid input")
        return -1

    max_sum = 0
    for i in range(k):
        max_sum += arr[i]

    window_sum = max_sum
    for i in range(n - k):
        window_sum = window_sum - arr[i] + arr[i + k]
        max_sum = max(max_sum, window_sum)

    return max_sum


def read_input():
    try:
        arr = list(
            map(int, input("Enter the array elements separated by spaces: ").split()))
        k = int(input("Enter the size of the subarray (k): "))
        return arr, k
    except ValueError:
        print("Invalid input. Please enter integers only.")
        return [], 0


def main():
    arr, k = read_input()
    result = max_subarray_sum(arr, k)
    if result != -1:
        print("Maximum sum of a subarray of size {} is {}".format(k, result))


if __name__ == "__main__":
    main()
