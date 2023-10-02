@smoke
Feature: using mouse hover method
  Scenario: verifying that user can choose from sub menu
Given user hover on Computers
When user hover on notebooks at subMenu
And user get the text of this sub-category and click on it
#5- after opening sub-category page, you need to get text of the page title
  And user get text of page title

#6- Assert that the sub-category title is (equal or contains) the one you get it while selecting random sub-category
Then  user Assert that the sub-category title is (equal or contains) Notebookd

#Note: you are supposed to use below functions

#toLowerCase().trim(); // this will change "Desktops " to "desktops"