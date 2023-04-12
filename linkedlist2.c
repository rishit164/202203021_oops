#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node * next;
};
struct node * head;
void insertlast(int data)
{	
	struct node * temp = (struct node *) malloc(sizeof(struct node));
	temp->data = data;
	temp->next = NULL;
	if(head==NULL)
	{
		head = temp;
	}
	else
	{
		struct node * k = head;
		while(k->next!=NULL)
		{
			k=k->next;
		}
		k->next=temp;
	}
}
void insert(int data)
{
	struct node * temp = (struct node *) malloc(sizeof(struct node));
	temp->data = data;
	temp->next = head;
	head=temp;
	
}
void removek()
{
	struct node * k = head;
	head=head->next;
	free(k);
}
void removelast()
{
	struct node * k = head;
	struct node * p = NULL;
	while(k->next!=NULL)
	{
		p=k;
		k=k->next;
	}
	p->next=NULL;
}
void removeAt(int index)
{
	struct node * k = head;
	struct node * p = NULL;
	if(index==1)
	{     
		head=head->next;
	}
	else
	{
		int i=0;
		for(i=1;i<index;i++)
		{
			p=k;
			k=k->next;
		}
		p->next=k->next;
		free(k);
	 
	}
}
void show()
{
	struct node * k = head;
	while(k!=NULL)
	{
		printf("%d  ",k->data);
		k=k->next;
	}
	printf("\n");
}
void insertAt(int index,int data)
{
	struct node * temp = (struct node *) malloc(sizeof(struct node));
	temp->data = data;
	temp->next = NULL;
	if(index==1)
	{
		temp->next=head;
		head=temp;
	}
	else
	{
		struct node * n = head;
		int i;
		for( i=1;i<index-1;i++)
        {
            n = n->next;
        }
        temp->next=n->next;
        n->next= temp;
	}
}
int main()
{
	insert(2);
	show();
	
	insertlast(5);
	show();
	
	insertAt(2,98);
	show();
	
	insert(8);
	show();
	
	removek();
	show();
	
	removeAt(2);
	show();
	
	removelast();
	show();
	
}
