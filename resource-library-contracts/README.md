## Synopsis

This is a little Demo-Project to demonstrate the power of **Resource Library Contracts** in combination with the popular Component-Library **PrimeFaces**. 
This example is based on Spark and Titan, PrimeFaces premium themes, which are not included in this example. Instead I mocked it with basic css, so you see a difference. In case you want to use PrimeFaces premium layout, just drop the "<theme>-layout" folder into the contracts-folder, and you are good to go. 

## Motivation

**Resource Library Contracts** is a powerful feature of JSF, yet rarely seen in projects. If you want to use multiple themes and/or facelet-templates in your application, this is the way to go. There aren't much resources around, so I felt the need to contribute a little example to get you kickstarted. 

## Installation

Clone the project, build it and fiddle around with it.
The structure of the different contract-directories is modeled after what PrimeFaces Premium-Themes look like. 

Here is a short description of the steps necessary to take if you want to do it from scratch:

1.) Create a folder named "contracts" in the root of the webapp/WebApplication-Directory. If you want a different location, set the context-param "javax.faces.WEBAPP_CONTRACTS_DIRECTORY" in your web.xml 
 
2.) Create folders for your contracts in the respective contracts-directory. 

3.) Put templating stuff in your contracts. CSS, Images, JS, etc. 

4.) Surround your ui:compositions with an f:view tag and set the contracts-attribute with the name of a contract (the folders you created). Like this: <f:view contracts="contract-name". If you want it dynamic, put EL in there.

4a.) In the case of PrimeFaces also set your primefaces.THEME context-param in your web.xml to use the respective theme. You can put EL in there as well. 

5.) Enjoy your new templating-awesomeness 

## License

Since there is not really anything useful and/or secret stuff here, knock yourself out. If I had to name a license it would be the WTFPL found here http://www.wtfpl.net/about/.
