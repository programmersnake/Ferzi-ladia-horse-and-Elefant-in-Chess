package chessfigures;

import java.util.HashMap;
import java.util.Scanner;

public class ChessFigures {

    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);        
        HashMap map = new HashMap<String, Character>();           
        
        int x1=scan.nextInt();
        int y1=scan.nextInt();
        int x2=scan.nextInt();
        int y2=scan.nextInt();
        int x3=scan.nextInt();
        int y3=scan.nextInt();
        int x4=scan.nextInt();
        int y4=scan.nextInt();
        
        Ferz f = new Ferz(x1,y1, map);        
        Horse h=new Horse(x2,y2,map);        
        Ladia l=new Ladia(x3,y3,map);
        Elefant e=new Elefant(x4, y4, map);        
        
        f.M(); h.M(); l.M(); e.M();        
        
        map.remove(x1+""+y1);
        map.remove(x2+""+y2);
        map.remove(x3+""+y3);
        map.remove(x4+""+y4);
        
        System.out.println(map);
        System.out.println("Free kl="+map.size());
    }        
    
}

class Ferz{
    public int x,y;
    HashMap<String,Character> map;
    Ferz(int x, int y, HashMap map){
        this.x=x;
        this.y=y;
        this.map=map;
    }
    
    void M(){
        int N=X_void_minus(x, y)+X_void_plus(x, y)+Y_void_minus(x, y)+Y_void_plus(x, y)+Diagonal_1(x, y)+Diagonal_2(x, y)+Diagonal_3(x, y)+Diagonal_4(x, y);
        System.out.println(N);
    }
    
    private int X_void_minus(int x, int y){
        int N=0;
        while(true)
            if(x<=1) break;
            else {                
                x--;                
                N++;
                map.put(x+""+y, 'f');                
            }                
        return N;
    }
    
    private int X_void_plus(int x, int y){
        int N=0;
        while(true)
            if(x>=8) break;
            else {                
                x++;                
                N++;
                map.put(x+""+y, 'f');
            }                
        return N;
    }
    
    private int Y_void_minus(int x, int y){
        int N=0;
        while(true)
            if(y<=1) break;
            else {
                y--;
                N++;
                map.put(x+""+y, 'f');
            }                
        return N;
    }
    
    private int Y_void_plus(int x, int y){
        int N=0;
        while(true)
            if(y>=8) break;
            else {
                y++;
                N++;
                map.put(x+""+y, 'f');
            }                
        return N;
    }
    
    private int Diagonal_1(int x, int y){
        int N=0;
        while(true)
            if(x<=1||y<=1) break;
            else {                
                x--;
                y--;                
                N++;
                map.put(x+""+y, 'f');
            }                
        return N;
    }    
    
    private int Diagonal_2(int x, int y){
        int N=0;
        while(true)
            if(x>=8||y>=8) break;
            else {                
                x++;
                y++;                
                N++;
                map.put(x+""+y, 'f');
            }                
        return N;
    }
    
    private int Diagonal_3(int x, int y){
        int N=0;
        while(true)
            if(x<=1||y>=8) break;
            else {                
                x--;
                y++;                
                N++;
                map.put(x+""+y, 'f');
            }                
        return N;
    }
    
    private int Diagonal_4(int x, int y){
        int N=0;
        while(true)
            if(x>=8||y<=1) break;
            else {                
                x++;
                y--;                
                N++;
                map.put(x+""+y, 'f');
            }                
        return N;
    }
      
}


class Horse{
    public int x,y;
    HashMap<String, Character> map;
    Horse(int x, int y, HashMap map){
        this.x=x;
        this.y=y;
        this.map=map;
    }
    
    void M(){
        int N=G1(x,y)+G2(x,y)+G3(x,y)+G4(x,y)+G5(x,y)+G6(x,y)+G7(x,y)+G8(x,y);        
    }
    
    private int G1(int x, int y){
        int N=0;        
        if(x>=8||y>=7) return 0;
        else {                
            x++;                
            y+=2;
            N++;
            map.put(x+""+y, 'h');
        }                
        return N;
    }
    
