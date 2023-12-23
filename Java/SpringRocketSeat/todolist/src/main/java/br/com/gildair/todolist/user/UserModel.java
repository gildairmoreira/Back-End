package br.com.gildair.todolist.user;

import lombok.Data; //Faz GET e SET das variaveis
// import lombok.Getter; //Faz somente GET das variaveis
// import lombok.Setter; //Faz somente SET das variaveis

/* para não ter que declarar cada get e set usa-se a lib Lombok  */

@Data
public class UserModel {
    private String username;
    private String name;
    private String password;

    // getters e setters
    

}
