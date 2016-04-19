# Relationships between classes

There are 2 types of relationships:
- Inheritance: It can be called as generalization, or specialization.

- Association: It can be further categorized into 
    * Composition, and 
    * Aggregation

## Composition
It is more stronger type of association. Symbolized with colored diamond box.

For example:
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

## Aggregation 
It is more flexible type of association. Symbolized with white diamond box.

For example:
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

The dependencies between classes are more explicit, which makes unit testing easier.

Both of these associations can be generalized using directed arrow head.