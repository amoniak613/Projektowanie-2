package pl.javka.wzorce;

import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }

    public static final class Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder toys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            Dog dog = new Dog();
            dog.age = this.age;
            dog.name = this.name;
            dog.toys = this.toys;
            dog.type = this.type;
            return dog;
        }
    }
}