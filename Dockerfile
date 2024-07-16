# Base image로 OpenJDK 17을 사용
FROM openjdk:8-jdk-alpine

# 작업 디렉토리를 /app우로 설정
WORKDIR /app

# Maven 빌드 결과물인 JAR 파일을 컨테이너의 작업 디렉톨리로 복사
COPY target/springdocker-0.0.1-SNAPSHOT.jar app.jar

# 컨테이너 실행 시 실행할 명령어를 설정
ENTRYPOINT [ "java", "-jar", "app.jar" ]