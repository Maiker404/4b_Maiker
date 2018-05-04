package br.edu.ifro;
import br.edu.ifro.modelo.Aluno;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class AlunoController implements Initializable {
    @FXML
    private JFXTextField txtNome;
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnFechar;
    @Override
    public void initialize(URL url, ResourceBundle rb) {}    
    @FXML
    private void gravarNoBanco(ActionEvent event) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("aula");
        EntityManager em=emf.createEntityManager();
        Aluno aluno=new Aluno();
        aluno.setNome(txtNome.getText());
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
    }
    @FXML
    private void fecharJanela(ActionEvent event) {
        Stage stage = (Stage) btnFechar.getScene().getWindow();
        stage.close();
    }
}