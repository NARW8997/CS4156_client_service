﻿# CS4156_client_service
 ### The service is the client service of Customer for DrinkMoreWater service
 ### The service has mainly 4 modules
* ___Users___
     * `GET /user`  
          * Description: This endpoint retrieves all users that match the template given in the query parameters. No parameters are required.  
          * Sample Request: localhost:80/users  
          * Request Parameters:  
               * `None`
     * `PUT /user`
          * Description: This endpoint updates the given user.  
          * Sample Request: localhost:80/users  
          * Request Parameters:  
               * `User Object`
     * `POST /user`
          * Description: This endpoint creates a user in the database.  
          * Sample Request: localhost:80/users  
          * Request Parameters:  
               * `User Object`, no need to give id for user
