SECURED-ORGANIZATION
====================

Testing if an organization’s boundary is secured

Introduction: An organization is made up of different levels and where there are different roles and according to the roles employees are provided with access privileges. An organization is said to be secured if proper access privileges are provided to all the employees, if even one employee gets some access privilege that is not associated with the role then the organization is compromised.
Objective: To create an organization having employees and different set of roles and access policies defined to the individual roles. Then to randomly assign these access privileges individually and in pairs to find out the most effect method of randomly assigning policies.
What we did:
1. Created an organization – Bank
2. Specified Roles – Director, Manager, Accountant, Cashier and Clerk
3. Created Employees – 2 2 2 3 3 =12 Employees
Roles\Access
Read
Write
Update
Insert
Delete
Full Director Yes Yes Yes Yes Yes Yes
Manager
Yes
Yes
Yes
Yes
Yes
Accountant Yes Yes Yes Yes
Cashier
Yes
Yes
Yes
Clerk Yes Yes
4. Now we randomly assigned the access policies to the employees.
5. Assignment of policies were also done in pairs for example Read-Write pair. In this if an employee gets Read access they also get Write access.
6. We then computed how accurate the assignment was in terms of an employee getting all the access required/less than that but not more than the defined access.
7. We did this simulation 5 times and found out which the best assignment method was and what the accuracy of it was.
How we did it:
1. Created employee list.
2. Access privileges and employee roles were defined in a Hash Map.
3. Random assignment was made to 12 employees. First individual access were given, then Write-Update pair was selected, then Read-Write pair and so on.
4. After assignment the value of accuracy of each assignment method was stored in different arrays.
5. Steps 3 & 4 were repeated FIVE times.
6. Arrays containing the accuracy values were summed up and divided by 5 to get an average.
7. The best value was selected and the method was displayed showing that it was optimal to assign the privileges
What did we learn?
We learnt that an organization is made up of different roles, where each role has a specific duty and can only access the files specified to its role.
We got an explanation for the Principle of Least Privilege and a fair idea of separation of duties.
The example on which we developed the project gave us an idea on how an organization functions and how the access privileges are distributed.
What did we like about the project?
We gained hands on experience of implementing what we have learnt in this semester about information security. We got to know the importance of information security in an organization. The very practice of writing code gave us insights how security is implemented in real world systems. Having a hands on practice of developing the program also gave us broader view of different security models their advantage and their disadvantages also where these security models can be deployed while keeping in mind their very importance. We have also learned that breach in security policies can compromise the integrity, privacy and confidentiality of data in an organization.
