Step-1: Go to the project root folder using cd
---

Step-2: Clean and build the project with maven
---
sudo mvn install

Step-3: Run docker compose
---
sudo docker-compose up

Step-4: Access web app from browser
---
http://localhost:8085

Step-5: Create an user with role ADMIN and login with that user
---
http://localhost:8085/register
<br/>
(Note: user with role USER has no access to batch job execution button)

Step-6: Run the batch job
---
When "Run Job" button is clicked you should be able to see status "COMPLETED"

Step-7: Verify database
---
username: test 
<br/>
password: test 
<br/>
database: firstlab

Step-8: Destroy the containers
---
sudo docker-compose down