# dio-explorando-padroes-de-projeto-na-pratica-com-java-SURF
Projeto construído para contemplar o curso Explorando Padrões de Projeto na prática com Java. 

# O desafio
O desafio proposto no curso traz a ideia da construção de um projeto do zero, utilizando os conceitos de padrões de projeto abordados nos encontros:

`Crie uma solução que explore o conceito de Padrões de Projeto na prática. Para isso, você pode reproduzir um dos projetos que criamos durante as aulas ou, caso se sinta preparado, desenvolver uma nova ideia do zero.`



# Como eu fiz?
Já havia um tempo que eu queria aliar o meu esporte favorito, o Surf, com alguma aplicação dos estudos em Java. Esta foi a oportunidade.

- Assistindo aos vídeos, escolhi o tipo de padrão que eu gostaria de replicar: _STRATEGY_.

- Criei então a árvore de relacionamentos entre os blocos do programa (mais abaixo).

- Porém, eu gostaria de ir além do Java puro, e decidi trabalhar usando o _Spring Framework_, já que o estava estudando em outros cursos do mesmo bootcamp. 

- Busquei apoio no Github, em fóruns e sites da Internet. 

- Encontrei o texto do Rafael Lemes (link nos agradecimentos), e o repositório do curso da DIO.

- Usei estes materiais como base para construir o projeto no _Spring Initializr_.

- Construi então as classes e a interface, cada uma com seus códigos respectivos e conexões. 

A ideia da interação entre estes blocos está representada pela imagem abaixo:

<img src = "Surf UML.png" alt="Imagem mostrando o diagrama do programa de Surf.">


Desta forma, em cada contexto de onda apresentada (`cavada`, `achatada` ou `fechando`), o método `manobrar` vai imprimir na tela uma manobra diferente, como se fosse na vida real.

### Obrigado por ler, espero que goste!! 
## Mais sobre o autor

- [@chrissperb](https://www.github.com/chrissperb)


## Agradecimentos
 - [Rafael Lemes - DEV.TO](https://dev.to/nenhumrafael/strategy-pattern-no-spring-boot-usando-enum-4fg9)
 - [README.SO](https://readme.so/)

