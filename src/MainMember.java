import java.util.ArrayList;
public class MainMember {
    public static ArrayList <Member> member = new ArrayList<>();
    public static void main(String[] args) {
         
         Member b1 = new Member();
         Member b2 = new Member();
         Member b3 = new Member();
         
         b1.setNama("Tery Kincowati");
         b1.setTeam("OPTIIK");
         b1.setUmur(19);
         b1.setPerformance(89);
         b1.setSuara(87);
         b1.setAttitude(90);
         
         b2.setNama("Irma Nurvianti");
         b2.setTeam("BIOS");
         b2.setUmur(20);
         b2.setPerformance(88);
         b2.setSuara(89);
         b2.setAttitude(880);
         
         b3.setNama("Fatimatus Zahro");
         b3.setTeam("RAYON");
         b3.setUmur(20);
         b3.setPerformance(87);
         b3.setSuara(80);
         b3.setAttitude(90);
         
         member.add(b1);
         member.add(b2);
         member.add(b3);
         hasil();
    }
    public static void hasil(){
        System.out.println("==============================================");
        System.out.println(">>>>>>>>>>>>>>> DAFTAR MEMBER <<<<<<<<<<<<<<<<");
        System.out.println("==============================================");
        for (int i=0; i<member.size();i++ ){
            System.out.println("");
            System.out.println("Data Member :");
            System.out.println("Nama Member\t: "+member.get(i).getNama());
            System.out.println("Nama Team\t: "+member.get(i).getTeam());
            System.out.println("Umur\t\t: "+member.get(i).getUmur());
            System.out.println("Rata-Rata\t: "+member.get(i).getNilai());
        System.out.println("----------------------------------------------");
        }
    }
   
    
}