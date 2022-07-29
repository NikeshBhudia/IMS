Coverage: 34%  

  Inventory Management System

This projcect represent an inventory managment system, within this system you are able to create, read, update and delete, customers, items, orders and you are able to add extra items to an order after an order has been created. The data entered is also saved on a SQL database which can be both created and accessed through the code provided.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

###Prerequisites
JDK:
First thing to download is the Java Development Kit (JDK) this can be found on the oracle website. <br />
-Upon download open the file and you will be promted with the set up page,proceed by clicking next. <br />
-Upon the custom setup page click next. <br />
-Upon the the destination page click next for it to download to its default location [(The JDK will now be installed in C:/Program Files/Java)] if you wish to chech it to install elsewhere please change it accordingly. <br />
-Finally after this you will have succesfully completed installation. Proceed by clicking close. <br />

Set Up:

Next we need to set up the environmental variables for the JDK.

-Press the Windows button and type "path" into the search field, then select "Edit the system environment variables" <br />
-Click Environment Variables. <br />
-From this screen you can edit both the "User" and the "System" variables. You should change the "System" variables (in the bottom half of the window) as we want our changes to affect ALL users. Click New to add a new system variable. <br />
-In the new popup window, we will create our new JAVA_HOME variable and give it a value corresponding to our JDK folder. <br />
-Click Ok and we should now see our new JAVA_HOME system variable in the "System variables" box like so. <br />
-We now need to edit the "Path" variable to include a reference to the /bin (binary files) folder in our JAVA_HOME. <br />
To do this select the "Path" variable under "System variables" and then, click "dit. <br />
-We need to append the path of the Java /bin folder to this "Path" variable. To do this, we will reference the JAVA_HOME variable we created i.e. %JAVA_HOME%\bin <br />
-When you have done this, your "Path" variable should look like the image below (make sure that there is a semi-colon before and after %JAVA_HOME%\bin). <br />

