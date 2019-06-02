package com.lihl.composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {

	void killVirus();

}

class ImageFile implements AbstractFile {
	private String name;

	public ImageFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("ImageFile.killVirus():" + name);
	}

}

class VideoFile implements AbstractFile {
	private String name;

	public VideoFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("VideoFile.killVirus():" + name);
	}

}

class TextFile implements AbstractFile {
	private String name;

	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("TextFile.killVirus():" + name);
	}
}

class Folder implements AbstractFile {
	private String name;
	List<AbstractFile> files = new ArrayList<AbstractFile>();

	public Folder(String name) {
		this.name = name;
	}

	public void add(AbstractFile file) {
		files.add(file);
	}

	public void remove(AbstractFile file) {
		files.remove(file);
	}

	public AbstractFile getChile(int index) {
		return files.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("Folder.killVirus():"+name);
		for (AbstractFile file : files) {
			file.killVirus();
		}
	}

}
