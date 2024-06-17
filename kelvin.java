class kelvin{
    public double[] convertTemperature(double celsius) {
        // Create an array to hold the converted temperatures
        double[] convertedTemperatures = new double[2];
      
        // Convert Celsius to Kelvin and store the result in the first element of the array
        // The formula to convert Celsius to Kelvin is celsius + 273.15
        convertedTemperatures[0] = celsius + 273.15;
      
        // Convert Celsius to Fahrenheit and store the result in the second element of the array
 
       // The formula to convert Celsius to Fahrenheit is celsius * 1.8 + 32
        convertedTemperatures[1] = celsius * 1.8 + 32;
      
        // Return the array containing both converted temperatures
        return convertedTemperatures;
    }
}