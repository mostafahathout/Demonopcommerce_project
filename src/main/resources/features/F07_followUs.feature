@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
 When user opens facebook link
 Then  fb is opened in new tab

  Scenario: user opens twitter link
  When user opens twitter link
   Then  Twiiter nopCommerce is opened in new tab
  Scenario: user opens rss link

 When user opens rss link
 Then Rss is opened in new tab
  Scenario: user opens youtube link
  When user opens youtube link
  Then "https://www.youtube.com/user/nopCommerce" is opened in new tab