package com.thoughtworks.capability.gtb.demospringconfig;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource("/application-small.properties")
public class SmallLevelControllerTest {
  @Autowired
  MockMvc mockMvc;

  LevelController levelController;

  @Test
  public void should_get_basic_given_level_less_than_one() throws Exception {
    mockMvc.perform(get("/level"))
        .andExpect(MockMvcResultMatchers.content()
            .string("basic"));
  }

}
