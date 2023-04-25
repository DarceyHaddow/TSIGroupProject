#### TSIGroupProject
Repository for the Bakery EPOS System (TSI Group Project)
----------------------------------------------------------------
### Overview of Project
EPOS (Electric Point of Sale) system which provides bakery assistants an interface to use when serving customers. The EPOS will have a button for each bakery item and these can be added by quantity to a transaction. There will be a ‘checkout’ button to provide the sales assistant a total price for the transaction which they will then accept the cash for.


### Use of IDE's
- As discussed in our retrospective both netBeans and intelliJ can support this application: please make sure to check any changes in both IDEs for consistency before commiting your changes.
- The application is dependent on a connection with a database (Microsoft Access) to populate the combobox with products and prices. The appropriate Jar files are present allowing this connection to be established however in order to see the data, the application must be run in Netbeans rather than any other IDE.
- The netBeans IDE is best for making changes to the GUI as it gives an interactive Design interface.
- Only the netbeans IDE will connect to the database, use this IDE for interation.

### Important Note for Future Changes
- The seemingly empty currentOrderTest file in src/test is directly connected to the Maven files that allow this application's tests to run. Please DO NOT delete!

### Notes on Classes
- The Javax library (and the javax.swing.JFrame class) support the application. This is within the EposUI class.
- All classes have the package my.epos to allow them to be called within the main code.
- The Button class, created in the commit 'Basic Class Implementation Added', did have notes about adding an image to a button. This will require more investigation from the engineer if we decide to implement this! The notes have been deleted to maintain clean code.
- Both Product and Quantity have an Info method, these take the attributes of the class to allow them to be implemented in different places of the code.

- ER Diagram between Classes:

<img width="452" alt="image" src="https://user-images.githubusercontent.com/127321272/234123551-4477e801-12ca-4fac-a99b-ba96640f0255.png">


### User Stories
- As a user, I would like a clearly labelled interface, to easily ring through customer’s items. 
- As a user, I would like for buttons to store items and their prices 
- As a user, I want a checkout button to display order total request payment from the bakery customers for their items.  
- As the bakery owner, I would like for users of the system to login to the interface for security reasons. 
- As the bakery owner, I would like to be able to view the reports of the sales to add to the accounts.  
- As the bakery owner, I would like to be able to keep my product and price inventory up-to-date. 
