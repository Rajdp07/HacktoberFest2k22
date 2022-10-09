n = input("Please enter a number: ")
try:
    n = int(n)
except ValueError:
    print("Requires a valid integer!")