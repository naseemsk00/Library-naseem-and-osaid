/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LibraryRegistrationSystem;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author naseem
 */
public class CheckBookLoans extends javax.swing.JFrame {
ArrayList<Student> students = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Loan> allLoans = new ArrayList<>();
    ArrayList<String> loanDetailsList = new ArrayList<>();
    ArrayList<LoanRecord> loanRecords = new ArrayList<>();
    /**
     * Creates new form CheckBookLoans
     */
    public CheckBookLoans() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Check Book Loans");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         LoanBook tomet = new LoanBook();
        tomet.setVisible(true); 
         close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//    try {                                         
//        try {
//            /*   try {
//            // Step 1: Load all students and books
//            students = loadStudentsFromFile();
//            books = loadBooksFromFile();
//            
//            // Assuming you have a way to link students and books to their loans
//            allLoans = createLoansList(students, books); // Implement this method based on your application's logic
//            
//            // Step 2: Format loan details into strings
//            
//            for (Loan loan : allLoans) {
//            String loanDetails = formatLoanDetails(loan); // Implement this method
//            loanDetailsList.add(loanDetails);
//            }
//            
//            // Step 3: Update the JList with formatted strings
//            jList1.setListData(loanDetailsList.toArray(new String[0]));
//            
//            } catch (Exception e) {
//            // Handle exceptions and provide feedback
//            e.printStackTrace(); // Log the exception or inform the user as appropriate
//            }
//            }
//            
//            // Utility methods for loading data from files
//            
//            
//            
//            
//            // Placeholder for method to associate books and students with their loans
//            private List<Loan> createLoansList(List<Student> students, List<Book> books) {
//            // Implement according to your system's logic for associating loans with books and students
//            return new ArrayList<>();
//            */
//            
//            books = loadBooksFromFile();
//            students = loadStudentsFromFile();
//        } catch (IOException | ClassNotFoundException ex) {
//            Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        String loanedBook = ""; // This will hold the entire contents of loanbook.txt
//        
//        try (BufferedReader reader = new BufferedReader(new FileReader("loanbook.txt"))) {
//            StringBuilder stringBuilder = new StringBuilder();
//            String line = reader.readLine();
//            
//            while (line != null) {
//                stringBuilder.append(line).append(System.lineSeparator()); // Append each line and a newline
//                line = reader.readLine(); // Read the next line
//            }
//            
//            loanedBook = stringBuilder.toString(); // Convert StringBuilder to String
//        } catch (IOException e) {
//            e.printStackTrace(); // Handle exceptions here
//        }
//        
//        
//        ArrayList<Loan> allLoans = processLoans(books, students);
//        
//        saveBooksToFile(books);
//        saveStudentsToFile(students);
//        
//        // Save the combined loans list to "loanlist.txt"
//        saveLoanListToFile(allLoans);
//
//        displayLoanDetails(allLoans);
//        // Read "loanlist.txt" and print its contents (or display in GUI as needed)
//          // Implement this method to read and print "loanlist.txt"
//        
//        
//        
//        
//        
//    } catch (IOException ex) {
//        Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
//    }
//
//     FileInputStream fis = null;
//    
//    
//         try {
//             fis = new FileInputStream("students.txt"); // Ensure the file name is correct and the file exists
//         } catch (FileNotFoundException ex) {
//             Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
//         }
//        ObjectInputStream ois = null;
//         try {
//             ois = new ObjectInputStream(fis);
//         } catch (IOException ex) {
//             Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
//         }
//         try {
//             students = (ArrayList<Student>) ois.readObject();
//         } catch (IOException ex) {
//             Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
//         } catch (ClassNotFoundException ex) {
//             Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
//         }
//      finally {
//                  if(fis != null) {
//                      try {
//                          fis.close();
//                      } catch (IOException ex) {
//                          System.out.println(ex.getMessage());
//                      }
//                  }
//              }
//        
       // jTextArea1.setText(students);
//        
//                for (Student book : students) {
//                    
//                        jTextArea1.setText(book.getInfo() + "\n");
//                        
//                    }
//                  
//    FileInputStream frs = null;
//    try {
//        frs = new FileInputStream("books.dat"); // Ensure the file name is correct and the file exists
//        ObjectInputStream oer = new ObjectInputStream(fis);
//         books = (ArrayList<Book>) oer.readObject();

        
       // jTextArea1.setText(students);
//        
//                for (Book booke : books) {
//                    
//                        jTextArea1.setText(booke.getInfo() + "\n");
//                        
//                    }
//finally {
//                  if(frs != null) {
//                      try {
//                          frs.close();
//                      } catch (IOException ex) {
//                          System.out.println(ex.getMessage());
//                      }
//                  }
//              }
                
        
        // After successful loading, search for the student by name
//        String name = jTextField1.getText(); // Assuming jTextField1 is where the user enters the student's name
//        boolean found = false; // Flag to check if any student is found
//
//        for (Student student : students) {
//            if (student.getName().equalsIgnoreCase(name)) {
//                System.out.println(student.getInfo() + "\n");
//                found = true; // Set found to true as we found at least one student with the name
//            }
//        }
//
//        if (!found) {
//            System.out.println("No student found with the name: " + name);
//        }

//    } catch (FileNotFoundException ex) {
//        System.out.println("File not found: " + ex.getMessage());
//    } catch (ClassNotFoundException | IOException ex) {
//        System.out.println("Error reading file: " + ex.getMessage());
//    } finally {
//        try {
//            if (fis != null) {
//                fis.close();
//            }
//        } catch (IOException ex) {
//            System.out.println("Error closing file: " + ex.getMessage());
//        }
//    }

updateLoanDetailsDisplay();





    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        
    }
 
 private ArrayList<Book> loadBooksFromFile() throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.dat"))) {
        return (ArrayList<Book>) in.readObject();
    }
}
 
 private ArrayList<Student> loadStudentsFromFile() throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.txt"))) {
        return (ArrayList<Student>) in.readObject();
    }
}
 
 
 
