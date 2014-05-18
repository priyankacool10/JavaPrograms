This program is done using singleton pattern.

Here is the problem :
/* Let’s say that there’s a husband and wife - Jack and Jill - who share a joint account. They currently have $1,000 in their account. They both log in to their online bank account at the same time, but from different locations.

They both decide to deposit $200 each into their account through a wire transfer from other bank accounts that they have at the same time. So, the total account balance after these 2 deposits should be $1,000 + ($200 * 2), which equals $1,400.

Let’s say Jill’s transaction goes through first, but Jill's thread of execution is switched out (to Jack’s transaction thread) right after executing this line of code in the deposit method:


temp = balance + amount;

Now, the processor is running the thread for Jack, who is also depositing $200 into their account. When Jack’s thread deposits $200, the account balance is still only $1,000, because the variable accountBalance has not yet been updated in Jill’s thread. Remember that Jill’s thread stopped execution right before the accountBalance variable was updated.

So, Jack’s thread runs until it completes the deposit function, and then updates the value of the accountBalance variable to $1200. After this, control returns to Jill’s thread, where newAccountBalance has the value of $1200. Then, it just assigns this value of $1,200 to accountBalance and returns. And that is the end of execution.

What is the result of these 2 deposits of $200? Well, the accountBalance variable ends up being set to only $1200, when it should have been $1400. This means Jack and Jill lost $200. This is good for the bank, but a huge problem for Jack and Jill, and any other of the bank's customers.

*/

This problem is sorted out by using synchronized methods.