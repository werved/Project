# QAE-BINAR ACADEMY-B2C


## QAE Wave 21 Team A

Learn how to create Web and App automation testing.


## Team Member
- Faaiq Abdillah `Team Lead`
- Lau T	`Scrum Master`
- Wery Veditya `Team Member`
- Teuku Ardhianzah D.S `Team Member`



## Object Testing

| Name           | Link                                                                                 |
| ------------   | ------------------------------------------------------------                         |
|Second Hand Web | [Click Here](https://secondhand.binaracademy.org/)                                   |
|Second Hand App | [Click Here](https://drive.google.com/file/d/1bXcd7Cm2BySiUjCs6xNbBLLgA-mAT1Hg/view) |



## Tools
| App                                                      | Version           |
| ------------                                             | ----------------  |
| Git                                                      | 2.45.2            |
|Sourcetree                                                | 3.4.18            |
| Katalon Studio                                           | 8.6.9             |
| Browser (Mozilla Firefox, Google Chrome, Microsoft Edge) | Latest Version    |
| Android Studio                                           |  2020.3.1 Patch 3 |
| Vysor                                                    | 5.0.7             |

## What We Have Learned:


### 1. Git Flow

 - git pull: Pull changes from the remote repository into the local repository. &#10003;
 - git checkout -b "branch name": Create a new branch. &#10003;
 - git checkout "branch name": Switch to the specified branch. &#10003;
 - git add . : Stage all changes in the current directory for the next commit. &#10003;
 - git status: Show information about which changes have been staged, which haven't, and which files are not being tracked. &#10003;
 - git commit -m "title": Create a commit with a message. &#10003;
 - git log --oneline: Show History commit
 - git push -u origin "branch name": Push local repository into remote repository. &#10003;
 - git merge "source branch": Merge changes from the source branch into the current branch. &#10003;
 - git clean -fd: Discard new file. 
 - git clean -fd "file": Discard spesific file. &#10003;
 - git reset "commit number": Undo commit. &#10003;
 - git branch -m "oldname" "newname": Rename branch. &#10003;




### 2. Katalon
```
|-- create project 1
		    |-- set .gitignore 2
            |-- include
                |-- features (gherkin) 3
                |-- step definitions 7
		    |-- object repository
                |-- test objects (locator) 4
            |-- test cases
                |-- method 5
                |-- runner 8
            |-- keyword
                |-- custom keyword [if required] 6
            |-- test listener
                |-- hook 9
            |-- test suites 10
------------------------------------------------------------
            |-- report
            |-- driver
            |-- browser/device
```

1. **create project**: Create a new project to automate. &#10003;
2. **set .gitignore**: To ignore files so they don't get pushed to the remote repository. &#10003;
    <br>
    common .gitignore:
    - **/*.log
    - **/*.gradle
    - **/*.properties
    - **/*.classpath
    -  **/*.project
    - **/*.idea
    - **/*.settings
    - **/*.cache
    - **/*.meta
    - **/bin
    - **/Reports
    - **/Libs
    - **/output
    - **/build
    - **/apk
    - **/settings
    - **/*.prj

3. **features (gherkin)**: Contains steps from a feature with gherkin syntax. &#10003;
    <br>
    - Feature: Feature name.
    - @ (tag): Tagging feature or scenario for runner
    - Background: To define steps that are can use to all scenarios within a feature.
    - Given: Sets up the initial context or state of the feature.
    - When: Contains the action or event that triggers the behavior.
    - Then: Contains the expected outcome or result of the action (When).
    - And: Used to add more details or conditions to the steps.

4. **test objects (locator)**: Contains the target to be tested &#10003;
    <br>
    common test objects (locator):
    - id / resource-id
    - name
    - class
    - data-test
    - xpath

5. **method**: Contains methods used in test cases. &#10003;

6. **custom keyword**: Contains custom keyword for supporting method. &#10003;

7. **step defintion**: Define gherkin syntax within a feature into code. &#10003;

8. **runners**: Execute test cases. &#10003;
    <br>
    code:
    - CucumberKW.*runFeatureFiles*("") = Want to run a Spesific feature.
    - CucumberKW.*runFeatureFilesWithTags*("","") = Want to run from feature with spesific tags
    - CucumberKW.*runFeatureFolder*("") = Want to run features in a spesific folder.
    - CucumberKW.*runFeatureFolderWithTags*("","") = Want to run features within spesific tags in a spesific folder.


9. **test suites**: Groups several test cases to be run together. &#10003;

10. **hooks (test listeners)**: Manages actions run (method) before or after a test suite is executed. &#10003;
----------------------------------------------------------------
11. **report**: Generates run test result reports. &#10003;

12. **driver**: Connects to the browser or device to be tested. &#10003;

13. **browser/device**: The environment where the testing is executed. &#10003;






### 3. Other

|                                             |                          |
| ------------                                | -------------------------|
| Work as team. &#10003;                      | Resolving issues &#10003;|
| Take responsibility for own tasks. &#10003; | Collaboration. &#10003;  |
|Open Discussion &#10003;                     | etc..                    |