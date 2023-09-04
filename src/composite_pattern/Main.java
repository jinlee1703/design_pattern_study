package composite_pattern;

// 동작 테스트용 클래스, 디렉터리 계층을 생성
// root
// 	├── bin
// 	│    ├── vi
// 	│	 └── latex
// 	│
// 	├── tmp
// 	└── usr
// 	     ├── youngjin
//       │    ├── diary.html
//       │    └── Composite.java
// 	     ├── gildong
// 	     │    └── memo.tex
// 	     └── dojun
// 	          ├── game.doc
// 	          └── junk.mail
public class Main {
	public static void main(String[] args) {
		System.out.println("Making root entries...");

		// root 디렉터리 생성
		Directory rootDir = new Directory("root");
		Directory binDir = new Directory("bin");
		Directory tmpDir = new Directory("tmp");
		Directory usrDir = new Directory("usr");

		// 디렉터리 내에 디렉터리 추가
		rootDir.add(binDir);
		rootDir.add(tmpDir);
		rootDir.add(usrDir);
		binDir.add(new File("vi", 10000));
		binDir.add(new File("latex", 20000));
		rootDir.printList();
		System.out.println();

		// user 디렉터리 생성
		System.out.println("Making user entries...");
		Directory youngjin = new Directory("youngjin");
		Directory gildong = new Directory("gildong");
		Directory dojun = new Directory("dojun");
		usrDir.add(youngjin);
		usrDir.add(gildong);
		usrDir.add(dojun);

		// user 디렉터리 내에 디렉터리 및 파일 추가
		youngjin.add(new File("diary.html", 100));
		youngjin.add(new File("Composite.java", 200));
		gildong.add(new File("memo.tex", 300));
		dojun.add(new File("game.doc", 400));
		dojun.add(new File("junk.mail", 500));
		rootDir.printList();
	}
}
