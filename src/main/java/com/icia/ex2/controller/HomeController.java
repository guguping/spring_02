package com.icia.ex2.controller;

import com.icia.ex2.dto.StudentDTO;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello1")
    public String Hello1(){
        return "hello1";
    }

    @GetMapping("/hello-param1")
    public String Hello2(@RequestParam("name") String name,@RequestParam("age") String age){
        System.out.println("name = " + name + ", age = " + age);
        return "hello2";
    }
    @GetMapping("/hello-param2")
    public String Hollo2_1(@RequestParam("email") String email,@RequestParam("password") int password ){
        System.out.println("email = " + email + ", password = " + password);
        return "index";
    }
    @GetMapping("/form-param1")
    public String formParam1(@RequestParam("p1") String p1,@RequestParam("p2") String p2){
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        return "index";
    }
    /* @GetMapping ("/form-param1") 와 @PostMapping ("/form-param1")는
    *  메인주소는 같지만 전송 방식이 다르기 때문에 다르다고 판단되어 같은 주소로 사용 가능하다 */
    @PostMapping("/form-param1")
    public String formParam2(@RequestParam String p3,@RequestParam String p4) {
        /* 파라미터의 변수 이름과 메소드에서 사용하는 변수의 이름이 같으면 생략 가능하다 */
        System.out.println("p3 = " + p3 + ", p4 = " + p4);
        return "index";
    }

    @GetMapping("/hello3")
    public String hello3(Model model){
        /* Model = 스프링에서 제공하는 인터페이스 */
        String s1 = "안녕하세요";
        model.addAttribute("m1",s1);
        return "hello3";
    }

    @GetMapping("/hello4")
    public String hello4(Model model){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("12341234");
        model.addAttribute("student",studentDTO);
        return "hello4";
    }

    /* hello5 요청을 처리하는 메서드
    *  실행내용: StudentDTO 객체를 담는 ArrayList를 선언하고 학생 2명의 정보를 리스트에 저장 후
    *  리스트를 모델에 담자 */

    @GetMapping("/hello5")
    public String Hello5(Model model){
//        StudentDTO studentDTO = new StudentDTO();
//        List<StudentDTO> sList = new ArrayList<>();
//        studentDTO.setId(1L);
//        studentDTO.setStudentName("학생1");
//        studentDTO.setStudentNumber("12341234");
//        sList.add(studentDTO);
//        studentDTO = new StudentDTO();
//        studentDTO.setId(2L);
//        studentDTO.setStudentName("학생2");
//        studentDTO.setStudentNumber("45674567");
//        sList.add(studentDTO);
//        model.addAttribute("sList",sList);

        List<StudentDTO> sList = new ArrayList<>();
        for (int i = 1 ; i<=10 ; i++){
//            StudentDTO studentDTO = newStudent(i);
//            sList.add(studentDTO);
            sList.add(newStudent(i));
        }
        model.addAttribute("sList",sList);
        return "hello5";
    }

    private StudentDTO newStudent(int i){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId((long)i);
        studentDTO.setStudentName("학생"+i);
        studentDTO.setStudentNumber("1111110"+i);
        return studentDTO;
    }
}
