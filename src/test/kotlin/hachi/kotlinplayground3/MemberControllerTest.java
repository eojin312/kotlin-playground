package hachi.kotlinplayground3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class MemberControllerTest extends BaseApiControllerTest{

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void members() throws Exception {
        mockMvc.perform(post("/member"))
                .andExpect(status().isOk());
    }
}