import re

def isPalindrome(textInput):
    forward = ''.join(re.findall(r'[a-z]+',textInput.lower()));
    backward= forward[::-1]
    return forward == backward

print(isPalindrome('Mala yalam'))