public ArrayList<Loan> processLoans(ArrayList<Book> books, ArrayList<Student> students) {
    ArrayList<Loan> loans = new ArrayList<>();

    // Your logic for loanDate and dueDate
    LocalDate loanDate = LocalDate.now();
    LocalDate dueDate = loanDate.plusDays(5); // for example, due 5 days from loan date

    for (Book book : books) {
        if (book.isAvailable()) {
            for (Student student : students) {
                if (student.canLoan()) {
                    // Assuming Loan constructor takes (Student, Book, loanDate, dueDate)
                    Loan newLoan = new Loan(student, book, loanDate, dueDate);

                    // Update the book and student status
                    book.loanOut(); // Assuming this method marks the book as loaned
                    student.loanBook(book); // Assuming this updates the student's record

                    loans.add(newLoan); // Add the new loan to the list

                    // Depending on rules, you might break here if one book per student is allowed at a time
                    break; // Remove this line if students can loan multiple books at once
                }
            }
        }
    }

    return loans; // Return the list of all loans created
}
 public void saveBooksToFile(ArrayList<Book> books) throws IOException {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
        oos.writeObject(books);
    } // The try-with-resources statement ensures that the ObjectOutputStream is closed after the operation is completed.
}
 public void saveStudentsToFile(ArrayList<Student> students) throws IOException {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
        oos.writeObject(students);
    } // The try-with-resources statement ensures that the ObjectOutputStream is closed after the operation is completed.
}
 public void saveLoanListToFile(ArrayList<Loan> loans) {
    String fileName = "loanlist.txt";  // The file you want to write to

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        for (Loan loan : loans) {
            // Assuming Loan has a suitable toString method
            writer.write(loan.toString());
            writer.newLine();  // Ensure each loan is on a new line
        }
    } catch (IOException e) {
        e.printStackTrace();
        // Handle exceptions appropriately - maybe log or notify the user
    }
}
 public void displayLoanDetails(ArrayList<Loan> loans) {
    StringBuilder loanText = new StringBuilder();
    for (Loan loan : loans) {
        loanText.append(formatLoanDetails(loan)).append("\n");
    }
    jTextArea1.setText(loanText.toString()); // Assuming jTextArea1 is a JTextArea component
}
 private String formatLoanDetails(Loan loan) {
    // Retrieve details from the loan object
    String bookTitle = loan.getBook().getTitle();
    String studentName = loan.getStudent().getName();
    String loanDate = loan.getLoanDate().toString(); // Assuming getLoanDate returns a LocalDate
    String dueDate = loan.getDueDate().toString();
    String status = loan.isOverdue() ? "Late" : "On Time";

    // Format the details into a readable string
    return String.format("Book: %s, Student: %s, Loan Date: %s, Due Date: %s, Status: %s",
            bookTitle, studentName, loanDate, dueDate, status);
}
  private void readAndDisplayStudents() {
        try (FileInputStream fis = new FileInputStream("students.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            students = (ArrayList<Student>) ois.readObject();
            StringBuilder allStudentInfo = new StringBuilder();
            for (Student student : students) {
                allStudentInfo.append(student.getInfo()).append("\n");
            }
            jTextArea2.setText(allStudentInfo.toString());

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
            // Handle exception or display message to the user
        }
    }
   private void readAndDisplayBooks() {
        try (FileInputStream frs = new FileInputStream("books.dat");
             ObjectInputStream oer = new ObjectInputStream(frs)) {

            books = (ArrayList<Book>) oer.readObject();
            StringBuilder allBookInfo = new StringBuilder();
            for (Book book : books) {
                allBookInfo.append(book.getInfo()).append("\n");
            }
            // Assuming you want to append books data to students data
            jTextArea2.append(allBookInfo.toString());

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
            // Handle exception or display message to the user
        }
    }
   private void updateLoanDetailsDisplay() {
        readAndDisplayStudents();  // First, display students
        readAndDisplayBooks(); 
        readAndDisplayLoanBooks();
       // Then, append books
    }
   private void readAndDisplayLoanBooks() {
    // File path for the loanbook.txt
    String filePath = "loanbook.txt";
    
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        // StringBuilder to accumulate the lines of the file
        StringBuilder allLoanInfo = new StringBuilder();

        // Read each line of the file until the end
        String line = reader.readLine();
        while (line != null) {
            allLoanInfo.append(line).append("\n"); // Append the line and a newline character
            line = reader.readLine(); // Read the next line
        }

        // Set the text of your JTextArea to the contents of the StringBuilder
        jTextArea1.setText(allLoanInfo.toString());

    } catch (IOException ex) {
        // Log the exception and possibly notify the user
        Logger.getLogger(CheckBookLoans.class.getName()).log(Level.SEVERE, null, ex);
    }
}
 /*
 private ArrayList<Student> loadStudentsFromFile() throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.txt"))) {
        return (ArrayList<Student>) in.readObject();
    }
}
 private ArrayList<Book> loadBooksFromFile() throws IOException, ClassNotFoundException {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.dat"))) {
        return (ArrayList<Book>) in.readObject();
    }
}
 private ArrayList<Loan> createLoansList(ArrayList<Student> students, ArrayList<Book> books) {
    ArrayList<Loan> loans = new ArrayList<>();
    loanRecords = getLoanRecords(); // Ensure this method works as expected
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy"); // Your pattern here

    for (LoanRecord record : loanRecords) {
        Student student = findStudentById(students, Integer.parseInt(record.getStudentId()));
        Book book = findBookByTitle(books, record.getBookTitle());

        if (student != null && book != null) {
            // Use formatter to parse the dates
            LocalDate loanDate = LocalDate.parse(record.getLoanDate(), formatter);
            LocalDate dueDate = LocalDate.parse(record.getDueDate(), formatter);

            // Assuming you have a matching constructor in Loan
            Loan loan = new Loan(student, book, loanDate, dueDate);
            loans.add(loan);
        }
        
    }
    return loans;
}
 private ArrayList<LoanRecord> getLoanRecords() {     
    String filePath = "LoanRecord.txt"; // path to your LoanRecord.txt file

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            // Splitting the line into parts assuming they are separated by commas
            String[] parts = currentLine.split(",");

            // Ensure that the line has the correct number of parts
            if (parts.length == 4) {
                // Create a new LoanRecord object and add it to the list
                // Adjust this according to the actual constructor of your LoanRecord class
                LoanRecord record = new LoanRecord(parts[0], parts[1], parts[2], parts[3]);
                loanRecords.add(record);
            }
        }
    } catch (IOException e) {
        e.printStackTrace(); // Handle exceptions
    }

    return loanRecords;
}
 public Student findStudentById(List<Student> students, int studentId) {
    for (Student student : students) {
        if (student.getId() == studentId) {
            return student;
        }
    }
    return null; // Return null if no student found with the given ID
}
 public Book findBookByTitle(List<Book> books, String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            return book; // Return the book if the title matches
        }
    }
    return null; // Return null if no matching book is found
}
 private String formatLoanDetails(Loan loan) {
    // Ensure all getters exist and return the expected format
    String lateStatus = loan.isOverdue() ? "Late" : "On Time";
    return String.format("Book: %s, Student: %s, Loan Date: %s, Due Date: %s, Status: %s",
            loan.getBook().getTitle(),
            loan.getStudent().getName(),
            loan.getLoanDate().toString(),
            loan.getDueDate().toString(),
            lateStatus);
}
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckBookLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBookLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBookLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBookLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBookLoans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
