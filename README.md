# Ledger-API

Java API, a ledger between 2 people. +/- values posted as @RequestParam which represent transactions between them.

![ledger application](/assets/ledger.JPG)

![ledger usage in postman](/assets/ledger-postman.JPG)


Notatki:
- W Controller'ach nie używam @RestController, bo w argumencie metody przyjmuję @RequestParam zamiast @RequestBody, a zamiast @ResponseBody zwracam Template generowany przez Spring wykorzystując framework Thymeleaf.
