# Author: José Manuel Gamboa Gómez

## Part 2: Implementing the Tasks Microservice RESTFUL API

2. Create a new package called dto and inside define your TaskDto object with at least the following fields

    ![DTO Package](img/TaskDTO%20folder.png)

    ![TaskDTO Class](img/TaskDTO%20Class.png)

3. Create a new package called entities and inside define your Task entity object with the same fields as the dto version:

    ![Entities Folder](img/Entities%20Folder.png)

    ![Task Class](img/Task%20Class.png)

4. Create a new package called service and inside create the following interface

    ![Service Folder](img/Service%20Pack.png)

    ![TaskService Interface](img/TaskService%20Inter.png)

5. Create an implementation of the TaskService using a HashMap data structure inside and make sure your service implementation TaskServiceHashMap is injectable using the @Service annotation.

    ![TSHM](img/TSHM.png)

    ![TaskContro Impl](img/TaskController%20Impl.png)

+ **Endpoints Test**

+ Post Test

    ![Post Test](img/Post%20Test.png)

+ GetAll Test

    ![Get Test](img/Get%20Test.png)

+ GetById Test

    ![Find Test](img/Find%20Test.png)

+ Put Test

    ![Update Test](img/Put%20Test.png)

+ Delete Test

    ![Delete Test](img/Delete%20Test.png)

+ Delete Fail Test

    ![Delete Fail Test](img/Delete%20Fail%20Test.png)