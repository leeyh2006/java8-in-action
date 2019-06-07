## stream(lazy execution) like video streaming
- 데이터 처리 연산을 지원하도록 소스에서 추출된 연속된 요소

## collection vs stream 
- collection
    - store value to memory.
    - external iteration
    - management synchronize
- stream
    - store value to memory **when request.**
    - internal iteration.
    - auto synchronize is strong in multi-core

## stream calculate  
- intermediate  operation (중간연산)
- terminal operation (최종연산)
- pipe line
why ? for lazy
