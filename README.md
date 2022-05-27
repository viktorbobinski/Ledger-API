# Ledger-API
 
## Stack
SpringBoot application with Spring Data, Spring Web, Thymeleaf & H2 Database

## About
Java API is a ledger between 2 people. +/- values posted as @RequestParam which represent transactions between them.

## Photos

![ledger application](/assets/ledger.JPG)

![ledger usage in postman](/assets/ledger-postman.JPG)


#### Notes
- W Controller'ach nie używam @RestController, bo w argumencie metody przyjmuję @RequestParam zamiast @RequestBody, a zamiast @ResponseBody zwracam Template generowany przez Spring wykorzystując framework Thymeleaf.
