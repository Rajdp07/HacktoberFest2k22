secret = "campus"
turn = 9
n=0
guesses = ""
print("\nLet's play Guess the Word")
print(f"You have {turn} turns to guess the word")
print(len(secret) * ' _ ')
while n<9:
    guess = input("\nGuess a letter: ")
    n+=1
    guesses += guess
    if guess == secret:
        print('You Won')
        break
    else:
        for letter in secret:
            if letter in guesses:
                print('',letter,'',end='')
            else:
                print(' _ ',end='')
print("\nEnd of Game")
