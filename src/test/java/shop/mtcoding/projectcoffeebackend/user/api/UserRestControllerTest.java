package shop.mtcoding.projectcoffeebackend.user.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import shop.mtcoding.projectcoffeebackend.MyWithRestDoc;



@SpringBootTest
public class UserRestControllerTest extends MyWithRestDoc {

    @Test
    public void hello_test(){}

    @Test
    public void join_test() throws Exception {
        //given
        UserRestRequest.JoinDTO requestDTO = new UserRestRequest.JoinDTO();

            requestDTO.setLoginId("hello");
            requestDTO.setUserName("김헬로");
            requestDTO.setPassword("a12345678!");
            requestDTO.setEmail("baronjae@gmail.com");
            requestDTO.setPhoneNumber("01093085400");

        System.out.println(requestDTO);

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(requestDTO);

        //when
        ResultActions resultActions =
                mockMvc.perform(
                        MockMvcRequestBuilders.post("/api/join")
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON)
                );
        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(responseBody);
        //then
        resultActions
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
                .andExpect(MockMvcResultMatchers.jsonPath("$.error").isEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andDo(document);
    }
}
