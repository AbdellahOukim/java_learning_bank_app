public class Account {
    private int rib ;
    private String user ;
    private int password ;
    private double sold ;

    public Account( int rib , String user , int password , double sold ) {
        this.rib = rib ;
        this.user = user ;
        this.password = password ;
        this.sold = sold ;
    }

    public int getRIB() {
        return this.rib ;
    }

    public  int getPassword() {
        return this.password ;
    }

}
