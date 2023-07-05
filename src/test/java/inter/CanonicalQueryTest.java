package inter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CanonicalQueryTest {

    @Test
    void test1() {
        assertEquals("select id, name from users where family = ? and (group_id = ? or manager_id in (...));"
                , CanonicalQuery.canonize("""
                        SELECT
                            id, name
                        FROM users
                        WHERE
                            family = "Petrov" and
                            (
                                group_id = "1" or manager_id in ( "1", "3", "8", "92" )
                            );
                        """));
    }

    @Test
    void test2() {
        assertEquals("select id from tasks where query_part in (...) and task_owner = ?;"
                , CanonicalQuery.canonize("""
                        select id from tasks
                        where query_part
                        in ( ";" , " in ( ?, ? )",
                        "in" )
                        and task_owner = "Vasily";
                        """));
    }

    @Test
    void test3() {
        assertEquals("select t.id from topics t inner join readers r on r.t_id = t.id where (ifnull(t.ref, ?) = ? or t.name = ? or t.name like ?);"
                , CanonicalQuery.canonize("""
                        select t.id
                        from topics t
                        inner join readers r
                        on r.t_id = t.id
                        where (
                        ifnull(t.ref, "n") = "a"
                        or t.name = "messages"
                        or t.name like "%'"
                        );
                                        """));
    }
    @Test
    void test4() {
        assertEquals(""
                , CanonicalQuery.canonize("""
                        SELECT
                        DATE_FORMAT(co.order_date, \"%Y-%m') AS order_month,
                        DATE_FORMAT(co.order_date, '%Y-%m-%d') AS order_day,
                        FROM cust_order co
                        INNER JOIN order_line ol ON co.order_id = ol.order_id
                        GROUP BY
                          DATE_FORMAT(co.order_date, '%Y-%m'),
                          DATE_FORMAT(co.order_date, '%Y-%m-%d')
                        ORDER BY co.order_date ASC;
                                        """));
    }
}