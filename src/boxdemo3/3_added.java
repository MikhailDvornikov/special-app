/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boxdemo3;

/**
 *
 * @author ���������
 */
public class BoxDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.width = 2;
        mybox1.height = 4;
        mybox1.depth = 6;
        
        // ��������� �������� ���������� ���������� myboxl
        mybox2.width = 4;
        mybox2.height = 8;
        mybox2.depth = 7;
        
        // ������� ����� ������� ���������������
        mybox1.volume();
        
        // ������� ����� ������� ���������������
        mybox2.volume();
        
        // 
        
    }
    
}
