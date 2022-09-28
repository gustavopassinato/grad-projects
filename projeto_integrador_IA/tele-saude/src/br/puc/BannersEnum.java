package br.puc;


public enum BannersEnum {
    INICIO {
        @Override
        public String format(Object nome) {
            return String.format(
        """
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        +             #####    ######   ##   ##        ##  ##    ####    ##  ##   ####      ####  +  
        + ╲╲┏━━┓╲╲    ##  ##   ##       ### ###        ##  ##     ##     ### ##   ## ##    ##  ## +
        + ╲━╋━━╋━╲    ##  ##   ##       #######        ##  ##     ##     ######   ##  ##   ##  ## +
        + ╲╲┃◯◯┃╲╲    #####    ####     ## # ##        ##  ##     ##     ######   ##  ##   ##  ## + 
        + ╲┏╯┈◣┃╲╲    ##  ##   ##       ##   ##        ##  ##     ##     ## ###   ##  ##   ##  ## +
        + ╲╰━┳┳╯╲╲    ##  ##   ##       ##   ##          ###      ##     ##  ##   ## ##    ##  ## +
        + ▔▔▔┗┗▔▔▔    #####    ######   ##   ##          ##      ####    ##  ##   ####      ####  +  
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        +
        + Olá %s! Pressione Enter para continuar!
        +
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        """,(String) nome);

        }
    },
    PERGUNTA {
        @Override
        public String format(Object pergunta) {
            return String.format(
            """
            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            +
            ==>  %s
            +
            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++        
            """    
            , (String) pergunta);
            
        }
    },
    USUARIO {
        @Override
        public String format(Object userOut) {
            User user = (User) userOut;

            return String.format(
            """
            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            +
            ==>  Nome completo: %s %s
            +
            ==>  Data de nacimento: %s
            +
            ==>  Data ultima avaliação: %s
            +
            %s
            =====> Parecer com relação a COVID-19: %s
            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++        
            """    
            , 
            user.getNome(), 
            user.getSobrenome(), 
            user.getDataNascimento(),
            user.getDataAvaliacao(),
            user.getSintomasFormat(),
            user.getParecer()
            );
        }
    };


    public abstract String format(Object text);
}