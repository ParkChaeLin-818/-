
/**
 * 여기에 Blackbox 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Blackbox
{
    public static void main(String[] args){
        int x = 0;
        //16세이상인 경우
        if (150 > x && x > 16){
            System.out.print("2000원 입니다.");
        }
        //7세이상인 경우
        else if(x > 7){
            System.out.print("900원 입니다.");
        }
        //4세이상인 경우
        else if(x > 4){
            System.out.print("400원 입니다.");
        }
        //4세미만인 경우
        else if(x > 0){
            System.out.print("0원 입니다.");
        }
        //잘못된 경우
        else{
            System.out.print("잘못된 값 입니다.");
        }
        
    }
}
