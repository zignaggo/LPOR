module LNPG_08_TAD.Department where

type Name = String
type ID = Int
type Location = String
type Role = String
type Salary = Int

type Employee = (Name, ID, Role, Salary)
type Employees = [Employee]
type Department = (Name, ID, Location, Employees)

newEmployee :: Name -> ID -> Role -> Salary -> Employee
newEmployee name id role salary = (name, id, role, salary)

newDepartment :: Name -> ID -> Location -> Employees -> Department
newDepartment name id location employees = (name, id, location, employees)

addEmployee :: Department -> Employee -> Department
addEmployee (name, id, location, employees) employee =
    (name, id, location, employee : employees)

getDepartamentInfo :: Department -> String
getDepartamentInfo (name, id, location, employees) =
    "Department Name: " ++ name ++ "\nID: " ++ show id ++
    "\nLocation: " ++ location ++
    "\nEmployees:\n" ++ unlines (map formatEmployee employees)
    where
        formatEmployee (empName, empId, empRole, empSalary) =
            "  Employee Name: " ++ empName ++
            "\n    ID: " ++ show empId ++
            "\n    Role: " ++ empRole ++
            "\n    Salary: " ++ show empSalary

main :: IO ()
main = do
    let department = newDepartment "CDP" 1 "Casa do caralho" []
    let employee = newEmployee "John Doe" 123 "Developer" 50000
    let updatedDepartment = addEmployee department employee
    putStrLn $ getDepartamentInfo updatedDepartment
