
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Named
@RequestScoped
public class VacanteForm {
    //Int¿yectar dependencia
    @Inject
    private Candidato candidato;
    
    Logger log = LogManager.getRootLogger();
    
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }
    
    public String enviar(){
        if(this.candidato.getNombre().equals("Angel")){
            System.out.println("EXITOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
            log.info("Entando al caso de exito");
            return "exito";//REDIRECCIONAR
        }
        else{
            System.out.println("FALLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
            log.info("Entando al caso de fallo");
            return "fallo";
        }
    }
}
