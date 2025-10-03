@ControllerAdvice
public class ExceptionService {

  @ExceptionHandler
    ResponseEntity<CPFException> handleException(CPFException err){
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value()); 
        uer.setMessage("You have entered CPF "+err.getMessage()+" invalid.");
        return new ResponseEntity(uer,HttpStatus.BAD_REQUEST); 
    }
}