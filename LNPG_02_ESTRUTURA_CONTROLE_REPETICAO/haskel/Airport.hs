module LNPG_02_ESTRUTURA_CONTROLE_REPETICAO.Airport where
checkList :: Int -> String
-- checkList (numberPassenger | numberPassenger == 0) rg = "Sem passageiros"
checkList numberPassenger = checkList (numberPassenger - 1) 
main :: IO ()
main = do
    let x = 0
    let result = checkList x
    print result