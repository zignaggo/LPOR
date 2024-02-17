module LNPG_01_TIPOS_E_VARIAVEIS.MaiorityAge where
canBePrisioner :: Int -> [Char]
canBePrisioner age = if age >= 18 then "Pode ser Preso" else "Não pode ser preso"
main :: IO ()
main = do
    let age = 17
    putStrLn ( canBePrisioner age )