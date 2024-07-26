Feature: Add New Admin Then Delete It
i want to add new admin then delete it successfully
Scenario Outline: Add-Delete Admin
Given user loged in
When user click on add new admin
And input "<User Role>" ,"<Employee Name>","<Status>" , "<Username>","<Password>","<Confirm Password>"
And user click on delete icon
Then new added admin deleted successfully

Examples:
|User Role |Employee Name |Status|Username|Password|Confirm Password|

|Admin|Ryan  Anderson|Enabled|Admin|admin123|admin123|
