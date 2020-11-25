import java.util.Arrays;
import java.util.StringTokenizer;

class Machine {

    private String color;
    private String name;
     boolean status;

    public Machine(String color,String name){
        this.status = true;
    }

    public void on(){
        this.status = false;
    }
    public String shw(){
        return (this.status==true?"may dang mo":"may dang tat");
    }

}

