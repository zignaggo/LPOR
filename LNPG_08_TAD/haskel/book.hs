type Title = String
type Author = String
type PublishedYear = Int
type AvailableCopies = Int

type Book = (Title, Author, PublishedYear, AvailableCopies)

newBook :: Title -> Author -> PublishedYear -> AvailableCopies -> Book
newBook title author publishedYear availableCopies = (title, author, publishedYear, availableCopies)

toLend :: Book -> Either String Book
toLend (title, author, year, copies) =
    if copies > 0
        then Right (title, author, year, copies - 1)
        else Left "Doesn't have available copies"

returnCopy :: Book -> Book
returnCopy (title, author, year, copies) = (title, author, year, copies + 1)

hasAvailable :: Book -> Bool
hasAvailable (_, _, _, copies) = copies > 0

getInfo :: Book -> String
getInfo (title, author, year, copies) = "Title: " ++ title ++ "\nAuthor: " ++ author ++ "\nPublished year: " ++ show year ++ "\nAvailable copies: " ++ show copies

main :: IO ()
main = do
    let book1 = newBook "A volta dos que nao foram" "Zig" 2000 10
    putStrLn $ getInfo book1