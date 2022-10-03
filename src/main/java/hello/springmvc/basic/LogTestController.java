package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass()); #slf4j annotation이 자동으로 넣어줌

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        //log.trace(" trace log="+name); // 이렇게는 사용하면 안됨, + 연산이 일어나면서 메모리를 사용하게되는 비효율 발생 , 쓸모없는 리소스 사용

        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info(" info log={}",name);
        log.warn(" warn log={}",name);
        log.error(" error log={}",name);

        return "ok";
    }
}
