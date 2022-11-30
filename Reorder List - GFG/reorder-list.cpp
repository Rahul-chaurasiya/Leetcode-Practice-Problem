//{ Driver Code Starts
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
/* Linked list Node */
struct Node {
    int data;
    struct Node* next;

    Node(int x) {
        data = x;
        next = NULL;
    }
};



// } Driver Code Ends
/* Following is the Linked list node structure */

/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }
};
*/

class Solution{
public:
    void reorderList(Node* head) {
        Node *move1 = head, *move2 = head;
        while (move2) {
            if (move1 != move2)
                move1 = move1->next;
            move2 = move2->next;
            if (move2)
                move2 = move2->next;
        }
        move2 = move1->next;
        move1->next = NULL;
        move1 = head;
        Node *temp = move2, *prev = NULL;
        while (move2) {
            temp = move2->next;
            move2->next = prev;
            prev = move2;
            move2 = temp;
        }
        move2 = prev;
        while (move2) {
            temp = move1->next;
            prev = move2->next;
            move1->next = move2;
            move2->next = temp;
            move1 = temp;
            move2 = prev;
        }
    }
};

//{ Driver Code Starts.



/* Function to create a new Node with given data */
struct Node* newNode(int data) {
    struct Node* new_Node = new Node(data);
    new_Node->data = data;
    new_Node->next = NULL;
    return new_Node;
}

void printList(struct Node* Node) {
    while (Node != NULL) {
        printf("%d ", Node->data);
        Node = Node->next;
    }
    printf("\n");
}

void freeList(struct Node* head) {
    struct Node* temp;
    while (head != NULL) {

        temp = head;
        head = head->next;
        free(temp);
    }
}

int main(void) {
    int t, n, m, i, x;

    cin >> t;
    while (t--) {
        struct Node* temp, *head;
        cin >> n;
        cin >> x;
        head = new Node(x);
        temp = head;
        for (i = 0; i < n - 1; i++) {
            cin >> x;
            temp->next = new Node(x);
            temp = temp->next;
        }
        
        Solution ob;
        
        ob.reorderList(head);
        printList(head);
        freeList(head);
    }
    return 0;
}

// } Driver Code Ends