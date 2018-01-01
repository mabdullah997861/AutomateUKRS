# AutomateUKRS

Background: 
I have used cucumber jvm project template to write the scenarios in BDD format. 

Project Structure: 
helpers package contains data helper and log classes.
Modules package will have all action classes for example signin action , checkout action. 
pageObjects have page object classes defined
step_definitions package has all step definitions and hooks class as well as Cucumber Runner class (where we can set options)
features package has all .feature files
testData package has test data files eg. excel files
pom.xml – since it is a maven project and has all dependencies as GAVs
log4j.xml – config file for log4j

Project: UKRSOnline

They are in total 5 Scenarios 

2x – End to End Test Scenarios– Homepage to checkout 

3x – Search filter test Scenarios

Exception: Tests will break if survey pop up comes up . 
