# learning-architecture-containers > VERSION 04

![Architecture](../img/solution-v04.png)

Para o exercício version_04, utilizaremos o `docker-compose` para nos auxiliar a subir os serviços.

A. Refactoring

B. API Java buscando dados do MongoDB

C. Rota para popular previamente os dados da Collections: `http://localhost:5002/admin/populate-artist-works`

D. Melhoria no docker-compose para definir dependencia entre services


## 1- Buildar imagem mongo para a API artist-works-api

```
Caminho:
/learning-architecture-containers/solutions
```

Modifique o arquivo `docker-compose.yaml` e inclua o conteúdo:

```yaml
artist-works-mongodb:
    image: mongo
    ports:
    - "27017:27017"
    environment: 
        - MONGO_INITDB_ROOT_USERNAME=mongo
        - MONGO_INITDB_ROOT_PASSWORD=secret@123
```

## 2- Executar o docker-compose

```
Caminho: 
/learning-architecture-containers/solutions

# remove todas as imagens
docker compose down --rmi 'all'

# recria as imagens
docker compose up -d
```


Você pode testar chamando a URL de `artists-frontend`: 

a. http://localhost:4220/#/artists/

Você pode testar chamando a URL de `artists-backend`: 

a. http://localhost:5001/api/artists/

b. http://localhost:5001/api/artists/1/


Você pode testar chamando a URL de `artist-works-backend`: 

a. http://localhost:5002/api/artists/1/works/

b. http://localhost:5002/admin/populate-artist-works


Você pode testar chamando a URL de `artists-nginx`:  

a. http://localhost:8080/api/artists/

b. http://localhost:8080/api/artists/1/

c. http://localhost:8080/api/artists/1/works/
