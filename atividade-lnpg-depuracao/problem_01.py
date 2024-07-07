def calculate_average(numbers):
    # Correção: Validação caso a lista seja vazia
    # Erro tratado: ZeroDivisionError: division by zero
    lenght = len(numbers)
    if(lenght < 1):
        return 0
    
    total = sum(numbers)
    return total / len(numbers)

def find_max(numbers):
    # Correção: Validação caso a lista seja vazia
    # Erro Tratado: IndexError: list index out of range
    lenght = len(numbers)
    if(lenght < 1):
        return 0
    
    max_number = numbers[0]
    for number in numbers:
        if number > max_number:
            max_number = number
    return max_number


def get_numbers():
    numbers = input("Enter numbers separated by spaces: ").split()
    numbers = [int(num) for num in numbers]
    return numbers


def main():
    numbers = get_numbers()
    print("Average:", calculate_average(numbers))
    print("Maximum:", find_max(numbers))


if __name__ == "__main__":
    main()
