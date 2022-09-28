package br.puc;

public enum SintomaEnum {

    TOSSE {
        @Override
        public String sintomaFormatado() {
            // TODO Auto-generated method stub
            return "Tosse";
        }
    },
    CORIZA {
        @Override
        public String sintomaFormatado() {
            // TODO Auto-generated method stub
            return "Coriza";
        }
    },
    DOR_CORPO {
        @Override
        public String sintomaFormatado() {
            // TODO Auto-generated method stub
            return "Dores no corpo";
        }
    },
    DOR_CABECA {
        @Override
        public String sintomaFormatado() {
            // TODO Auto-generated method stub
            return "Dores de cabeça";
        }
    },
    FEBRE {
        @Override
        public String sintomaFormatado() {
            // TODO Auto-generated method stub
            return "Febre";
        }
    },
    PERDA_OLFATO {
        @Override
        public String sintomaFormatado() {
            // TODO Auto-generated method stub
            return "Perda de olfato";
        }
    },
    PERDA_PALADAR {
        @Override
        public String sintomaFormatado() {
            // TODO Auto-generated method stub
            return "Perda de paladar";
        }
    };

    public abstract String sintomaFormatado();

}
