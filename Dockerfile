FROM openjdk:21
COPY ./target/ticket.jar ticket.jar
CMD ["jar","-jar","ticket.jar"]