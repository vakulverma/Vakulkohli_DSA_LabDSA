# Vakulkohli_DSA_LabDSA
The program for balancing brackets is designed to check whether a given string contains balanced brackets. The balanced brackets mean that each opening bracket should be closed in the correct order.
The balanced brackets mean that for each opening bracket (such as '{', '[', or '('), there is a corresponding closing bracket 
(such as '}', ']', or ')') in the correct order. The program uses a suitable data structure, a stack, to validate the balance 
of the brackets in the string.

The program explanation is given below:

1. Takes input from the user as brackets.
2. The program processes the input string character by character.
3. When an opening bracket is encountered, it is pushed onto the stack
4. the program checks if the stack is empty if a closing bracket is encountered.
   If it is empty, it means there is no corresponding opening bracket, and the string
   is unbalanced. Otherwise, it pops the top element from the stack and checks if it matches
   the encountered closing bracket.
5. If the popped opening bracket does not match the encountered closing bracket, the string is unbalanced.
6. The process continues until all characters in the input string are processed.
7. After processing the entire string, if the stack is empty, it means all brackets are balanced, and the string is balanced.
   Otherwise, the string is unbalanced.
