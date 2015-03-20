# Prescribing DSL
A prototype implementation of a domain specific language for creating prescriptions for my Honours Thesis at UVic.

##Project Motitvation

Clinical Information Systems (CIS) are becoming increasingly prelvenet in our health care system. One of the advantages to CIS's is the ability for them to provide advanced decision support to health care professionals. However, clinical decision support systems rely on data that has been entered by a human; this data must be well structured and in format that the computer understands. Coversely, humans prefer to use natural language to describe clinical concepts (such as prescriptions). However, natural language processing for free text is currently a very difficult problem, and will likely not be solved for some time. The code in this repository is a prototype system for author semi-natural language prescriptions. 

##Dependencies

* GROOVE graph transformation engine, downloadable at: [http://groove.cs.utwente.nl/downloads/](http://groove.cs.utwente.nl/downloads/)
  * This is also in the file tree for the project under Resources/groove/
* ANTLR4 [http://www.antlr.org/](http://www.antlr.org/)

##Running the GROOVE Graph Transformation Editor

The GROOVE environment comes with several tools that can be of use: 

* **groove_xx.jar** contains the main executable code for the GROOVE tool but just provides a programmatic API, running this from the commandline will have no effect as it is not an executable jar.  
* **Simulator.jar** contains the the GUI for editing and simulating graph transformation systems.
* **Generator.jar** a commandline tool for running simulations, much faster than running through the Simulator tool, use this for large simulator runs. 
* **Imager.jar** a GUI for exporting images of GROOVE rules and graphs, useful for making pretty pictures for papers and theses. 

Run these tools by invoking them from the commadnline: 

`java -jar <NAME OF JAR> <OPTIONS>`

For example, to run the simulator use: 

`java -jar Simulator.jar`
