//package projectcoffeebackend.user.api;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import projectcoffeebackend.MyWithRestDoc;
//import shop.mtcoding.projectcoffeebackend.user.api.UserRestRequest;
//
//@AutoConfigureRestDocs
//@SpringBootTest
//public class UserRestControllerTest extends MyWithRestDoc {
//
//    @Test
//    public void join_test() throws Exception {
//        //given
//        UserRestRequest.JoinDTO requestDTO = new UserRestRequest.JoinDTO();
//
//            requestDTO.setLoginId("hello");
//            requestDTO.setUserName("김헬로");
//            requestDTO.setPassword("a12345678!");
//            requestDTO.setEmail("baronjae@gmail.com");
//            requestDTO.setPhoneNumber("01093085400");
//
//        System.out.println(requestDTO);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String requestBody = objectMapper.writeValueAsString(requestDTO);
//
//        //when
//        ResultActions resultActions =
//                mockMvc.perform(
//                        MockMvcRequestBuilders.post("/api/join")
//                        .content(requestBody)
//                        .contentType(MediaType.APPLICATION_JSON)
//                );
//        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
//        System.out.println(responseBody);
//        //then
//        resultActions
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.success").value(true))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.response.id").value(4))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.response.loginId").value("hello"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.response.username").value("김헬로"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.response.password").value("a12345678!"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.response.email").value("baronjae@gmail.com"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.response.phoneNumber").value("01093085400"))
//                .andDo(MockMvcResultHandlers.print())
//                .andDo(document);
//    }
//}
