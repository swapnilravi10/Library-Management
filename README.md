# Library-Management
Library Management Core Java Application

<b>What is this project about?</b>

This is a library management project that lets the Library management to :

1)	Login as Admin
2)	Login as Librarian

#On entering the credentials of <b>Admin</b> grant access as admin and allow the user to 

1)	Add a new Librarian 
2)	View all the Librarians
3)	Delete a particular Librarian using  ID

#On entering the credentials of <b>Librarian</b> grant access as librarian and allow the user to

1)	Add new book
2)	View the books
3)	Issue a book
4)	Return a book

<b>Development of project and requirements:</b>

The project is a core java application build on Netbeans using <b>maven</b> and <b>hibernate</b>.

<b>Database Used:</b>
MySQL

Tables created:Librarian, Book and Admin<br/>
Librarian columns:<br/>
id(int) : name(string) : pass(password) : email(string)<br/>
Book columns:<br/>
id(int) : name(string) : author(string) : stock(int)<br/>
Admin columns:<br/>
id(int) : name(string) : password(string)<br/>
<b>IDE:</b>
Netbeans

<b>Programming Language:</b>
Java

<b>Functions Fully Functionals of project:-</b>

1)	Admin Login
2)	Add Librarian
3)	Delete Librarian
4)	Add new Book
5)	Librarian login 
6)	View all librarians
7)	View the books

<b>Functions to be worked on in the project:-</b>

1)	Issue a book  (Appropriate decrement in Stock and Increment in issue )
2)	Return a book (Appropriate increament in Stock and decrement in issue)

Start Project <b>{LibraryMain.java}</b>
