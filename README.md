# ControleClientesMongoDB
Este um aplicativo, de cadastro de registros, com uso de um banco de dados NÃO-RELACIONAL "o MongoDB". Resolvi implementar este protótipo com o objetivo de mostrar aos alunos da disciplina Programação Orientado a Objetos em java, o uso de um SGBD NOSQL, mostrando a diferença de armazenamento dos dados em relação aos SGBD´S RELACIONAIS.



 sistema Controle de Clientes, que estou desenvolvendo em Java com uso de um banco de dados hashtag#NoSQL, isto é, um banco de dados hashtag#NÃORELACIONAL, o hashtag#MongoDB. Como já falei na publicação anterior, onde o sistema foi criado e foi realizado o cadastro de usuários, para terem acesso ao mesmo, através do Login( E-mail) e Password). Nesse cadastro de usuários, haverão validações nas entradas de dados como (CPF e E-mail). Hoje o Sistema já permite que o usuário, através de suas credenciais (E-mail e Password) consiga logar-se ao mesmo, caso este usuário não estiver cadastrado, ele poderá realizar seu próprio cadastro, para ter acesso à Tela de Cadastro de Clientes. O próximo passo será implementar as funções do cadastro dos clientes. Obs. Esta é a vantagem que percebo no hashtag#MongoDB, pois em vez de usarmos tabelas para armazenar hashtag#Registros como em bancos de dados hashtag#Relacionais, devemos usar hashtag#Coleções para armazenar hashtag#documentos. Isto se torna um ganho enorme tendo em vista que, o hashtag#MongoDB, faz facilmente a conversão de documentos hashtag#JSON e similares, como hashtag#BSON, em hashtag#objetos hashtag#Java, tornando a hashtag#leitura e hashtag#gravação de dados no rápida e incrivelmente eficiente durante a análise de informações em tempo real em vários ambientes de desenvolvimento. 


## :camera_flash: Screenshots
<!-- You can add more screenshots here if you like -->
<img src="/projetomongoDB/imagens/imagem01.png" width="260">&emsp;<img src="/imagem/imagem02.png" width="260">&emsp;<img src="/imagem/imagem03.png" width="260">&emsp;<img src="/imagem/imagem04.png" width="260">&emsp;

## Tecnologias
* React-Native
* Visual Studio Code
* Node.js
* MySQL
* bodyParser.json
* SQL
* db.connect
* useState
* navigation
* axios
- Components de UI
    - View
    - TextInput
    - Button
    - StyleSheet
    - Text
    - Image
    - FlatList
    - ScrollView
### TODO
- Melhorar estilização do aplicativo, implementando mais regras de negócio com entradas de dados e geração de relatórios

## Author
Ediberto Mariano da Silva (follow me on [Linkedin] (https://www.linkedin.com/in/ediberto-mariano-da-silva-238071118/))

## License
```
The MIT License (MIT)

Copyright (c) 2024 Ediberto Mariano da Silva

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
