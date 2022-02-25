# Microservice Course

### Endpoints

### Save Course
...
POST /api/course/ HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Cookie: JSESSIONID=8A190F87274FB2C2D76AEB140485267A
Content-Length: 94

{
"title": "test-course-1",
"subtitle": "test-course-subtitle-1",
"price": 9
}
...

#### Get Courses
...
GET /api/course/ HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Cookie: JSESSIONID=8A190F87274FB2C2D76AEB140485267A
Content-Length: 94

{
"title": "test-course-1",
"subtitle": "test-course-subtitle-1",
"price": 9
}
...

### Delete Course
...
DELETE /api/course/2 HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Cookie: JSESSIONID=8A190F87274FB2C2D76AEB140485267A
Content-Length: 94

{
"title": "test-course-1",
"subtitle": "test-course-subtitle-1",
"price": 9
}



...
