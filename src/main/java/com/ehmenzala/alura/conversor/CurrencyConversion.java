package com.ehmenzala.alura.conversor;

public enum CurrencyConversion {
    
    SOL_DOLAR (0.26, "Dólares", "De Soles a Dólares"),
    SOL_EURO (0.25, "Euros", "De Soles a Euros"),
    SOL_LIBRA_ESTERLINA (0.22, "Libras esterlinas", "De Soles a Libras esterlinas"),
    SOL_YEN (34.31, "Yenes", "De Soles a Yenes"),
    SOL_WONG_COREANO (335.3, "Wongs coreanos", "De Soles a Wongs coreanos"),
    DOLAR_SOL (3.81, "Soles", "De Dólares a Soles"),
    EURO_SOL (4.03, "Soles", "De Euros a Soles"),
    LIBRA_ESTERLINA_SOL (4.57, "Soles", "De Libras esterlinas a Soles"),
    YEN_SOL (0.029, "Soles", "De Yenes a Soles"),
    WONG_COREANO_SOL (0.0030, "Soles", "De Wongs coreanos a Soles");
    
    private double convertFactor;
    private String toConvert;
    private String statement;
    
    private CurrencyConversion(double convertFactor, String toConvert,
            String statement) {
        this.convertFactor = convertFactor;
        this.toConvert = toConvert;
        this.statement = statement;
    }

    public double getConvertFactor() {
        return convertFactor;
    }

    public String getToConvert() {
        return toConvert;
    }

    public String getStatement() {
        return statement;
    }
}
