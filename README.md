# CSC 335 Lab 2: Arizona Michael's

Honoring the CSC 335 tradition of naming our cafe after the head TA we have a small 
Point of Sale terminal for a sandwich shop (not
to be confused with Jersey Mike's) that has a Loyalty Program 
to reward repeat customers. Every fifth visit, the customer gets a 10% discount.

We will model the store as a loop of customers who visit and make multiple orders. You
can close down the store by entering `exit`. This will permanently cause it to go
out of business (brutal!).

## Instructions

1. We have provided a UML diagram for the missing PunchCard class that you can load into
https://app.diagrams.net/ to view. Turn that diagram into the implementation of PunchCard.

2. Modify CashRegister.java wherever you see `// TODO` and add visit tracking
and Nth-visit discounts to the customer's total. Remember, it's every Nth visit,
not just the Nth visit. So if N=3, every third visit, etc.

Add the other classes to the UML diagram and make sure to submit everything via
GitHub by next week's section.

