module LNPG_01_TIPOS_E_VARIAVEIS.WeightedAverage where
-- Notations
-- (head: tail)
-- v1 working
-- sumWeights :: [[Float]] -> Float
-- sumWeights weights = sum [x!!1 | x <- weights]
-- multiplyMarks :: [[Float]] -> [Float]
-- multiplyMarks marks = [product x | x <- marks]
-- main :: IO ()
-- main = do
--     let marks = [[10, 2], [9, 2]]
--     let weights = sumWeights marks
--     let marksMultiplayed = multiplyMarks marks
--     let result = sum marksMultiplayed  / weights
--     print result
weightedAverage :: [[Float]] -> Float
weightedAverage marks = sum [product x | x <- marks] / sum [x!!1 | x <- marks]
-- sum [x!!1 | x <- group] -- sum of weights
-- sum [product x | x <- marks] -- product between mark and weight and sum of result
main :: IO ()
main = do
    let marks = [[10, 1], [9, 1]]
    let average = weightedAverage marks
    print average