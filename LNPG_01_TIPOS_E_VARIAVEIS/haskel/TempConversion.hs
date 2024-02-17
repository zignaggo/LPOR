module LNPG_01_TIPOS_E_VARIAVEIS.TempConversion where
celsiusToFahrenheit :: Float -> Float
celsiusToFahrenheit celsius = (celsius * 1.8) + 32;
main :: IO ()
main = do
    let celsius = 32
    let fahrenheit = celsiusToFahrenheit celsius
    putStrLn ("Celsius: " ++ show celsius ++ " => Fahrenheit: " ++ show fahrenheit)