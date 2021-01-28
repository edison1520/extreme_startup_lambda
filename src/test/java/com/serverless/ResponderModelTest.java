package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResponderModelTest {
    @Test
    public void  cuandoPreguntanPorElNombreRespondeCarlos(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "d4f58f60: what is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("devopers");
    }

    @Test
    public void  cuandoPreguntanPorSumar12y5Responder17(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "39543160: what is 12 plus 5";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("17");
    }

}
