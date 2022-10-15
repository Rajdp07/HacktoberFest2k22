a = input("Please enter number a: ")
b = input("Please enter number b: ")
c = input("Please enter number c: ")
print(a, b, c)

a = int(a)
b = int(b)
c = int(c)

largest = a
if b > a:
    largest = b
if c > largest:
    largest = c
print("The largest number is: " + str(largest))
