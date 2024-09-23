FROM openjdk:17-ea-11-slim
COPY build/libs /app
COPY agent/opentelemetry-javaagent.jar /app
WORKDIR /app
ENV TZ=Asia/Seoul
RUN apt-get install -y tzdata
ENTRYPOINT ["java","-javaagent:opentelemetry-javaagent.jar", "-jar","kafka-producer-tester-0.0.1-SNAPSHOT.jar"]