#open cmd prompt and check what types of machines are available in your machine
the command is:  wsl --list --online
> pwd to check in which directory i am in
> ls to see what directories are available
> clear to remove all from home screen (temporary zone only none will be deleted).
> ls to see all directories that are available
> cd change directory u can go into a directory where u want.
> cd .. | cd - to go back 
> ls -a to see all hidden files
> ls -l to see all permission given files
> mkdir to create directories, folders
> touch a.txt to create files
> cat a.txt it shows what text is present in a.txt file.
> cat > a.txt it creates a new file 
> history to see what commands have been executed in past.
> rm to remove files
> cp to copy files
> rm to remove files
> rmdir to remove directories
> mkdir -p newfolder/folder/testing/selinium to create subdirectories in a directory
> rm -r newfolder it deletes subdirectories along with parent directory
> rm -rv newfolder it is also as same as above command
> find ~ -name a.txt it gives us the location of where a.txt lies
> find ~ -type d -name newfolder it gives us the location of where a directory lies
> man it describes all commands
> man find
> whatis ls list all contents
> whatis what if it is not found it shows nothing appropriate

> there are three standard streams in Linux 
 . stdin (standard input)   0
 . stdout (standard output) 1
 . stderr (standard error)  2

> echo $HOME
> env to show environment variables
> head names.txt it shows us 10 lines of code in a file
> head -n 15 names.txt gonna return 15 lines of code in a file
> tail names.txt gonna return 10 ines of code from the last in a file
> tail -n 5 name.txt gonna return last 5 lines of code in a file
> sort names.txt it gives output in ascending order.
> sort -r names.txt it shows in descending order.
> cat names.txt | tr a-z A-Z
> uniq names.txt it wont shows repeated values it gives       unique values.
> uniq -c names.txt it shows how many time a value occurs in a file as a number
> uniq -u names.txt it shows only unique values it means it wont show repeated values
> uniq -d names.txt it shows only duplicate values
> wc names.txt it rerurns how many number of lines of code are there 
> wc -l names.txt it gives number of lines 
> wc -c names.txt it gives size of file
