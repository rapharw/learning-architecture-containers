# learning-architecture-containers > VERSION 03

![Architecture](../img/solution-v02.png)

Para o exercício version_03, utilizaremos o `docker-compose` para nos auxiliar a subir os serviços.

## 1- Executar o docker-compose

```
Caminho: 
/learning-architecture-containers/solutions

# remove todas as imagens
docker compose down --rmi 'all'

# recria as imagens
docker compose up -d
```

Você pode testar chamando a URL de `artists-backend`: 

a. http://localhost:5001/api/artists/

b. http://localhost:5001/api/artists/1/


Você pode testar chamando a URL de `artist-works-backend`: 

a. http://localhost:5002/api/artists/1/works/


Você pode testar chamando a URL de `artists-nginx`:  

a. http://localhost:8080/api/artists/

b. http://localhost:8080/api/artists/1/

c. http://localhost:8080/api/artists/1/works/
