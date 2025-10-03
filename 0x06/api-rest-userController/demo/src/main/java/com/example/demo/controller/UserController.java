@RestController
@RequestMapping(value = "/users")
public class UserController {

@GetMapping("/user-id/{id}")
public String findUserById(@PathVariable int id) {

   String msg = "";
   // TODO
   return msg;
}

@GetMapping("/user-name/{userName}")
public String findUserByName(@PathVariable String userName) {

   String msg = "";
   // TODO
   return msg;
}

@GetMapping("/user-cpf/{cpf}")
public String findUserByCPF(@PathVariable String cpf) {

   String msg = "";
   boolean isCPFValid = isCPF(String CPF);
   // TODO
   return msg;

}

public boolean isCPF(String CPF) {
   // TODO
   return false;
}

}