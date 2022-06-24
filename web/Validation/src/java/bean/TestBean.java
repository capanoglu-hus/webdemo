
package bean;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Named;

/**
 *
 * @author Stark
 */
@FacesValidator 
@Named
public class TestBean implements Validator{
    private String username;
    private String password;

    public TestBean() {
    }
    
    public boolean  ValidatePassword(FacesContext context ,UIComponent cmp , Object value ) throws ValidatorException{
        String v = (String) value ;
        if(v.isEmpty()){
            throw new ValidatorException(new FacesMessage("şifre yaz kardeş"));
        }else if(v.length()<8){
            throw new ValidatorException(new FacesMessage("şifre 8 den az olamaz "));
            
        }
        return true;
    }
    
    public void register(){
        System.out.println("----------REGİSTER---------");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object t) throws ValidatorException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
}
