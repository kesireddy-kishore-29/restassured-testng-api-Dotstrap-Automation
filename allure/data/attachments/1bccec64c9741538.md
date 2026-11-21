# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-639611ce-fe85-4858-b61e-7b9faf50913c` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-0f5f329d-fc37-4aa5-8c64-d23e48b329bd` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-f2e7726e-2322-4ce3-b97a-8866bd920d2e` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-096c2b7d-8a91-48b9-bb7b-c8ca2d402705` |
| 5 | `POST /v1/accounts` | 400 | 13 | `qa-f9b3a8c5-0405-4734-b42c-09b071061b49` |
| 6 | `POST /v1/auth/token` | 200 | 56 | `qa-57d1ae95-b241-4dba-bf83-1fadcb5f0e05` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-10512cc9-0aac-417e-b9e5-ae215db49d74` |
| 8 | `POST /v1/auth/token` | 401 | 38 | `qa-5d7eb97a-7347-4af0-9f7d-aef8e760b15a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-4ca46722-7e02-4122-acd2-659cedcb665c` |
| 10 | `POST /v1/auth/token` | 401 | 67 | `qa-4b707960-2621-4978-87b1-62d27903f24c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-639611ce-fe85-4858-b61e-7b9faf50913c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-639611ce-fe85-4858-b61e-7b9faf50913c
Content-Type: application/json

--- request body ---
{"handle":"qa-690d5b566607","displayName":"QA 690d5b566607","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-639611ce-fe85-4858-b61e-7b9faf50913c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-690d5b566607
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d751b92d-b4ba-47dc-827d-acfdc88e224a","handle":"qa-690d5b566607","displayName":"QA 690d5b566607","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.043843204Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f5f329d-fc37-4aa5-8c64-d23e48b329bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f5f329d-fc37-4aa5-8c64-d23e48b329bd
Content-Type: application/json

--- request body ---
{"handle":"qa-39490fac4413","displayName":"QA 39490fac4413","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f5f329d-fc37-4aa5-8c64-d23e48b329bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Location: /v1/accounts/qa-39490fac4413
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ff197d7-72b6-4597-9476-fd822656dd5a","handle":"qa-39490fac4413","displayName":"QA 39490fac4413","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.088821551Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f2e7726e-2322-4ce3-b97a-8866bd920d2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2e7726e-2322-4ce3-b97a-8866bd920d2e
Content-Type: application/json

--- request body ---
{"handle":"qa-690d5b566607","password":"****"}

--- response: 200 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2e7726e-2322-4ce3-b97a-8866bd920d2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d751b92d-b4ba-47dc-827d-acfdc88e224a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-096c2b7d-8a91-48b9-bb7b-c8ca2d402705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-096c2b7d-8a91-48b9-bb7b-c8ca2d402705
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-39490fac4413","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-096c2b7d-8a91-48b9-bb7b-c8ca2d402705
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
Location: /v1/conversations/cnv_31fbbf58-dc09-46fd-af1d-870e5bac8634
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_31fbbf58-dc09-46fd-af1d-870e5bac8634","subject":"Error contract","status":"open","region":"eu","participants":["qa-690d5b566607","qa-39490fac4413"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.217966794Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f9b3a8c5-0405-4734-b42c-09b071061b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9b3a8c5-0405-4734-b42c-09b071061b49
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9b3a8c5-0405-4734-b42c-09b071061b49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-f9b3a8c5-0405-4734-b42c-09b071061b49"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-57d1ae95-b241-4dba-bf83-1fadcb5f0e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57d1ae95-b241-4dba-bf83-1fadcb5f0e05
Content-Type: application/json

--- request body ---
{"handle":"qa-39490fac4413","password":"****"}

--- response: 200 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-57d1ae95-b241-4dba-bf83-1fadcb5f0e05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ff197d7-72b6-4597-9476-fd822656dd5a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-10512cc9-0aac-417e-b9e5-ae215db49d74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10512cc9-0aac-417e-b9e5-ae215db49d74
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-10512cc9-0aac-417e-b9e5-ae215db49d74
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
correlation: qa-5d7eb97a-7347-4af0-9f7d-aef8e760b15a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d7eb97a-7347-4af0-9f7d-aef8e760b15a
Content-Type: application/json

--- request body ---
{"handle":"qa-39490fac4413","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d7eb97a-7347-4af0-9f7d-aef8e760b15a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5d7eb97a-7347-4af0-9f7d-aef8e760b15a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ca46722-7e02-4122-acd2-659cedcb665c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca46722-7e02-4122-acd2-659cedcb665c
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ca46722-7e02-4122-acd2-659cedcb665c
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
correlation: qa-4b707960-2621-4978-87b1-62d27903f24c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b707960-2621-4978-87b1-62d27903f24c
Content-Type: application/json

--- request body ---
{"handle":"qa-690d5b566607","password":"****"}

--- response: 401 in 67 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b707960-2621-4978-87b1-62d27903f24c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b707960-2621-4978-87b1-62d27903f24c"}
```
