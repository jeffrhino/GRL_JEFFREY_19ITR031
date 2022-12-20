
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    UserInput obj = new UserInput();
	    obj.Method1();
	    Measure obj1 = new Measure();
	    obj1.Method1();
	}
}
class DataSet{
    float distance;
    float time;
    
    public DataSet(float distance , float time){
        this.distance = distance;
        this.time = time;
    }
    public String toString(){
        return this.distance+","+this.time;
    }
  }
class UserInput {
    DataSet[] Attribute1 = new DataSet[10];
    float[] speed = new float[10];
    public void Method1(){
        for(int i=0;i<2;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the distance");
            float dist = sc.nextFloat();
            System.out.println("Enter the time");
            float tim = sc.nextFloat();
            float speed = dist/tim;
            Attribute1[i]= new DataSet(dist,tim);
        }
         for(int i=0;i<2;i++){
            speed[i] = Attribute1[i].distance/Attribute1[i].time;
            System.out.println("Distance : "+Attribute1[i].distance);
            System.out.println("Time : "+Attribute1[i].time);
            System.out.println("Speed :" +speed[i]);
        }
    }
}
class Measure extends UserInput{
    public void Method1(){
        //speed=distance/time;
    }
}
class ShowResult{
    //return 0;
}
