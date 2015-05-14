package five.programming.problems;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

public class Problem3Test {

	@Test
	public void test0() {
		Problem3 p = new Problem3();
		BigInteger[] actual = p.getFibonacciList(10);
		BigInteger[] expected = {new BigInteger("0"), new BigInteger("1"), new BigInteger("1"), new BigInteger("2"), new BigInteger("3"), new BigInteger("5"), new BigInteger("8"), new BigInteger("13"), new BigInteger("21"),new BigInteger("34") };
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}

	/*@Test
	public void test1() {
		Problem3 p = new Problem3();
		BigInteger[] actual = p.getFibonacciList(100);
		BigInteger[] expected = { new BigInteger("0"), new BigInteger("1"), new BigInteger("1"), new BigInteger("2"), new BigInteger("3"), new BigInteger("5"), new BigInteger("8"), new BigInteger("13"), new BigInteger("21"),
				new BigInteger("34"), new BigInteger("55"), new BigInteger("89"), new BigInteger("144"), new BigInteger("233"), new BigInteger("377"), new BigInteger("610"), new BigInteger("987"), new BigInteger("1597"),
				new BigInteger("2584"), new BigInteger("4181"), new BigInteger("6765"), new BigInteger("10946"), new BigInteger("17711"), new BigInteger("28657"), new BigInteger("46368"), new BigInteger("75025"), new BigInteger("121393"),
				new BigInteger("196418"), new BigInteger("317811"), new BigInteger("514229"), new BigInteger("832040"), new BigInteger("1346269"), new BigInteger("2178309"), new BigInteger("3524578"), new BigInteger("5702887"),
				new BigInteger("9227465"), new BigInteger("14930352"), new BigInteger("24157817"), new BigInteger("39088169"), new BigInteger("63245986"), new BigInteger("102334155"), new BigInteger("165580141"),
				new BigInteger("267914296"), new BigInteger("433494437"), new BigInteger("701408733"), new BigInteger("1134903170"), new BigInteger("1836311903"), new BigInteger("2971215073"), new BigInteger("4807526976"),
				new BigInteger("7778742049"), new BigInteger("12586269025"), new BigInteger("20365011074"), new BigInteger("32951280099"), new BigInteger("53316291173"), new BigInteger("86267571272"), new BigInteger("139583862445"),
				new BigInteger("225851433717"), new BigInteger("365435296162"), new BigInteger("591286729879"), new BigInteger("956722026041"), new BigInteger("1548008755920"), new BigInteger("2504730781961"),
				new BigInteger("4052739537881"), new BigInteger("6557470319842"), new BigInteger("10610209857723"), new BigInteger("17167680177565"), new BigInteger("27777890035288"), new BigInteger("44945570212853"),
				new BigInteger("72723460248141"), new BigInteger("117669030460994"), new BigInteger("190392490709135"), new BigInteger("308061521170129"), new BigInteger("498454011879264"), new BigInteger("806515533049393"),
				new BigInteger("1304969544928657"), new BigInteger("2111485077978050"), new BigInteger("3416454622906707"), new BigInteger("5527939700884757"), new BigInteger("8944394323791464"), new BigInteger("14472334024676221"),
				new BigInteger("23416728348467685"), new BigInteger("37889062373143906"), new BigInteger("61305790721611591"), new BigInteger("99194853094755497"), new BigInteger("160500643816367088"), new BigInteger("259695496911122585"),
				new BigInteger("420196140727489673"), new BigInteger("679891637638612258"), new BigInteger("1100087778366101931"), new BigInteger("1779979416004714189"), new BigInteger("2880067194370816120"),
				new BigInteger("4660046610375530309"), new BigInteger("7540113804746346429"), new BigInteger("12200160415121876738"), new BigInteger("19740274219868223167"), new BigInteger("31940434634990099905"),
				new BigInteger("51680708854858323072"), new BigInteger("83621143489848422977"), new BigInteger("135301852344706746049"), new BigInteger("218922995834555169026") };
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}*/
}