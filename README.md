# Analisador léxico implementado em kotlin para a disciplina de compiladores


## A linguagem representada será composta por:

### Identificadores:
    [a-zA-Z][a-zA-Z0-9]* ex: variavel1, a2, nome, Nome, nOMe1 
### Números inteiros:
    [0-9]+
### Operadores aritméticos:
    + - * /
### Operadores relacionais:
     > <
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

### Exemplo de execução

### Arquivo de entrada:
    var a = b
    var b = 10
    
    a equal 10
    
    a < 10
    a > 10@
    
    var name1
    var name2
    
    fun a = var var1 + var2
    
### String de saída:
     [[ value: 'var', index: 0, type: 'KEYWORD' ]
    , [ value: 'a', index: 1, type: 'IDENTIFIER' ]
    , [ value: '=', index: 2, type: 'ASSIGNMENT_OPERATOR' ]
    , [ value: 'b', index: 3, type: 'IDENTIFIER' ]
    , [ value: 'var', index: 4, type: 'KEYWORD' ]
    , [ value: 'b', index: 5, type: 'IDENTIFIER' ]
    , [ value: '=', index: 6, type: 'ASSIGNMENT_OPERATOR' ]
    , [ value: '10', index: 7, type: 'NUMBER' ]
    , [ value: 'a', index: 8, type: 'IDENTIFIER' ]
    , [ value: 'equal', index: 9, type: 'IDENTIFIER' ]
    , [ value: '10', index: 10, type: 'NUMBER' ]
    , [ value: 'a', index: 11, type: 'IDENTIFIER' ]
    , [ value: '<', index: 12, type: 'RELATIONAL_OPERATOR' ]
    , [ value: '10', index: 13, type: 'NUMBER' ]
    , [ value: 'a', index: 14, type: 'IDENTIFIER' ]
    , [ value: '>', index: 15, type: 'RELATIONAL_OPERATOR' ]
    , [ value: '10@', index: 16, type: 'INVALID_TOKEN' ]
    , [ value: 'var', index: 17, type: 'KEYWORD' ]
    , [ value: 'name1', index: 18, type: 'IDENTIFIER' ]
    , [ value: 'var', index: 19, type: 'KEYWORD' ]
    , [ value: 'name2', index: 20, type: 'IDENTIFIER' ]
    , [ value: 'fun', index: 21, type: 'KEYWORD' ]
    , [ value: 'a', index: 22, type: 'IDENTIFIER' ]
    , [ value: '=', index: 23, type: 'ASSIGNMENT_OPERATOR' ]
    , [ value: 'var', index: 24, type: 'KEYWORD' ]
    , [ value: 'var1', index: 25, type: 'IDENTIFIER' ]
    , [ value: '+', index: 26, type: 'ARITHMETIC_OPERATOR' ]
    , [ value: 'var2', index: 27, type: 'IDENTIFIER' ]
    ]


    
    

