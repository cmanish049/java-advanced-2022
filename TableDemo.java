import javax.swing.*;
public class TableDemo {
    JFrame f;
    TableDemo(){
        f=new JFrame();
        String data[][]={ {"101","Aakash","Kathmandu"},
                {"102","Bikash","Rolpa"},
                {"103","Subash","Jhapa"},
                {"104","Tara","Lalitpur"}
        };
        String column[]={"Roll No.","Name","Address"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TableDemo();
    }
}