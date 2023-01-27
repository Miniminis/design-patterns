package me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before;

import java.time.LocalDate;

/**
 * 문제점
 * 1. 생성자를 만드는 방법이 장황해진다.
 * - 당일치기(nights, days 가 없는) 등 케이스에 따라서 다른 생성자가 필요하다.
 * 2. nights를 설정하면 days 를 자동으로 설정하도록 강제하고 싶은데 불가하다.
 * 3. 다양한 구성의 인스턴스를 만드는 방법을 제공한다.
 * - 복잡한 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.
 * 장점
 * 1. 인스턴스 만드는 순서를 강제할 수 있다.
 * - 일반 생성자에서는 그냥 순서에 맞는 타입만 넣어주면 되었다. 강제할 수는 없음.
 *      - 생성자에 복잡한 로직이 들어가게 된다.
 * 2. 복잡한 객체를 만드는 과정을 숨길 수 있다.
 * - 클라이언트에서는 그 과정을 알 필요없이 그냥 가져다가 쓰면 된다.
 * 3. 인스턴스 타입 빌더를 매개변수를 받기 떄문에 확장에 용이하다.
 * - VIPTourBuilder, ForeignerTourBuilder 등 다양한 빌더들이 올 때, 인스턴스 타입인 TourBuilder 로 여전히 수정없이 받을 수 있다.
 * 4. 불완전한 객체를 사용할 수 없게끔 강제한다.
 * - 반드시 getUser() 를 통해서만 객체를 가져와 사용할 수 있다.
 * 단점
 * 1. 항상 디렉터를 사용해야한다. 객체를 더 만들어야한다.
 * 2. 구조가 기존에 비해 복잡해진다.
 * */
public class App {

    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));


        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");
    }
}
