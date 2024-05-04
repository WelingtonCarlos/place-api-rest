<h1 align="center">
  Place Service
</h1>

API Rest para gestão de lugares. [Este desafio](https://github.com/RocketBus/quero-ser-clickbus/tree/master/testes/backend-developer) fazia parte do processo de adimissão para pessoas desenvolvedoras backend que se candidatam para a ClickBus.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://docs.spring.io/spring-framework/reference/web/webflux.html)
- [Spring Data + R2DBC](https://docs.spring.io/spring-framework/reference/data-access/r2dbc.html)
- [SpringDoc OpenAPI 3](https://docs.spring.io/spring-integration/reference/webflux.html)
- [Slugify](https://github.com/slugify/slugify)

## Práticas adotadas

- SOLID
- Testes automatizados
- Consultas com filtros dinâmicos usando o Query By Example
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Geração automática do Swagger com a OpenAPI 3
- Geração de slugs automática com o Slugify

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- POST /places
```
http POST :8080/places name="First Place" state="First State" city="First City"

HTTP/1.1 201 Created
Content-Length: 176
Content-Type: application/json

{
    "city": "First City",
    "createdAt": "2024-05-04T19:39:47.5426771",
    "id": 1,
    "name": "First Place",
    "slug": "first-place",
    "state": "First State",
    "updatedAt": "2024-05-04T19:39:47.5426771"
}
```

- GET /places/{id}
```
HTTP/1.1 200 OK
Content-Length: 174
Content-Type: application/json

{
    "city": "First City",
    "createdAt": "2024-05-04T19:39:47.542677",
    "id": 1,
    "name": "First Place",
    "slug": "first-place",
    "state": "First State",
    "updatedAt": "2024-05-04T19:39:47.542677"
}
```

- GET /places?name=?
```
http :8080/places name=="First Place"
ou
http :8080/places?name="First Place"
HTTP/1.1 200 OK
Content-Type: application/json
transfer-encoding: chunked

[
    {
        "city": "First City",
        "createdAt": "2024-05-04T19:39:47.542677",
        "id": 1,
        "name": "First Place",
        "slug": "first-place",
        "state": "First State",
        "updatedAt": "2024-05-04T19:39:47.542677"
    }
]
```

- PATCH /places/{id}
```
http PATCH :8080/places/1 name='Second Place' state='Second State' city="Second-city"
HTTP/1.1 200 OK
Content-Length: 179
Content-Type: application/json

{
    "city": "Second City",
    "createdAt": "2024-05-04T19:39:47.542677",
    "id": 1,
    "name": "Second Place",
    "slug": "second-place",
    "state": "Second State",
    "updatedAt": "2024-05-04T19:44:51.2450027"
}
```