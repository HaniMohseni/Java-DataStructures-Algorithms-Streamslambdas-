package com.sg.algorithms.expressionTree;


import java.util.Stack;

// Node class for the expression tree
class Node {
    String value;
    Node left;
    Node right;

    public Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

// Expression tree class
class ExpressionTree {
    Node root;

    public ExpressionTree() {
        root = null;
    }

    // Method to check if a given token is an operator
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // Method to build an expression tree from a postfix expression
    public void buildTree(String[] postfixTokens) {
        Stack<Node> stack = new Stack<>();

        for (String token : postfixTokens) {
            Node newNode = new Node(token);

            if (!isOperator(token)) {
                stack.push(newNode);
            } else {
                Node rightOperand = stack.pop();
                Node leftOperand = stack.pop();

                newNode.right = rightOperand;
                newNode.left = leftOperand;

                stack.push(newNode);
            }
        }

        root = stack.pop();
    }

    // Method to evaluate the expression tree
    public int evaluate() {
        return evaluateExpression(root);
    }

    // Helper method to evaluate expression recursively
    private int evaluateExpression(Node node) {
        if (node == null) {
            return 0;
        }

        if (!isOperator(node.value)) {
            return Integer.parseInt(node.value);
        }

        int leftValue = evaluateExpression(node.left);
        int rightValue = evaluateExpression(node.right);

        switch (node.value) {
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                if (rightValue != 0) {
                    return leftValue / rightValue;
                } else {
                    throw new ArithmeticException("Division by zero error");
                }
            default:
                return 0;
        }
    }
}

// Example usage:
public class ExpressionTreeAlgorithm {
    public static void main(String[] args) {
        String postfixExpression = "3 4 2 * +"; // Example postfix expression
        String[] postfixTokens = postfixExpression.split("\\s+");

        ExpressionTree tree = new ExpressionTree();
        tree.buildTree(postfixTokens);

        System.out.println("Postfix expression: " + postfixExpression);
        System.out.println("Evaluation result: " + tree.evaluate()); // Output the result of evaluation
    }
}
