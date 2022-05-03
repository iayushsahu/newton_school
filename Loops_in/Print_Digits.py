def printValue(digit):
 
    # For digit 0
    if digit == '0':
        print("zero", end = " ")
 
    # For digit 1
    elif digit == '1':
        print("one", end = " ")
 
    # For digit 2
    elif digit == '2':
        print("two", end = " ")
 
    #For digit 3
    elif digit=='3':
        print("three",end=" ")
 
    # For digit 4
    elif digit == '4':
        print("four", end = " ")
 
    # For digit 5
    elif digit == '5':
        print("five", end = " ")
 
    # For digit 6
    elif digit == '6':
        print("six", end = " ")
 
    # For digit 7
    elif digit == '7':
        print("seven", end = " ")
 
    # For digit 8
    elif digit == '8':
        print("eight", end = " ")
 
    # For digit 9
    elif digit == '9':
        print("nine", end = " ")
 
# Function to iterate through every
# digit in the given number
def printWord(N):
    i = 0
    length = len(N)
 
    # Finding each digit of the number
    while i < length:
         
        # Print the digit in words
        printValue(N[i])
        i += 1
 
# Driver code
N = input()
printWord(N)