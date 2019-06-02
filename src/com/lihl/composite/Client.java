package com.lihl.composite;


/**
 * 
 * – 抽象构件(Component)角色: 定义了叶子和容器构件的共同点
– 叶子(Leaf)构件角色：无子节点
– 容器(Composite)构件角色： 有容器特征，可以包含子节点
 * 
 * – 组合模式为处理树形结构提供了完美的解决方案，描述了如何将容器和叶子进行递归组
合，使得用户在使用时可以一致性的对待容器和叶子。
– 当容器对象的指定方法被调用时，将遍历整个树形结构，寻找也包含这个方法的成员，
并调用执行。其中，使用了递归调用的机制对整个结构进行处理。
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		Folder folder = new Folder("文件夹");
		AbstractFile imageFile = new ImageFile("图片");
		AbstractFile textFile = new TextFile("文本");
		AbstractFile videoFile = new VideoFile("视频");
		
		folder.add(imageFile);
		folder.add(textFile);
		folder.add(videoFile);
		
		System.out.println(folder.getChile(0));
		folder.killVirus();
	}

}
