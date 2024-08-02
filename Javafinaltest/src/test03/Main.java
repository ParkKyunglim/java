package test03;

class MovieTicket {
	// 속성
    private String movieTitle;
    private String screenTime;
    private String seatNumber;
    private boolean isBooked;

    // 생성자
    public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
        this.movieTitle = movieTitle;
        this.screenTime = screenTime;
        this.seatNumber = seatNumber;
        this.isBooked = false; // 초기 상태는 예약되지 않음
    }

    // 예약 메서드
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + " 예매 완료");
        } else {
            System.out.println("이미 예매됨");
        }
    }

    // 취소 메서드
    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;            
            System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + " 취소 완료");
        } else {            
            System.out.println("아직 예매 안됨");
        }
    }

    // 티켓 정보 출력 메서드
    public void printTicketInfo() {
        System.out.println("영화제목 : " + movieTitle);
        System.out.println("상영시간 : " + screenTime);
        System.out.println("좌석번호 : " + seatNumber);
        System.out.println("예매여부 : " + (isBooked ? "Yes" : "No"));
    }
}
public class Main {
    public static void main(String[] args) {
    	 // 티켓 객체 생성
        MovieTicket ticket = new MovieTicket("타이타닉", "19:00", "A1");

        // 티켓 정보 출력
        ticket.printTicketInfo();
        System.out.println("-------------------------");
        
        // 예약 테스트
        ticket.bookTicket();
        System.out.println("-------------------------");
        
        // 티켓 정보 출력
        ticket.printTicketInfo();
        System.out.println("-------------------------");

        // 이미 예약된 경우
        ticket.bookTicket();
        System.out.println("-------------------------");

        // 취소 테스트
        ticket.cancelBooking();
        System.out.println("-------------------------");
        
        // 티켓 정보 출력
        ticket.printTicketInfo();
        System.out.println("-------------------------");
        
        // 이미 취소된 경우
        ticket.cancelBooking();
        System.out.println("-------------------------");
    }
}