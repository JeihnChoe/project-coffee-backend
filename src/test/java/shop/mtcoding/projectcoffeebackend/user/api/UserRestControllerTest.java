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
    public void hello_test() {
    }


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

        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);

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

    @Test
    public void login_test() throws Exception {
        UserRestRequest.LoginDTO requestDTO = new UserRestRequest.LoginDTO();

        requestDTO.setLoginId("ssar");
        requestDTO.setPassword("a12345678!");

        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);

        //when
        ResultActions resultActions =
                mockMvc.perform(
                        MockMvcRequestBuilders.post("/api/login")
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

    @Test
    public void logout_test() throws Exception {

        //when
        ResultActions resultActions =
                mockMvc.perform(
                        MockMvcRequestBuilders.post("/api/logout")
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

    @Test
    public void pwdupdate_test() throws Exception {
        UserRestRequest.PwdUpdateDTO requestDTO = new UserRestRequest.PwdUpdateDTO();

        requestDTO.setLoginId("ssar");
        requestDTO.setPassword("asd8941403!");

        ObjectMapper om = new ObjectMapper();
        String requestBody = om.writeValueAsString(requestDTO);

        //when
        ResultActions resultActions =
                mockMvc.perform(
                        MockMvcRequestBuilders.post("/api/pwdupdate")
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
