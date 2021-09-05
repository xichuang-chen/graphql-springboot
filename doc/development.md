# Graphql springboot

## 项目关键点解释

### 1. 创建 schema 描述文件
We are creating a new file `schema.graphqls` in `src/main/resources` 

### 2. `GraphQLProvider` class
- 创建 `graphql` 实例
- 教程[Getting started with GraphQL Java and Spring Boot](https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/)
说 `The GraphQL Java Spring adapter will use that GraphQL instance to make our schema available via HTTP on the default url /graphql.`但是我访问
`http://localhost:8080/graphql` 并不行，具体看 [README](https://github.com/xichuang-chen/graphql-springboot#overview)
- buildSchema method which creates the GraphQLSchema instance and wires in code to fetch data