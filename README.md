### A spring book microservice that will be proxied through a Zuul proxy
(https://github.com/onelazyugy/zuul-proxy)
- This microservice serves 2 APIs
    1. productservice
    - GET 
        - http://localhost:8222/product/api/v1/product
    - POST 
        - http://localhost:8222/product/api/v1/save-product
        - request body
        <code>
            {
                "product": {
                    "id": 1,
                    "name": "jacket",
                    "color": "pink",
                    "category": "clothing"
                }
            }
        </code>
        - response body
        <code>
        {
            "success": true,
            "message": "success",
            "product": {
                "id": 1,
                "name": "jacket",
                "color": "pink",
                "category": "clothing"
            }
        }
        </code>
    