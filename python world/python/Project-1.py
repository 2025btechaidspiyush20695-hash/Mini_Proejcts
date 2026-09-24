#SNAKE , WATER , GUN GAME
import random
computer = random.choice([-1,0,1])
youstr = input("enter your choice :")
youDict = {"s":1,"w":-1,"g":0}
reverseDict = {1:"snake",-1:"water",0:"gun"}
you = youDict[youstr]
#by now we have two numbers , you and computer
print(f"you choose {reverseDict[you]}\ncomputer choose {reverseDict[computer]}")
if(computer == you):
        print("its a draw")
else:
    if(computer == -1 and you == 1):
        print("you win !!")
    elif(computer == -1 and you == 0):
        print("you Lose ")
    elif(computer == 1 and you == -1):
        print("you Lose ")
    elif(computer == 1 and you == 0):
        print("you Win !!")
    elif(computer == 0 and you == -1):
        print("you Win !!")
    elif(computer == 0 and you == 1):
        print("you Lose ")
