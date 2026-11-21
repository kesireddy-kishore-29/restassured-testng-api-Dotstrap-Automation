# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-cbdb3606-dcfa-4748-8be8-1f400e6e9c76` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-8efdc67a-f6e1-4c6f-bbb5-601635be1e85` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-584300f6-8ec7-463b-88e5-04e7ab39747e` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-31ea3de5-ffa5-4a94-99b9-4703875dbfb3` |
| 5 | `DELETE /v1/accounts/me` | 503 | 18 | `qa-127a31a3-883f-4e66-9d06-016cba1cf605` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-caddc2c7-82c8-4aaf-a757-9465115909c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a2266346-f7de-4fef-a03d-b18185cb2277` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-5a71cb34-167d-4af6-a41b-6c9c6d5aabd1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0e43d2ce-d964-4638-b5b3-b8364b55f75f` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-ca6ce017-e411-481a-8826-062ad35bd634` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cbdb3606-dcfa-4748-8be8-1f400e6e9c76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbdb3606-dcfa-4748-8be8-1f400e6e9c76
Content-Type: application/json

--- request body ---
{"handle":"qa-3d9607276ba6","displayName":"QA 3d9607276ba6","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbdb3606-dcfa-4748-8be8-1f400e6e9c76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-3d9607276ba6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7586637-26ce-48a1-9c8d-8c067251f1be","handle":"qa-3d9607276ba6","displayName":"QA 3d9607276ba6","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.686002850Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8efdc67a-f6e1-4c6f-bbb5-601635be1e85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8efdc67a-f6e1-4c6f-bbb5-601635be1e85
Content-Type: application/json

--- request body ---
{"handle":"qa-b22fbeabf2b5","displayName":"QA b22fbeabf2b5","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-8efdc67a-f6e1-4c6f-bbb5-601635be1e85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-b22fbeabf2b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0c24de9-92de-49ec-b02a-5cfbdc39cc37","handle":"qa-b22fbeabf2b5","displayName":"QA b22fbeabf2b5","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.730681615Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-584300f6-8ec7-463b-88e5-04e7ab39747e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-584300f6-8ec7-463b-88e5-04e7ab39747e
Content-Type: application/json

--- request body ---
{"handle":"qa-3d9607276ba6","password":"****"}

--- response: 200 in 53 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-584300f6-8ec7-463b-88e5-04e7ab39747e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7586637-26ce-48a1-9c8d-8c067251f1be"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-31ea3de5-ffa5-4a94-99b9-4703875dbfb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31ea3de5-ffa5-4a94-99b9-4703875dbfb3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b22fbeabf2b5","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-31ea3de5-ffa5-4a94-99b9-4703875dbfb3
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
Location: /v1/conversations/cnv_2644112b-edbe-4a96-be90-ecac12853a02
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2644112b-edbe-4a96-be90-ecac12853a02","subject":"Error contract","status":"open","region":"eu","participants":["qa-3d9607276ba6","qa-b22fbeabf2b5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.839973696Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-127a31a3-883f-4e66-9d06-016cba1cf605

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 575957ae-8d89-4828-9c8a-fa7e31112cc4
X-Correlation-Id: qa-127a31a3-883f-4e66-9d06-016cba1cf605
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-127a31a3-883f-4e66-9d06-016cba1cf605
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-127a31a3-883f-4e66-9d06-016cba1cf605"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-caddc2c7-82c8-4aaf-a757-9465115909c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caddc2c7-82c8-4aaf-a757-9465115909c1
Content-Type: application/json

--- request body ---
{"handle":"qa-b22fbeabf2b5","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-caddc2c7-82c8-4aaf-a757-9465115909c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0c24de9-92de-49ec-b02a-5cfbdc39cc37"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2266346-f7de-4fef-a03d-b18185cb2277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2266346-f7de-4fef-a03d-b18185cb2277
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2266346-f7de-4fef-a03d-b18185cb2277
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
correlation: qa-5a71cb34-167d-4af6-a41b-6c9c6d5aabd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a71cb34-167d-4af6-a41b-6c9c6d5aabd1
Content-Type: application/json

--- request body ---
{"handle":"qa-b22fbeabf2b5","password":"****"}

--- response: 401 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a71cb34-167d-4af6-a41b-6c9c6d5aabd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a71cb34-167d-4af6-a41b-6c9c6d5aabd1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0e43d2ce-d964-4638-b5b3-b8364b55f75f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e43d2ce-d964-4638-b5b3-b8364b55f75f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0e43d2ce-d964-4638-b5b3-b8364b55f75f
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ca6ce017-e411-481a-8826-062ad35bd634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca6ce017-e411-481a-8826-062ad35bd634
Content-Type: application/json

--- request body ---
{"handle":"qa-3d9607276ba6","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca6ce017-e411-481a-8826-062ad35bd634
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ca6ce017-e411-481a-8826-062ad35bd634"}
```
