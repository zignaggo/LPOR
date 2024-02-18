module LNPG_01_TIPOS_E_VARIAVEIS.WeightedAverage where
weightedAverage :: [[Float]] -> Float
weightedAverage marks = sum [product x | x <- marks] / sum [x!!1 | x <- marks]
-- [[mark, weight]] = [[10,2]]
-- sum [x!!1 | x <- group] -- sum of weights
-- sum [product x | x <- marks] -- sum of mark * weight
main :: IO ()
main = do
    let marks = [[10, 1], [9, 1], [8, 2]]
    print (weightedAverage marks)