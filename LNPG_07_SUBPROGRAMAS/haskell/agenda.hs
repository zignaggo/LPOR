import Data.List
type Evento = String
type Agenda = [Evento]

adicionarEvento :: Agenda -> IO ()
adicionarEvento agenda = do
    putStrLn "Digite o evento a ser adicionado:"
    evento <- getLine
    let novaAgenda = agenda ++ [evento]
    loop novaAgenda

removerEvento :: Agenda -> IO ()
removerEvento agenda = do
    putStrLn "Digite o índice do evento a ser removido:"
    indiceStr <- getLine
    let indice = read indiceStr
    if indice >= 0 && indice < length agenda
        then do
            let novaAgenda = delete (agenda !! indice) agenda
            loop novaAgenda
        else do
            putStrLn "Índice inválido. Tente novamente."
            loop agenda

visualizarAgenda :: Agenda -> IO ()
visualizarAgenda agenda = do
    putStrLn "Eventos na Agenda:"
    mapM_ putStrLn agenda
    loop agenda

loop :: Agenda -> IO ()
loop agenda = do
    putStrLn "\nSelecione uma opção:\n1. Adicionar evento\n2. Remover evento\n3. Visualizar agenda\n4. Sair"
    opcao <- getLine
    case opcao of
        "1" -> adicionarEvento agenda
        "2" -> removerEvento agenda
        "3" -> visualizarAgenda agenda
        "4" -> putStrLn "Saindo do programa..."
        _   -> do
            putStrLn "Opção inválida. Tente novamente."
            loop agenda

main :: IO ()
main = do
    putStrLn "Bem-vindo ao Gerenciador de Agenda!"
    loop []