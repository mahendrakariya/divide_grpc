FROM gradle:5.6-jdk11

EXPOSE 50052
COPY build/libs/divide.jar divide.jar

CMD ["java", "-jar", "divide.jar"]

