
import javax.swing.*;
import static java.lang.System.*;   /*
 

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Razia
 */
    public class Task {
    private String dev_fname, dev_surname, name, description, status_desc, therefrom, fixed_remaining, in_upper, in_upper2;
    private int increments, status, duration, from=0;
    private final int desc_limit = 50; //unchangeable and is inflexible.

    public String Status_desc(){ return status_desc; }

    public String  Name(){ return name; }
    public void Name(String name){ this.name = name; }

    public String Dev_fname(){ return dev_fname; }
    public void Dev_fname(String dev_fname){ this.dev_fname = dev_surname; }

    public String Dev_surname(){ return dev_surname; }
    public void Dev_surname(String dev_surname){ this.dev_surname = dev_surname; }

    public String Description(){ return description; }
    public void Description(String description){ this.description = description; }

    public int Status(){ return status; }
    public void Status(int status){ this.status = status; }

    public int Duration(){ return duration; }
    public void Duration(int duration){ this.duration = duration; }

    public void Enroll_inputs(Task assoc[], int runs)
    {
        for (int val = 0; val < assoc.length; val++)
        {
            assoc[val] = new Task(); //embedded to database the inputs.

            //take task name.
            assoc[val].name = JOptionPane.showInputDialog("Test data for task"+(val + 1)+ "\nTask name: ");
            this.Name(assoc[val].name);

            //store description of project.
            assoc[val].description = JOptionPane.showInputDialog("Task description: ");
            this.Description(assoc[val].description);

            while (assoc[val].description.length() >  desc_limit)
            {
                assoc[val].description = JOptionPane.showInputDialog("enter a task description of less than 50 characters.\nTask description: ");
            }

            //if limit is not exceeded.
            // message should show.
            JOptionPane.showMessageDialog(null, "task captured.");

            //store developer details.
            assoc[val].dev_fname = JOptionPane.showInputDialog("developer fname: ");
            this.Dev_fname(assoc[val].dev_fname);

            assoc[val].dev_surname = JOptionPane.showInputDialog("developer surname: ");
            this.Dev_surname(assoc[val].dev_surname);

            //store duration of project.
            assoc[val].duration = Integer.parseInt(JOptionPane.showInputDialog("Task duration?"));
            this.Duration(assoc[val].duration);

            //store status of project.
            assoc[val].status = Integer.parseInt(JOptionPane.showInputDialog("task status: \n1 - To Do\n2 - Done\n3 - Doing"));
            this.Status(assoc[val].status);

            switch (assoc[val].status)
            {
                case 1:
                    status_desc = "to do";
                    break;
                case 2: status_desc = "done";
                    break;
                case 3: status_desc = "doing";
                    break;
                default: err.println("invalid selection");
            }

                //build report.
                //also converts these to uppercase
   in_upper = assoc[val].dev_fname.substring(0, 2);
  JOptionPane.showMessageDialog(null, new StringBuilder()
    .append("status: ").append(assoc[val].status_desc).append("\n\tdeveloper details: ").append(assoc[val].dev_fname).
    append(" ").append(assoc[val].dev_surname). append("\n\ttask number: ").append(val + 1).
    append("\n\ttasks to do: ").append(runs). append("\n\ttask name: ").append(assoc[val].name).
    append("\n\ttask description: ").append(assoc[val].description). append("\n\ttask identity: ").append(in_upper.toUpperCase()).append(":").append(from + 1).
    append(":").append(assoc[val].dev_fname.substring(assoc[val].dev_surname.length() - 3, assoc[val].dev_surname.length()).toUpperCase())
    .append("\n\ttask duration: ").append(assoc[val].duration).append("hrs").toString()); // assigned .toString() to same time
                // convert it to a string with no complications.
        }
    }
}   

