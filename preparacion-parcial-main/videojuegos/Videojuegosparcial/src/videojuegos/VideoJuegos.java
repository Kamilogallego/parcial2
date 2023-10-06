package videojuegos;

public enum VideoJuegos {
    DEPORTIVOS("NBA2K","control","2022"){
        @Override
        public String mostrarPosicionRanking() {
            return "bueno";
        }

        @Override
        public String comprarMonedas() {
            return "bueno";
        }
    },
    ESTRATEGIA("Civilization","tecladoyraton","2018"){
        @Override
        public String mostrarPosicionRanking() {
            return "bueno";
        }

        @Override
        public String comprarMonedas() {
            return "bueno";
        }
    },
    MUSICALES("justdance","controles","2019"){
        @Override
        public String mostrarPosicionRanking() {
            return "bueno";
        }

        @Override
        public String comprarMonedas() {
            return "bueno";
        }
    },
    AVENTURA("spider-man","control","2023"){
        @Override
        public String mostrarPosicionRanking() {
            return "exelente";
        }

        @Override
        public String comprarMonedas() {
            return "exelente";
        }
    },
    SIMULACION("persona5","controles","2019"){
        @Override
        public String mostrarPosicionRanking() {
            return "bueno";
        }

        @Override
        public String comprarMonedas() {
            return "bueno";
        }
    };

    private String nombrejuego;
    private String comojugar;
    private String añodecreacion;

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public String getComojugar() {
        return comojugar;
    }

    public void setComojugar(String comojugar) {
        this.comojugar = comojugar;
    }

    public String getAñodecreacion() {
        return añodecreacion;
    }

    public void setAñodecreacion(String añodecreacion) {
        this.añodecreacion = añodecreacion;
    }

    VideoJuegos(String nombrejuego, String comojugar, String añodecreacion) {
        this.nombrejuego = nombrejuego;
        this.comojugar = comojugar;
        this.añodecreacion = añodecreacion;

    }
    public abstract String mostrarPosicionRanking();
    public abstract String comprarMonedas();
}


