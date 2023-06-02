// import files
import database.DatabaseClass;
import shop.Store;

// import java awt packages
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// import java sql package
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Store st = new Store();
        st.setVisible(true);
        st.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                try {
                    DatabaseClass.getInstance().getConnection().close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}