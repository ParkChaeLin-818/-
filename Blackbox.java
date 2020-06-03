<<<<<<< HEAD

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
=======

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

>>>>>>> 2d992c7cc721b0f993dc80573f8a5a87c412e2a4
