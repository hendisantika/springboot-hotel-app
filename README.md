# springboot-hotel-app

[![Java CI with Maven](https://github.com/hendisantika/springboot-hotel-app/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/springboot-hotel-app/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.2-brightgreen?logo=springboot)
![Dependabot](https://img.shields.io/badge/Dependabot-enabled-blue?logo=dependabot)

Hotel booking service built with Spring Boot, MyBatis, and MySQL.

![Home Page](img/home.png "Home Page")

## Features

- Hotel search and availability checking
- Room booking management
- Destination and nationality management
- Currency exchange rate handling
- RESTful API endpoints
- Velocity template engine for views

## Technologies

- Java 25 (LTS)
- Spring Boot 4.1.2
- Jackson 3 (`tools.jackson`)
- MyBatis Spring Boot Starter 4.1.0
- MySQL 9.5 (via Docker Compose)
- Lombok
- Docker & Docker Compose (Eclipse Temurin 25 base images)
- GitHub Actions & Dependabot

## Prerequisites

- JDK 25 or higher
- Maven 3.9+
- Docker and Docker Compose (for containerized deployment)
- MySQL 8.0+ (if running locally without Docker)

## Running with Docker (Recommended)

The easiest way to run this application is using Docker Compose, which will start both the application and MySQL
database:

```bash
# Build and start the containers
docker-compose up --build -d

# View logs
docker-compose logs -f app

# Stop the containers
docker-compose down

# Stop and remove volumes (clean slate)
docker-compose down -v
```

The application will be available at: http://localhost:8080

The Docker setup includes:

- MySQL 9.5 database (port 3306)
- Spring Boot application (port 8080)
- Persistent volume for MySQL data
- Health checks for service dependencies

## Running Locally

If you prefer to run the application locally without Docker:

1. **Set up MySQL database:**
   ```bash
   # Create database
   mysql -u root -p
   CREATE DATABASE hotel;
   ```

2. **Configure database connection:**

   Edit `src/main/resources/application.properties` if needed:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/hotel
   spring.datasource.username=root
   spring.datasource.password=root
   ```

3. **Build and run:**
   ```bash
   # Build the application
   mvn clean package -DskipTests

   # Run the application
   java -jar target/springboot-hotel-app-0.0.1-SNAPSHOT.jar
   ```

## Development

### Building the Project

```bash
# Compile and package
mvn clean package

# Run tests
mvn test

# Skip tests during build
mvn clean package -DskipTests
```

### Docker Commands

```bash
# Build only (without starting)
docker-compose build

# View running containers
docker-compose ps

# View logs
docker-compose logs -f

# Execute commands in the app container
docker-compose exec app sh

# Execute commands in the MySQL container
docker-compose exec mysql mysql -u root -p
```

## Project Structure

```
springboot-hotel-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/hendisantika/springboothotelapp/
│   │   │       ├── controller/     # REST controllers
│   │   │       ├── entity/         # Domain entities
│   │   │       ├── service/        # Business logic
│   │   │       └── SpringbootHotelAppApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── velocity/           # View templates
│   └── test/
├── Dockerfile                      # Docker image definition
├── docker-compose.yml              # Multi-container setup
├── .dockerignore                   # Docker build exclusions
└── pom.xml                         # Maven dependencies
```

## Continuous Integration

The [`Java CI with Maven`](.github/workflows/maven.yml) workflow runs on every push and pull request to `master`
(and can be triggered manually via `workflow_dispatch`):

- Sets up **Temurin JDK 25** with Maven dependency caching
- Builds and tests the project with `mvn -B package`
- On pushes to `master`, submits the Maven dependency graph to GitHub to improve Dependabot alerts

## Dependency Management (Dependabot)

[`dependabot.yml`](.github/dependabot.yml) keeps dependencies up to date (Asia/Jakarta timezone, 05:00):

| Ecosystem        | Schedule        | Grouping                                                        | Commit prefix    |
|------------------|-----------------|-----------------------------------------------------------------|------------------|
| `maven`          | daily           | `spring-boot`, `mybatis`, `maven-plugins`, `minor-and-patch`    | `chore(deps)`    |
| `github-actions` | weekly (Monday) | all actions in one PR                                           | `ci(deps)`       |
| `docker`         | weekly (Monday) | Dockerfile base images (stays on the JDK 25 line)               | `build(deps)`    |
| `docker-compose` | weekly (Monday) | images in `docker-compose.yml` (MySQL)                          | `build(deps)`    |

All Dependabot PRs are labeled `dependencies` plus an ecosystem label (`java`, `github_actions`, `docker`).
Legacy libraries (`json-lib`, `velocity`, `velocity-tools`) are intentionally ignored.

## API Endpoints

(Add your API documentation here based on your controllers)

## Configuration

Key configuration properties in `application.properties`:

- `spring.datasource.url` - Database connection URL
- `spring.datasource.username` - Database username
- `spring.datasource.password` - Database password
- `spring.velocity.resourceLoaderPath` - Velocity templates location

## Troubleshooting

### Docker Issues

If you encounter port conflicts:

```bash
# Check what's using the ports
lsof -i :8080
lsof -i :3306

# Use different ports by modifying docker-compose.yml
```

If the application can't connect to MySQL:

```bash
# Check if MySQL is healthy
docker-compose ps

# View MySQL logs
docker-compose logs mysql

# Restart the services
docker-compose restart
```

### Build Issues

Make sure you are building with JDK 25:

```bash
java -version   # should print 25
```

If you see `package com.fasterxml.jackson.databind does not exist`, note that Spring Boot 4 uses
Jackson 3 — import from `tools.jackson.databind` instead.

If Lombok annotations are not working:

```bash
# Clean and rebuild
mvn clean install -DskipTests
```

## License

(Add your license information here)
