# designAPI

## Alex Patai ic20b113

Task:

You want to develop a quick API that helps you with design questions. Your API should be
able to:
  - Return the complementary color of red, orange, yellow, green, blue, and purple
  
You should implement a REST-based server in Java (use Spring Boot). The service should
be able to return the desired information using REST.

Use GitHub or Azure DevOps for the project and follow the correct DevOps procedure. Use a
Kanban board to manage your User Stories and use a git branching model (preferable
gitflow) to manage your code. Track your development process by updating your Kanban
board and write at least one unit tests for every requirement. A Continuous Integration
pipeline that produces the finished software artifact should be implemented as well.
Document
  • the whole process
  • the user stories
  • the repository URL
  • the usage of the software
in a Readme file with explanatory text. Submit the code (including the .git folder and ALM
files) as a zip file (please put the Readme inside the zip file).
You can use external resources as long as you mark them: “ // taken from: <URL> ”
  
  Red  → Green
Orange  → Blue
Yellow  → Purple
  
  
  As an ALM tool, Github was used. There was a Kanban-board created where the user stories were defined and converted to issues.
  From the issues, I have used the Create branch button to create feature branches.
  After implementing the issue, I have created pull requests to merge the changes back to the develop branch.
  
  I have used a CI/CD pipeline for continuous dev and testing, that can be seen in the Actions menu.
  
  Everything has been documented in by screenshots that can be found in the ./screenshots folder. 
  
  The develop branch is at the end of the project merged back to main and it is given a tag, to mark the release.
  
  
 ##Usage
 
  Download the artifact from the pipeline and execute the .jar file with the following command:
  
  java -jar <filename>.jar
  
  The service should be up and running.
  
  use the following URL to see if the service is running:
  
  http://localhost:8080/
  
  
  use the following URL to get the complementary color of yellow (red, green, blue, purple and orange are other possible colors)
  
  http://localhost:8080/api/complementary/color=yellow
