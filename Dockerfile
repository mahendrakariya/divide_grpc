FROM gradle:5.6-jdk11

COPY build/libs/divide.jar divide.jar

CMD ["java", "-jar", "divide.jar"]

