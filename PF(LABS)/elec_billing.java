public class elec_billing{
    public static void main(String[] args) {
        
        int a= 253;
        int b= 578;
        
        System.out.println("Your bill on units "+ a + " is " + bill(a)+"rs");
        System.out.println("Your bill on units "+ b + " is " + bill(b)+"rs");
    }
    public static int bill(int u) {

        int bill=0;
        int i=u; 

        int slab1;
        if (i<100) {
            slab1=i;
        }
            else {
                slab1=100;
            }
        
        bill+=slab1*15;
        i -= slab1;



        int slab2;
        if (i<200) {
            slab2=i;
        }
            else {
                slab2=200;
            }
        
            bill+=slab2*25;
        i -= slab2;



        int slab3;
        if (i<200) {
            slab3=i;
        }
            else {
                slab3=200;
            }
        
        bill+=slab3*35;
        i -= slab3;



        int slab4 = i; 
        bill += slab4 * 50;


        return bill;
    }
}