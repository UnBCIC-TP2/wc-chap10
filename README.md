# wc-chap10

Uma implementação do WordCount usando o estilo 'The Things' em 
Scala. 

## Compilação e Execução dos Testes

```{shell} 
$ sbt compile test
```

## Geração de um executável

```{shell} 
$ sbt assembly
```

## Execução do programa (via sbt) 

```{shell} 
$ sbt "run <input-file> <stop-words>"
```


