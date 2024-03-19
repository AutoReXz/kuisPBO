import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class juri extends JFrame implements ActionListener{
    private JLabel judul;
    private JTextField namaField;
    private JRadioButton animasiRadioButton;
    private JRadioButton menulissuratRadioButton;
    private JButton masuk;
    private JButton submit;
    private JButton submit2;
    
    private JTextField alurField;
    private JTextField konten;
    private JTextField kreativitas;
    private JTextField sinematografi;
    
    private JTextField struktur;
    private JTextField isi;
    private JTextField kreativitas2;
    private JTextField kaidahbahasa;
    
   private JPanel cardPanel;
   private CardLayout cardLayout;
   private JPanel awalPanel;
   private JPanel animasiPanel;
   private JPanel menulisPanel;
   private JLabel hasil;
    

    public juri() {
    super("Kalkulator Juri");
    
    awalPanel = new JPanel();
    animasiPanel = new JPanel();
    menulisPanel = new JPanel();
    
    cardLayout = new CardLayout();
    cardPanel = new JPanel (cardLayout);
    
    
    
    //awalPanel.setLayout(new GridLayout(5, 2, 5, 5));
    awalPanel.setLayout(new GridLayout(5, 2, 5, 5));
    animasiPanel.setLayout(new GridLayout(10, 10, 5, 5));
    menulisPanel.setLayout(new GridLayout(10,2,5,5));
    
    //judul = new JLabel('Lomba Sekolah');
    //judul.setHorizontalAlignment(SwingConstants.CENTER);
    JLabel judul = new JLabel("Lomba Sekolah");
    judul.setHorizontalAlignment(SwingConstants.CENTER);
    awalPanel.add(judul);
    
    animasiRadioButton = new JRadioButton("Animasi");
    menulissuratRadioButton = new JRadioButton("Menulis Surat");
    ButtonGroup group = new ButtonGroup();
    group.add(animasiRadioButton);
    group.add(menulissuratRadioButton);
    
    awalPanel.add(animasiRadioButton);
    awalPanel.add(menulissuratRadioButton);
    
    masuk = new JButton("Masuk");
    masuk.addActionListener(this);
    awalPanel.add(masuk);
    
    JLabel namaLabel = new JLabel("Nama  : ");
    JLabel namanya = new JLabel(" Agung ");
    JLabel sekolahLabel = new JLabel("Nama Sekolah : ");
    JLabel sekolahnya = new JLabel("UPN School");
    JLabel alurteks = new JLabel("Alur  :");
    alurField = new JTextField(2);
    JLabel kontenteks = new JLabel("Konten  :");
    konten = new JTextField(2);
    JLabel kreativitasteks = new JLabel("Kreativitas  :");
    kreativitas = new JTextField(2);
    JLabel sinematografiteks = new JLabel("Sinematografi  :");
    sinematografi = new JTextField(2);
    
    animasiPanel.add(namaLabel);
    animasiPanel.add(namanya);
    animasiPanel.add(sekolahLabel);
    animasiPanel.add(sekolahnya);
    animasiPanel.add(alurteks);
    animasiPanel.add(alurField);
    animasiPanel.add(kontenteks);
    animasiPanel.add(konten);
    animasiPanel.add(kreativitasteks);
    animasiPanel.add(kreativitas);
    animasiPanel.add(sinematografiteks);
    animasiPanel.add(sinematografi);
    
    submit = new JButton("submit");
    submit.addActionListener(this);
    //submit.setHorizontalAlignment(SwingConstants.CENTER);
    animasiPanel.add(submit);
    
    hasil = new JLabel("Hasil : (isi dahulu)");
    animasiPanel.add(hasil);
    
    
    
    JLabel namatim = new JLabel("Nama tim : ");
    JLabel namatimnya = new JLabel(" IF Biru ");
    JLabel sekolahLabel2 = new JLabel("Nama Sekolah : ");
    JLabel sekolahnya2 = new JLabel("UPN School");
    JLabel strukturteks = new JLabel("Struktur  :");
    struktur = new JTextField(2);
    JLabel isiteks = new JLabel("Isi  :");
    isi = new JTextField(2);
    JLabel kreativitas2teks = new JLabel("Kreativitas  :");
    kreativitas2 = new JTextField(2);
    JLabel kaidahbahasateks = new JLabel("Kaidah Bahasa  :");
    kaidahbahasa = new JTextField(2);
    
    menulisPanel.add(namatim);
    menulisPanel.add(namatimnya);
    menulisPanel.add(sekolahLabel2);
    menulisPanel.add(sekolahnya2);
    menulisPanel.add(strukturteks);
    menulisPanel.add(struktur);
    menulisPanel.add(isiteks);
    menulisPanel.add(isi);
    menulisPanel.add(kreativitas2teks);
    menulisPanel.add(kreativitas2);
    menulisPanel.add(kaidahbahasateks);
    menulisPanel.add(kaidahbahasa);
    
    submit2 = new JButton("submit");
    submit2.addActionListener(this);
    //submit.setHorizontalAlignment(SwingConstants.CENTER);
    menulisPanel.add(submit2);
    
    
    
    cardPanel.add(awalPanel, "awal");
    cardPanel.add(animasiPanel, "animasi");
    cardPanel.add(menulisPanel, "menulis");
    //add(awalPanel);
    add(cardPanel);
            
    pack();
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == masuk){
            if(animasiRadioButton.isSelected())
            {
                cardLayout.show(cardPanel, "animasi");
            } else if(menulissuratRadioButton.isSelected())
            {
                cardLayout.show(cardPanel, "menulis");
            }
            
        }
    }
    
    public void actionPerformed2(ActionEvent e) {
        if(e.getSource() == submit){
            int nalur = Integer.parseInt(alurField.getText())*15/100;
            int nkonten = Integer.parseInt(konten.getText())*35/100;
            int nkreativitas = Integer.parseInt(kreativitas.getText())*35/100;
            int nsinematografi = Integer.parseInt(sinematografi.getText())*15/100;
            String jumlah = "" + (nalur + nkonten + nkreativitas + nsinematografi);
            hasil.setText(jumlah);
            
        }
    }
    
    //bilanganBulat = integer.parseInt(textField.getText())
    


    public static void main(String[] args) {
        new juri();
    }
}