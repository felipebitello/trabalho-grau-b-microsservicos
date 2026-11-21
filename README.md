Trabalho Grau B - Academia

FELIPE BITELLO E LUCAS COLLING
![diagrama](diagramamicrosservicosgb.drawio.png)
Servicos
- registry-service (8761) - Eureka
- gateway-service (8005) - Gateway com circuit breaker
- aluno-service (8001) - alunos
- plano-service (8002) - planos

POST http://localhost:8005/planos
{ "nome": "Mensal", "valorMensal": 99.90 }

POST http://localhost:8005/alunos
{ "nome": "Joao", "cpf": "12345678900", "idade": 22, "planoId": 1 }

GET http://localhost:8005/alunos

GET http://localhost:8005/planos

Ordem pra rodar: registry, plano, aluno, gateway
