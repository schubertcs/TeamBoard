# TeamBoard

TeamBoard is a collaborative task management platform designed to help teams stay organized and aligned.  
It lets users create boards, define tasks, assign responsibilities, and track progress with clarity.  
Built with a focus on simplicity, transparency, and teamwork, TeamBoard aims to make collaboration feel natural and structured at the same time.

## Tech Stack

- Java 25
- Spring Boot 3
- Docker

## Getting Started

To build the application, run the following Maven command:
```bash
./mvnw clean package
```

To start the application, use:
```bash
./mvnw spring-boot:run
```

### Docker

Building and running the docker image works with these commands:
```bash
docker build -t schubertcs/teamboard:phase1 .
docker run schubertcs/teamboard:phase1
```

To debug the image, the following command allows you to start a new container and open a shell on it:
```bash
docker run --rm -it --entrypoint sh schubertcs/teamboard:phase1
# leaving by typing exit
```

To build a new image and start the whole application stack, so including the database, use:
```bash
docker compose up --build
```

## Next Steps

TeamBoard is currently in its first development phase. Upcoming goals include:

- Defining a clean domain model for boards, lists, and tasks
- Designing RESTful endpoints for task management
- Introducing caching and performance optimization with Redis
- Preparing the foundation for future collaboration features and a simple frontend