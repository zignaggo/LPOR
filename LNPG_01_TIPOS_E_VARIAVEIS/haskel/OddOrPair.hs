module LNPG_01_TIPOS_E_VARIAVEIS.OddOrPair where
oddOrPair :: Int -> [Char]
oddOrPair x = if even x then "Par" else "Impar"
main :: IO ()
main = do
    let number = 3
    putStrLn ( oddOrPair number )
