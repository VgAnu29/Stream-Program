package StreamPrograms.StreeamGrouping;


    class Employee
    {
        private int empId;
        private String empName;
        private int deptNo;

        Employee(int empId,String empName,int deptNo)
        {
            this.empName=empName;
            this.empId=empId;
            this.deptNo=deptNo;
        }

        public int getDeptNo() {
            return deptNo;
        }

        public String getEmpName() {
            return empName;
        }

        public int getEmpId() {
            return empId;
        }

        @Override
        public String toString() {
            return "Employee{id=" + empId +
                    ", name='" + empName + '\'' +
                    ", deptNo=" + deptNo + '}';
        }
    }