MySQL:
-To download MySQL follow the link (https://dev.mysql.com/downloads/windows/installer/8.0.html) and download the link that says mysql-installer-community be sure not the download the one that mentions web. <br />
-Upon the opening the installer you will see a system notifaction box acking you to acceot the changes into your system, click accept to proceed. <br />
-Once the installer window is open choose the set up type as custom and click next. <br />
- Next will be promted to select what software you would like to install: <br />
  -select the newest from MySQL Server from MySQL Server <br />
  -select the newest from MySQL Workbench from application <br />
  -select the newest from Samples and Examples from Documentation <br />
  (Use the green arrow on the side to transfer them from the left to the right). <br />
  -Once these are correctly selected clcik next. <br />
-You should now be on the download page click Execute. <br />
-Once the downloads are finished click next. <br />
-You should then be taken to the installation page, Click execute. <br />
-Once the installation is finished, click next. <br />
-You will arrive on the Product Configureaction Page, click next. <br />
-You should now be on the Type ans Networking page, click Next. <br />
-You should now be on the Authentocation Method page, click next. <br />
-After completeing this you will be arrive on the Account and Role page, Enter a password for root(or admin account), typically this password is also set to root but it can be set to anything just be sure to not forget it. (If you ever do forget it you will have to uninstall are re install MySQL. Once you have completed this step click Next. <br />
-Upon arriving on the Windows Service page, CLick next. <br />
-Upon arriving at the Apply Configuration page, click Execute. <br />
-Once the configuration has been applied successfully, click finish. <br />
-You will now arrive on the Product configuration page, click Next. <br />
-You should now be on the Connect To Server page, enter the password and click Check. <br />
-If the connection succeeded, click Next. <br />
-You should now be on the Apply Configuration page, click Execute. <br />
-Once the configuration is applied, click Finish. <br />
-You should now be back on the Product Configuration page, click Next again. <br />
-You should now be on the Installation Complete page, click Finish. This will open MySQL Workbench. <br />

Set Up:

-Again open up the start menu and enter path to open your system environment variables. <br />
-Click Environment Variables.  <br />
-In the bottom System Variables panel of this window, click New. <br />
-In the Variable name enter (MYSQL_HOME) [ALL CAPS] and in the variable value enter the path to your MySQL by defult is should be (C:\ProgramFiles\MySQL\MySQL Server 8.0). Click OK. <br />
-Scroll through the bottom panel until you see the Path panel, click Edit, then New and add (%MYSQL_HOME%\bin). Click ok. <br />
-Finished. 

GitBAsh:

-In your browser of choice visit Git Bash download
-Then select Windows <br />
-Your download should begin automatically<br />
-Find the installer that was downloaded and run it<br />
-A window that looks like this should open, click Next<br />
-Leave the install location as default and click Next<br />
-Select the components shown here then click Next<br />
-Start menu folder should be 'Git' then click Next<br />
-Swap default editor from VIM to Notepad (this is because the default option Vim has a steep learning curve), then click Next<br />
-Select Override default branch name to "main" then click Next<br />
-Adjust where Git can be run from, selecting Use Git and optional Unix tools from the Command Prompt will allow you to use both Git Bash and command prompt for  version control, you can leave it on default if you'd prefer to only use Git Bash. <br />
-In this case, select the option `Git from command line and 3rd party software` then click `Next` <br />
-Select Use bundled OpenSSH then click Next<br />
-Select Use OpenSSL library then click Next<br />
-Select Checkout Windows-style then click Next<br />
-Select Use MinTTY then click Next<br />
-Select Default (fast-forward) then click Next<br />
-Select Git Credential Manager CORE then click Next<br />
-Tick Enable file system caching then click Next<br />
-Tick Enable experimental build-in file system monitor then click Next<br />
-Wait for Git to install<br />
-Launch Git Bash and click Finish<br />

SetUp:
-Open Terminal<br />
-(Make sure not to be in a repository, do this by typing git cd)<br />
-Proceed to enter (Replace USERNAME AND EMAIL with your own details. This will be done globally so you wont have to do once you have set this up once on your system.<br />
# git config --global user.name "[USERNAME]" <br />
# git config --global user.email "[EMAIL]" <br />
-If all step are followed your gitbash will be now read to use.

Mavern:

-To install mavern start by opening your EclipseIDE  
-Open Eclipse
-Go to Help -> Eclipse Marketplace
-Search by Maven
-Click "Install" button at "Maven Integration for Eclipse" section

### Installing

-To get the development environment running start of my scrolling to the top of this page and clicking on 'Code'.<br /> 
-There it will take you to the main page and you will see a green button with the label 'Code', Click that. <br />
-Upon clicking a drop down you will be presented with the HTTPS code, Copy that. <br />
-Once copied head into your eclipse terminal (be sure to open the git bash terminal: accessed through the windows tab at the top). Be sure not be in a directory, if you are trying 'cd' will take you back. <br />
-Paste 'git clone [HTTPS link you copied]' and press enter, give it a second and it will clone the repository down to your local machine. The default place for this will be in your users area. <br />
-Once this step is complete head to Open Eclipse. <br />
-Click File > Import  <br />
-Type Maven in the search box under Select an import source: <br />
-Select Existing Maven Projects. <br />
-Click Next. <br />
-Click Browse and select the folder that is the root of the Maven project <br />
-Click Next. <br />
-Click Finish. <br />
-You will successfully imported your project.  <br />
-To check if it works be sure to close any other projects and click the 'Run Runner' (green play) on the top or head into the runner file and Run through there. <br />
-If the console displays the option for the IMS then it mean the code has been imported successfully.


## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Upon cloning down the repositiory be sure to head into src/main/resources/sql-schema.sql and make sure the data there is the same as your personal SQL data so that the data bases can be created.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK](https://www.oracle.com/java/technologies/downloads/) - Develpment Environment
* [MySQL](https://dev.mysql.com/downloads/windows/installer/8.0.html) - Databse Service
## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Nikesh Bhudia** - *Developer* - [NikeshBhudia](https://github.com/NikeshBhudia)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
