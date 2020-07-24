
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class MinhaThread implements Runnable {

    JLabel jLabel;
    
    public MinhaThread(JLabel j){
        jLabel = j;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            jLabel.setText(Thread.currentThread().getName() + " : Processando..." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jLabel.setText(Thread.currentThread().getName() + " : Finalizada!");
    }

}
