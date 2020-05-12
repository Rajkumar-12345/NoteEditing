import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class NoteEditor extends Frame {
	
	PopupMenu popmenu;
	
	NoteEditor(String title){
		
		super(title);
		
		 addWindowListener(new WindowAdapter(){  
	            public void windowClosing(WindowEvent e) {  
	                dispose();  
	            }  
	        });
		
		//TextArea textArea;
		
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		

		//setLayout(new FlowLayout());
		
		Menu file = new Menu("File");
		
		MenuItem ne_w,open,save,save_as,page_setup,print,exit;
		
		file.add(ne_w = new MenuItem("New      Ctrl+N"));
		file.add(open= new MenuItem("Open     Ctrl+O"));
		file.add(save= new MenuItem("Save      Ctrl+S"));
		file.add(save_as= new MenuItem("Save As"));
		file.add(new MenuItem("-"));
		file.add(page_setup = new MenuItem("Page Setup....."));
		file.add(print = new MenuItem("Print     Ctrl+P"));
		file.add(new MenuItem("-"));
		file.add(new MenuItem("Exit"));
		
		Menu edit = new Menu("Edit");
		
		MenuItem undo,cut,copy,paste,delete,find,find_next,replace,go_to,select_all,time_date;
		
		edit.add(undo = new MenuItem("Undo           Ctrl+z"));
		edit.add(new MenuItem("-"));
		edit.add(cut = new MenuItem("Cut             Ctrl+X"));
		edit.add(copy = new MenuItem("Copy           Ctrl+C"));
		edit.add(paste = new MenuItem("Paste         Ctrl+V"));
		edit.add(delete = new MenuItem("Delete       Del"));
		edit.add(find = new MenuItem("Find......     Ctrl+F"));
		edit.add(find_next = new MenuItem("Find Next      F3"));
		edit.add(replace = new MenuItem("Replace.....Ctrl+H"));
		edit.add(go_to = new MenuItem("Go To         Ctrl+G"));
		edit.add(new MenuItem("-"));
		edit.add(select_all= new MenuItem("Select All Ctrl+A"));
		edit.add(time_date = new MenuItem("Time/Date     F5"));
		
		Menu format = new Menu("Format");
		
		MenuItem word_wrap,font;
		
		format.add(word_wrap = new MenuItem("World Wrap"));
		format.add(font = new MenuItem("Font....."));
		
		Menu view = new Menu("View");
	
		MenuItem status_bar;
		
		view.add(status_bar = new MenuItem("Status Bar"));
		
		Menu help = new Menu("Help");
		
		MenuItem view_help,about_notpad;
		
		help.add(view_help = new MenuItem("View Help"));
		help.add(new MenuItem("-"));
		help.add(about_notpad = new MenuItem("About Notpad"));
		
		//textField = new TextField(); 
		//textArea.setEditable(true);
		TextArea ta = new TextArea();
		ta.setEditable(true);
		
		mbar.add(file);
		mbar.add(edit);
		mbar.add(format);
		mbar.add(view);
		mbar.add(help);
		add(ta);
		
		
		
		
			
			MenuItem items;
			popmenu = new PopupMenu("Edit");
			
			items = new MenuItem("Undo");
			popmenu.add(items);
			popmenu.add(new MenuItem("-"));
			
			items = new MenuItem("Cut");
			popmenu.add(items);
			popmenu.addSeparator();
			
			items = new MenuItem("Copy");
			popmenu.add(items);
			
			items = new MenuItem("Paste");
			popmenu.add(items);
			
			items = new MenuItem("Delete");
			popmenu.add(items);
			popmenu.add(new MenuItem("-"));
			
			items = new MenuItem("Select All");
			popmenu.add(items);
			popmenu.add(new MenuItem("-"));
			
			items = new MenuItem("Right to left Reading order");
			popmenu.add(items);
			
			items = new MenuItem("Show Unicode control charecter");
			popmenu.add(items);
			
			items = new MenuItem("Insert Unicode control charecter");
			popmenu.add(items);
			popmenu.add(new MenuItem("-"));
			
			items = new MenuItem("Open IME");
			popmenu.add(items);
			
			items = new MenuItem("Reconversion");
			popmenu.add(items);
			
			add(popmenu);
			
			enableEvents(AWTEvent.MOUSE_EVENT_MASK);
			resize(200,200);
			
		}
	
public void processMouseEvent(MouseEvent me) {
		
		if(me.isPopupTrigger()) {
			
			popmenu.show(me.getComponent(),me.getX(),me.getY());
		}
		super.processMouseEvent(me);
	
	
	}
public static void main(String[] args) {
		
		NoteEditor me = new NoteEditor("Untitled1 - Notepad1");
		me.pack();
		me.setSize(300,300);
		me.setVisible(true);
		
	}

}
