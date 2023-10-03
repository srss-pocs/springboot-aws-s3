Spring Boot 3.1.4

A Simple Spring Boot and AWS S3 Integration with Secret and Access Keys

Create a AWS S3 Bucket

Keep AWS Keys in application yaml file

Check .aws folder keys (>User\PC\.aws on Windows)

APIs

http://localhost:8080/api/s3/getuploadurl?fileName=1.jpg : GET

Response
https://xxxx.s3.amazonaws.com/1.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20231003T145402Z&X-Amz-SignedHeaders=host&X-Amz-Expires=299&X-Amz-Credential=eeeeeeeeee%2F20231003%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=ccccccccccccccccccccc

Paste above url in postman

From POSTMAN (make sure it is PUT Mapping otherwise it will throw  request signature we calculated does not match the signature you provided. Check your key and signing method)


![image](https://github.com/srss-pocs/springboot-aws-s3/assets/145287517/f269d68e-d0f0-4151-a27f-90303758f9d4)



http://localhost:8080/api/s3/getdownloadurl?fileName=1.jpg : GET
