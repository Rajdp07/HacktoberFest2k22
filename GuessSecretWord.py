secret = "Campus"
turn = 9
guesses = ""
print("\nLet's play Guess the Word")
print(f"You have {turn} turns to guess the word")
print(len(secret) * ' _ ')
guess = input("Guess a letter: ")
guesses += guess
for letter in secret:
    if letter in guesses:
        print('',letter,'',end='')
    else:
        print(' _ ',end='')
print("\nEnd of Game")