import random

# Mapping numbers to choices
choices = ["Scissor", "Rock", "Paper"]

# Randomly generate computer's choice
computer = random.randint(0, 2)

# Prompt user for their choice
user = int(input("Enter a number (0: Scissor, 1: Rock, 2: Paper): "))

# Display choices
print(f"You chose {choices[user]}. Computer chose {choices[computer]}.")

# Determine the outcome
if user == computer:
    print("It's a draw!")
elif (user == 0 and computer == 2) or \
     (user == 1 and computer == 0) or \
     (user == 2 and computer == 1):
    print("You win!")
else:
    print("You lose!")
