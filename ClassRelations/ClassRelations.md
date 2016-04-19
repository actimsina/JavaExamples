# Relationships between classes

There are 2 types of relationships:
- Inheritance
> It can be called as Generalization / Specialization etc.
- Association
    * Composition 
    * Aggregation
> Associations can be further categorized into two groups
 composition, and aggregation
> Composition is more stronger type of association
> Aggregation is more flexible type of association

For example Composition:

```java
    class Car {
        private Engine e1;
        
        public Car {
            e1 = new Engine();
        }
        
        void move() {
            e1.work();
        }
    }
```

For example Aggregation:
Dependency Injection
```java
    class Car {
        private Engine e1;
        
        public Car(Engine e1){
            this.e1 = e1;
        }
        
        void move() {
            if( this.e1 != null)
            e1.work();
        }        
    }
```