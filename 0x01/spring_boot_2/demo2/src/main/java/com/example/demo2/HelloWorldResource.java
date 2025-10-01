package com.example.demo2;

@RestController
@RequestMapping(value="/messages")
class HelloWorldResource {

    @GetMapping("/home")
    public String helloWorld() {
        return "PROJETO MAVEN (SPRING INITIALIZR) CRIADO COM SUCESSO !!!";
    }
    
}