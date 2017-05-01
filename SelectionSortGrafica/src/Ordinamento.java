import java.awt.image.ImageObserver;
/**
 *
 * @author StoccoEmanuele
 */
public class Ordinamento extends javax.swing.JFrame 
{
    //dichiarazione variabili
    int dimensione, vettore[], cont;
    String insDim, stringa;
    boolean selection;
    
    public Ordinamento() //costruttore
    {
        initComponents();
        dimensione = 0;
        cont = 0;
        selection = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jLabel1.setText("Vettore Generato:");

        jLabel2.setText("Vettore Ordinato:");

        button1.setLabel("Avvia Ordinamento");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        jLabel3.setText("Inserire numero elementi vettore:");

        jMenu1.setText("Algoritmo di ordinamento");

        jMenuItem1.setText("Quick Sort");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Bitonic Sort");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Shaker Sort");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Bubble Sort");
        jMenu1.add(jMenuItem4);

        jMenuItem9.setText("Merge Sort");
        jMenu1.add(jMenuItem9);

        jMenuItem5.setText("Shell Sort");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Radix Sort");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Insertion Sort");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Selection Sort");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem10.setText("Counting Sort");
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //evento se premuto il bottone "Avvia Ordinamento"
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        
        //Se il contenuto della texbox della dimensione del vettore è vuoto viene segnalato
        if(jTextField4.getText() == "")
        {
            insDim = "Non hai inserito la dimensione del vettore!";
            jTextField4.setText(insDim); //il messaggio verrà visualizzato nella textbox del vettore
        }
        
        //prende il contenuto della textbox e la converte in un numero intero
        insDim = jTextField4.getText();
        dimensione = Integer.parseInt(insDim);
        
            Vettore(dimensione, vettore); //richiamo metodo vettore
    }//GEN-LAST:event_button1MouseClicked

    //se premuto l'algoritmo di ordinamento dal menù a tendina
    private void jMenuItem8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseClicked
        selection = true;
    }//GEN-LAST:event_jMenuItem8MouseClicked

    //genera il vettore di numeri casuali e ne visualizza il contenuto
    private void Vettore(int dimensione, int[]vettore)
    {
       vettore = new int[dimensione];
       cont = 0;
       
       for(int i = 0; i < vettore.length; i++)
       {
           double casuale = (int)(Math.random()*100); //generazione di numeri casuali da 0 a 100
           vettore[i] = (int)casuale;
           
           //stampa del contenuto del vettore
           if(cont == 0)
           {
            stringa = " " + Integer.toString(vettore[i]);
            cont++;
           }
           else
            stringa = " " + stringa + " " + Integer.toString(vettore[i]);
               
           jTextField2.setText(stringa);
       }
       
       //richiamo dell'algoritmo di ordinamento selezionato
       if(selection == /*true*/false)
        SelectionSort(vettore);
       else
        {
           stringa = "Nessun algoritmo di ordinamento selezionato.";
           jTextField3.setText(stringa);
        }
       
       }
    
    //algoritmo di ordinamento SelectionSort
    private void SelectionSort(int vettore[])
    {
       for(int i = 0; i < vettore.length-1; i++) 
        {
            int minimo = i;
            
            for(int j = i+1; j < vettore.length; j++) 
            {
             //Qui avviene la selezione, ogni volta
             //che nell' iterazione troviamo un elemento piú piccolo di minimo
             //facciamo puntare minimo all'elemento trovato
                    if(vettore[minimo] > vettore[j])
                        minimo = j;
            }
            
            //Se minimo è diverso dall'elemento di partenza allora avviene
            //lo scambio
            if(minimo != i)
            { 
                int k = vettore[minimo];
                vettore[minimo] = vettore[i];
                vettore[i] = k;
            }
        }
       Stampa(vettore);
    }
    
    //stampa del contenuto del vettore
    private void Stampa(int vettore[])
    {
        cont = 0;
        
       for(int i = 0; i < vettore.length; i++)
       {
            if(cont == 0)
           {
            stringa = " " + Integer.toString(vettore[i]);
            cont++;
           }
           else
            stringa = " " + stringa + " " + Integer.toString(vettore[i]);
               
           jTextField3.setText(stringa);
       }
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        { public void run() 
            { new Ordinamento().setVisible(true); } });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
