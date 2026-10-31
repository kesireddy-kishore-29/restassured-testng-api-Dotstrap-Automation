# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-dfa6619c-f3b2-4bb1-b9e0-34fd398c1b6c` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-e6f4f1cc-9120-476a-a4ca-c664a1d5e485` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-194c8b41-0bd4-4faf-89ce-78e0d319c7e8` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-2b56b52d-3de7-4098-a354-50185a189ec8` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 8 | `qa-9354ff13-85f0-4bd2-8ded-30a4bf81e81a` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-15026c1d-6102-4865-8f19-a24876a1a4a1` |
| 7 | `POST /v1/auth/token` | 200 | 13 | `qa-ffda66af-9e18-40c6-8877-df367b19d2b9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-fd8d0c88-d85d-4193-9a58-6bf6e6ac3ab2` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-b0a19de0-37f4-4c7a-a2b8-7a4b27e9fbba` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-50d6c020-8c20-4f34-8f2c-4049c1c9d0f2` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-e95d69f9-317e-4ebc-be39-03816b2007b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dfa6619c-f3b2-4bb1-b9e0-34fd398c1b6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfa6619c-f3b2-4bb1-b9e0-34fd398c1b6c
Content-Type: application/json

--- request body ---
{"handle":"qa-b31d743e76bb","displayName":"QA b31d743e76bb","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfa6619c-f3b2-4bb1-b9e0-34fd398c1b6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-b31d743e76bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_689cb8dd-40d0-4dc2-a55d-efbadfe7cf6a","handle":"qa-b31d743e76bb","displayName":"QA b31d743e76bb","region":"eu","role":"user","createdAt":"2026-10-23T07:42:04.203313080Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e6f4f1cc-9120-476a-a4ca-c664a1d5e485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6f4f1cc-9120-476a-a4ca-c664a1d5e485
Content-Type: application/json

--- request body ---
{"handle":"qa-31406eb46d34","displayName":"QA 31406eb46d34","password":"****","region":"us"}

--- response: 201 in 16 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6f4f1cc-9120-476a-a4ca-c664a1d5e485
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-31406eb46d34
X-Served-Region: us
Content-Length: 181

{"id":"acc_6bd20cd9-e5ef-41fb-9c0f-9eea3e96c450","handle":"qa-31406eb46d34","displayName":"QA 31406eb46d34","region":"us","role":"user","createdAt":"2026-10-23T07:42:04.234458403Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-194c8b41-0bd4-4faf-89ce-78e0d319c7e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194c8b41-0bd4-4faf-89ce-78e0d319c7e8
Content-Type: application/json

--- request body ---
{"handle":"qa-b31d743e76bb","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-194c8b41-0bd4-4faf-89ce-78e0d319c7e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_689cb8dd-40d0-4dc2-a55d-efbadfe7cf6a"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-31406eb46d34
correlation: qa-2b56b52d-3de7-4098-a354-50185a189ec8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b56b52d-3de7-4098-a354-50185a189ec8
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b56b52d-3de7-4098-a354-50185a189ec8
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
Content-Length: 74

{"handle":"qa-31406eb46d34","displayName":"QA 31406eb46d34","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-31406eb46d34
correlation: qa-9354ff13-85f0-4bd2-8ded-30a4bf81e81a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9354ff13-85f0-4bd2-8ded-30a4bf81e81a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9354ff13-85f0-4bd2-8ded-30a4bf81e81a
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

{"handle":"qa-31406eb46d34","displayName":"QA 31406eb46d34","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-31406eb46d34
correlation: qa-15026c1d-6102-4865-8f19-a24876a1a4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15026c1d-6102-4865-8f19-a24876a1a4a1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-15026c1d-6102-4865-8f19-a24876a1a4a1
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
Content-Length: 74

{"handle":"qa-31406eb46d34","displayName":"QA 31406eb46d34","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ffda66af-9e18-40c6-8877-df367b19d2b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffda66af-9e18-40c6-8877-df367b19d2b9
Content-Type: application/json

--- request body ---
{"handle":"qa-31406eb46d34","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffda66af-9e18-40c6-8877-df367b19d2b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6bd20cd9-e5ef-41fb-9c0f-9eea3e96c450"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd8d0c88-d85d-4193-9a58-6bf6e6ac3ab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd8d0c88-d85d-4193-9a58-6bf6e6ac3ab2
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd8d0c88-d85d-4193-9a58-6bf6e6ac3ab2
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
correlation: qa-b0a19de0-37f4-4c7a-a2b8-7a4b27e9fbba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a19de0-37f4-4c7a-a2b8-7a4b27e9fbba
Content-Type: application/json

--- request body ---
{"handle":"qa-31406eb46d34","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0a19de0-37f4-4c7a-a2b8-7a4b27e9fbba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0a19de0-37f4-4c7a-a2b8-7a4b27e9fbba"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50d6c020-8c20-4f34-8f2c-4049c1c9d0f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50d6c020-8c20-4f34-8f2c-4049c1c9d0f2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50d6c020-8c20-4f34-8f2c-4049c1c9d0f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-e95d69f9-317e-4ebc-be39-03816b2007b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e95d69f9-317e-4ebc-be39-03816b2007b4
Content-Type: application/json

--- request body ---
{"handle":"qa-b31d743e76bb","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:42:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e95d69f9-317e-4ebc-be39-03816b2007b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e95d69f9-317e-4ebc-be39-03816b2007b4"}
```
