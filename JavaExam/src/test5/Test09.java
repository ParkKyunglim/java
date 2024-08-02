package test5;

enum Gender { // 열거 객체
    MALE, FEMALE
}

class Man {
    public void print() {
        System.out.println("남자 입니다.");
    }
}

class Woman {
    public void print() {
        System.out.println("여자 입니다.");
    }
}

public class Test09 {
    public static void main(String[] args) {
        Object human1 = makeHuman(Gender.MALE);
        Object human2 = makeHuman(Gender.FEMALE);

        if (human1 instanceof Man) { // 타입
            Man man = (Man) human1;
            man.print();
        }

        if (human2 instanceof Woman woman) {
            woman.print();
        }
    }

    public static Object makeHuman(Gender gender) { // Man, Woman 객체 둘 다 같은 타입으로 바꿀 수 있는 것으로..(부모없음) 모든 객체는 object로 받을 수 있음
        if (gender == Gender.MALE) {
            return new Man();
        } else if (gender == Gender.FEMALE) {
            return new Woman();
        }
        return null;
    }
}
