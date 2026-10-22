# Transcript: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | retried |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 789 | `qa-84fe359f-ce55-40d5-8159-571332871ff9` |
| 2 | `POST /v1/auth/token` | 200 | 60 | `qa-45909c28-df31-4212-a94f-31b848066546` |
| 3 | `GET /v1/credits/balance` | 200 | 67 | `qa-4f570c91-2043-4bc0-8122-b9be639a8615` |
| 4 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-5e63fc9d-bf04-4a16-adb2-b0722350c5f3` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-96313189-7d17-4e5f-9d4c-e605c3fce62f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-84fe359f-ce55-40d5-8159-571332871ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84fe359f-ce55-40d5-8159-571332871ff9
Content-Type: application/json

--- request body ---
{"handle":"qa-16ca82ac2f55","displayName":"QA 16ca82ac2f55","password":"****","region":"in"}

--- response: 201 in 789 ms ---
Date: Thu, 22 Oct 2026 04:29:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-84fe359f-ce55-40d5-8159-571332871ff9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-16ca82ac2f55
X-Served-Region: in
Content-Length: 181

{"id":"acc_c36e6289-fe7f-4d29-8c88-5bdd1266c58c","handle":"qa-16ca82ac2f55","displayName":"QA 16ca82ac2f55","region":"in","role":"user","createdAt":"2026-10-22T04:29:10.735302100Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-45909c28-df31-4212-a94f-31b848066546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45909c28-df31-4212-a94f-31b848066546
Content-Type: application/json

--- request body ---
{"handle":"qa-16ca82ac2f55","password":"****"}

--- response: 200 in 60 ms ---
Date: Thu, 22 Oct 2026 04:29:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-45909c28-df31-4212-a94f-31b848066546
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c36e6289-fe7f-4d29-8c88-5bdd1266c58c"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-4f570c91-2043-4bc0-8122-b9be639a8615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f570c91-2043-4bc0-8122-b9be639a8615
Content-Type: application/json

--- response: 200 in 67 ms ---
Date: Thu, 22 Oct 2026 04:29:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f570c91-2043-4bc0-8122-b9be639a8615
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 98

{"availableBalance":5,"currency":"credits","accountId":"acc_c36e6289-fe7f-4d29-8c88-5bdd1266c58c"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e63fc9d-bf04-4a16-adb2-b0722350c5f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e63fc9d-bf04-4a16-adb2-b0722350c5f3
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 22 Oct 2026 04:29:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e63fc9d-bf04-4a16-adb2-b0722350c5f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-96313189-7d17-4e5f-9d4c-e605c3fce62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96313189-7d17-4e5f-9d4c-e605c3fce62f
Content-Type: application/json

--- request body ---
{"handle":"qa-16ca82ac2f55","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 22 Oct 2026 04:29:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96313189-7d17-4e5f-9d4c-e605c3fce62f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96313189-7d17-4e5f-9d4c-e605c3fce62f"}
```
