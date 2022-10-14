import random
print('Welcome to Hacktober Fest 2022! Welcome to guess number game')
number = random.randint(1, 12)
print('Number has been generated!!\nYou have 5 chances to guess the number')

count = 5

while count != 0:
    guess_number = int(input('Guess the number: '))

    if guess_number == number:
        print("Congratuations! You won!")
        break
    elif guess_number > number:
        print('You number is too big, please retry.')
    else:
        print('You number is too small, please retry.')
    count=-1