# Analisador léxico implementado em kotlin para a disciplina de compiladores


## A linguagem representada será composta por:

### Identificadores:
    [a-zA-Z][a-zA-Z0-9]* ex: variavel1, a2, nome, Nome, nOMe1 
### Números inteiros:
    [0-9]+
### Operadores aritméticos:
    + - * /
### Operadores relacionais:
     >
### Operador de atribuição:
    =
### Palavras reservadas:
    equal
    var
    if
    else
    while
    for
    fun
    return

### Qualquer token que não se encaixe nas categorias acima será considerado inválido gerando um erro léxico.
    ex: 1a ,va$, var%, var@, 1asd
    
    

