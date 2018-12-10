package farmaware;

import br.com.farmaware.dao.UserDAO;
import br.com.farmaware.model.User;
import br.com.farmaware.view.LoginView;
import br.com.farmaware.view.UserView;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lucasdm
 */
public class FarmaWare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set theme
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FarmaWare.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FarmaWare.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FarmaWare.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FarmaWare.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Startup
        
        UserDAO dao = new UserDAO();
        List<User> users = null;
        try {
            users = dao.getRecords("categ = 0");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: \n" + ex.getMessage(), "Erro", 0);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Classe: \n" + ex.getMessage(), "Erro", 0);
        }
        
        if(users.size() > 0){
            LoginView lv = new LoginView();
            lv.setVisible(true);
        }
        else{
            UserView uv = new UserView(null, true);
            uv.setVisible(true);
        }
        
    }
    
}
