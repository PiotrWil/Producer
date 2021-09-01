import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "my"
    request {
        url "/fraud"
        method GET()
    }
    response{
        status 201
        body(["aaa", "bbb"])
    }
}