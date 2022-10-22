number_list = [2, 9, 20, 15, 200, 34, 16, 45, 4, 62, 87, 94, 29, 155, 44]
small_list = []
big_list = []
print('Hello World! Welcome to the game')
print("Initial list: ")
print(number_list)
user_input = int(input("Please enter a number, we will split our list to two list using your number :"))
for num in number_list:
    if num < user_input:
        small_list.append(num)
    else:
        big_list.append(num)
print("list less than " + str(user_input) + ": ")
print(small_list)
print("list greater than or equal " + str(user_input) + ": ")
print(big_list)