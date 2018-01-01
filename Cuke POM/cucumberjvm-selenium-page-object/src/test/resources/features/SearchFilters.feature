Feature: Test search filters

Scenario: Search item
	Given I open ukrsonline website
	When I search the item
	Then I verify displayed results
	
Scenario: Verifying the search filters by price
	Given I open ukrsonline website
	When I search the item
	When I sort results by price and ascending
	Then I verify results sorted by price in ascending order

Scenario: Verifying the search filters by price
	Given I open ukrsonline website
	When I search the item
	When I sort results by price and descending
	Then I verify results sorted by price in descending order