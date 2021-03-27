package ArrayList;
import java.util.Scanner;
	
public class Ex1 {
	public static void main(String[] args) {
		//Sochansole();
		//Loaiso();
		//Sosanh();
		//Sosanhten();
		//Kiemtragiatri();
		//Timsolonnhat();
		//Kiemtratrongkhoang();
		//Nhapdiemhople();
		//Kiemtratangorgiam();
		//Hienthiso();
		//Tongcacso();
		//Tongcacsole();
		//Sochiahetcho3();
		//Daysogiaithua();
		//Uocchung();
		//Haivonglap();
		//Hienthimang();
		//Hienthiphantulonnhattrongmang();
		//Tongcacphantudauvacuoi();
		//Hienthisochantrongmang();
		//Tongcacsolelonhonkhong();
		//Sapxeptrongmang();
		//Tongphantutrongmang();
		Phantutrongmangchiahetcho5();
	}
	public static void Sochansole() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] a = new int[10];
	    
		for (int i = 0; i < n; i++) {
			 a[i] = sc.nextInt();
          }
		
		System.out.println("Cac so vua nhap la: ");
		
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " La so chan ");
			}
			else {
				System.out.println(a[i] + " La so le ");
			}
		}
	}
	
	public static void Loaiso() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				System.out.println(a[i] + " Day la so nguyen duong");
			}
			else if (a[i] < 0) {
				System.out.println(a[i] + " Day la so nguyen am");
			}
			else if (a[i] == 0) {
				System.out.println(a[i] + " Day la so 0");
			}
		}
	}
	
	public static void Sosanh() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap hai so nguyen a va b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a + " lon hon " + b);
		}
		else if (a < b) {
			System.out.println(a + " nho hon " + b);
		}
		else if (a == b) {
			System.out.println(a + " bang " + b);
		}		
	}
	
	public static void Sosanhten() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap ten nguoi ban thu nhat: ");
		String name1 = sc.next();
		
		System.out.print("Nhap ten nguoi ban thu hai: ");
		String name2 = sc.next();
		
		if (name1.equals(name2)) {
			System.out.print("Hai thang tre trau nay ten giong nhau @ @");
		}
		else {
			System.out.print("Hai thang tre trau nay ten khac nhau @ @");
		}
	}
	
	public static void Kiemtragiatri() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hai gia tri ban muon: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a != 0 && b != 0) {
			System.out.print("Hai gia tri vua nhap khac 0");
		}
		else {
			System.out.print("Hai gia tri vua nhap bang 0");
		}
	}
	public static void Timsolonnhat() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
	
	public static void Kiemtratrongkhoang() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so ma ban muon: ");
		int a = sc.nextInt();
		
		if (a >= 10 && a <= 100) {
			System.out.print(a + " nam trong khoang [10,100] ");
		}
		else {
			System.out.print(a + " khong nam trong khoang [10,100] ");
		}
	}
	
	public static void Nhapdiemhople() {
		Scanner sc = new Scanner(System.in);
		System.out.print("So luong hoc sinh trong lop: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 1; i < n; i++) {
			System.out.print("Nhap diem cua hoc sinh thu " + i + ": ");
			a[i] = sc.nextInt();
		}
		
		for (int i = 1; i < n; i++) {
			if (a[i] <= 10 && a[i] >= 0) {
				System.out.println(a[i] + " Diem nhap hop le");
			}
			else {
				System.out.println(a[i] + " Diem nhap khong hop le");
			}
		}
	}
	
	public static void Kiemtratangorgiam() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		 if (a <= b && b <= c) {
		        System.out.println("increasing");
		    } else if (a >= b && b >= c) {
		    	System.out.println("decreasing");
		    } else {
		    	System.out.println("neither increasing nor decreasing order");
		    }
	}
	
	public static void Hienthiso() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen n: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(i + " ");
		}
		System.out.println("Ket thuc vong lap !");
	}
	
	public static void Tongcacso() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hai so nguyen a va b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.print("Tong cac so la: " + sum);
	}
	
	public static void Tongcacsole() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen n: ");
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.print("Tong cac so le la: " + sum);
	}
	
	public static void Sochiahetcho3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 2 so nguyen a va b: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Day so chia het cho 3: ");
		
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void Daysogiaithua() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so nguyen n: ");
		int n = sc.nextInt();
		
		int gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		System.out.print("Giai thua cua " + n + " la " + gt);
	}
	
	public static void Uocchung() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so nguyen n: ");
		int n = sc.nextInt();
		
		System.out.println("Day so uoc chung la: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}		
	}
	
	public static void Haivonglap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so nguyen n: ");
		int n = sc.nextInt();
		
		System.out.println("Hien thi so tu 0 -> 24: ");
		
		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(i * 5 + j + " ");
			}
			System.out.println();
			//i * 5 + j + " "
		}
	}
	
	public static void Hienthimang() {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Mang vua duoc nhap la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void Hienthiphantulonnhattrongmang() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so nguyen n mong muon: ");
		int n = sc.nextInt();
		//khai bao mang
		int[] a = new int[n];
		//nhap vao mang
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Danh sach mang vua nhap: ");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
		
		int max = a[0];
		for (int i = 0; i < n; i++) {
		if (a[i] > max) {
			max = a[i];
		  }
	   }
		System.out.print("Hien thi so lon nhat trong mang: " + max);
    }
	
	public static void Tongcacphantudauvacuoi() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so nguyen n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = a[0] + a[n-1];
		}
		System.out.print("Tong phan tu dau tien va cuoi: " + sum);
	}
	
	public static void Hienthisochantrongmang() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
        System.out.print("Hien thi so chan trong mang: "); 
		for (int i = 0; i < n; i++) {
		    if (a[i] % 2 == 0) {
		    	System.out.print(a[i] + " ");
		    }
		}
	}
	
	public static void Tongcacsolelonhonkhong() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if ( a[i] % 2 != 0 && a[i] > 0) {
				sum += a[i];
			}
		}
		System.out.print("Tong cac so le lon hon khong: " + sum); 
	}
	
	public static void Sapxeptrongmang() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	       
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void Tongphantutrongmang() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				answer += arr[i][j];
			}
		}

		System.out.print(answer);
	
	}
	
	public static void Phantutrongmangchiahetcho5() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] % 5 == 0) {
					answer += arr[i][j];
				}
			}
		}
		System.out.print(answer);
	}
}

