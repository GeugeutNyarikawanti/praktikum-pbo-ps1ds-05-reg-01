package com.geugeut.guided.guided2.main;

import com.geugeut.guided.guided2.hargapulsa.*;
import com.geugeut.guided.guided2.hargatoken.*;

public class mainTokenPulsa {
    public static void main(String[] args){
        HargaPulsa pulsa = new HargaPulsa();
        pulsa.info();

        HargaToken token = new HargaToken();
        token.info();
    }
}
