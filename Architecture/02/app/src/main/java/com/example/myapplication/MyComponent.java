package com.example.myapplication;


import dagger.Component;

@Component(modules = MyModule.class)
public interface MyComponent{
    String getString();
}
