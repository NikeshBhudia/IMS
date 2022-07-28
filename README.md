Coverage: 34%
# Inventory Management System

This projcect represent an inventory managment system, within this system you are able to create, read, update and delete, customers, items, orders and you are able to add extra items to an order after an order has been created. The data entered is also saved on a SQL database which can be both created and accessed through the code provided.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
###JDK
First thing to download is the Java Development Kit (JDK) this can be found on the oracle website.
-Upon download open the file and you will be promted with the set up page,proceed by clicking next.
-Upon the custom setup page click next.
-Upon the the destination page click next for it to download to its default location [(The JDK will now be installed in C:/Program Files/Java)] if you wish to chech it to install elsewhere please change it accordingly.
-Finally after this you will have succesfully completed installation. Proceed by clicking close.

Next we need to set up the environmental variables for the JDK.

-Press the Windows button and type "path" into the search field, then select "Edit the system environment variables"
-Click "Environment Variables...".
-From this screen you can edit both the "User" and the "System" variables. You should change the "System" variables (in the bottom half of the window) as we want our changes to affect ALL users. Click "New..." to add a new system variable.
-In the new popup window, we will create our new JAVA_HOME variable and give it a value corresponding to our JDK folder.
-Click "OK" and we should now see our new JAVA_HOME system variable in the "System variables" box like so.
-We now need to edit the "Path" variable to include a reference to the /bin (binary files) folder in our JAVA_HOME.
To do this select the "Path" variable under "System variables" and then click "Edit...".
-We need to append the path of the Java /bin folder to this "Path" variable. To do this, we will reference the JAVA_HOME variable we created i.e. %JAVA_HOME%\bin
-When you have done this, your "Path" variable should look like the image below (make sure that there is a semi-colon before and after %JAVA_HOME%\bin).



### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

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

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
