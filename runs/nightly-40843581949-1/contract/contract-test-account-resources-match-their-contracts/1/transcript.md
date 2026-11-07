# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 408 | `qa-15e971f8-ca8d-428e-aad9-1532a28796f3` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-d64a9a84-7a96-4f1f-9147-429c94a26cda` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-e7734c32-af3a-4fd2-bece-d71abca659d2` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-c6f829e1-425b-4b9f-920a-dfe60dcf7a90` |
| 5 | `GET /v1/accounts/me` | 200 | 24 | `qa-53d24daa-2ebe-4ce4-8368-1e49c9b1d682` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 34 | `qa-28045383-9ff4-403c-bc32-decdbcb96bc8` |
| 7 | `POST /v1/auth/token` | 200 | 20 | `qa-03ecb35f-d90e-4c5b-aec1-6c847c875db9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3b3c992a-70aa-4a6e-a639-e2cc1fb65e8f` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-54696ed1-029e-4e66-8143-b2da983039ef` |
| 10 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-4217aca5-6f4b-470c-b03a-4bad61fbcfd5` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-630be8f2-af21-408b-adae-900b276b9c6e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15e971f8-ca8d-428e-aad9-1532a28796f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15e971f8-ca8d-428e-aad9-1532a28796f3
Content-Type: application/json

--- request body ---
{"handle":"qa-c6bb2a089f44","displayName":"QA c6bb2a089f44","password":"****","region":"eu"}

--- response: 201 in 408 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-15e971f8-ca8d-428e-aad9-1532a28796f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-c6bb2a089f44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5a68e5a0-9132-43ab-a2e5-eb2146d660af","handle":"qa-c6bb2a089f44","displayName":"QA c6bb2a089f44","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.280589240Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d64a9a84-7a96-4f1f-9147-429c94a26cda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d64a9a84-7a96-4f1f-9147-429c94a26cda
Content-Type: application/json

--- request body ---
{"handle":"qa-282c2daa633a","displayName":"QA 282c2daa633a","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d64a9a84-7a96-4f1f-9147-429c94a26cda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-282c2daa633a
X-Served-Region: us
Content-Length: 181

{"id":"acc_3d14c2a6-da23-454f-9b64-0f3a38a1fa72","handle":"qa-282c2daa633a","displayName":"QA 282c2daa633a","region":"us","role":"user","createdAt":"2026-10-29T08:38:59.736498397Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e7734c32-af3a-4fd2-bece-d71abca659d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7734c32-af3a-4fd2-bece-d71abca659d2
Content-Type: application/json

--- request body ---
{"handle":"qa-c6bb2a089f44","password":"****"}

--- response: 200 in 45 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7734c32-af3a-4fd2-bece-d71abca659d2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5a68e5a0-9132-43ab-a2e5-eb2146d660af"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c6f829e1-425b-4b9f-920a-dfe60dcf7a90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6f829e1-425b-4b9f-920a-dfe60dcf7a90
Content-Type: application/json

--- request body ---
{"handle":"qa-c6bb2a089f44","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6f829e1-425b-4b9f-920a-dfe60dcf7a90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5a68e5a0-9132-43ab-a2e5-eb2146d660af"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-53d24daa-2ebe-4ce4-8368-1e49c9b1d682

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d24daa-2ebe-4ce4-8368-1e49c9b1d682
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-53d24daa-2ebe-4ce4-8368-1e49c9b1d682
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
Content-Length: 181

{"id":"acc_5a68e5a0-9132-43ab-a2e5-eb2146d660af","handle":"qa-c6bb2a089f44","displayName":"QA c6bb2a089f44","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.280589240Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-282c2daa633a
correlation: qa-28045383-9ff4-403c-bc32-decdbcb96bc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28045383-9ff4-403c-bc32-decdbcb96bc8
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-28045383-9ff4-403c-bc32-decdbcb96bc8
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
X-Served-Region: eu
Content-Length: 74

{"handle":"qa-282c2daa633a","displayName":"QA 282c2daa633a","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-03ecb35f-d90e-4c5b-aec1-6c847c875db9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ecb35f-d90e-4c5b-aec1-6c847c875db9
Content-Type: application/json

--- request body ---
{"handle":"qa-282c2daa633a","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-03ecb35f-d90e-4c5b-aec1-6c847c875db9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d14c2a6-da23-454f-9b64-0f3a38a1fa72"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b3c992a-70aa-4a6e-a639-e2cc1fb65e8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b3c992a-70aa-4a6e-a639-e2cc1fb65e8f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b3c992a-70aa-4a6e-a639-e2cc1fb65e8f
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-54696ed1-029e-4e66-8143-b2da983039ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54696ed1-029e-4e66-8143-b2da983039ef
Content-Type: application/json

--- request body ---
{"handle":"qa-282c2daa633a","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54696ed1-029e-4e66-8143-b2da983039ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54696ed1-029e-4e66-8143-b2da983039ef"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4217aca5-6f4b-470c-b03a-4bad61fbcfd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4217aca5-6f4b-470c-b03a-4bad61fbcfd5
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4217aca5-6f4b-470c-b03a-4bad61fbcfd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-630be8f2-af21-408b-adae-900b276b9c6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630be8f2-af21-408b-adae-900b276b9c6e
Content-Type: application/json

--- request body ---
{"handle":"qa-c6bb2a089f44","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-630be8f2-af21-408b-adae-900b276b9c6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-630be8f2-af21-408b-adae-900b276b9c6e"}
```
