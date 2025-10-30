# springboot-hotel-app

Hotel booking service built with Spring Boot, MyBatis, and MySQL.

## Features

- Hotel search and availability checking
- Room booking management
- Destination and nationality management
- Currency exchange rate handling
- RESTful API endpoints
- Velocity template engine for views

## Technologies

- Spring Boot 3.5.7
- Java 21
- MySQL 8.0
- MyBatis 3.0.5
- Lombok
- Docker & Docker Compose

## Prerequisites

- Java 21 or higher
- Maven 3.9+
- Docker and Docker Compose (for containerized deployment)
- MySQL 8.0 (if running locally without Docker)

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

- MySQL 8.0 database (port 3306)
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

If Lombok annotations are not working:

```bash
# Clean and rebuild
mvn clean install -DskipTests
```

## License

(Add your license information here)
