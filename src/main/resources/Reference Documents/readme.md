## News Api
## Project Description
### ```1. Requirements```
<li>Kotlin
<li>Maven
<li>Cucumber plugin

### ```2. Build and Deployment Steps```
#### Run command: 

``` console 
 mvn install
 ``` 
on the project root directory terminal or depending on the IDE, you can select ```build app```
#### Run project as springboot app
#### The project starts on port specified in the environment part in this case 
``` bash 
8881
```
### Testing
#### 1. Using Swagger 
Navigate to <a>http://localhost:8881/swagger-ui.html to get api documentation
#### Test the api endpoints specified on the swagger page.
#### 2. Using Postman
Open postman on the url  ```http://localhost:8881/api```.

Test the different apis specified on the postman collection here <a>https://drive.google.com/file/d/11bbaxOx7o8GsBx6_IUk-r2eQxxFhTPRp/view?usp=sharing

### ``` 3. Tests```
Cucumber and Junit were used to do intergration tests.

To test, 
navigate to ```test``` test folder and under ```resources```  folder there's features folder with all test files.
select a feature to test and run it.


