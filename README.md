# Hoen Scanner Microservice

## Overview

Hoen Scanner is a simple microservice built using **Java and Dropwizard** that allows users to search for **rental cars and hotels by city**.
The service reads search data from JSON files and exposes a REST API endpoint to return filtered results.

---

## Features

* REST API built with **Dropwizard**
* JSON request and response handling using **Jackson**
* Search functionality based on **city name**
* Data loaded from:

  * `rental_cars.json`
  * `hotels.json`
* API testing using **Postman**

---

## Tech Stack

* Java
* Dropwizard
* Jackson
* Maven
* Postman

---

## Project Structure

```
src
 └─ main
     └─ java
         └─ com.skyscanner
             ├─ HoenScannerApplication.java
             ├─ Search.java
             ├─ SearchResult.java
             └─ SearchResource.java
```

---

## API Endpoint

### Search Results

**POST** `/search`

Request Body

```json
{
  "city": "petalborough"
}
```

Response Example

```json
[
  {
    "city": "petalborough",
    "title": "Petalborough Hotel",
    "kind": "hotel"
  },
  {
    "city": "petalborough",
    "title": "Petalborough Car Rental",
    "kind": "car"
  }
]
```

---

## Running the Project

1. Clone the repository

```
git clone https://github.com/your-username/hoen-scanner.git
```

2. Open the project in **IntelliJ IDEA**

3. Install **JDK 19**

4. Run the application:

```
HoenScannerApplication.java
```

5. Server will start at:

```
http://localhost:8080
```

---

## Testing the API

Use **Postman**

Request

```
POST http://localhost:8080/search
```

Body

```json
{
 "city": "petalborough"
}
```

---

## Author

Manju
