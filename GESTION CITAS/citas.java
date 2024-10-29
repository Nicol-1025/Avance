import javax.swing.*;
import java.awt.*;

public class AgendarCita {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Agendar Cita");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        
        JLabel nombreLabel = new JLabel("Nombre del Cliente:");
        JTextField nombreField = new JTextField();
        
        JLabel servicioLabel = new JLabel("Servicio:");
        JComboBox<String> servicioBox = new JComboBox<>(new String[] {"Consulta Médica", "Odontología"});
        
        JLabel fechaLabel = new JLabel("Fecha de la Cita:");
        JTextField fechaField = new JTextField();
        
        JLabel horaLabel = new JLabel("Hora de la Cita:");
        JTextField horaField = new JTextField();
        
        JButton agendarButton = new JButton("Agendar Cita");
        
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(servicioLabel);
        panel.add(servicioBox);
        panel.add(fechaLabel);
        panel.add(fechaField);
        panel.add(horaLabel);
        panel.add(horaField);
        panel.add(new JLabel()); // Placeholder
        panel.add(agendarButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
