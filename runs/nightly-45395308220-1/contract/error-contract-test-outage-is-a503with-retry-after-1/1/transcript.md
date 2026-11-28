# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-d1dcdb76-7170-4674-b9f3-a120124123be` |
| 2 | `POST /v1/accounts` | 201 | 64 | `qa-698bddd3-4b54-48cb-98b1-11a4f9262f5f` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-98b04ede-a7b0-4443-9437-9885d696ce16` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-8703a335-4d19-43ea-bd87-b4ffbc9d481b` |
| 5 | `POST /v1/accounts` | 503 | 13 | `qa-bdb84523-9d9f-46b8-9919-5fe1357a700b` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-d20c6696-2e93-4032-96d5-bf93da42b905` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-8fb65a9e-4aaa-4c97-8835-d5bc93c11565` |
| 8 | `POST /v1/auth/token` | 401 | 38 | `qa-c21de175-18e2-4bee-9ed1-564d5789de6e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-27d184db-3261-4be4-b437-e7a0cd3ba458` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-7fe25736-0a68-413a-9438-d088c1534915` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d1dcdb76-7170-4674-b9f3-a120124123be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1dcdb76-7170-4674-b9f3-a120124123be
Content-Type: application/json

--- request body ---
{"handle":"qa-e3e955033d6e","displayName":"QA e3e955033d6e","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1dcdb76-7170-4674-b9f3-a120124123be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-e3e955033d6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_934380f9-10c1-4abe-a63e-7ef6d7e8a562","handle":"qa-e3e955033d6e","displayName":"QA e3e955033d6e","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.135857919Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-698bddd3-4b54-48cb-98b1-11a4f9262f5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-698bddd3-4b54-48cb-98b1-11a4f9262f5f
Content-Type: application/json

--- request body ---
{"handle":"qa-4df53f5cc0cb","displayName":"QA 4df53f5cc0cb","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-698bddd3-4b54-48cb-98b1-11a4f9262f5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-4df53f5cc0cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cec0213-fbe1-428c-8365-bc71cfc1a8bc","handle":"qa-4df53f5cc0cb","displayName":"QA 4df53f5cc0cb","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.221249259Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-98b04ede-a7b0-4443-9437-9885d696ce16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98b04ede-a7b0-4443-9437-9885d696ce16
Content-Type: application/json

--- request body ---
{"handle":"qa-e3e955033d6e","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-98b04ede-a7b0-4443-9437-9885d696ce16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_934380f9-10c1-4abe-a63e-7ef6d7e8a562"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8703a335-4d19-43ea-bd87-b4ffbc9d481b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8703a335-4d19-43ea-bd87-b4ffbc9d481b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4df53f5cc0cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8703a335-4d19-43ea-bd87-b4ffbc9d481b
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
X-Served-Region: eu
Location: /v1/conversations/cnv_52dcfa8f-db3b-4abe-addd-a9e35a669866
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_52dcfa8f-db3b-4abe-addd-a9e35a669866","subject":"Error contract","status":"open","region":"eu","participants":["qa-e3e955033d6e","qa-4df53f5cc0cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.304675411Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-bdb84523-9d9f-46b8-9919-5fe1357a700b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0e2fdcdd-2f4b-4bbc-9b4e-e4f74c631311
X-Correlation-Id: qa-bdb84523-9d9f-46b8-9919-5fe1357a700b
Content-Type: application/json

--- request body ---
{"handle":"qa-7626a6dbe82c","displayName":"QA 7626a6dbe82c","password":"****","region":"eu"}

--- response: 503 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bdb84523-9d9f-46b8-9919-5fe1357a700b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-bdb84523-9d9f-46b8-9919-5fe1357a700b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d20c6696-2e93-4032-96d5-bf93da42b905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d20c6696-2e93-4032-96d5-bf93da42b905
Content-Type: application/json

--- request body ---
{"handle":"qa-4df53f5cc0cb","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d20c6696-2e93-4032-96d5-bf93da42b905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cec0213-fbe1-428c-8365-bc71cfc1a8bc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8fb65a9e-4aaa-4c97-8835-d5bc93c11565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb65a9e-4aaa-4c97-8835-d5bc93c11565
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8fb65a9e-4aaa-4c97-8835-d5bc93c11565
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
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-c21de175-18e2-4bee-9ed1-564d5789de6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c21de175-18e2-4bee-9ed1-564d5789de6e
Content-Type: application/json

--- request body ---
{"handle":"qa-4df53f5cc0cb","password":"****"}

--- response: 401 in 38 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c21de175-18e2-4bee-9ed1-564d5789de6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c21de175-18e2-4bee-9ed1-564d5789de6e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27d184db-3261-4be4-b437-e7a0cd3ba458

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27d184db-3261-4be4-b437-e7a0cd3ba458
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27d184db-3261-4be4-b437-e7a0cd3ba458
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7fe25736-0a68-413a-9438-d088c1534915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fe25736-0a68-413a-9438-d088c1534915
Content-Type: application/json

--- request body ---
{"handle":"qa-e3e955033d6e","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fe25736-0a68-413a-9438-d088c1534915
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7fe25736-0a68-413a-9438-d088c1534915"}
```
