# CS4156_client_service
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
     * `GET /user/{id}`
          * Description: This endpoint retrives a user info from its id.  
          * Sample Request: localhost:80/users/1
          * Request Parameters:  
               * `id`
     * `DELETE /user/{id}`
          * Description: This endpoint delete a user info from its id.  
          * Sample Request: localhost:80/users/1
          * Request Parameters:  
               * `id`
               
* ___Restaurant___
     * `GET /restaurant`  
          * Description: This endpoint retrieves all users that match the template given in the query parameters. No parameters are required.  
          * Sample Request: localhost:80/restaurant
          * Request Parameters:  
               * `None`
     * `GET /restaurant/details`  
          * Description: This endpoint retrieves all restaurant in details that match the template given in the query parameter. No parameters are required.  
          * Sample Request: localhost:80/restaurant/details
          * Request Parameters:  
               * `None`
     * `GET /restaurant/popular`  
          * Description: This endpoint retrieves all restaurant in details that match the template given in the query parameter. No parameters are required.  
          * Sample Request: localhost:80/restaurant/popular
          * Request Parameters:  
               * `None`
     * `GET /restaurant/{id}`  
          * Description: This endpoint retrieves a restaurant by its id.  
          * Sample Request: localhost:80/restaurant/1
          * Request Parameters:  
               * `id`
     * `GET /restaurant/{id}/details`  
          * Description: This endpoint retrieves a restaurant in detail format by its id.  
          * Sample Request: localhost:80/restaurant/1/details
          * Request Parameters:  
               * `id`            
     * `GET /restaurant/{id}/like`  
          * Description: This endpoint retrieves a restaurant's like count by the restaurant's id.  
          * Sample Request: localhost:80/restaurant/1/like
          * Request Parameters:  
               * `id`           
     * `GET /restaurant/{id}/dislike`  
          * Description: This endpoint retrieves a restaurant's dislike count by the restaurant's id.  
          * Sample Request: localhost:80/restaurant/1/dislike
          * Request Parameters:  
               * `restaurant id` 

* ___Review___
     * `GET /review`  
          * Description: This endpoint retrieves all reviews that match the template given in the query parameters. No parameters are required.  
          * Sample Request: localhost:80/review
          * Request Parameters:  
               * `None`
     * `POST /review`  
          * Description: This endpoint create a new review.  
          * Sample Request: localhost:80/review
          * Request Parameters:  
               * `Review Object`
     * `POST /review/rest/{id}`  
          * Description: This endpoint retrieves all the reviews for a restaurant by restaurant id.  
          * Sample Request: localhost:80/review/rest/1
          * Request Parameters:  
               * `Review Object`       
     * `POST /review/user/{id}`  
          * Description: This endpoint retrieves all the reviews from a user by user id.  
          * Sample Request: localhost:80/review/user/4
          * Request Parameters:  
               * `id` 
     * `GET /review/{id}`  
          * Description: This endpoint retrieves a review by review id.  
          * Sample Request: localhost:80/review/1
          * Request Parameters:  
               * `review id`
     * `DELETE /review/{id}`  
          * Description: This endpoint deletes a review by review id.  
          * Sample Request: localhost:80/review/8
          * Request Parameters:  
               * `review id`
                  
* ___Dish___
     * `GET /dish`  
          * Description: This endpoint retrieves all reviews that match the template given in the query parameters. No parameters are required.  
          * Sample Request: localhost:80/dish
          * Request Parameters:  
               * `None`
     * `GET /dish/{id}`  
          * Description: This endpoint retrieves a dish by dish id.  
          * Sample Request: localhost:80/dish/1
          * Request Parameters:  
               * `dish id`
* ___bookmark___       
    * `PSOT /bookmark`  
          * Description: This endpoint deletes a bookmark by provided bookmark object.  
          * Sample Request: localhost:80/bookmark
          * Request Parameters:  
               * `Bookmark Object`
    * `PSOT bookmark/countuser/{userId}`  
          * Description: This endpoint retrives the number of bookmarks the user wrote.  
          * Sample Request: localhost:80/bookmark/countuser/4
          * Request Parameters:  
               * `user id`
    * `GET bookmark/user/{userId}`  
          * Description: This endpoint deletes a bookmark by provided bookmark object.  
          * Sample Request: localhost:80/review/user/4
          * Request Parameters:  
               * `user id`        
    * `DELETE bookmark/{id}`  
          * Description: This endpoint deletes a bookmark by provided bookmark id.  
          * Sample Request: localhost:80/bookmark/45
          * Request Parameters:  
               * `bookmark id`              
               
               
               
               
               
               
