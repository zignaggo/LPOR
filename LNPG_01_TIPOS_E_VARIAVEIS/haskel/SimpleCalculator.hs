module LNPG_01_TIPOS_E_VARIAVEIS.SimpleCalculator where
import GHC.Float (divideFloat)
basicOperations :: Float -> Float -> [Float]
basicOperations x y = [x+y, x-y, x*y, x`divideFloat`y]
main :: IO ()
main = do
    let x = 4
    let y = 2
    let result = basicOperations x y
    putStrLn (show x ++ "+" ++ show y ++ "=" ++ show (head result))
    putStrLn (show x ++ "-" ++ show y ++ "=" ++ show (result !! 1))
    putStrLn (show x ++ "*" ++ show y ++ "=" ++ show (result !! 2))
    putStrLn (show x ++ "/" ++ show y ++ "=" ++ show (result !! 3))