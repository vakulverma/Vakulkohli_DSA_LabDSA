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

# PairWithGivenSumInBST.java
The program is designed to find a pair of nodes in a Binary Search Tree (BST) that sum up to a given target value.
 To achieve this, the program follows these steps:

In-Order Traversal: The program starts by performing an in-order traversal on the BST. 
In-order traversal visits the nodes in ascending order, and it is used here to convert the BST into a sorted array.
 The sorted array will allow us to apply the two-pointer approach.

Two-Pointer Approach: Once the in-order traversal is completed, the program uses a two-pointer approach on the sorted array. 
Two pointers, one at the beginning and another at the end of the array, are initialized. The pointers move towards each other to 
find the pair of nodes that sum up to the given target.

Finding the Pair: At each step, the program calculates the sum of the values pointed to by the two pointers.
 If the sum is equal to the target value, it means the pair is found, and the program prints the pair.
 If the sum is less than the target, the left pointer is moved to the right, and if the sum is greater than the target, 
 the right pointer is moved to the left. The process continues until the pair is found or until the pointers meet, 
 indicating that no such pair exists.

