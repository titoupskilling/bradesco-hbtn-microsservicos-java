import main.java.com.example.demo.exception.CPFException;

@RestController
@RequestMapping(value = "/users")
public class UserController {

@GetMapping("/user-id/{id}")
public String findUserById(@PathVariable int id) {

   String msg = "You have entered valid ID";
   // TODO
   return msg;
}

@GetMapping("/user-name/{userName}")
public String findUserByName(@PathVariable String userName) {

   String msg = "You have entered valid USERNAME";
   msg = "You have entered invalid USERNAME";
   return msg;
}

@GetMapping("/user-cpf/{cpf}")
public String findUserByCPF(@PathVariable String cpf) {

   String msg = "You have entered valid CPF";
   boolean isCPFValid = isCPF(String CPF);
   msg = "You have entered invalid CPF";
   return msg;

}

public boolean isCPF(String CPF) {
   if(CPF.isBlank()){
      throw new CPFException();
   }
   return false;
}

}