FROM openjdk:21
EXPOSE 8080
ADD target/springboot-aws-s3-presignurl-demo.jar springboot-aws-s3-presignurl-demo.jar 
ENTRYPOINT ["java","-jar","/springboot-aws-s3-presignurl-demo.jar"]