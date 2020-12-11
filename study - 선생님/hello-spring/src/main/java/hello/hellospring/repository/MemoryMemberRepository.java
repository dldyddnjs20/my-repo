package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Repository
public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    // 현재는 test, 실무에서는 front 개발자는 ConcurrentHashMap을 주로 사용한다.  왜냐하면 동시에 많을 유저사용
    private static long squence =0L;  // long 아니라 AtomicLong

    @Override
    public Member save(Member member) {
        member.setId(++squence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name)).findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();  // 디버그용으로 여러 단위 테스트 할때 사용한다. 메모리 클리어 할때 사용한다.
    }
}