    private int G2(int x, int y){
        int N=0;
        if(x>=7||y>=8) return 0;
        else {                
            x+=2;                
            y++;
            N++;
            map.put(x+""+y, 'h');
        }                
        return N;
    }
    
    private int G3(int x, int y){
        int N=0;
        if(x>=7||y<=1) return 0;
        else {                
            x+=2;                
            y--;
            N++;
            map.put(x+""+y, 'h');
        }                            
        return N;
    }
    
    private int G4(int x, int y){
        int N=0;
        if(x>=8||y<=2) return 0;
        else {                
            x++;                
            y-=2;
            N++;
            map.put(x+""+y, 'h');
        }                
        return N;
    }
    
    private int G5(int x, int y){
        int N=0;
        if(x<=1||y<=2) return 0;
        else {                
            x--;                
            y-=2;
            N++;
            map.put(x+""+y, 'h');
        }                
        return N;
    }    
    
    private int G6(int x, int y){
        int N=0;
        if(x<=2||y<=1) return 0;
        else {                
            x-=2;                
            y--;
            N++;
            map.put(x+""+y, 'h');
        }                
        return N;
    }
    
    private int G7(int x, int y){
        int N=0;
        if(x<=2||y>=8) return 0;
        else {                
            x-=2;                
            y++;
            N++;
            map.put(x+""+y, 'h');
        }                
        return N;
    }
    
    private int G8(int x, int y){
        int N=0;
        if(x<=1||y>=7) return 0;
        else {                
            x--;                
            y+=2;
            N++;
            map.put(x+""+y, 'h');
        }                
        return N;
    }
      
}

class  Ladia{
    public int x,y;
    HashMap<String, Character> map;
    Ladia(int x, int y, HashMap map){
        this.x=x;
        this.y=y;
        this.map=map;
    }
    
    void M(){
        int N=Diagonal_1(x, y)+Diagonal_2(x, y)+Diagonal_3(x, y)+Diagonal_4(x, y);
        System.out.println(N);
    }
    
    private int Diagonal_1(int x, int y){
        int N=0;
        while(true)
            if(x<=1||y<=1) break;
            else {                
                x--;
                y--;                
                N++;
                map.put(x+""+y,'l');
            }                
        return N;
    }    
    
    private int Diagonal_2(int x, int y){
        int N=0;
        while(true)
            if(x>=8||y>=8) break;
            else {                
                x++;
                y++;                
                N++;
                map.put(x+""+y,'l');
            }                
        return N;
    }
    
    private int Diagonal_3(int x, int y){
        int N=0;
        while(true)
            if(x<=1||y>=8) break;
            else {                
                x--;
                y++;                
                N++;
                map.put(x+""+y,'l');
            }                
        return N;
    }
    
    private int Diagonal_4(int x, int y){
        int N=0;
        while(true)
            if(x>=8||y<=1) break;
            else {                
                x++;
                y--;                
                N++;
                map.put(x+""+y,'l');
            }                
        return N;
    }
    
}

class Elefant{
    public int x,y;
    HashMap<String, Character> map;
    Elefant(int x, int y, HashMap map){
        this.x=x;
        this.y=y;
        this.map=map;
    }
    
    void M(){
        int N=X_void_minus(x, y)+X_void_plus(x, y)+Y_void_minus(x, y)+Y_void_plus(x, y);
        System.out.println(N);
    }
    
    private int X_void_minus(int x, int y){
        int N=0;
        while(true)
            if(x<=1) break;
            else {                
                x--;                
                N++;
                map.put(x+""+y, 'e');
            }                
        return N;
    }
    
    private int X_void_plus(int x, int y){
        int N=0;
        while(true)
            if(x>=8) break;
            else {                
                x++;                
                N++;
                map.put(x+""+y, 'e');
            }                
        return N;
    }
    
    private int Y_void_minus(int x, int y){
        int N=0;
        while(true)
            if(y<=1) break;
            else {
                y--;
                N++;
                map.put(x+""+y, 'e');
            }                
        return N;
    }
    
    private int Y_void_plus(int x, int y){
        int N=0;
        while(true)
            if(y>=8) break;
            else {
                y++;
                N++;
                map.put(x+""+y, 'e');
            }                
        return N;
    }
      
}