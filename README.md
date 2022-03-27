This Java app is a work-in-progress that simulates the creation of passwords for an admin or user object. Using the Scanner utility, the user interacts with the program.
You are guided through a series of questions that lead you to the creation of an object (Admin/User account) where you then set your username and your password.
This information is saved by means of adding it to an ArrayList (Java.util package) located in the Main class. Looping and conditional constructs help guide the user.

1. Goals for this project: Create a database and table to be associated with the admins and users. (Work in progress)
2. Use JDBC to connect this app with the database. (Work in progress)

ATTENTION:\
This repository includes .java files that need to be compiled by the Java compiler into class files before being ran.
You can do this via your preferred IDE or via Windows CLI / Apple's Terminal / Linux CLI, etc.

FOR WINDOWS:\
(Install Java, e.g. Java SE 17.)\
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html \
Extract the cloned zip file.\
Open the Command Prompt.\
Use 'cd' (change directory) to navigate to the extracted folder's SRC directory.\
Your CLI should look something like this:\
'C:\\Users\\(yourusername)\\Downloads\\AdminUserPasswords-JAVA-main\\src>'.\
\
In my case, when downloading and unzipping the file with the default name, the syntax looks like this below: \
\
My default CLI directory is C:\\Users\\(my username).\ 
\
If yours differs, that is ok, just navigate to the src directory of the unzipped file.\
\
For me, this was 'cd Downloads\AdminUserPasswords-JAVA-main\src' \
\
Enter 'javac ./com.AdminProject/main/Main.java' (This will compile the .java files in the directory into .class files).\
Enter 'java com.AdminProject.main.Main' (This will run the .class files that were compiled).\
\
And the program should begin prompting you with messages!
