## filtering and slicing
- filter(T->boolean);
- distinct(); exclude overlap data
- limit(long n);
- skip(lon n);
- map ,flatMap

## search and matching
- allMatch  (all)
- anyMatch (at least one) : terminal operation
- noneMatch (none)  
**short circuit** : 


- findFirst 
- findAny (first random find) : return Optional

## findFirst vs findAny
diff Parallelism


## Optional
A container class that represents the presence or absence of a value.

- for null check
- isPresent() : return true if Optional include value.
- ifPresent(Consumer<T> block) : execute block if Optional include value.
- T get(): return value if Optional include value but NoSuchElementException
- T orElse(T other) : return value or default value.

menu.stream()
    .filter(i->i.isVegetarian)
    .findAny() => Optional<Dish> return
    .ifPresent(d->sout(d));
    
## reducing
reduce(0 , (a,b) -> a+b)


## Basic Stream
IntStream, DoubleStream, LongStream
- mapToInt
- mapToDouble
- mapToLong

## boxed
transfer to basic stream
Stream<Integer> stream = intStream.boxed();

## Stream.of, Stream.empty

## file to stream

## infinite stream
Stream.iterate ,Stream.generate
caution **limit**


## stateless operation vs stateful operation
- stateless operation  
map,filter etc..
- stateful operation
sorted, reduce, etc...
