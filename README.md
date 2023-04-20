#### TSIGroupProject
Repository for the Bakery EPOS System (TSI Group Project)
----------------------------------------------------------------
### Overview of Project
EPOS (Electric Point of Sale) system which provides bakery assistants an interface to use when serving customers. The EPOS will have a button for each bakery item and these can be added by quantity to a transaction. There will be a ‘checkout’ button to provide the sales assistant a total price for the transaction which they will then accept the cash for.


### Use of IDE's
- As discussed in our retrospective both netBeans and intelliJ can support this application: please make sure to check any changes in both IDEs for consistency before commiting your changes.
- The netBeans IDE is best for making changes to the GUI

### Notes on Classes
- The Javax library (and the javax.swing.JFrame class) support the application. This class is within the main code.
- All classes have the package my.epos to allow them to be called within the main code.
- The Button class, created in the commit 'Basic Class Implementation Added', did have notes about adding an image to a button. This will require more investigation from the engineer if we decide to implement this! The notes have been deleted to maintain clean code.
- The Button Class again is open to refactoring upon further investigation of the GUI's implementation.
- The Product class has 8 implemented objects in code, these hopefully will later be removed to read the products from a csv file. 
- Both Product and Quantity have an Info method, these take the attributes of the class to allow them to be implemented in different places of the code.

### User Stories
- As a user, I would like a clearly labelled interface, to easily ring through customer’s items. 
- As a user, I would like for buttons to store items and their prices 
- As a user, I want a checkout button to display order total request payment from the bakery customers for their items.  
- As the bakery owner, I would like for users of the system to login to the interface for security reasons. 
- As the bakery owner, I would like to be able to view the reports of the sales to add to the accounts.  
- As the bakery owner, I would like to be able to keep my product and price inventory up-to-date. 
