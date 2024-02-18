module LNPG_01_TIPOS_E_VARIAVEIS.WeightedAverage where
weightedAverage :: [[Float]] -> Float
weightedAverage marks = sum [product x | x <- marks] / sum [x!!1 | x <- marks]
-- sum [x!!1 | x <- group] -- sum of weights
-- sum [product x | x <- marks] -- sum of mark * weight
main :: IO ()
main = do
    let marks = [[10, 1], [9, 1]]
    print (weightedAverage marks)