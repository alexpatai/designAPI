package com.patai.designapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class DesignAPIControllerTests {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void test_index(){
        try{
            mockMvc.perform(MockMvcRequestBuilders.get("/"))
                    .andExpect(status().isOk())
                    .andExpect(content().string(equalTo("Design API application running.")));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test_getCompColor(){
        try{
            mockMvc.perform(MockMvcRequestBuilders.get("api/complementary/color/red"))
                    .andExpect(status().isOk())
                    .andExpect(content().string(equalTo("green")));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
