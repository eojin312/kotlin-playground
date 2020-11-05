package hachi.kotlinplayground3;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @RequestMapping(value = "/member", method = RequestMethod.POST)
    @ResponseBody
    public Member members(@RequestBody Member member) {
        return member;
    }
}
