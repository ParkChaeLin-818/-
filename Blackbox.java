
/**
 * ABC수족관 입장료를 계산 하는 메소드
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Blackbox
{
    int age = 0;
    public  int caluculate(int age){
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
