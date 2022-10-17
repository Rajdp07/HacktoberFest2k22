sentence = input("Please enter a sentence, we will reverse all words in it: ")

# Reverse words in the string
words = sentence.split()[::-1]
reverse_sentence = []

for word in words:
    reverse_sentence.append(word)

print("Reverse all words in your sentence and make a new sentence: ")
print(" ".join(reverse_sentence))
