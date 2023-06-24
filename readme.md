
1 - fazer o comando na raiz da pasta
docker build -t evento-api .

2 - rodar a imagem
docker run -p 8080:8080 evento-api

modelo de objeto evento

{
"name": "Festival de Vinhos de Urussanga",
"date": "2023-08-15T20:00:00",
"description": "Evento enogastronômico que celebra a produção de vinhos em Urussanga, SC, com degustações e shows musicais."
}


endpoints:
GET /eventos para pegar todos os eventos
GET /id para pegar o evento pela ID
POST /crete para criar o evento (enviar o objeto acima no body, por ex)
DELETE /id pra apagar o evento pela id

o cupom eh gerado p cada evento automaticamente

pode consumir a mesma API nos dois servicos

