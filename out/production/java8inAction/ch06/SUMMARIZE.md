## Collectors , Summarization
terminal operation with reducing 
- collect(Collectors.summingInt);
- collect(Collectors.toList());
- collect(Collectors.count());  
..    
..  

## SummaryStatics
summarize class using SummaryStatics
- IntSummaryStatics - collect(Collectors.summarizingInt(lamda))
- DoubleSummaryStatics - collect(Collectors.summarizingDoublec(..))  
..
..

## joining
combine stream data.  
``` 
    String shortMenu = menu.stream().map(i->i.getName()).collect(Collectors.joining(","));
```

## Grouping
