
/**
 * ABC수족관 입장료를 계산하는 메소드
 * 
 * @author (박채린,마츠바라 케이토,이와사키 메구미) 
 * @version (20200603)
 */
public class Blackbox
{
    /**
     * calculate = 수족관 입장료를 계산하는 메소드
     * @param = age
     * return 타입은 int 입니다.
     */
    int age = 0;
    public  int calculate(int age){
        if ( age > 16){
            return 2000;
        }
        else if(age > 7){
            return 900;
        }
        else if(age >= 4){
            return 400;
        }
        else if(age >= 0){
            return 0;
        }
        else{
            return 99999;
        }
        
    }
}

